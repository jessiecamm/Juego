/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Jessie
 */
public class Pantalla extends javax.swing.JPanel {

    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
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

        nuestroPanel = new javax.swing.JPanel();
        titulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto_resultado = new javax.swing.JTextArea();
        panelVillano = new javax.swing.JLabel();
        panelHeroe = new javax.swing.JLabel();
        boton = new javax.swing.JButton();

        nuestroPanel.setBackground(new java.awt.Color(192, 36, 37));
        nuestroPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nuestroPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nuestroPanel.setFocusCycleRoot(true);
        nuestroPanel.setPreferredSize(new java.awt.Dimension(700, 542));

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
        texto_resultado.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        texto_resultado.setLineWrap(true);
        texto_resultado.setRows(5);
        texto_resultado.setBorder(null);
        jScrollPane1.setViewportView(texto_resultado);

        panelVillano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cruela.png"))); // NOI18N

        panelHeroe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelHeroe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Rober.png"))); // NOI18N

        boton.setBackground(new java.awt.Color(0, 0, 0));
        boton.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        boton.setForeground(new java.awt.Color(255, 255, 255));
        boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/click1.png"))); // NOI18N
        boton.setText("Fight!");
        boton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton.setContentAreaFilled(false);
        boton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        boton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        boton.setIconTextGap(6);
        boton.setPreferredSize(new java.awt.Dimension(62, 29));
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nuestroPanelLayout = new javax.swing.GroupLayout(nuestroPanel);
        nuestroPanel.setLayout(nuestroPanelLayout);
        nuestroPanelLayout.setHorizontalGroup(
            nuestroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuestroPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(nuestroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(nuestroPanelLayout.createSequentialGroup()
                        .addComponent(panelVillano)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelHeroe, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        nuestroPanelLayout.setVerticalGroup(
            nuestroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuestroPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(nuestroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelVillano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelHeroe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nuestroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nuestroPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonActionPerformed

    private void tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel nuestroPanel;
    private javax.swing.JLabel panelHeroe;
    private javax.swing.JLabel panelVillano;
    private javax.swing.JTextArea texto_resultado;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}

