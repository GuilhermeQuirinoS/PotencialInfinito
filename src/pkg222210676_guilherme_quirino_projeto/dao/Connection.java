/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210676_guilherme_quirino_projeto.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Cria a conexão com o banco de dados
 * @author Quirino
 */
public class Connection {

    private static Connection link;
    private java.sql.Connection driver;
    
    /**
     * Cria Conexão
     * @throws SQLException 
     */
    public Connection() throws SQLException {
        this.criaConexao();
    }
    
    public static Connection getConexao() throws SQLException {
        if (link == null) {
            link = new Connection();
        }
        return link;
    }
    
    /**
     * Chama o driver manager e especifica o banco de dados, usuário e senha
     * @throws SQLException 
     */
    private void criaConexao() throws SQLException {
        this.driver = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Projeto", "postgres", "Quirinos@00");
    }

    public java.sql.Connection getDriver() {
        return driver;
    }
}
