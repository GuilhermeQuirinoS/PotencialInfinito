/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210676_guilherme_quirino_projeto.controller;


import pkg222210676_guilherme_quirino_projeto.dao.ResultadosDAO;
import pkg222210676_guilherme_quirino_projeto.model.Contas;
import pkg222210676_guilherme_quirino_projeto.view.FrmPrincipal;

/**
 * Resposável por ligar o model (as contas) à interface gráfica (menu de input e resultados)
 * @author Quirino
 */
public class ContasController {

    private FrmPrincipal janela;
    private Contas contas;
    
    /**
     * atributos para receber os inputs da interface gráfica
     */
    private double m;
    private double L;
    private int Ni;
    private int Nf;
    private double a;
    private double b;
    /**
     * atributor para mandar os resultados para a interface gráfica
     */
    private double Ei;
    private double Ef;
    private double Vi;
    private double Vf;
    private double Yi;
    private double Yf;
    private double Pi;
    private double Pf;
    private double Efoton;
    private double Ffoton;
    private double Yfoton;
    private double X;
    private double NiY;
    private double NfY;
    
    /**
     * Construtor de ContasController
     * @param janela 
     */
    public ContasController(FrmPrincipal janela) {
        this.janela = janela;
        this.contas = new Contas();
    }
    
    /**
     * Define a massa como a do proton que será utilizada nas contas
     */
    public void defineMassaProton() {
        m = 1.67e-27;
        System.out.println(m);
    }
    /**
     * Define a massa como a do eletronque será utilizada nas contas
     */
    public void defineMassaEletron() {
        m = 9.11e-31;
        System.out.println(m);
    }
    
    /**
     * método responsável por receber os inputs da interface gráfica, utiliza-los para realizar as contas
     * e enviar os resultados dos mesmo para a interface e ao mesmo tempo armazena-los dentro do banco de dados
     * (Ligado ao botão "Computar Resultados" da interface")
     * @throws Exception 
     */
    public void inputs() throws Exception {
        L = Double.valueOf(janela.getlValue().getText());
        Ni = Integer.valueOf(janela.getNiValue().getText());
        Nf = Integer.valueOf(janela.getNfValue().getText());
        a = Double.valueOf(janela.getaValue().getText());
        b = Double.valueOf(janela.getbValue().getText());

        Contas contas = new Contas(L, Ni, Nf, a, b, m);

        Ei = contas.EnergiaInicial();
        Ef = contas.EnergiaFinal();
        Vi = contas.VelocidadeInicial();
        Vf = contas.VelocidadeFinal();
        Yi = contas.ComprimentoInicial();
        Yf = contas.ComprimentoFinal();
        Pi = contas.ProbabilidadeInicial();
        Pf = contas.ProbabilidadeFinal();
        Efoton = contas.EnergiaFoton();
        Ffoton = contas.FrequenciaFoton();
        Yfoton = contas.ComprimentoFóton();
        X = contas.FuncoesX();
        NiY = contas.FuncoesNiY();
        NfY = contas.FuncoesNfY();

        janela.getTxtEi().setText(String.valueOf(Ei));
        janela.getTxtEf().setText(String.valueOf(Ef));
        janela.getTxtVi().setText(String.valueOf(Vi));
        janela.getTxtVf().setText(String.valueOf(Vf));
        janela.getTxtYi().setText(String.valueOf(Yi));
        janela.getTxtYf().setText(String.valueOf(Yf));
        janela.getTxtPi().setText(String.valueOf(Pi));
        janela.getTxtPf().setText(String.valueOf(Pf));
        janela.getTxtEfoton().setText(String.valueOf(Efoton));
        janela.getTxtFfoton().setText(String.valueOf(Ffoton));
        janela.getTxtYfoton().setText(String.valueOf(Yfoton));
        janela.getTxtX().setText(String.valueOf(X));
        janela.getTxtX1().setText(String.valueOf(X));
        janela.getTxtNiY().setText(String.valueOf(NiY));
        janela.getTxtNfY().setText(String.valueOf(NfY));

        ResultadosDAO sql = new ResultadosDAO();
        sql.insere(contas);
    }

}
