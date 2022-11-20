/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkg222210676_guilherme_quirino_projeto.view;

import static java.lang.Thread.sleep;
import java.util.Random;

/**
 * Interface da animação que simula os saltos quanticos de uma particulas quando emite ou absorve um fóton
 * @author Quirino
 */
public class Animation extends javax.swing.JFrame {

    /**
     * Contrutor da animação
     */
    public Animation() {
        initComponents();
        new Thread() {
            @Override
            public void run() {
                Animacion();
            }
        }.start();
    }
    
    /**
     * define a localização dos fotons que serão emetidos ou absorvidos
     */
    public void Energias() {
        E1.setLocation(- 19, E1.getLocation().y);
        E2.setLocation(- 19, E2.getLocation().y);
        E3.setLocation(- 19, E3.getLocation().y);
        E4.setLocation(- 19, E4.getLocation().y);
        E5.setLocation(- 19, E5.getLocation().y);
    }

    /**
     * Inicia a animação da particula 1
     */
    public void Animacion() {
        int Xposition = - 3;
        int MovePX = 0;

        int Ex = - 19;
        int Ez = 2;

        int aux = 0;
        int rng = 0;

        Espaco.setLayer(Orbita1, 0);
        Espaco.setLayer(P1, 1);

        while (true) {
            Energias();


            P1.setLocation(Xposition, P1.getLocation().y);


            E1.setLocation(Ex, E1.getLocation().y);


            if (MovePX == 0) {
                Xposition += 2;
            } else if (MovePX == 1) {
                Xposition -= 2;
            } else {
            }


            if (Ez == 0) {
                Ex += 2;
            } else if (Ez == 1) {
                Ex -= 2;
            } else {
            }


            if (Xposition < Plano.getWidth() - 19) {
            } else if (Xposition > - 3) {
                MovePX = 1;
            }


            if ((MovePX == 1) && (Xposition < 164)) {
                aux++;
            }

            if (aux == 1) {
                Random sorte = new Random();
                int teto = 5;

                rng = sorte.nextInt(teto);
                rng++;

                System.out.println(rng);
            }


            if (rng == 0 || rng == 1) {
            } else {
                Ez = 0;
            }


            if (Xposition == - 3) {
                P1.setLocation(- 19, P1.getLocation().y);
                MovePX = 2;

                if (rng == 1) {
                    Animacion();
                } else if (rng == 2) {
                    P2Animacion();
                } else if (rng == 3) {
                    P3Animacion();
                } else if (rng == 4) {
                    P4Animacion();
                } else if (rng == 5) {
                    P5Animacion();
                }
            }

            try {
                sleep(10);
            } catch (Exception e) {
            }
        }
    }

    /**
     * Inicia a simulação da particula 2
     */
    public void P2Animacion() {
        int Xposition = - 3;
        int MovePX = 0;

        int Ex = - 19;
        int Ez = 2;

        int aux = 0;
        int rng = 0;

        Espaco.setLayer(Orbita2, 0);
        Espaco.setLayer(P2, 1);

        while (true) {
            Energias();


            P2.setLocation(Xposition, P2.getLocation().y);


            E2.setLocation(Ex, E2.getLocation().y);


            if (MovePX == 0) {
                Xposition += 3;
            } else if (MovePX == 1) {
                Xposition -= 3;
            } else {
            }


            if (Ez == 0) {
                Ex += 3;
            } else if (Ez == 1) {
                Ex -= 3;
            } else {
            }

            
            if (Xposition < Plano.getWidth() - 19) {
            } else if (Xposition > - 3) {
                MovePX = 1;
            }


            if ((MovePX == 1) && (Xposition < 164)) {
                aux++;
            }

            if (aux == 1) {
                Random sorte = new Random();
                int teto = 5;

                rng = sorte.nextInt(teto);
                rng++;

                System.out.println(rng);
            }


            if (rng == 0 || rng == 2) {
            } else if (rng == 1) {
                E2.setLocation(Xposition, E2.getLocation().y);
                Ez = 1;
            } else {
                Ez = 0;
            }


            if (Xposition == - 3) {
                P2.setLocation(- 19, P2.getLocation().y);
                MovePX = 2;

                if (rng == 1) {
                    Animacion();
                } else if (rng == 2) {
                    P2Animacion();
                } else if (rng == 3) {
                    P3Animacion();
                } else if (rng == 4) {
                    P4Animacion();
                } else if (rng == 5) {
                    P5Animacion();
                }
            }

            try {
                sleep(10);
            } catch (Exception e) {
            }
        }
    }

    /**
     * Inicia a animação da particula 3
     */
    public void P3Animacion() {
        int Xposition = - 3;
        int MovePX = 0;

        int Ex = - 19;
        int Ez = 2;

        int aux = 0;
        int rng = 0;

        Espaco.setLayer(Orbita3, 0);
        Espaco.setLayer(P3, 1);

        while (true) {
            Energias();


            P3.setLocation(Xposition, P3.getLocation().y);


            E3.setLocation(Ex, E3.getLocation().y);


            if (MovePX == 0) {
                Xposition += 4;
            } else if (MovePX == 1) {
                Xposition -= 4;
            } else {
            }


            if (Ez == 0) {
                Ex += 4;
            } else if (Ez == 1) {
                Ex -= 4;
            } else {
            }


            if (Xposition < Plano.getWidth() - 19) {
            } else if (Xposition > - 3) {
                MovePX = 1;
            }


            if ((MovePX == 1) && (Xposition < 164)) {
                aux++;
            }

            if (aux == 1) {
                Random sorte = new Random();
                int teto = 5;

                rng = sorte.nextInt(teto);
                rng++;

                System.out.println(rng);
            }


            if (rng == 0 || rng == 3) {
            } else if (rng == 1 || rng == 2) {
                E3.setLocation(Xposition, E3.getLocation().y);
                Ez = 1;
            } else {
                Ez = 0;
            }


            if (Xposition == - 3) {
                P3.setLocation(- 19, P3.getLocation().y);
                MovePX = 2;

                if (rng == 1) {
                    Animacion();
                } else if (rng == 2) {
                    P2Animacion();
                } else if (rng == 3) {
                    P3Animacion();
                } else if (rng == 4) {
                    P4Animacion();
                } else if (rng == 5) {
                    P5Animacion();
                }
            }

            try {
                sleep(10);
            } catch (Exception e) {
            }
        }
    }

    /**
     * Inicia a animação da particula 4
     */
    public void P4Animacion() {
        int Xposition = - 3;
        int MovePX = 0;

        int Ex = - 19;
        int Ez = 2;

        int aux = 0;
        int rng = 0;

        Espaco.setLayer(Orbita4, 0);
        Espaco.setLayer(P4, 1);

        while (true) {
            Energias();


            P4.setLocation(Xposition, P4.getLocation().y);


            E4.setLocation(Ex, E4.getLocation().y);


            if (MovePX == 0) {
                Xposition += 5;
            } else if (MovePX == 1) {
                Xposition -= 5;
            } else {
            }


            if (Ez == 0) {
                Ex += 5;
            } else if (Ez == 1) {
                Ex -= 5;
            } else {
            }


            if (Xposition < Plano.getWidth() - 19) {
            } else if (Xposition > - 3) {
                MovePX = 1;
            }


            if ((MovePX == 1) && (Xposition < 164)) {
                aux++;
            }

            if (aux == 1) {
                Random sorte = new Random();
                int teto = 5;

                rng = sorte.nextInt(teto);
                rng++;

                System.out.println(rng);
            }


            if (rng == 0 || rng == 4) {
            } else if (rng == 1 || rng == 2 || rng == 3) {
                E4.setLocation(Xposition, E4.getLocation().y);
                Ez = 1;
            } else {
                Ez = 0;
            }


            if (Xposition == - 3) {
                P4.setLocation(- 19, P4.getLocation().y);
                MovePX = 2;

                if (rng == 1) {
                    Animacion();
                } else if (rng == 2) {
                    P2Animacion();
                } else if (rng == 3) {
                    P3Animacion();
                } else if (rng == 4) {
                    P4Animacion();
                } else if (rng == 5) {
                    P5Animacion();
                }
            }

            try {
                sleep(10);
            } catch (Exception e) {
            }
        }
    }

    /**
     * Inicia a animação da particula5
     */
    public void P5Animacion() {
        int Xposition = - 3;
        int MovePX = 0;

        int EXposition = - 19;
        int MoveEX = 2;

        int aux = 0;
        int rng = 0;

        Espaco.setLayer(Orbita5, 0);
        Espaco.setLayer(P5, 1);

        while (true) {
            Energias();


            P5.setLocation(Xposition, P5.getLocation().y);


            E5.setLocation(EXposition, E5.getLocation().y);


            if (MovePX == 0) {
                Xposition += 6;
            } else if (MovePX == 1) {
                Xposition -= 6;
            } else {
            }


            if (MoveEX == 0) {
                EXposition += 6;
            } else if (MoveEX == 1) {
                EXposition -= 6;
            } else {
            }


            if (Xposition < Plano.getWidth() - 19) {
            } else if (Xposition > - 3) {
                MovePX = 1;
            }


            if ((MovePX == 1) && (Xposition < 164)) {
                aux++;
            }

            if (aux == 1) {
                Random sorte = new Random();
                int teto = 5;

                rng = sorte.nextInt(teto);
                rng++;

                System.out.println(rng);
            }


            if (rng == 0 || rng == 5) {
            } else {
                E5.setLocation(Xposition, E5.getLocation().y);
                MoveEX = 1;
            }


            if (Xposition == - 3) {
                P5.setLocation(- 19, P5.getLocation().y);
                MovePX = 2;

                if (rng == 1) {
                    Animacion();
                } else if (rng == 2) {
                    P2Animacion();
                } else if (rng == 3) {
                    P3Animacion();
                } else if (rng == 4) {
                    P4Animacion();
                } else if (rng == 5) {
                    P5Animacion();
                }
            }

            try {
                sleep(10);
            } catch (Exception e) {
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Y5 = new javax.swing.JLabel();
        Y4 = new javax.swing.JLabel();
        Y3 = new javax.swing.JLabel();
        Y2 = new javax.swing.JLabel();
        Y1 = new javax.swing.JLabel();
        N5 = new javax.swing.JLabel();
        N4 = new javax.swing.JLabel();
        N3 = new javax.swing.JLabel();
        N2 = new javax.swing.JLabel();
        N1 = new javax.swing.JLabel();
        X5 = new javax.swing.JLabel();
        X4 = new javax.swing.JLabel();
        X3 = new javax.swing.JLabel();
        X2 = new javax.swing.JLabel();
        X1 = new javax.swing.JLabel();
        X0 = new javax.swing.JLabel();
        Begin = new javax.swing.JPanel();
        E5 = new javax.swing.JLabel();
        E4 = new javax.swing.JLabel();
        E3 = new javax.swing.JLabel();
        E2 = new javax.swing.JLabel();
        E1 = new javax.swing.JLabel();
        Plano = new javax.swing.JPanel();
        Espaco = new javax.swing.JLayeredPane();
        P5 = new javax.swing.JLabel();
        P4 = new javax.swing.JLabel();
        P3 = new javax.swing.JLabel();
        P2 = new javax.swing.JLabel();
        P1 = new javax.swing.JLabel();
        Orbita5 = new javax.swing.JLabel();
        Orbita4 = new javax.swing.JLabel();
        Orbita3 = new javax.swing.JLabel();
        Orbita2 = new javax.swing.JLabel();
        Orbita1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Y5.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        Y5.setText(" 5");

        Y4.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        Y4.setText(" 4");

        Y3.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        Y3.setText(" 3");

        Y2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        Y2.setText(" 2");

        Y1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        Y1.setText(" 1");

        N5.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        N5.setText("n");

        N4.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        N4.setText("n");

        N3.setFont(new java.awt.Font("Bodoni MT Black", 0, 24)); // NOI18N
        N3.setText("n");

        N2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        N2.setText("n");

        N1.setFont(new java.awt.Font("Bodoni MT Black", 0, 24)); // NOI18N
        N1.setText("n");

        X5.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        X5.setText("5");

        X4.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        X4.setText("4");

        X3.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        X3.setText("3");

        X2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        X2.setText("2");

        X1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        X1.setText("1");

        X0.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        X0.setText("0");

        E5.setBackground(new java.awt.Color(52, 52, 52));
        E5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        E5.setForeground(new java.awt.Color(204, 0, 0));
        E5.setText("§");

        E4.setBackground(new java.awt.Color(52, 52, 52));
        E4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        E4.setForeground(new java.awt.Color(204, 102, 0));
        E4.setText("§");

        E3.setBackground(new java.awt.Color(52, 52, 52));
        E3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        E3.setForeground(new java.awt.Color(0, 102, 0));
        E3.setText("§");

        E2.setBackground(new java.awt.Color(52, 52, 52));
        E2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        E2.setForeground(new java.awt.Color(0, 0, 153));
        E2.setText("§");

        E1.setBackground(new java.awt.Color(53, 53, 53));
        E1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        E1.setForeground(new java.awt.Color(102, 0, 102));
        E1.setText("§");
        E1.setToolTipText("");
        E1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout BeginLayout = new javax.swing.GroupLayout(Begin);
        Begin.setLayout(BeginLayout);
        BeginLayout.setHorizontalGroup(
            BeginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BeginLayout.createSequentialGroup()
                .addGroup(BeginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(E5)
                    .addComponent(E1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(E4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(E2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(E3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 142, Short.MAX_VALUE))
        );
        BeginLayout.setVerticalGroup(
            BeginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BeginLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(E5)
                .addGap(45, 45, 45)
                .addComponent(E4)
                .addGap(35, 35, 35)
                .addComponent(E3)
                .addGap(20, 20, 20)
                .addComponent(E2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        Plano.setBackground(new java.awt.Color(204, 204, 204));
        Plano.setBorder(new javax.swing.border.MatteBorder(null));
        Plano.setForeground(new java.awt.Color(53, 53, 53));
        Plano.setToolTipText("");
        Plano.setPreferredSize(new java.awt.Dimension(500, 345));

        Espaco.setBackground(new java.awt.Color(255, 255, 255));
        Espaco.setOpaque(true);

        P5.setBackground(new java.awt.Color(52, 52, 52));
        P5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        P5.setForeground(new java.awt.Color(0, 0, 0));
        P5.setText("●");

        P4.setBackground(new java.awt.Color(52, 52, 52));
        P4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        P4.setForeground(new java.awt.Color(0, 0, 0));
        P4.setText("●");

        P3.setBackground(new java.awt.Color(52, 52, 52));
        P3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        P3.setForeground(new java.awt.Color(0, 0, 0));
        P3.setText("●");

        P2.setBackground(new java.awt.Color(52, 52, 52));
        P2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        P2.setForeground(new java.awt.Color(0, 0, 0));
        P2.setText("●");

        P1.setBackground(new java.awt.Color(53, 53, 53));
        P1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        P1.setForeground(new java.awt.Color(0, 0, 0));
        P1.setText("●");
        P1.setToolTipText("");
        P1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Orbita5.setBackground(new java.awt.Color(53, 53, 53));
        Orbita5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Orbita5.setForeground(new java.awt.Color(153, 0, 0));
        Orbita5.setText("_______________________________________________________________________");
        Orbita5.setMaximumSize(new java.awt.Dimension(500, 0));
        Orbita5.setMinimumSize(new java.awt.Dimension(500, 0));
        Orbita5.setPreferredSize(new java.awt.Dimension(500, 0));

        Orbita4.setBackground(new java.awt.Color(53, 53, 53));
        Orbita4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Orbita4.setForeground(new java.awt.Color(204, 102, 0));
        Orbita4.setText("___________________________________________________________________________________");
        Orbita4.setMaximumSize(new java.awt.Dimension(500, 0));
        Orbita4.setMinimumSize(new java.awt.Dimension(500, 0));
        Orbita4.setPreferredSize(new java.awt.Dimension(500, 0));

        Orbita3.setBackground(new java.awt.Color(53, 53, 53));
        Orbita3.setForeground(new java.awt.Color(0, 102, 0));
        Orbita3.setText("___________________________________________________________________________________________________");
        Orbita3.setMaximumSize(new java.awt.Dimension(500, 0));
        Orbita3.setMinimumSize(new java.awt.Dimension(500, 0));
        Orbita3.setPreferredSize(new java.awt.Dimension(500, 0));

        Orbita2.setBackground(new java.awt.Color(53, 53, 53));
        Orbita2.setForeground(new java.awt.Color(0, 0, 204));
        Orbita2.setText("___________________________________________________________________________________________________");
        Orbita2.setMaximumSize(new java.awt.Dimension(500, 0));
        Orbita2.setMinimumSize(new java.awt.Dimension(500, 0));
        Orbita2.setPreferredSize(new java.awt.Dimension(500, 0));

        Orbita1.setBackground(new java.awt.Color(53, 53, 53));
        Orbita1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Orbita1.setForeground(new java.awt.Color(102, 0, 102));
        Orbita1.setText("___________________________________________________________________________________");
        Orbita1.setMaximumSize(new java.awt.Dimension(500, 0));
        Orbita1.setMinimumSize(new java.awt.Dimension(500, 0));
        Orbita1.setPreferredSize(new java.awt.Dimension(500, 0));

        Espaco.setLayer(P5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Espaco.setLayer(P4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Espaco.setLayer(P3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Espaco.setLayer(P2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Espaco.setLayer(P1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Espaco.setLayer(Orbita5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Espaco.setLayer(Orbita4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Espaco.setLayer(Orbita3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Espaco.setLayer(Orbita2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Espaco.setLayer(Orbita1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EspacoLayout = new javax.swing.GroupLayout(Espaco);
        Espaco.setLayout(EspacoLayout);
        EspacoLayout.setHorizontalGroup(
            EspacoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EspacoLayout.createSequentialGroup()
                .addGroup(EspacoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EspacoLayout.createSequentialGroup()
                        .addComponent(Orbita5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EspacoLayout.createSequentialGroup()
                        .addComponent(Orbita1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34)
                        .addComponent(P1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EspacoLayout.createSequentialGroup()
                        .addComponent(Orbita4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EspacoLayout.createSequentialGroup()
                        .addComponent(Orbita2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EspacoLayout.createSequentialGroup()
                        .addComponent(Orbita3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P3)))
                .addContainerGap())
        );
        EspacoLayout.setVerticalGroup(
            EspacoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EspacoLayout.createSequentialGroup()
                .addGroup(EspacoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P5)
                    .addGroup(EspacoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Orbita5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(EspacoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EspacoLayout.createSequentialGroup()
                        .addComponent(Orbita4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGroup(EspacoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EspacoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(P3)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EspacoLayout.createSequentialGroup()
                        .addComponent(Orbita3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addGroup(EspacoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EspacoLayout.createSequentialGroup()
                        .addComponent(Orbita2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGroup(EspacoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EspacoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EspacoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Orbita1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PlanoLayout = new javax.swing.GroupLayout(Plano);
        Plano.setLayout(PlanoLayout);
        PlanoLayout.setHorizontalGroup(
            PlanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Espaco, javax.swing.GroupLayout.PREFERRED_SIZE, 498, Short.MAX_VALUE)
        );
        PlanoLayout.setVerticalGroup(
            PlanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Espaco)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(X0)
                        .addGap(85, 85, 85)
                        .addComponent(X1)
                        .addGap(85, 85, 85)
                        .addComponent(X2)
                        .addGap(85, 85, 85)
                        .addComponent(X3)
                        .addGap(85, 85, 85)
                        .addComponent(X4)
                        .addGap(85, 85, 85)
                        .addComponent(X5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Begin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Plano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(N4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Y4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(N5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Y5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(N3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Y3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(N2)
                            .addComponent(N1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Y1)
                            .addComponent(Y2))))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(N5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Y5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(N4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Y4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(N3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Y3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(N2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Y2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(N1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Y1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Plano, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Begin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(X5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(X4)
                                .addComponent(X3)
                                .addComponent(X2)
                                .addComponent(X1)
                                .addComponent(X0)))
                        .addGap(24, 24, 24))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Animation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Animation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Animation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Animation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Animation().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Begin;
    private javax.swing.JLabel E1;
    private javax.swing.JLabel E2;
    private javax.swing.JLabel E3;
    private javax.swing.JLabel E4;
    private javax.swing.JLabel E5;
    private javax.swing.JLayeredPane Espaco;
    private javax.swing.JLabel N1;
    private javax.swing.JLabel N2;
    private javax.swing.JLabel N3;
    private javax.swing.JLabel N4;
    private javax.swing.JLabel N5;
    private javax.swing.JLabel Orbita1;
    private javax.swing.JLabel Orbita2;
    private javax.swing.JLabel Orbita3;
    private javax.swing.JLabel Orbita4;
    private javax.swing.JLabel Orbita5;
    private javax.swing.JLabel P1;
    private javax.swing.JLabel P2;
    private javax.swing.JLabel P3;
    private javax.swing.JLabel P4;
    private javax.swing.JLabel P5;
    private javax.swing.JPanel Plano;
    private javax.swing.JLabel X0;
    private javax.swing.JLabel X1;
    private javax.swing.JLabel X2;
    private javax.swing.JLabel X3;
    private javax.swing.JLabel X4;
    private javax.swing.JLabel X5;
    private javax.swing.JLabel Y1;
    private javax.swing.JLabel Y2;
    private javax.swing.JLabel Y3;
    private javax.swing.JLabel Y4;
    private javax.swing.JLabel Y5;
    // End of variables declaration//GEN-END:variables
}
