package com.app.repositories;

import com.app.models.Task;
import com.app.utils.DBUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public void create(Task task) {
        String sql = "INSERT INTO tasks (nome, descricao, dataCriacao, dataConclusao, concluido) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DBUtils.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, task.getNome());
            stmt.setString(2, task.getDescricao());
            stmt.setString(3, task.getDataCriacao());
            stmt.setString(4, task.getDataConclusao());
            stmt.setBoolean(5, task.getConcluido());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Task> findAll() {
        List<Task> tasks = new ArrayList<>();
        String sql = "SELECT * FROM tasks";

        try (Connection conn = DBUtils.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Task task = new Task(
                        rs.getLong("id"),
                        rs.getString("nome"),
                        rs.getString("descricao"),
                        rs.getString("dataCriacao"),
                        rs.getString("dataConclusao"),
                        rs.getBoolean("concluido")
                );

                tasks.add(task);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tasks;
    }

    public Task findById(long id) {
        Task task = null;
        String sql = "SELECT * FROM tasks WHERE id = ?";

        try (Connection conn = DBUtils.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    task = new Task(
                            rs.getLong("id"),
                            rs.getString("nome"),
                            rs.getString("descricao"),
                            rs.getString("dataCriacao"),
                            rs.getString("dataConclusao"),
                            rs.getBoolean("concluido")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return task;
    }

    public void update(Task task) {
        String sql = "UPDATE tasks SET nome = ?, descricao = ?, dataCriacao = ?, dataConclusao = ?, concluido = ? WHERE id = ?";

        try (Connection conn = DBUtils.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, task.getNome());
            stmt.setString(2, task.getDescricao());
            stmt.setString(3, task.getDataCriacao());
            stmt.setString(4, task.getDataConclusao());
            stmt.setBoolean(5, task.getConcluido());
            stmt.setLong(6, task.getId());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(long id) {
        String sql = "DELETE FROM tasks WHERE id = ?";

        try (Connection conn = DBUtils.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
