package Presentacion;
import Logica.Configuraciones; 
import java.awt.event.ActionEvent; 
import java.awt.event.KeyEvent; 
import java.awt.event.WindowEvent; 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPanel; 
import javax.swing.JPasswordField; 
import javax.swing.JSeparator;
import java.awt.Color;
/**
 *
 * @author Usuario
 */
public class Ajustes extends javax.swing.JFrame {

    Configuraciones configuraciones;
    PlataformaMusical plataforma;
    Color colores;
    
    public Ajustes(Configuraciones configuraciones, PlataformaMusical plataforma) {
        initComponents();
        
        this.configuraciones = configuraciones;
        this.plataforma = plataforma;
        nombreUsuario.setText(configuraciones.getNombreUsuario());
        correoUsuario.setText(configuraciones.getCorreo());
        colores = configuraciones.getColor();
        colorActual.setBackground(colores);
        this.AjustarColores();
        lblCambiosColores.setVisible(false);
        lblCambiosCoont.setVisible(false);
        this.setLocationRelativeTo(null);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JPanel();
        b2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        iconUsuario = new javax.swing.JButton();
        correoUsuario = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cambiarContrasena = new javax.swing.JButton();
        passNuevo = new javax.swing.JPasswordField();
        passAnterior = new javax.swing.JPasswordField();
        lblCambiosCoont = new javax.swing.JLabel();
        iconPass = new javax.swing.JButton();
        iconUsuario1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        lblAjustesdecolores = new javax.swing.JLabel();
        cambiarColores = new javax.swing.JButton();
        color1 = new javax.swing.JButton();
        color2 = new javax.swing.JButton();
        color3 = new javax.swing.JButton();
        color4 = new javax.swing.JButton();
        lblSeleccion = new javax.swing.JLabel();
        color8 = new javax.swing.JButton();
        color7 = new javax.swing.JButton();
        color6 = new javax.swing.JButton();
        color5 = new javax.swing.JButton();
        color9 = new javax.swing.JButton();
        color10 = new javax.swing.JButton();
        color11 = new javax.swing.JButton();
        color12 = new javax.swing.JButton();
        color13 = new javax.swing.JButton();
        color14 = new javax.swing.JButton();
        color15 = new javax.swing.JButton();
        color16 = new javax.swing.JButton();
        lblColoractual = new javax.swing.JLabel();
        colorActual = new javax.swing.JButton();
        lblCambiosColores = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Ajustes de DG Player");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout b1Layout = new javax.swing.GroupLayout(b1);
        b1.setLayout(b1Layout);
        b1Layout.setHorizontalGroup(
            b1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );
        b1Layout.setVerticalGroup(
            b1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        b2.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout b2Layout = new javax.swing.GroupLayout(b2);
        b2.setLayout(b2Layout);
        b2Layout.setHorizontalGroup(
            b2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );
        b2Layout.setVerticalGroup(
            b2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        iconUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/ajuste.png"))); // NOI18N
        iconUsuario.setBorder(null);
        iconUsuario.setBorderPainted(false);
        iconUsuario.setContentAreaFilled(false);
        iconUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconUsuarioActionPerformed(evt);
            }
        });

        correoUsuario.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        correoUsuario.setText("Correo electronico");

        nombreUsuario.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        nombreUsuario.setText("Nombre de usuario");

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 0, 13)); // NOI18N
        jLabel5.setText("CAMBIAR CONTRASEÑA");

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        jLabel6.setText("Contraseña anterior:      ");

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        jLabel1.setText("Nueva contraseña:");

        cambiarContrasena.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        cambiarContrasena.setText("CAMBIAR CONTRASEÑA");
        cambiarContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarContrasenaActionPerformed(evt);
            }
        });

        passNuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passNuevoKeyPressed(evt);
            }
        });

        passAnterior.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passAnteriorKeyPressed(evt);
            }
        });

        lblCambiosCoont.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        lblCambiosCoont.setForeground(new java.awt.Color(102, 0, 0));
        lblCambiosCoont.setText("La contraseña se ha cambiado satisfactoriamente.");

        iconPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/pass.png"))); // NOI18N
        iconPass.setBorder(null);
        iconPass.setBorderPainted(false);
        iconPass.setContentAreaFilled(false);
        iconPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconPassActionPerformed(evt);
            }
        });

        iconUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/user2.png"))); // NOI18N
        iconUsuario1.setBorder(null);
        iconUsuario1.setBorderPainted(false);
        iconUsuario1.setContentAreaFilled(false);
        iconUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconUsuario1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblCambiosCoont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(32, 32, 32)
                                .addComponent(cambiarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(passNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(176, 176, 176))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)
                                        .addComponent(passAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(iconPass, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(119, 119, 119))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(iconUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(correoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(238, 238, 238))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(iconUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118))))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(nombreUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(correoUsuario))
                            .addComponent(iconUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(iconPass, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cambiarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCambiosCoont))))
                .addContainerGap())
        );

        lblAjustesdecolores.setFont(new java.awt.Font("Leelawadee UI", 0, 13)); // NOI18N
        lblAjustesdecolores.setText("AJUSTE DE COLORES DE LA INTERFAZ GRAFICA");

        cambiarColores.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        cambiarColores.setText("CAMBIAR COLORES");
        cambiarColores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarColoresActionPerformed(evt);
            }
        });

        color1.setBackground(new java.awt.Color(0, 0, 0));
        color1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color1ActionPerformed(evt);
            }
        });

        color2.setBackground(new java.awt.Color(0, 51, 51));
        color2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color2ActionPerformed(evt);
            }
        });

        color3.setBackground(new java.awt.Color(0, 0, 51));
        color3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color3ActionPerformed(evt);
            }
        });

        color4.setBackground(new java.awt.Color(51, 0, 51));
        color4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color4ActionPerformed(evt);
            }
        });

        lblSeleccion.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        lblSeleccion.setText("Selecciona un color de personalización:");

        color8.setBackground(new java.awt.Color(0, 51, 51));
        color8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color8ActionPerformed(evt);
            }
        });

        color7.setBackground(new java.awt.Color(0, 51, 0));
        color7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color7ActionPerformed(evt);
            }
        });

        color6.setBackground(new java.awt.Color(51, 51, 0));
        color6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color6ActionPerformed(evt);
            }
        });

        color5.setBackground(new java.awt.Color(51, 0, 0));
        color5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color5ActionPerformed(evt);
            }
        });

        color9.setBackground(new java.awt.Color(51, 51, 51));
        color9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color9ActionPerformed(evt);
            }
        });

        color10.setBackground(new java.awt.Color(0, 102, 102));
        color10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color10ActionPerformed(evt);
            }
        });

        color11.setBackground(new java.awt.Color(0, 0, 102));
        color11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color11ActionPerformed(evt);
            }
        });

        color12.setBackground(new java.awt.Color(102, 0, 102));
        color12.setForeground(new java.awt.Color(102, 0, 102));
        color12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color12ActionPerformed(evt);
            }
        });

        color13.setBackground(new java.awt.Color(102, 0, 0));
        color13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color13ActionPerformed(evt);
            }
        });

        color14.setBackground(new java.awt.Color(102, 102, 0));
        color14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color14ActionPerformed(evt);
            }
        });

        color15.setBackground(new java.awt.Color(0, 102, 0));
        color15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color15ActionPerformed(evt);
            }
        });

        color16.setBackground(new java.awt.Color(0, 102, 102));
        color16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color16ActionPerformed(evt);
            }
        });

        lblColoractual.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        lblColoractual.setText("Color actual:");

        colorActual.setBackground(new java.awt.Color(0, 51, 51));

        lblCambiosColores.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        lblCambiosColores.setForeground(new java.awt.Color(102, 0, 0));
        lblCambiosColores.setText("Los ajustes de colores se han aplicado satisfactoriamente.");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAjustesdecolores)
                                    .addComponent(lblSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(color9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(color10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(color11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(color12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(color13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(color14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(color15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(color16))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(color1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(color2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(color3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(color4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(color5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(color6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(color7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(color8))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblCambiosColores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(colorActual, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblColoractual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70))
                            .addComponent(cambiarColores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAjustesdecolores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeleccion)
                    .addComponent(lblColoractual))
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(color1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(color2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(color3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(color4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(color5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(color6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(color7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(color8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(color9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(color10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(color11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(color12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(color13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(color14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(color15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(color16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblCambiosColores))
                    .addComponent(cambiarColores))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CONFIGURACIONES DG PLAYER");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void AjustarColores()
    {
        b1.setBackground(colores);
        b2.setBackground(colores);
        lblCambiosColores.setVisible(false);
       
    }
    
    private void cambiarColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarColoresActionPerformed
            this.AjustarColores();
            if(configuraciones.CambiarColorInterfaz(colores))
            {
                colorActual.setBackground(colores);
                plataforma.AjustarColores();
                lblCambiosColores.setVisible(true);
            }
            else
            {
                lblCambiosColores.setText("Algo salio mal, intentalo de nuevo mas tarde.");
                lblCambiosColores.setVisible(true);
            }
            
    }//GEN-LAST:event_cambiarColoresActionPerformed

    private void cambiarContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarContrasenaActionPerformed
        if(passAnterior.getText().isEmpty())
        {    
            lblCambiosCoont.setText("Ingrese su contraseña actual.");
            lblCambiosCoont.setVisible(true);     
        }
        else if(passNuevo.getText().isEmpty())
        {   
            lblCambiosCoont.setText("Ingrese su nueva contraseña.");
            lblCambiosCoont.setVisible(true);     
        }
        else if(passNuevo.getText().length()<6)
        {
            lblCambiosCoont.setText("La nueva contraseña debe tener almenos 6 caracteres.");
            lblCambiosCoont.setVisible(true);     
        }
        else
        {
            if(configuraciones.CambiarContrasena(passAnterior.getText(), passNuevo.getText()))
            {
                lblCambiosCoont.setText("La contraseña se ha cambiado satisfactoriamente.");
                lblCambiosCoont.setVisible(true);
            }
            else
            {
                lblCambiosCoont.setText("Error al cambiar la contraseña.");
                lblCambiosCoont.setVisible(true);
            }
        }
    }//GEN-LAST:event_cambiarContrasenaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void color1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color1ActionPerformed
        colores = new Color(0,0,0);
        this.AjustarColores();
    }//GEN-LAST:event_color1ActionPerformed

    private void color9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color9ActionPerformed
        colores = new Color(51,51,51);
        this.AjustarColores();
    }//GEN-LAST:event_color9ActionPerformed

    private void color2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color2ActionPerformed
        colores = new Color(0,51,51);
        this.AjustarColores();
    }//GEN-LAST:event_color2ActionPerformed

    private void color10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color10ActionPerformed
        colores = new Color(0,102,102);
        this.AjustarColores();
    }//GEN-LAST:event_color10ActionPerformed

    private void color3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color3ActionPerformed
        colores = new Color(0,0,51);
        this.AjustarColores();
    }//GEN-LAST:event_color3ActionPerformed

    private void color11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color11ActionPerformed
        colores = new Color(0,0,102);
        this.AjustarColores();
    }//GEN-LAST:event_color11ActionPerformed

    private void color4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color4ActionPerformed
        colores = new Color(51,0,51);
        this.AjustarColores();
    }//GEN-LAST:event_color4ActionPerformed

    private void color12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color12ActionPerformed
        colores = new Color(102,0,102);
        this.AjustarColores();
    }//GEN-LAST:event_color12ActionPerformed

    private void color5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color5ActionPerformed
        colores = new Color(51,0,0);
        this.AjustarColores();
    }//GEN-LAST:event_color5ActionPerformed

    private void color13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color13ActionPerformed
        colores = new Color(102,0,0);
        this.AjustarColores();
    }//GEN-LAST:event_color13ActionPerformed

    private void color6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color6ActionPerformed
        colores = new Color(51,51,0);
        this.AjustarColores();
    }//GEN-LAST:event_color6ActionPerformed

    private void color14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color14ActionPerformed
        colores = new Color(102,102,0);
        this.AjustarColores();
    }//GEN-LAST:event_color14ActionPerformed

    private void color7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color7ActionPerformed
        colores = new Color(0,51,0);
        this.AjustarColores();
    }//GEN-LAST:event_color7ActionPerformed

    private void color15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color15ActionPerformed
        colores = new Color(0,102,0);
        this.AjustarColores();
    }//GEN-LAST:event_color15ActionPerformed

    private void color8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color8ActionPerformed
        colores = new Color(0,51,51);
        this.AjustarColores();
    }//GEN-LAST:event_color8ActionPerformed

    private void color16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color16ActionPerformed
        colores = new Color(0,102,102);
        this.AjustarColores();
    }//GEN-LAST:event_color16ActionPerformed

    private void passAnteriorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passAnteriorKeyPressed
        lblCambiosCoont.setVisible(false);
    }//GEN-LAST:event_passAnteriorKeyPressed

    private void passNuevoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passNuevoKeyPressed
        lblCambiosCoont.setVisible(false);
    }//GEN-LAST:event_passNuevoKeyPressed

    private void iconUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconUsuarioActionPerformed
        
    }//GEN-LAST:event_iconUsuarioActionPerformed

    private void iconPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iconPassActionPerformed

    private void iconUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iconUsuario1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel b1;
    private javax.swing.JPanel b2;
    private javax.swing.JButton cambiarColores;
    private javax.swing.JButton cambiarContrasena;
    private javax.swing.JButton color1;
    private javax.swing.JButton color10;
    private javax.swing.JButton color11;
    private javax.swing.JButton color12;
    private javax.swing.JButton color13;
    private javax.swing.JButton color14;
    private javax.swing.JButton color15;
    private javax.swing.JButton color16;
    private javax.swing.JButton color2;
    private javax.swing.JButton color3;
    private javax.swing.JButton color4;
    private javax.swing.JButton color5;
    private javax.swing.JButton color6;
    private javax.swing.JButton color7;
    private javax.swing.JButton color8;
    private javax.swing.JButton color9;
    private javax.swing.JButton colorActual;
    private javax.swing.JLabel correoUsuario;
    private javax.swing.JButton iconPass;
    private javax.swing.JButton iconUsuario;
    private javax.swing.JButton iconUsuario1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAjustesdecolores;
    private javax.swing.JLabel lblCambiosColores;
    private javax.swing.JLabel lblCambiosCoont;
    private javax.swing.JLabel lblColoractual;
    private javax.swing.JLabel lblSeleccion;
    private javax.swing.JLabel nombreUsuario;
    private javax.swing.JPasswordField passAnterior;
    private javax.swing.JPasswordField passNuevo;
    // End of variables declaration//GEN-END:variables
}
