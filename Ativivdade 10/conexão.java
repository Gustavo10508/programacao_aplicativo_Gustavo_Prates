package sistemaalunos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConexaoDAO {

    private Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/escola"; // nome do banco
        String user = "root"; // seu usuário MySQL
        String password = "123456"; // sua senha
        return DriverManager.getConnection(url, user, password);
    }

    // CREATE
    public void cadastrarAluno(Aluno aluno) {
        String sql = "INSERT INTO alunos (id, nome) VALUES (?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, aluno.getId());
            stmt.setString(2, aluno.getNome());
            stmt.executeUpdate();
            System.out.println("Aluno cadastrado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar aluno: " + e.getMessage());
        }
    }

    // READ
    public List<Aluno> listarAlunos() {
        List<Aluno> lista = new ArrayList<>();
        String sql = "SELECT * FROM alunos";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Aluno a = new Aluno(rs.getInt("id"), rs.getString("nome"));
                lista.add(a);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar alunos: " + e.getMessage());
        }
        return lista;
    }

    // UPDATE
    public void atualizarAluno(Aluno aluno) {
        String sql = "UPDATE alunos SET nome = ? WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, aluno.getNome());
            stmt.setInt(2, aluno.getId());
            stmt.executeUpdate();
            System.out.println("Aluno atualizado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar aluno: " + e.getMessage());
        }
    }

    // DELETE
    public void deletarAluno(int id) {
        String sql = "DELETE FROM alunos WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Aluno deletado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao deletar aluno: " + e.getMessage());
        }
    }
}
