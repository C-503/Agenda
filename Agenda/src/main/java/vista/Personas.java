
package vista;


import Controller.PersonasController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.personas;

public class Personas extends javax.swing.JFrame implements ActionListener {

     public int id_persona=-1;
    public Personas() throws SQLException {
        initComponents();
        btnguardar.addActionListener(this);
        btnsalir.addActionListener(this);
        btneliminar.addActionListener(this);
        cargarDatatable();
        btneliminar.setEnabled(false);
        btneditar.addActionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Tnombre = new javax.swing.JTextField();
        Tapellido = new javax.swing.JTextField();
        Tcorreo = new javax.swing.JTextField();
        Ttelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        vista = new javax.swing.JTable();
        btneliminar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Agenda"));

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Correo");

        jLabel4.setText("Telefono");

        vista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        vista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vistaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(vista);
        vista.getAccessibleContext().setAccessibleParent(null);

        btneliminar.setText("ELIMINAR");

        btneditar.setText("EDITAR");

        btnguardar.setText("GUARDAR");

        btnsalir.setText("SALIR");

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(fondoLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(72, 72, 72)
                                        .addComponent(Ttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(fondoLayout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Tcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(fondoLayout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Tapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(fondoLayout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(74, 74, 74)
                                            .addComponent(Tnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btneliminar)
                                .addGap(50, 50, 50)
                                .addComponent(btneditar)
                                .addGap(48, 48, 48)
                                .addComponent(btnguardar)
                                .addGap(49, 49, 49)
                                .addComponent(btnsalir)))
                        .addGap(0, 175, Short.MAX_VALUE)))
                .addContainerGap())
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Tnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Tapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Tcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Ttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneliminar)
                    .addComponent(btneditar)
                    .addComponent(btnguardar)
                    .addComponent(btnsalir))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vistaMouseClicked
    
        if (vista.getRowCount() <= 0) {
            JOptionPane.showConfirmDialog(null, "no hay datos para cargar");
        } else {
            this.id_persona = Integer.parseInt(vista.getValueAt(vista.getSelectedRow(), 0).toString());
            Tnombre.setText(vista.getValueAt(vista.getSelectedRow(), 1).toString());
            Tapellido.setText(vista.getValueAt(vista.getSelectedRow(), 2).toString());
            Tcorreo.setText(vista.getValueAt(vista.getSelectedRow(), 3).toString());
            Ttelefono.setText(vista.getValueAt(vista.getSelectedRow(), 4).toString());
            btneliminar.setEnabled(true);

        }
    }//GEN-LAST:event_vistaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Tapellido;
    private javax.swing.JTextField Tcorreo;
    private javax.swing.JTextField Tnombre;
    private javax.swing.JTextField Ttelefono;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable vista;
    // End of variables declaration//GEN-END:variables

  @Override
    public void actionPerformed(ActionEvent e) 
    {
    
        if(e.getSource() == btnguardar)
        {
            if(validacion(Tnombre.getText()) || (validacion(Ttelefono.getText())))
            {
               JOptionPane.showMessageDialog(null, "Debe completar el formulario");
                return;
            }
            else
            {
                personas per = new personas();
                per.setNombre(Tnombre.getText());
                per.setApellido(Tapellido.getText());
                per.setCorreo(Tcorreo.getText());
                per.setTelefono(Ttelefono.getText());
               
                try 
                {
                   PersonasController C = new PersonasController();
                   C.Guardar(per);
                   JOptionPane.showMessageDialog(null, "Registro creado correctamente");
                   this.cargarDatatable();
                } 
                catch (SQLException ex) 
                {
                    JOptionPane.showMessageDialog(null, "Registro no fue realizado por" + ex.getMessage());
                }
            }
            }
        if(e.getSource() == btnsalir)
        {
            System.exit(0);
        }
        if(e.getSource() == btneliminar)
        {
           if(this.id_persona != -1)
           {
               try {
                   PersonasController C = new PersonasController();
                   
                   if(C.Eliminar(this.id_persona))
                   {                       
                    cargarDatatable();
                    JOptionPane.showMessageDialog(null, "Registro eliminado con exito!!!");
                   } 
                   else 
                   {
                    JOptionPane.showMessageDialog(null, "No fue posible eliminar el registro!!!");
                   }
                   }     
               catch (SQLException ex) 
               {
                   Logger.getLogger(Personas.class.getName()).log(Level.SEVERE, null, ex);
               }
               
           }
            
        }
        
        if(e.getSource() == btneditar)
        {
            if(this.id_persona != -1)
            {
                try {
                    PersonasController C = new PersonasController();
                    personas per = new personas();
                    per.setNombre(Tnombre.getText());
                    per.setApellido(Tapellido.getText());
                    per.setCorreo(Tcorreo.getText());
                    per.setTelefono(Ttelefono.getText());
                    
                     if (C.Actualizar(per, this.id_persona)) {
                    cargarDatatable();
                    JOptionPane.showMessageDialog(null, "Registro actualizado con exito!!!");
                } else {
                    JOptionPane.showMessageDialog(null, "No fue posible actualizar el registro!!!");

                } 
                } 
                catch (Exception ex) 
                {
                 JOptionPane.showMessageDialog(null, "No fue posible actualizar el registro!!!");

                }
                }
            }
        
    }  
    
    public void cargarDatatable() throws SQLException {
        DefaultTableModel model = new DefaultTableModel();
        PersonasController C = new PersonasController();
        try {
            C.Consultar(model);
            vista.setModel(model);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error al cargar los datos por :  " + ex.getMessage());
        }

    }
    
    
      public boolean validacion(String texto)
   {
      boolean res = false;      
       if (texto.isEmpty()) {
           return true;
       }
       return res;
   }

      
  
}
