/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Heroes;
import Modelo.Super_X;
import Modelo.Villanos;

/**
 *
 * @author Jessie
 */
public class rePantalla extends javax.swing.JFrame {

    /**
     * Creates new form rePantalla
     */
    public rePantalla() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto_resultado = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(192, 36, 37));

        titulo.setBackground(new java.awt.Color(192, 36, 37));
        titulo.setFont(new java.awt.Font("Ebrima", 1, 30)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        titulo.setText("LET THE GAME BEGIN");
        titulo.setBorder(null);
        titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloActionPerformed(evt);
            }
        });

        texto_resultado.setBackground(new java.awt.Color(153, 0, 0));
        texto_resultado.setColumns(20);
        texto_resultado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        texto_resultado.setForeground(new java.awt.Color(255, 255, 255));
        texto_resultado.setLineWrap(true);
        texto_resultado.setRows(5);
        texto_resultado.setBorder(null);
        texto_resultado.setDoubleBuffered(true);
        jScrollPane1.setViewportView(texto_resultado);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("FIGHT!");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(267, 267, 267))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(168, 168, 168))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        texto_resultado.setText("Mortal Kombat 2.0\n");        
        texto_resultado.append("By Camm & Marto\n");
                
        //Creación de Heroes
        Heroes h1=new Heroes();
        h1.setEnergia(100);
        h1.setPais_origen("Inglaterra");
        h1.setNombre("Rober-Tone");
        h1.setHabilidad_ppal("Decibeles Mortales");
        h1.setIndice_bondad(9);
        
        Heroes h2=new Heroes("Halcón del desierto","Nueva Zelanda", "Ojos láser", 100, 8);        
        
        //Creación de Villanos
        Villanos v1=new Villanos();
        v1.setEnergia(100);
        v1.setNombre("Cruela");
        v1.setPais_origen("Italia");
        v1.setHabilidad_ppal("Vuela muy alto");
        v1.setIndice_maldad(10);
        
        Villanos v2=new Villanos("Destructor", "Nueva York", "Fuerza extrema",100, 9);        
        
        texto_resultado.append("\nPRESENTACIÓN DE PERSONAJES: \n");
        
        texto_resultado.append("\n\nHEROES:\n");
        texto_resultado.append(h1.toString()+ "\n");
        texto_resultado.append("Índice de Bondad > "+ h1.getIndice_bondad()+ "\n");
                
        texto_resultado.append(h2.toString()+ "\n");
        texto_resultado.append("Índice de Bondad > "+ h2.getIndice_bondad()+ "\n");
        
        texto_resultado.append("\n\nVILLANOS:\n");
        texto_resultado.append(v1.toString()+ "\n");
        texto_resultado.append("Índice de Maldad > "+ v1.getIndice_maldad()+ "\n");
        
        texto_resultado.append(v2.toString() + "\n");
        texto_resultado.append("Índice de Maldad > "+ v2.getIndice_maldad()+ "\n");
        
        texto_resultado.append("\n\nQUÉ COMIENCE EL JUEGO!\n\n");     
        texto_resultado.append("Hoy se enfrentan:\n ");
        int minimo = 1;
        int maximo = 2;   
        
        int luchador1 = Heroes.generarNumeroAleatorio(minimo, maximo);
        switch(luchador1) {
            case 1:
                texto_resultado.append(h1.getNombre()+ " vs. ");                              
                break;
            case 2:
                texto_resultado.append(h2.getNombre()+ " vs. ");                
                break;
            default:
                break;            
        }
        
        int luchador2 = Villanos.generarNumeroAleatorio(minimo, maximo);
        switch(luchador2)  {
            case 1:
                texto_resultado.append(v1.getNombre());                
                texto_resultado.append("\nAmbos comienzan el encuentro con una energía del 100%\n\n");
                break;
            case 2:
                texto_resultado.append(v2.getNombre());
                texto_resultado.append("\nAmbos comienzan el encuentro con una energía del 100%\n\n");
                break;
            default:
                break;
        }           
                            
        texto_resultado.append("LET'S FIGHT!\n\n");
        
            while ((h1.getEnergia() > 0) && (v1.getEnergia() > 0)) {            
            minimo = 1;
            maximo = 4;
            int golpeHeroes = Super_X.generarNumeroAleatorio(minimo, maximo);
            int golpeVillanos = Super_X.generarNumeroAleatorio(minimo, maximo);
            int golpe;      
        
            switch(golpeHeroes) {
                case 1:
                    golpe = h1.debilitar(v1.atacarVillano_1());
                    texto_resultado.append("----- A " + h1.getNombre() + " le queda " +golpe +  "% de energía.\n");
                    break;
                case 2:
                    golpe = h1.debilitar(v1.atacarVillano_2());
                    texto_resultado.append("----- A " + h1.getNombre() + " le queda " +golpe +  "% de energía.\n");
                    break;
                case 3:
                    golpe = h1.debilitar(v1.atacarVillano_3());
                    texto_resultado.append("----- A " + h1.getNombre() + " le queda " +golpe +  "% de energía.\n");
                    break;
                case 4:
                    golpe = h1.debilitar(v1.atacarVillano_4());
                    texto_resultado.append("----- A " + h1.getNombre() + " le queda " +golpe +  "% de energía.\n");
                    break;
                default:
                    break;
            }
            switch(golpeVillanos) {
                case 1:
                    golpe = v1.debilitar(h1.atacarHeroe_1());
                    texto_resultado.append("----- A " + v1.getNombre() + " le queda " +golpe +  "% de energía.\n");
                    texto_resultado.append("***************************************************************************\n\n");
                    break;
                case 2:
                    golpe = v1.debilitar(h1.atacarHeroe_2());
                    texto_resultado.append("----- A " + v1.getNombre() + " le queda " +golpe +  "% de energía.\n");
                    texto_resultado.append("***************************************************************************\n\n");
                    break;
                case 3:
                    golpe = v1.debilitar(h1.atacarHeroe_3());
                    texto_resultado.append("----- A " + v1.getNombre() + " le queda " +golpe +  "% de energía.\n");
                    texto_resultado.append("***************************************************************************\n\n");
                    break;
                case 4:
                    golpe = v1.debilitar(h1.atacarHeroe_4());
                    texto_resultado.append("----- A " + v1.getNombre() + " le queda " +golpe +  "% de energía.\n");
                    texto_resultado.append("***************************************************************************\n\n");
                    break;
                default:
                    break;
            }
            
            int energia_actual_Villanos=v1.getEnergia();
            int energia_actual_Heroes=h1.getEnergia();
            if ((energia_actual_Villanos <= 0) && (energia_actual_Heroes > 0)) {
                texto_resultado.append(h1.getNombre()+ " ha vencido a " + v1.getNombre() + "!! \n");
                texto_resultado.append(v1.getNombre() + " ha muerto.\n"); 
                texto_resultado.append(" May the forth be with her.\n\n");
            }
            else if ((energia_actual_Heroes <= 0) && (energia_actual_Villanos > 0)) {
                texto_resultado.append(v1.getNombre()+ " ha vencido a " + h1.getNombre() + "!! \n");
                texto_resultado.append(h1.getNombre() + " ha muerto.\n");
                texto_resultado.append(" May the forth be with him.\n\n");
            }
            else if((energia_actual_Villanos <=0) && (energia_actual_Heroes <=0)) {
                texto_resultado.append("Ambos son PERDEDORES, han muerto!!!!\n");
                texto_resultado.append(" Ahora pelean para el más allá. Bienvenidos al mundo ZOMBIE.\n\n");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(rePantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rePantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rePantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rePantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rePantalla().setVisible(true);
            }
        });        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea texto_resultado;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}
