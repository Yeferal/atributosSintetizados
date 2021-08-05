/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4;

import java.awt.Component;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author yeferal
 */
public class VentanaInicio extends javax.swing.JFrame {

    /**
     * Creates new form VentanaInicio
     */
    public VentanaInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        //JLabel lab = new JLabel();
        //lab.setName("foto");
        //scrollPanel.add(lab);
        
    }
    
    private void mostrarResultados(AST ast){
        jTextArea1.setText(ast.getRaiz().getTxtSalida());
        /*Component[] d = scrollPanel.getComponents();
		for(int index=0;index<d.length;index++){
			System.out.println(d[index].getName());
                        System.out.println(d[index].getClass());
			if((d[index].getName()=="foto")){
				scrollPanel.remove(d[index]);
			}
		}
        */
        ImageIcon icon = new ImageIcon("./arbol.jpg");
        JLabel label = new JLabel();
        label.setName("foto");
        label.setSize(icon.getIconWidth(), icon.getIconHeight());
        label.setIcon(icon);
//        jLabel2 = label;
//        jLabel2.setIcon(null);
//        jLabel2.removeAll();
//        jLabel2.setIcon(new ImageIcon("./arbol.jpg"));
//        jLabel2.repaint();
        scrollPanel.add(label);
        scrollPanel.setViewportView(label);
        scrollPanel.getViewport().repaint();
        scrollPanel.getViewport().revalidate();
        scrollPanel.repaint();
        //label.repaint();
        
//        labelImagen.setIcon(null);
//        labelImagen.removeAll();
//        //labelImagen.setAutoscrolls(false);
//        labelImagen.setIcon(new ImageIcon("./arbol.jpg"));
        
        //labelImagen.setIcon(null);
//        labelImagen.repaint();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaEntrada = new javax.swing.JTextArea();
        botonAnalizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        scrollPanel = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textAreaEntrada.setColumns(20);
        textAreaEntrada.setRows(5);
        textAreaEntrada.setText("5+((1+2)*4)+3");
        jScrollPane1.setViewportView(textAreaEntrada);

        botonAnalizar.setText("Analizar");
        botonAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnalizarActionPerformed(evt);
            }
        });

        jLabel1.setText("Resultado: ");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        scrollPanel.setViewportView(jLabel2);

        jButton1.setText("Limpiar");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(botonAnalizar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonAnalizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanel)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnalizarActionPerformed
        String texto = textAreaEntrada.getText();
        AnalizadorLexico analizadorLexico = new AnalizadorLexico(new StringReader(texto));
        AnalizadorSintactico analizadorSintactico = new AnalizadorSintactico(analizadorLexico);
        try {
            analizadorSintactico.parse();
            Nodo nodoNuevo = analizadorSintactico.nodo;
            AST ast = new AST();
            ast.recorrerArbol(nodoNuevo);
            mostrarResultados(ast);
            ast.mostrar();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_botonAnalizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*Component[] d = scrollPanel.getComponents();
		for(int index=0;index<d.length;index++){
			System.out.println(d[index].getName());
			if((d[index].getName()=="foto")){
				scrollPanel.remove(d[index]);
			}
		}*/
                scrollPanel.setViewportView(null);
                this.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnalizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JTextArea textAreaEntrada;
    // End of variables declaration//GEN-END:variables
}
