/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_10;

/**
 *
 * @author ficdev
 */
import java.sql.*;

public class MyConnection {

    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver"); // registra o driver
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ficdatabase", "postgres", "123456"); // abre conexão
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM escola"); // executa comando SQL
            while (rs.next()) { //manipula resultado
                int id = rs.getInt("idescola");
                String nome = rs.getString("nomeescola");
                String cep = rs.getString("cepescola");
                System.out.println(id + ", " + nome+ ", " +cep);
            }
            conn.close(); // fecha conexão
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
