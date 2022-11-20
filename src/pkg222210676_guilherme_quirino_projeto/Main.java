/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg222210676_guilherme_quirino_projeto;

import java.util.Scanner;
import pkg222210676_guilherme_quirino_projeto.dao.ResultadosDAO;
import pkg222210676_guilherme_quirino_projeto.model.Contas;
import pkg222210676_guilherme_quirino_projeto.view.Animation;
import pkg222210676_guilherme_quirino_projeto.view.FrmPrincipal;

/**
 * Inicia as interfaces gráficas de menu/resultado e de animação
 * @author Quirino
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        FrmPrincipal frm = new FrmPrincipal();
        frm.setVisible(true);
        Animation animation = new Animation();
        animation.setVisible(true);
        
/**        
        Contas contas = new Contas();       
        System.out.println("====RESULTADOS====");
        contas.EnergiaInicial();
        contas.EnergiaFinal();

        contas.EnergiaFoton();

        contas.ComprimentoFóton();

        contas.FrequenciaFoton();

        contas.VelocidadeInicial();

        contas.VelocidadeFinal();

        contas.ComprimentoInicial();

        contas.ComprimentoFinal();

        contas.ProbabilidadeInicial();

        contas.ProbabilidadeFinal();
        
        contas.Funcoes();
**/                
        
    }
}
