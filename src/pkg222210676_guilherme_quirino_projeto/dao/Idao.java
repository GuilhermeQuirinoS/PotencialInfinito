/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210676_guilherme_quirino_projeto.dao;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Ações que serão realizadas no banco de dados
 * @author Quirino
 */
public interface Idao<T> {
    
    public boolean insere(T o) throws SQLException;

}
