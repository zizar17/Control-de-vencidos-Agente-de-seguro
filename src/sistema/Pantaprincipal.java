
package sistema;

import javax.swing.ImageIcon;

public class Pantaprincipal extends javax.swing.JFrame {

  
    public Pantaprincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        //Icono del JFrame
        setIconImage(new ImageIcon(getClass().getResource("/images/caducado.png")).getImage());
        etiquetaAlerta.setVisible(false);
        botonRevisar.setVisible(false);
        etiquetaContadora.setVisible(false);
        alerta();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        etiquetaImagen = new javax.swing.JLabel();
        etiquetaTitulo = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        botonRevisar = new javax.swing.JButton();
        etiquetaAlerta = new javax.swing.JLabel();
        etiquetaContadora = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        menuUsuarios = new javax.swing.JMenuItem();
        separador = new javax.swing.JPopupMenu.Separator();
        menuSalir = new javax.swing.JMenuItem();
        menuSeparador = new javax.swing.JMenu();
        menu2 = new javax.swing.JMenu();
        menuClientes = new javax.swing.JMenuItem();
        separador1 = new javax.swing.JPopupMenu.Separator();
        menuVencidos = new javax.swing.JMenuItem();
        separador2 = new javax.swing.JPopupMenu.Separator();
        menuInforme = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 204, 153));
        panel.setForeground(new java.awt.Color(0, 0, 0));

        etiquetaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fechaVencimiento (1).png"))); // NOI18N

        etiquetaTitulo.setBackground(new java.awt.Color(0, 0, 0));
        etiquetaTitulo.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTitulo.setText("Control Vencidos");

        panel2.setBackground(new java.awt.Color(255, 204, 153));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonRevisar.setBackground(new java.awt.Color(255, 255, 255));
        botonRevisar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonRevisar.setForeground(new java.awt.Color(0, 0, 0));
        botonRevisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/revisar.png"))); // NOI18N
        botonRevisar.setText("REVISAR VENCIDOS");
        botonRevisar.setBorderPainted(false);
        botonRevisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRevisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRevisarActionPerformed(evt);
            }
        });
        panel2.add(botonRevisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 6, -1, -1));

        etiquetaAlerta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/advertencia.png"))); // NOI18N
        panel2.add(etiquetaAlerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        etiquetaContadora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaContadora.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaContadora.setText("¡ Comunicate con tus clientes hay:  vencidos !");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(etiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(etiquetaImagen))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etiquetaContadora, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(etiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaContadora)
                .addGap(14, 14, 14))
        );

        menu1.setText("Acerca de");

        menuUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/perfil.png"))); // NOI18N
        menuUsuarios.setText("Usuarios");
        menuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUsuariosActionPerformed(evt);
            }
        });
        menu1.add(menuUsuarios);
        menu1.add(separador);

        menuSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salida.png"))); // NOI18N
        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        menu1.add(menuSalir);

        barraMenu.add(menu1);

        menuSeparador.setText("|");
        barraMenu.add(menuSeparador);

        menu2.setText("Menús");

        menuClientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consumidor.png"))); // NOI18N
        menuClientes.setText("Clientes");
        menuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClientesActionPerformed(evt);
            }
        });
        menu2.add(menuClientes);
        menu2.add(separador1);

        menuVencidos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuVencidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fecha-de-vencimiento.png"))); // NOI18N
        menuVencidos.setText("Vencidos");
        menuVencidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVencidosActionPerformed(evt);
            }
        });
        menu2.add(menuVencidos);
        menu2.add(separador2);

        menuInforme.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuInforme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/informe-de-credito-empresarial.png"))); // NOI18N
        menuInforme.setText("Informes de pagos");
        menuInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInformeActionPerformed(evt);
            }
        });
        menu2.add(menuInforme);

        barraMenu.add(menu2);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClientesActionPerformed
        //Creamos el metodo para ingresar a la ventana de clientes
        Clientes c = new Clientes ();
        c.setVisible(true);
    }//GEN-LAST:event_menuClientesActionPerformed

    private void menuVencidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVencidosActionPerformed
        //Creamos el metodo para ingresar a la ventana de vencidos
        Vencidos v = new Vencidos();
        v.setVisible(true);
    }//GEN-LAST:event_menuVencidosActionPerformed

    private void menuInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInformeActionPerformed
        //Creamos el metodo para ingresar a la ventana de informes
        InformesPagos ip = new InformesPagos();
        ip.setVisible(true);
    }//GEN-LAST:event_menuInformeActionPerformed

    private void menuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsuariosActionPerformed
        //Creamos el metodo para ingresar a la ventana de usuarios
        Usuarios u = new Usuarios();
        u.setVisible(true);
    }//GEN-LAST:event_menuUsuariosActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        System.exit(0);//Cerramos el programa
    }//GEN-LAST:event_menuSalirActionPerformed

    private void botonRevisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRevisarActionPerformed
       //Creamos el metodo para ingresar a la ventana de vencidos
        Vencidos v = new Vencidos();
        v.setVisible(true);
    }//GEN-LAST:event_botonRevisarActionPerformed

    public void contarVencidos (){
        Vencidos v = new Vencidos();
        int fila = v.jTableDatosVencidos.getRowCount();
        String etiqueta = "¡ Comunícate con tus clientes hay: "+fila+" vencidos !";
        etiquetaContadora.setText(etiqueta);
        etiquetaContadora.setVisible(true);
    }
    
    public void alerta(){
       Vencidos v = new Vencidos();
       int fila=v.jTableDatosVencidos.getRowCount();
       if(fila>0){
           etiquetaAlerta.setVisible(true);
           botonRevisar.setVisible(true);
           contarVencidos();
       }
   }
    
   
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton botonRevisar;
    private javax.swing.JLabel etiquetaAlerta;
    public javax.swing.JLabel etiquetaContadora;
    private javax.swing.JLabel etiquetaImagen;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JMenu menu1;
    private javax.swing.JMenu menu2;
    private javax.swing.JMenuItem menuClientes;
    private javax.swing.JMenuItem menuInforme;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenu menuSeparador;
    private javax.swing.JMenuItem menuUsuarios;
    private javax.swing.JMenuItem menuVencidos;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel2;
    private javax.swing.JPopupMenu.Separator separador;
    private javax.swing.JPopupMenu.Separator separador1;
    private javax.swing.JPopupMenu.Separator separador2;
    // End of variables declaration//GEN-END:variables
}
