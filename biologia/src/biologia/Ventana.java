package biologia;

import java.util.Random;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
    }
    
    public void Reproducir(String nombreSonido) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(nombreSonido).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido.");
        }
    }
    public void ReproducirLoop(String nombreSonido) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(nombreSonido).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.loop(1);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido.");
        }
    }
    
    int a;
    //la bandera sirve para verificar que se a respondido correctamente
    boolean bandera = false;
    // se selecciona la pregunta al azar
    void random(String valor) {
        //el numero que se calculado es la pregunta
        int random = 0;
        int min = 0;//número inicio
        int max = 9;//número final
        int range = max - min + 1;
        int b = (int) (Math.random() * range) + min;
        a = b;
    }
    //pregunta,1,2,3,4 (los numero estan en orden de respuesta)
    void enlace(String valor) {
        String opcinepreguntas = null;
        opcinepreguntas = String.valueOf(a);
        switch (opcinepreguntas) {
            case "0" ->     //pregunta                opcion1    1                opcion2       2           opcion3 3  opcion4 4
                this.opcion("La infertilidad es...", "Imposibilidad de procrear", "Que no nazca la planta", "El suelo", "Otro");
            case "1" ->
                this.opcion("La andropausia es unproceso donde...", "No hay embarazo", "Las capacidades disminuyen", "Se puede morir", "Todas son correctas");
            case "2" ->
                this.opcion("¿Cuál de las siguientes opciones no es una causa de la andropausia?", "Falta de actividad sexual", "Nivel bajo de testosterona ", "Factores hereditarios", "Otro");
            case "3" ->
                this.opcion("La andropausia se da en...", "Niños", "Mujeres", "Hombres", "Todos");
            case "4" ->
                this.opcion("¿A qué edad se presenta mayormente la infertilidad masculina?", "40", "10", "50", "30");
            case "5" ->
                this.opcion("¿A qué edad se presenta mayormente la infertilidad femenina?", "20-40", "40", "60", "45-51");
            case "6" ->
                this.opcion("¿Qué causa la andropausia?","Comer mucho", "Todos", " Los bajos niveles de testosterona en el cuerpo", "Ninguno");
            case "7" ->
                this.opcion("La andropausia es un proceso natural ? ", "Si", "No", "Tal vez", "");
            case "8" ->
                this.opcion("Cuál de estas es una causa de la infertilidad femenina?", "Falta de actividad sexual", "Alteraciones de la ovulación", "Ninguna","Todas");
            case "9"->
                this.opcion("Se puede revertir la infertilidad  ?", "No", "A veces", "Si", "Es imposible");
        }
    }

    void re(String valor) {
        String repuestas;
        repuestas = String.valueOf(a);
        switch (repuestas) {
            case "0" ->
                this.verificarRespuesta("1");//se selecciona la opcion correcta en este caso opcion1
            case "1" ->
                this.verificarRespuesta("2");//opcion2
            case "2" ->
                this.verificarRespuesta("1");
            case "3" ->
                this.verificarRespuesta("3");//opcion3
            case "4" ->
                this.verificarRespuesta("1");
            case "5" ->
                this.verificarRespuesta("4");//opcion4
            case "6" ->
                this.verificarRespuesta("3");
            case "7" ->
                this.verificarRespuesta("1");
            case "8" ->
                this.verificarRespuesta("3");
            case "9" ->
                this.verificarRespuesta("2");
        }
    }
    String btSeleccionado = null;

    public void verificarRespuesta(String correcto) {

        if (btSeleccionado == correcto) {
            Reproducir("/home/trabajo/Música/StarshipSmlByFrom PE1077204_preview.wav");
            JOptionPane.showMessageDialog(null, "correcto");
            bandera = true;
        } else {
            Reproducir("/home/trabajo/Música/BeepWrongButtonAle MM013101_preview.wav");
            JOptionPane.showMessageDialog(null, "incorrecto");
            bandera = false;
        }
    }
    //se rellenan los botones con las opciones antes escritas
    public void opcion(String nombre, String op1, String op2, String op3, String op4) {
        txtPregunta.setText(nombre);
        r1.setText(op1);
        r2.setText(op2);
        r3.setText(op3);
        r4.setText(op4);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGradient3 = new Panel_gradiend.PanelGradient();
        panelGradient1 = new Panel_gradiend.PanelGradient();
        jLabel1 = new javax.swing.JLabel();
        panelGradient4 = new Panel_gradiend.PanelGradient();
        txtPregunta = new javax.swing.JLabel();
        panelGradient2 = new Panel_gradiend.PanelGradient();
        r2 = new javax.swing.JButton();
        panelGradient5 = new Panel_gradiend.PanelGradient();
        r1 = new javax.swing.JButton();
        panelGradient6 = new Panel_gradiend.PanelGradient();
        r4 = new javax.swing.JButton();
        panelGradient7 = new Panel_gradiend.PanelGradient();
        r3 = new javax.swing.JButton();
        panelGradient8 = new Panel_gradiend.PanelGradient();
        panelGradient9 = new Panel_gradiend.PanelGradient();
        jLabel4 = new javax.swing.JLabel();
        panelGradient10 = new Panel_gradiend.PanelGradient();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        getContentPane().setLayout(null);

        panelGradient3.setBackground(new java.awt.Color(23, 23, 23));
        panelGradient3.setColorGradient(new java.awt.Color(42, 42, 42));
        panelGradient3.setGradientType(Panel_gradiend.PanelGradient.GradientType.VERTICAL);

        panelGradient1.setBackground(new java.awt.Color(224, 9, 229));
        panelGradient1.setColorGradient(new java.awt.Color(36, 78, 208));
        panelGradient1.setRadius(35);
        panelGradient1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelGradient1MouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(254, 254, 254));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 217, 217));
        jLabel1.setText("Iniciar");
        panelGradient1.add(jLabel1);
        jLabel1.setBounds(20, 10, 60, 17);

        panelGradient3.add(panelGradient1);
        panelGradient1.setBounds(170, 200, 90, 40);

        panelGradient4.setBackground(new java.awt.Color(36, 78, 208));
        panelGradient4.setColorGradient(new java.awt.Color(224, 9, 229));
        panelGradient4.setRadius(20);

        txtPregunta.setBackground(new java.awt.Color(254, 242, 242));
        txtPregunta.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        txtPregunta.setForeground(new java.awt.Color(254, 238, 238));
        panelGradient4.add(txtPregunta);
        txtPregunta.setBounds(4, 0, 810, 35);

        panelGradient3.add(panelGradient4);
        panelGradient4.setBounds(280, 200, 820, 40);

        panelGradient2.setBackground(new java.awt.Color(224, 9, 229));
        panelGradient2.setColorGradient(new java.awt.Color(36, 78, 208));
        panelGradient2.setRadius(30);

        r2.setBackground(new java.awt.Color(246, 246, 246));
        r2.setFont(new java.awt.Font("Roboto Medium", 1, 17)); // NOI18N
        r2.setForeground(new java.awt.Color(254, 254, 254));
        r2.setBorderPainted(false);
        r2.setContentAreaFilled(false);
        r2.setFocusPainted(false);
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        panelGradient2.add(r2);
        r2.setBounds(0, 0, 430, 50);

        panelGradient3.add(panelGradient2);
        panelGradient2.setBounds(160, 370, 430, 50);

        panelGradient5.setBackground(new java.awt.Color(224, 9, 229));
        panelGradient5.setColorGradient(new java.awt.Color(36, 78, 208));
        panelGradient5.setRadius(30);

        r1.setBackground(new java.awt.Color(87, 87, 87));
        r1.setFont(new java.awt.Font("Roboto Medium", 1, 17)); // NOI18N
        r1.setForeground(new java.awt.Color(254, 254, 254));
        r1.setBorderPainted(false);
        r1.setContentAreaFilled(false);
        r1.setFocusPainted(false);
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        panelGradient5.add(r1);
        r1.setBounds(0, 0, 430, 50);

        panelGradient3.add(panelGradient5);
        panelGradient5.setBounds(160, 290, 430, 50);

        panelGradient6.setBackground(new java.awt.Color(224, 9, 229));
        panelGradient6.setColorGradient(new java.awt.Color(36, 78, 208));
        panelGradient6.setRadius(30);

        r4.setBackground(new java.awt.Color(87, 87, 87));
        r4.setFont(new java.awt.Font("Roboto Medium", 1, 17)); // NOI18N
        r4.setForeground(new java.awt.Color(254, 254, 254));
        r4.setBorderPainted(false);
        r4.setContentAreaFilled(false);
        r4.setFocusPainted(false);
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });
        panelGradient6.add(r4);
        r4.setBounds(0, 0, 460, 50);

        panelGradient3.add(panelGradient6);
        panelGradient6.setBounds(650, 370, 460, 50);

        panelGradient7.setBackground(new java.awt.Color(224, 9, 229));
        panelGradient7.setColorGradient(new java.awt.Color(36, 78, 208));
        panelGradient7.setRadius(30);

        r3.setFont(new java.awt.Font("Roboto Medium", 1, 17)); // NOI18N
        r3.setForeground(new java.awt.Color(254, 254, 254));
        r3.setBorderPainted(false);
        r3.setContentAreaFilled(false);
        r3.setFocusPainted(false);
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });
        panelGradient7.add(r3);
        r3.setBounds(0, 0, 460, 50);

        panelGradient3.add(panelGradient7);
        panelGradient7.setBounds(650, 290, 460, 50);

        getContentPane().add(panelGradient3);
        panelGradient3.setBounds(170, 0, 1200, 790);

        panelGradient8.setBackground(new java.awt.Color(48, 48, 48));
        panelGradient8.setColorGradient(new java.awt.Color(13, 13, 13));
        panelGradient8.setGradientType(Panel_gradiend.PanelGradient.GradientType.VERTICAL);

        panelGradient9.setBackground(new java.awt.Color(115, 36, 208));
        panelGradient9.setColorGradient(new java.awt.Color(244, 8, 53));
        panelGradient9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelGradient9MouseClicked(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(254, 238, 238));
        jLabel4.setText("Salir");
        panelGradient9.add(jLabel4);
        jLabel4.setBounds(50, 10, 41, 17);

        panelGradient8.add(panelGradient9);
        panelGradient9.setBounds(20, 720, 130, 30);

        panelGradient10.setBackground(new java.awt.Color(36, 78, 208));
        panelGradient10.setColorGradient(new java.awt.Color(199, 30, 163));
        panelGradient10.setRadius(20);

        jLabel3.setForeground(new java.awt.Color(254, 238, 238));
        jLabel3.setText("andropausia");
        panelGradient10.add(jLabel3);
        jLabel3.setBounds(20, 10, 90, 17);

        panelGradient8.add(panelGradient10);
        panelGradient10.setBounds(20, 140, 120, 40);

        jLabel2.setBackground(new java.awt.Color(254, 254, 254));
        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 238, 238));
        jLabel2.setText("Quist");
        panelGradient8.add(jLabel2);
        jLabel2.setBounds(40, 50, 70, 40);

        getContentPane().add(panelGradient8);
        panelGradient8.setBounds(0, 0, 170, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // boton1
        btSeleccionado = "1";
        re("");
        if (bandera == true) {
            random("");
            enlace("");
            bandera = false;
        } else {
        }
    }//GEN-LAST:event_r1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // boton2
        btSeleccionado = "2";
        re("");
        if (bandera == true) {
            random("");
            enlace("");
            bandera = false;
        } else {
        }
    }//GEN-LAST:event_r2ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        // boton3
        btSeleccionado = "3";
        re("");
        if (bandera == true) {
            random("");
            enlace("");
            bandera = false;
        } else {
        }
    }//GEN-LAST:event_r3ActionPerformed

    private void panelGradient1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGradient1MouseClicked
        // iniciar juego
        ReproducirLoop("/home/trabajo/Música/Memories.wav");
        random("");
        enlace("");
    }//GEN-LAST:event_panelGradient1MouseClicked

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
        // opcion4
        btSeleccionado = "4";
        re("");
        if (bandera == true) {
            random("");
            enlace("");
            bandera = false;
        } else {
        }
    }//GEN-LAST:event_r4ActionPerformed

    private void panelGradient9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGradient9MouseClicked
        // boton para salir
        System.exit(0);
    }//GEN-LAST:event_panelGradient9MouseClicked

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private Panel_gradiend.PanelGradient panelGradient1;
    private Panel_gradiend.PanelGradient panelGradient10;
    private Panel_gradiend.PanelGradient panelGradient2;
    private Panel_gradiend.PanelGradient panelGradient3;
    private Panel_gradiend.PanelGradient panelGradient4;
    private Panel_gradiend.PanelGradient panelGradient5;
    private Panel_gradiend.PanelGradient panelGradient6;
    private Panel_gradiend.PanelGradient panelGradient7;
    private Panel_gradiend.PanelGradient panelGradient8;
    private Panel_gradiend.PanelGradient panelGradient9;
    private javax.swing.JButton r1;
    private javax.swing.JButton r2;
    private javax.swing.JButton r3;
    private javax.swing.JButton r4;
    private javax.swing.JLabel txtPregunta;
    // End of variables declaration//GEN-END:variables
}
