/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210676_guilherme_quirino_projeto.model;

/**
 *
 * @author Quirino
 */
public class Contas {

    private double L;
    private int Ni;
    private int Nf;
    private double a;
    private double b;
    private double Ei;
    private double Eiev;
    private double Ef;
    private double Efev;
    private double m;
    private double Efoton;

    final double h = 6.626e-34;
    final double c = 3e8;

    public Contas() {
    }
    
    /**
     * Contrutor de Contas
     * @param L
     * @param Ni
     * @param Nf
     * @param a
     * @param b
     * @param m 
     */
    public Contas(double L, int Ni, int Nf, double a, double b, double m) {
        this.L = L;
        this.Ni = Ni;
        this.Nf = Nf;
        this.a = a;
        this.b = b;
        this.m = m;
    }

    public double getL() {
        return L;
    }

    public int getNi() {
        return Ni;
    }

    public int getNf() {
        return Nf;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setL(double L) {
        this.L = L;
    }

    public void setNi(int Ni) {
        this.Ni = Ni;
    }

    public void setNf(int Nf) {
        this.Nf = Nf;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    /**
     * 
     * @return Energia Inicial em eV 
     */
    public double EnergiaInicial() {
        double x = Math.pow(h, 2) / (8 * m * Math.pow(L, 2));

        Ei = x * Math.pow(Ni, 2);
        Eiev = Ei * 6.242e+18;

        System.out.println("Energia Inicial: \n" + Ei + " J");
        System.out.println("Energia Inicial: \n" + Eiev + " eV");
        System.out.println("\n");

        return Eiev;
    }
    
    /**
     * 
     * @return Energia Final em eV
     */
    public double EnergiaFinal() {
        double x = Math.pow(h, 2) / (8 * m * Math.pow(L, 2));

        Ef = x * Math.pow(Nf, 2);
        Efev = Ef * 6.242e+18;

        System.out.println("Energia final: \n" + Ef + " J");
        System.out.println("Energia Final: \n" + Efev + " eV");
        System.out.println("\n");

        return Efev;
    }
    
    /**
     * 
     * @return Energia do Foton em eV 
     */
    public double EnergiaFoton() {
        Efoton = Ef - Ei;

        double aux = Efoton * 6.242e+18;

        System.out.println("Energia do foton: \n" + aux + " eV");
        System.out.println("\n");

        return aux;
    }
    
    /**
     * 
     * @return Frequencia do Foton em Hz
     */
    public double FrequenciaFoton() {
        double frequencia = Efoton / h;

        System.out.println("Frequencia do foton: \n" + frequencia);
        System.out.println("\n");

        return frequencia;
    }
    
    /**
     * 
     * @return Comprimento do Foton em (depende do input nm/m/etc)
     */
    public double ComprimentoFóton() {
        double comprimento = h * c / Efoton;

        System.out.println("Comprimento do foton \n" + comprimento);
        System.out.println("\n");

        return comprimento;
    }
    
    /**
     * 
     * @return Velocidade Inicial em m/s 
     */
    public double VelocidadeInicial() {
        double Vi = Math.sqrt((2 * Ei) / m);

        System.out.println("Velocidade inicial da particula: \n" + Vi);
        System.out.println("\n");

        return Vi;
    }
    
    /**
     * 
     * @return Velocidade Final em m/s 
     */
    public double VelocidadeFinal() {
        double Vf = Math.sqrt((2 * Ef) / m);

        System.out.println("Velocidade final da particula: \n" + Vf);
        System.out.println("\n");

        return Vf;
    }
    
    /**
     * 
     * @return Comprimento Inicial em m 
     */
    public double ComprimentoInicial() {
        double Yi = Math.sqrt((h * h) / (2 * m * Ei));

        System.out.println("Comprimento inicial da particula: \n" + Yi);
        System.out.println("\n");

        return Yi;
    }
    
    /**
     * 
     * @return Comprimento Final em m
     */
    public double ComprimentoFinal() {
        double Yf = Math.sqrt((h * h) / (2 * m * Ef));

        System.out.println("Comprimento final da particula: \n" + Yf);
        System.out.println("\n");

        return Yf;
    }
    
    /**
     * 
     * @return Probabilidade de encontrar a particula em N inicial em %
     */
    public double ProbabilidadeInicial() {
        double PAInicial = L * Math.sin((2 * Math.PI * a * Ni) / L);
        double PBInicial = L * Math.sin((2 * Math.PI * b * Ni) / L);

        double PInicial = 100 * (((2 * Math.PI * Ni * (b - a)) + (PAInicial - PBInicial)) / (2 * Math.PI * L * Ni));

        System.out.println("Probabilidade Em N Inicial: \n" + PInicial);

        return PInicial;
    }
    
    /**
     * 
     * @return Probilidade de encontrar a particula em N final em %
     */
    public double ProbabilidadeFinal() {
        double PAFinal = L * Math.sin((2 * Math.PI * a * Nf) / L);
        double PBFinal = L * Math.sin((2 * Math.PI * b * Nf) / L);

        double PFinal = 100 * (((2 * Math.PI * Nf * (b - a)) + (PAFinal - PBFinal)) / (2 * Math.PI * L * Nf));

        System.out.println("Probabilidade Em N Final: \n" + PFinal);

        return PFinal;
    }
    
    /**
     * 
     * @return Váriavel que faz parte das funções de ondas 
     */
    public double FuncoesX() {
        double X = Math.sqrt((2 / L));

        System.out.println("\n");
        return X;
    }
    
    /**
     * 
     * @return Função de onda da particula em N inicial 
     */
    public double FuncoesNiY() {
        double NiY = ((Ni * Math.PI) / L);

        /*System.out.println("\nFuncao no nivel inicial:"+ X +" * Sen("+NiY+" * x)\n");
        System.out.println("\n");*/
        return NiY;
    }
    
    /**
     * 
     * @return Função de onda da particula em N inicial  
     */
    public double FuncoesNfY() {
        double NfY = ((Nf * Math.PI) / L);

        /*System.out.println("Funcao no nivel final:"+ X +" * Sen("+ NfY +" * x)\n");
        System.out.println("\n");*/
        return NfY;

    }
}
