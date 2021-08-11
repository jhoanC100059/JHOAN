
import java.util.ArrayList;
import javax.swing.ComboBoxModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANDRES
 */
public class JFrameTrabajadores extends javax.swing.JFrame {
    
    
    ArrayList<Trabajador> listaTrabajadores=new ArrayList<Trabajador>();

    /**
     * Creates new form Trabajadores
     */
    public JFrameTrabajadores() {
        initComponents();
    }
public void LimpiarCampos(){
    this.jtId.setText(""); //Limpiamos el texto.
    this.jtNombre.setText("");
    this.jtDireccion.setText("");
    this.jtTelefono.setText("");
    this.jtSueldo.setText("");
    this.lbInfo.setText("");
}

public void mostrarMensaje(String mensaje){
    this.lbInfo.setVisible(true);
    this.lbInfo.setText(mensaje);
}
public boolean validarID(int id){
    for(Trabajador t:listaTrabajadores){
        if(t.getId()==id)return false;
    }
    return true;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbingreso = new javax.swing.JLabel();
        btBuscar = new javax.swing.JButton();
        btborrar = new javax.swing.JButton();
        jbId = new javax.swing.JLabel();
        jbNombre = new javax.swing.JLabel();
        jbDireccion = new javax.swing.JLabel();
        jbTelefono = new javax.swing.JLabel();
        jbSueldo = new javax.swing.JLabel();
        jbRegion = new javax.swing.JLabel();
        lbInfo = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtDireccion = new javax.swing.JTextField();
        jtTelefono = new javax.swing.JTextField();
        jtSueldo = new javax.swing.JTextField();
        btGuardar = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        cbRegion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbingreso.setText("Ingreso de nuevo trabajador");

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btborrar.setText("Borrar");
        btborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btborrarActionPerformed(evt);
            }
        });

        jbId.setText("Id");

        jbNombre.setText("Nombre");

        jbDireccion.setText("Direccion");

        jbTelefono.setText("Telefono");

        jbSueldo.setText("Sueldo");

        jbRegion.setText("Region");

        lbInfo.setBackground(new java.awt.Color(255, 255, 0));
        lbInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInfo.setText("Informacion");
        lbInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jtId.setText("jTextField1");

        jtNombre.setText("jTextField2");

        jtDireccion.setText("jTextField3");

        jtTelefono.setText("jTextField4");

        jtSueldo.setText("jTextField5");

        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        cbRegion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una region", "Boyacá", "Cundinamarca", "Caldas", "Antioquia" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btborrar)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbingreso)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtId, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(jtNombre)
                                    .addComponent(jtDireccion)
                                    .addComponent(jtTelefono)
                                    .addComponent(jtSueldo)
                                    .addComponent(cbRegion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbSueldo)
                                    .addComponent(jbTelefono)
                                    .addComponent(jbDireccion)
                                    .addComponent(jbNombre)
                                    .addComponent(jbId, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbRegion)
                                    .addGap(14, 14, 14)))
                            .addComponent(lbInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btGuardar)
                        .addGap(45, 45, 45)
                        .addComponent(btLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalir)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jbingreso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBuscar)
                    .addComponent(btborrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbId)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNombre)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDireccion)
                    .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbTelefono)
                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSueldo)
                    .addComponent(jtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbRegion)
                    .addComponent(cbRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGuardar)
                    .addComponent(btLimpiar)
                    .addComponent(btSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
    LimpiarCampos();        // TODO add your handling code here:
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        // TODO add your handling code here:
        //Toda a info que saquemos de los campos de textoson de tipo -string
        //Si necesitamos tipo entero debemos transformarlo
        try{
            
            String idStr=this.jtId.getText();
            String nombre=this.jtNombre.getText();
            String direccion=this.jtDireccion.getText();
            String telefono=this.jtTelefono.getText();
            String sueldoStr=this.jtSueldo.getText();
            String region=(String)this.cbRegion.getSelectedItem();
            
            boolean errorIngresoVacio=false;
            
            //Preguntamos si algunos de estos campos estan vacios, cambiamos erroIngresoVacio = True.
            
            if("".equals(idStr)) errorIngresoVacio=true;
            if("".equals(nombre)) errorIngresoVacio=true;
            if("".equals(direccion)) errorIngresoVacio=true;
            if("".equals(telefono)) errorIngresoVacio=true;
            if("".equals(sueldoStr)) errorIngresoVacio=true;
            if(cbRegion.getSelectedIndex()==0) errorIngresoVacio=true;
            
            //Si alguno de los anteriores está vacio, Agregamos otro método (mostrarMensaje()).
            if(errorIngresoVacio){
                mostrarMensaje("Debe ingresar todos los campos");
                return;
            }
            //Si no están vacios, transformamos  entero lo que esta en String,pero que es entero.
            
            int id = Integer.parseInt(idStr);
            int sueldo = Integer.parseInt(sueldoStr);
            
            if(validarID(id)){
                Trabajador t=new Trabajador(id, nombre, direccion, telefono, sueldo, region);
                this.listaTrabajadores.add(t);
                LimpiarCampos();
                mostrarMensaje("FUNCIONARIO INGRESADO");//Creamos botón Información
            }else{
                mostrarMensaje("Id No Válido");
            }
            
        }catch(Exception e){
            mostrarMensaje("ID y sueldo deben ser numéricos.");//Ejecutamos y damos guardar.
        }
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        this.lbInfo.setVisible(false);
        String idStr=jtId.getText();
        //Revisamos que no esté vacío.
        if("".equals(idStr)){//Si el ID es igual a vacio mostrar el sisguiente mensaje y terminamos
            mostrarMensaje("Debe ingresar un id");
            return;
        }//En caso de que no sea vacío
        try{
            int id=Integer.parseInt(idStr);//Transformamos el id a un número, Si fall va a la excepción
            for(Trabajador trabajador:listaTrabajadores){//Si no es vacío recorremos la lista y lo ubicamos
               if(trabajador.getId()==id){//Si el trabajador que está almacenado es igual al id ingresado.
                   //Significa ue encontramos al trabajador y mostramos sus atributos por pantalla.
                   jtNombre.setText(trabajador.getNombre());//En el campo del nombre del texto guardo el nombre del trabajador
                   jtDireccion.setText(trabajador.getDireccion());//Saco el nombre y lo guardo en el cuadro de texto de la direccion
                   jtTelefono.setText(trabajador.getTelefono());
                   jtSueldo.setText(String.valueOf(trabajador.getSueldo()));//Recuerden el sueldo viene int, hacemos lo contrario
                   
                   //En la region es diferente porque tenemos que seleccionar uno de los que ya existen.
                   
                   ComboBoxModel cbm=this.cbRegion.getModel();//Creamos un objeto cbm de la libreria ComboBoxModel.
                                                              //Es el listado de todos los elementos que tiene el ComboBox.
                   for(int i=0;i<cbm.getSize();i++){
                       if(cbm.getElementAt(i).toString().equals(trabajador.getRegion())){//Del cbm que es todo el listado de la region
                           //le pedimos un elemento(posicion i del for)la transformamos a string y la comparo con la region del trabajador
                           //que acabo de encontrar
                           
                           this.cbRegion.setSelectedIndex(i);
                           return;
                   }                                           
               }
            }
        }
        //Si s que o lo encontramos:
        LimpiarCampos();
        this.jtId.setText(idStr);
        mostrarMensaje("Id no encontrado");
        }catch(Exception e){
        mostrarMensaje("ID Debe ser numérico");
}      
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btborrarActionPerformed
        // TODO add your handling code here:
        this.lbInfo.setVisible(false);
        String IdStr = jtId.getText();//Sacamos el Id.
        //Revisamos que no esté vacío.
        if("".equals(IdStr)){ //Si el Id es igual a vacío mostrar el sisguiente mensaje y terminamos.
            mostrarMensaje("Debe ingresar un id");
            return;
        }//En caso de que no sea vacío
        
        try{
            int Id=Integer.parseInt(IdStr);
            for(Trabajador trabajador:listaTrabajadores){ //Si no está vacío recorremos la lista y lo ubicamos.
                if(trabajador.getId()==Id){//Si el trabajador que está almacenado es igual al id ingresado. Significa que
                    String nombre=trabajador.getNombre();//Antes de eliminarlo, lo rescatamos obviamente.
                    this.listaTrabajadores.remove(trabajador);//Entonces lo encontré, lo elimino de la lista
                    mostrarMensaje(nombre + "Trabajador Eliminado.");
                    return;
                }
            }
            LimpiarCampos();
            this.jtId.setText(IdStr);
            mostrarMensaje("Id no encontrado");
        }catch(Exception e){
        mostrarMensaje("ID debe ser numérico");
    }
    }//GEN-LAST:event_btborrarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTrabajadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btSalir;
    private javax.swing.JButton btborrar;
    private javax.swing.JComboBox<String> cbRegion;
    private javax.swing.JLabel jbDireccion;
    private javax.swing.JLabel jbId;
    private javax.swing.JLabel jbNombre;
    private javax.swing.JLabel jbRegion;
    private javax.swing.JLabel jbSueldo;
    private javax.swing.JLabel jbTelefono;
    private javax.swing.JLabel jbingreso;
    private javax.swing.JTextField jtDireccion;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtSueldo;
    private javax.swing.JTextField jtTelefono;
    private javax.swing.JLabel lbInfo;
    // End of variables declaration//GEN-END:variables
}
