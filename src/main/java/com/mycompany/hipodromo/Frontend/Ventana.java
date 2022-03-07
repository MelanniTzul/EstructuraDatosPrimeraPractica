package com.mycompany.hipodromo.Frontend;

import com.mycompany.hipodromo.ListaEnlazadaDoble.ListaEnlazadaDoble;
import com.mycompany.hipodromo.Persona.Apuesta;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Melanni Tzul
 */
public class Ventana extends javax.swing.JFrame {

    // Apuesta apostador = new Apuesta();//Creo objeto de apostador
    private Apuesta[] arrayApuestas;// Creo una variable global de un array de tipo Apuesta, para poder guardar mis apuestas
    ListaEnlazadaDoble EnlazadaDoble;
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null);//centrar ventana
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1AreaCargaArchivo = new javax.swing.JTextArea();
        jButton1CargarArchivo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4Reportes = new javax.swing.JButton();
        jButton2IngresarApuestas = new javax.swing.JButton();
        jButton3VefificacionApuestas = new javax.swing.JButton();
        jButton1NuevaApuesta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manejo de apuestas y control de Hipódromo");

        jLabel1.setText("Hipódromo");

        jTextArea1AreaCargaArchivo.setColumns(20);
        jTextArea1AreaCargaArchivo.setRows(5);
        jScrollPane1.setViewportView(jTextArea1AreaCargaArchivo);

        jButton1CargarArchivo.setText("Cargar apuestas");
        jButton1CargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CargarArchivoActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingreso de las apuestas:");

        jButton4Reportes.setText("Reportes");
        jButton4Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ReportesActionPerformed(evt);
            }
        });

        jButton2IngresarApuestas.setText("Ingresar Apuestas");
        jButton2IngresarApuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2IngresarApuestasActionPerformed(evt);
            }
        });

        jButton3VefificacionApuestas.setText("Ingreso de Resultados ");
        jButton3VefificacionApuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3VefificacionApuestasActionPerformed(evt);
            }
        });

        jButton1NuevaApuesta.setText("Nueva Apuesta");
        jButton1NuevaApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1NuevaApuestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3VefificacionApuestas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2IngresarApuestas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1CargarArchivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4Reportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1NuevaApuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jButton1CargarArchivo)
                .addGap(31, 31, 31)
                .addComponent(jButton2IngresarApuestas)
                .addGap(34, 34, 34)
                .addComponent(jButton3VefificacionApuestas)
                .addGap(47, 47, 47)
                .addComponent(jButton4Reportes)
                .addGap(42, 42, 42)
                .addComponent(jButton1NuevaApuesta)
                .addContainerGap(199, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
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

    //*Le creo el evento al boton para cargar el archivo de entrada, que se carga en el texArea*//
    private void jButton1CargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CargarArchivoActionPerformed
        jTextArea1AreaCargaArchivo.setText("");//Limpiar el tex Area
        JFileChooser VentanaCargaArchivo = new JFileChooser(); //Creo mi objeto file chooser, que me permite abrir una ventana para cargar mi archivo
        //Usamos un entero, el nombre de nuestro objeto JFileCooser 
        int numero = VentanaCargaArchivo.showOpenDialog(this);//This significa que abrira la ventana encima de nuesta ventana principal me gurda el valor de la opcion escogida
        if (numero == JFileChooser.APPROVE_OPTION) { // condicione para que sea la opcion que si se guardo mi archivo
            String linea;//Creo una variable tipo String
            File Archivo = VentanaCargaArchivo.getSelectedFile();//Con el File leo archivo. Se crea un archivo y se guarda el archivo que seleccionamos getSelectefFile(obtener archivo seleccionado)
            try {
                FileReader LeerArchivo = new FileReader(Archivo);//Leemos el archivo seleccionado, lo convierte en un archivo de lectura
                BufferedReader TextoLeido = new BufferedReader(LeerArchivo);//Para que escriba linea por linea, BufferedReader va leyendo linea por linea
                //siclo para ir leyendo todo el archivo linea por linea
                while ((linea = TextoLeido.readLine()) != null) {
                    jTextArea1AreaCargaArchivo.append(linea + "\n");//Mostramos linea por linea en el tex area y usamos append para que se coloque una debajo de otra

                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al leer el archivo");
            }          
        }
    }//GEN-LAST:event_jButton1CargarArchivoActionPerformed

    //*Le creo el evento al boton para ingresar las apuestas que se cargan en mi textArea*//
    private void jButton2IngresarApuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2IngresarApuestasActionPerformed
        //Llamamos a la funcion y le enviamos como parametro el texto cargado del jTextArea1AreaCargaArchivo
        IngresarApuesta(jTextArea1AreaCargaArchivo);
        jTextArea1AreaCargaArchivo.setEditable(false);//Desabilitar la edicion de texto
        JOptionPane.showMessageDialog(null,"Apuestas Ingresadas y  Cerradas");//Desplegar mensaje
        jButton2IngresarApuestas.setEnabled(false);//Desabilitar el boton
        jButton1CargarArchivo.setEnabled(false);

    }//GEN-LAST:event_jButton2IngresarApuestasActionPerformed
    
    /**
     *Utilizando la notación BigO
     * Complejidad O(n)
     */
    //Funcion para ingresar mis apuestas al Array
    private void IngresarApuesta(JTextArea TextoCargado) {
        arrayApuestas = new Apuesta[TextoCargado.getLineCount()]; //Obtengo el numero de lineas que trae mi texto cargado o ingresado
        String[] ArrayLineas = TextoCargado.getText().split("\n");//Obtengo el texto linea por linea
        try {
             for (int i = 0; i < ArrayLineas.length; i++) {
            String[] ArrayPalabras = ArrayLineas[i].split(",");// Nuevo array para guardar por palabras
            if (ArrayPalabras.length == 12) {//Doce datos correctos que se ingresaran en mi archivo cargado
                Double monto = Double.parseDouble(ArrayPalabras[1]);//Convertir el String de monto a double 
                //Convertir el numero de apuestas ingresadas a int
                int[] noPuestasIngresadas = {Integer.valueOf(ArrayPalabras[2]), Integer.valueOf(ArrayPalabras[3]), Integer.valueOf(ArrayPalabras[4]), Integer.valueOf(ArrayPalabras[5]), Integer.valueOf(ArrayPalabras[6]), Integer.valueOf(ArrayPalabras[7]), Integer.valueOf(ArrayPalabras[8]), Integer.valueOf(ArrayPalabras[9]), Integer.valueOf(ArrayPalabras[10]), Integer.valueOf(ArrayPalabras[11])};
                Apuesta apuesta = new Apuesta(ArrayPalabras[0], monto, noPuestasIngresadas); //Asignando valores
                arrayApuestas[i] = apuesta;//Guardar mi apuesta 
            }
        }
             crearListaDoble();
        } catch (Exception e) {
        }
    }

    public void crearListaDoble(){
        EnlazadaDoble=new ListaEnlazadaDoble( );
        for (int i = 0; i <arrayApuestas.length; i++) {
            if (arrayApuestas[i]!=null ) {
        
                EnlazadaDoble.AgregarAlFinal(arrayApuestas[i]);
            }
        }
    
        EnlazadaDoble.InicializarVerificacion();
    }

    //Boton para ingresar de los resultados de los caballos 
    private void jButton3VefificacionApuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3VefificacionApuestasActionPerformed
    IngresoDeResultados VentanaIngreso = new IngresoDeResultados();
    VentanaIngreso.setVisible(true);
    }//GEN-LAST:event_jButton3VefificacionApuestasActionPerformed
     private void EliminarApuesta() {

    }
    
    
    private void jButton4ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ReportesActionPerformed
        Reportes VentanaReporte = new Reportes();
        VentanaReporte.setVisible(true);      
    }//GEN-LAST:event_jButton4ReportesActionPerformed

    private void jButton1NuevaApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1NuevaApuestaActionPerformed
        jTextArea1AreaCargaArchivo.setText("");
        jButton1CargarArchivo.setEnabled(true);
        jButton2IngresarApuestas.setEnabled(true);
    }//GEN-LAST:event_jButton1NuevaApuestaActionPerformed

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
    private javax.swing.JButton jButton1CargarArchivo;
    private javax.swing.JButton jButton1NuevaApuesta;
    private javax.swing.JButton jButton2IngresarApuestas;
    private javax.swing.JButton jButton3VefificacionApuestas;
    private javax.swing.JButton jButton4Reportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1AreaCargaArchivo;
    // End of variables declaration//GEN-END:variables
}
