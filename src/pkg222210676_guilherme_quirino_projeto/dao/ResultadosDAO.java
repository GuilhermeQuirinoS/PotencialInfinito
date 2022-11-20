/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210676_guilherme_quirino_projeto.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import pkg222210676_guilherme_quirino_projeto.model.Contas;

/**
 * Carrega o metodo insere(), responsável por armazenas os resultados em suas respectivas 
 * colunas da tabela do banco de dados
 * @author Quirino
 */
public class ResultadosDAO implements Idao<Contas> {

    private Connection link;

    public ResultadosDAO() throws Exception {
        this.link = Connection.getConexao();
    }

    @Override
    public boolean insere(Contas o) throws SQLException {
        System.out.println("Insert_Data_SQL");
        String sql = "INSERT INTO resultados (ei, ef , vi, vf, yi, yf, pi, pf, efoton, ffoton, yfoton) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = this.link.getDriver().prepareStatement(sql);
        ps.setDouble(1, o.EnergiaInicial());
        ps.setDouble(2, o.EnergiaFinal());
        ps.setDouble(3, o.VelocidadeInicial());
        ps.setDouble(4, o.VelocidadeFinal());
        ps.setDouble(5, o.ComprimentoInicial());
        ps.setDouble(6, o.ComprimentoFinal());
        ps.setDouble(7, o.ProbabilidadeInicial());
        ps.setDouble(8, o.ProbabilidadeFinal());
        ps.setDouble(9, o.EnergiaFoton());
        ps.setDouble(10, o.FrequenciaFoton());
        ps.setDouble(11, o.ComprimentoFóton());

        return ps.execute();
    }
}
