package Presentacion;

import Clases.Cancion; 
import Clases.Usuario;
import Logica.AccionesCancion;
import Logica.ManejoCancion;
import Logica.Configuraciones;
import Logica.ControlPlataforma;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel Gomez
 */

public class PlataformaMusical extends javax.swing.JFrame{
    
    private final int STOP = 1000;
    public final int PLAY = 1001;
    private final int PAUSE = 1002;
    
    private Usuario usuario;
    private final AccionesCancion reproductor;
    private int nroCancion = 0;
    public int estadoCancion = STOP;
    private float volumen = 70;
    private boolean auxvolumen = true;
    
    //Tiempo de reproduccion de la cancion

    public int duracion= 0;
    public int segundos = 0;
        
    public PlataformaMusical(Usuario usuario, AccionesCancion reproductor) 
    {
        initComponents();
        this.usuario = usuario;
        this.reproductor = reproductor;
        
        //Barra de avance
        avanceMusical.setValue(0);
        
        new ManejoCancion().ActualizarListaCancionesUsuario(usuario);
        this.ActualizarTablaMusical();
        this.AjustarColores();
        new ControlPlataforma(this, usuario).hayCanciones();
        new TiempoReproduccion();
        reproduccionAutomatica.setSelected(true);
        this.cargarCover();
        cover.setVisible(true);
        cover.setEnabled(true);
        this.estadoCancion =STOP;
        
    }
    
    
    private void cargarCover()
    {
        Color color = new Configuraciones(usuario).getColor();
        String nomImg = null;
        
        if(color.getRed() == 0 && color.getGreen() == 0 && color.getBlue() == 0)//Negro
            nomImg = "src\\Media\\" + "coverA" + ".png";
        else if(color.getRed() == 51 && color.getGreen() == 51 && color.getBlue() == 51)//Gris
            nomImg = "src\\Media\\" + "coverA" + ".png";
        else if(color.getRed() == 0 && color.getGreen() == 51 && color.getBlue() == 51)//Verdeazul clar
            nomImg = "src\\Media\\" + "coverS" + ".png";
        else if(color.getRed() == 0 && color.getGreen() == 102 && color.getBlue() == 102)//Verdeazul osc
            nomImg = "src\\Media\\" + "coverS" + ".png";
        else if(color.getRed() == 0 && color.getGreen() == 0 && color.getBlue() == 51)//Azul cl
            nomImg = "src\\Media\\" + "coverA" + ".png";
        else if(color.getRed() == 0 && color.getGreen() == 0 && color.getBlue() == 102)//Azul osc
            nomImg = "src\\Media\\" + "coverA" + ".png";
        else if(color.getRed() == 51 && color.getGreen() == 0 && color.getBlue() == 51)//Morado osc
            nomImg = "src\\Media\\" + "coverM" + ".png";
        else if(color.getRed() == 102 && color.getGreen() == 0 && color.getBlue() == 102)//Morado cl
            nomImg = "src\\Media\\" + "coverM" + ".png";
        else if(color.getRed() == 0 && color.getGreen() == 0 && color.getBlue() == 51)//Rojo osc
            nomImg = "src\\Media\\" + "coverR" + ".png";
        else if(color.getRed() == 0 && color.getGreen() == 0 && color.getBlue() == 102)//Rojo cl
            nomImg = "src\\Media\\" + "coverR" + ".png";
        else if(color.getRed() == 51 && color.getGreen() == 51 && color.getBlue() == 0)//Cafe osc
            nomImg = "src\\Media\\" + "coverS" + ".png";
        else if(color.getRed() == 102 && color.getGreen() == 102 && color.getBlue() == 0)//Cafe cl
            nomImg = "src\\Media\\" + "coverS" + ".png";
        else if(color.getRed() == 0 && color.getGreen() == 51 && color.getBlue() == 0)//Verde osc
            nomImg = "src\\Media\\" + "coverV" + ".png";
        else if(color.getRed() == 0 && color.getGreen() == 102 && color.getBlue() == 0)//Verde cl
            nomImg = "src\\Media\\" + "coverV" + ".png";
        else
            nomImg = "src\\Media\\" + "coverR" + ".png";
        
        //Cargar caratula
        Image img= null;
        try 
        {
            img = ImageIO.read(new File(nomImg));
            Image newimg = img.getScaledInstance( 201, 161,  java.awt.Image.SCALE_SMOOTH ) ;                    
            ImageIcon icon = new ImageIcon( newimg );
            cover.setIcon(icon);
            cover.setVisible(true);
            cover.setEnabled(true);
        } 
        catch (IOException ex) {
            Logger.getLogger(PlataformaMusical.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        brr1 = new javax.swing.JPanel();
        logoDGPlayer = new javax.swing.JLabel();
        lblCerrarSesion = new javax.swing.JButton();
        pContenido = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        nroCanciones = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Panel = new javax.swing.JPanel();
        jScrollPaneCanciones = new javax.swing.JScrollPane();
        tablaMusical = new javax.swing.JTable();
        reproduccionAutomatica = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        agregarCancion = new javax.swing.JButton();
        cnfiguraciones = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cover = new javax.swing.JLabel();
        artistaMusical = new javax.swing.JLabel();
        cancionMusical = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        brr2 = new javax.swing.JPanel();
        atrasCancion = new javax.swing.JButton();
        reproducirCancion = new javax.swing.JButton();
        siguienteCancion = new javax.swing.JButton();
        avanceMusical = new javax.swing.JSlider();
        volumenAjuste = new javax.swing.JSlider();
        tiemporestante = new javax.swing.JLabel();
        tiempotranscurrido = new javax.swing.JLabel();
        iconVolumen = new javax.swing.JLabel();
        infoVol = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Plataforma DG Player");
        setResizable(false);

        brr1.setBackground(new java.awt.Color(102, 0, 0));

        logoDGPlayer.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        logoDGPlayer.setForeground(new java.awt.Color(255, 255, 255));
        logoDGPlayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoDGPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/icon.png"))); // NOI18N
        logoDGPlayer.setText("DG PLAYER");

        lblCerrarSesion.setBackground(new java.awt.Color(102, 0, 0));
        lblCerrarSesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        lblCerrarSesion.setText("Cerrar Sesión");
        lblCerrarSesion.setBorder(null);
        lblCerrarSesion.setBorderPainted(false);
        lblCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout brr1Layout = new javax.swing.GroupLayout(brr1);
        brr1.setLayout(brr1Layout);
        brr1Layout.setHorizontalGroup(
            brr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brr1Layout.createSequentialGroup()
                .addComponent(logoDGPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCerrarSesion)
                .addContainerGap())
        );
        brr1Layout.setVerticalGroup(
            brr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(brr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(logoDGPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pContenido.setBackground(new java.awt.Color(255, 255, 255));

        nroCanciones.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        nroCanciones.setText("XX canciones");

        nombreUsuario.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        nombreUsuario.setText("Nombre de usuario");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(nroCanciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombreUsuario)
                .addGap(5, 5, 5)
                .addComponent(nroCanciones)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPaneCanciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPaneCanciones.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneCanciones.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPaneCanciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPaneCancionesMouseClicked(evt);
            }
        });

        tablaMusical.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        tablaMusical.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Artista", "Album", "Canción", "Duración"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaMusical.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMusicalMouseClicked(evt);
            }
        });
        jScrollPaneCanciones.setViewportView(tablaMusical);

        reproduccionAutomatica.setText("Reproducción automatica");
        reproduccionAutomatica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reproduccionAutomaticaMouseClicked(evt);
            }
        });
        reproduccionAutomatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reproduccionAutomaticaActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/automatic.png"))); // NOI18N

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneCanciones)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reproduccionAutomatica)))
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPaneCanciones, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reproduccionAutomatica, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        agregarCancion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/agregar.png"))); // NOI18N
        agregarCancion.setText("Añadir musica");
        agregarCancion.setBorderPainted(false);
        agregarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCancionActionPerformed(evt);
            }
        });

        cnfiguraciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/configuracion.png"))); // NOI18N
        cnfiguraciones.setText("Configuraciones");
        cnfiguraciones.setBorderPainted(false);
        cnfiguraciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnfiguracionesActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/acerca.png"))); // NOI18N
        jButton1.setText("Acerca de");
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agregarCancion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cnfiguraciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agregarCancion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cnfiguraciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cover.setBackground(new java.awt.Color(255, 255, 255));
        cover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coverMouseClicked(evt);
            }
        });

        artistaMusical.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        artistaMusical.setText("Artista");

        cancionMusical.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        cancionMusical.setText("Canción");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/esquina.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancionMusical, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(artistaMusical, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cover, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(artistaMusical)
                        .addGap(4, 4, 4)
                        .addComponent(cancionMusical))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(23, 23, 23))
        );

        brr2.setBackground(new java.awt.Color(102, 0, 0));

        atrasCancion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/prev.png"))); // NOI18N
        atrasCancion.setBorder(null);
        atrasCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasCancionActionPerformed(evt);
            }
        });

        reproducirCancion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/play.png"))); // NOI18N
        reproducirCancion.setBorder(null);
        reproducirCancion.setBorderPainted(false);
        reproducirCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reproducirCancionActionPerformed(evt);
            }
        });

        siguienteCancion.setBackground(new java.awt.Color(102, 0, 0));
        siguienteCancion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/next.png"))); // NOI18N
        siguienteCancion.setBorder(null);
        siguienteCancion.setDisabledIcon(null);
        siguienteCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteCancionActionPerformed(evt);
            }
        });

        avanceMusical.setBackground(new java.awt.Color(102, 0, 0));
        avanceMusical.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        avanceMusical.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avanceMusicalMouseClicked(evt);
            }
        });

        volumenAjuste.setBackground(new java.awt.Color(102, 0, 0));
        volumenAjuste.setValue(70);
        volumenAjuste.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                volumenAjusteStateChanged(evt);
            }
        });

        tiemporestante.setForeground(new java.awt.Color(255, 255, 255));
        tiemporestante.setText("00:00:00");

        tiempotranscurrido.setForeground(new java.awt.Color(255, 255, 255));
        tiempotranscurrido.setText("00:00:00");

        iconVolumen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/volMax.png"))); // NOI18N
        iconVolumen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconVolumenMouseClicked(evt);
            }
        });

        infoVol.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        infoVol.setForeground(new java.awt.Color(255, 255, 255));
        infoVol.setText("70   ");

        javax.swing.GroupLayout brr2Layout = new javax.swing.GroupLayout(brr2);
        brr2.setLayout(brr2Layout);
        brr2Layout.setHorizontalGroup(
            brr2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brr2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(atrasCancion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reproducirCancion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(siguienteCancion)
                .addGap(26, 26, 26)
                .addComponent(tiemporestante, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avanceMusical, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tiempotranscurrido)
                .addGap(12, 12, 12)
                .addComponent(iconVolumen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volumenAjuste, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoVol)
                .addContainerGap())
        );
        brr2Layout.setVerticalGroup(
            brr2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tiemporestante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(avanceMusical, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(volumenAjuste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(brr2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(brr2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoVol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconVolumen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atrasCancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reproducirCancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(siguienteCancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tiempotranscurrido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pContenidoLayout = new javax.swing.GroupLayout(pContenido);
        pContenido.setLayout(pContenidoLayout);
        pContenidoLayout.setHorizontalGroup(
            pContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pContenidoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(brr2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pContenidoLayout.setVerticalGroup(
            pContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pContenidoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pContenidoLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(brr2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(brr1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(brr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    ControlPlataforma control = new ControlPlataforma(this, usuario);

    
    public class TiempoReproduccion
    {
        public TiempoReproduccion(){
            Timer timer = new Timer();
            timer.scheduleAtFixedRate(timerTask, 0,1000);
        }
        
        TimerTask timerTask = new TimerTask()
        {
            public void run() 
            {
                if (estadoCancion == PLAY && segundos+1<=duracion)
                {
                    segundos++;
                    avanceMusical.setValue(segundos);
                    tiempotranscurrido.setText(control.getTiempo(segundos));
                    tiemporestante.setText(control.getTiempo(duracion - segundos));
                    
                    if(segundos>=duracion)
                    {
                        if(reproduccionAutomatica.isSelected())
                            SiguienteCancion();
                    }
                    
                }
            }
        };
    }
    
    public void AjustarColores()
    {
        new ControlPlataforma(this, usuario).AjustarColores();
    }
    
    private void lblCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblCerrarSesionActionPerformed
        
        if(estadoCancion==PAUSE || estadoCancion==PLAY)
        {
            ManejoCancion tag = new ManejoCancion();
            List<Cancion> lista = tag.getListaCancionesUsuario(usuario);
            reproductor.Parar(lista.get(nroCancion).getDireccion());
            estadoCancion = STOP;
        }
        
        usuario = null;
        this.setVisible(false);
        new InicioSesion().setVisible(true);
        
    }//GEN-LAST:event_lblCerrarSesionActionPerformed

    private void atrasCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasCancionActionPerformed
        tablaMusical.getSelectionModel().clearSelection();
        if(nroCancion-1>=0)
        {
            nroCancion--;
        }
        else
        {
            nroCancion = tablaMusical.getRowCount()-1;
        }
        
        tablaMusical.getSelectionModel().setSelectionInterval (nroCancion, nroCancion);
        
        estadoCancion = STOP;
        reproducirCancion();
    }//GEN-LAST:event_atrasCancionActionPerformed

    private void ActualizarTablaMusical()
    {
        //Eliminar campos
        estadoCancion = STOP;
        
        DefaultTableModel model = (DefaultTableModel) tablaMusical.getModel(); 
        
        for(int i = tablaMusical.getRowCount()-1; i>=0; i--)
        {
            model.removeRow(i); 
        }
         
        //Añadir canciones de la lista
        ManejoCancion tag = new ManejoCancion();
        List<Cancion> lista = tag.getListaCancionesUsuario(usuario);
        
        Iterator<Cancion> it = lista.iterator();
                
        while (it.hasNext()) 
        {
            Cancion cn = it.next();
            DefaultTableModel modelo=(DefaultTableModel) tablaMusical.getModel(); 

            Object [] fila=new Object[4]; 
            
            fila[0]=cn.getArtista();
            fila[1]=cn.getAlbum();
            fila[2]=cn.getTitulo();
            fila[3]=control.getTiempo((int)cn.getDuracion());
            
            modelo.addRow(fila); 
        }
    }
    
    private void agregarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCancionActionPerformed
        JFileChooser ventanaBusqueda = new JFileChooser();//Objeto ventana de busqueda
        ventanaBusqueda.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);//Tipo de busqueda
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de música...", "mp3");
        ventanaBusqueda.setFileFilter(filter);//Extenciones
        ventanaBusqueda.setMultiSelectionEnabled(true);//Seleccionar varios archivos
        int returnVal = ventanaBusqueda.showOpenDialog(null);//Condicional de aceptacion seleccion
        if(returnVal == JFileChooser.APPROVE_OPTION) 
        {
            
            int nroSelec = ventanaBusqueda.getSelectedFiles().length;
            File[] f = new File[nroSelec];
            f = ventanaBusqueda.getSelectedFiles();
            
            for (int i = 0; i < nroSelec;i++)//Registrar cada cancion seleccionada
            { 
                
                if(!new ManejoCancion().AgregarCanciones(f[i], usuario))
                {
                    JOptionPane.showMessageDialog(null,"No fue posible añadir las canciones, intentalo nuevamente.");     
                } 
                
            }
                
        }
        
        new ManejoCancion().ActualizarListaCancionesUsuario(usuario);
        ActualizarTablaMusical();
        
        new ControlPlataforma(this, usuario).hayCanciones();
  
    }//GEN-LAST:event_agregarCancionActionPerformed

    private void jScrollPaneCancionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPaneCancionesMouseClicked
        
    }//GEN-LAST:event_jScrollPaneCancionesMouseClicked

    private void InformacionCancion()
    {
        ManejoCancion tag = new ManejoCancion();
        List<Cancion> lista = tag.getListaCancionesUsuario(usuario);
        
        //Numero de cancion en reproducción
        
        //Agregar descripción de la canción
        artistaMusical.setText(lista.get(nroCancion).getArtista());
        cancionMusical.setText(lista.get(nroCancion).getTitulo());
    }
    
    private void tablaMusicalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMusicalMouseClicked

        estadoCancion = STOP;
        nroCancion = tablaMusical.getSelectedRow();
        InformacionCancion();
        reproducirCancion();

    }//GEN-LAST:event_tablaMusicalMouseClicked

    private void SiguienteCancion()
    {
        tablaMusical.getSelectionModel().clearSelection();
        if(nroCancion+1<tablaMusical.getRowCount())
        {
            nroCancion++;
        }
        else
        {
            nroCancion = 0;
        }
        
        tablaMusical.getSelectionModel().setSelectionInterval (nroCancion, nroCancion);
        estadoCancion = STOP;
        reproducirCancion();
    }
    
    private void siguienteCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteCancionActionPerformed
        SiguienteCancion();
    }//GEN-LAST:event_siguienteCancionActionPerformed

    private void reproducirCancion()
    {   
        if (nroCancion>=0)
        {
            InformacionCancion();
            tablaMusical.setRowSelectionInterval(nroCancion, nroCancion);
            ManejoCancion tag = new ManejoCancion();
            List<Cancion> lista = tag.getListaCancionesUsuario(usuario);
            
            if (estadoCancion  == PAUSE)
            { 
                reproductor.Resumen();
                estadoCancion = PLAY;
                reproducirCancion.setIcon(new ImageIcon("src\\Media\\" + "pause" + ".png"));
                
            }
            else if (estadoCancion  == STOP) 
            {
                avanceMusical.setValue(0);
                estadoCancion = PLAY;
                reproductor.Parar(lista.get(nroCancion).getDireccion());
                reproductor.Reproducir(lista.get(nroCancion).getDireccion());
                
                segundos = 0;
                duracion = (int)lista.get(nroCancion).getDuracion();
                avanceMusical.setMaximum(duracion);
                reproducirCancion.setIcon(new ImageIcon("src\\Media\\" + "pause" + ".png"));
                try 
                {
                    Image img = ImageIO.read(new File(lista.get(nroCancion).getDirCover()));
                    Image newimg = img.getScaledInstance( 201, 161,  java.awt.Image.SCALE_SMOOTH ) ;                    
                    ImageIcon icon = new ImageIcon( newimg );
                    cover.setIcon(icon);

                } 
                catch (IOException ex) 
                {
                    
                }

            }
            else if (estadoCancion  == PLAY)
            {
                reproductor.Pausa();
                estadoCancion = PAUSE;
                reproducirCancion.setIcon(new ImageIcon("src\\Media\\" + "play" + ".png"));
            }
        }
    }
    
    private void reproducirCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reproducirCancionActionPerformed
        reproducirCancion();
    }//GEN-LAST:event_reproducirCancionActionPerformed
    
    private void avanceMusicalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avanceMusicalMouseClicked
        
    }//GEN-LAST:event_avanceMusicalMouseClicked

    private void cnfiguracionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnfiguracionesActionPerformed
        new Configuraciones(usuario).AbrirAjustes(this);

    }//GEN-LAST:event_cnfiguracionesActionPerformed

    private void ControlVolumen()
    {
        int gainValue = volumenAjuste.getValue();
            
        int maxGain = volumenAjuste.getMaximum();
        if (gainValue == 0)
        {
            reproductor.setVolumen(0);
            infoVol.setText("00" + "   ");
            //jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/vol4.png")));
        }
        else
        {
            volumen = (float) ((double) gainValue / (double) maxGain);
            reproductor.setVolumen(volumen);
            infoVol.setText((int)(volumen*100) + "   ");
            if(volumen*100 <= 1)
            {
                iconVolumen.setIcon(new ImageIcon("src\\Media\\" + "volMute" + ".png"));
            }
            else if(volumen*100>0 && volumen*100<30)
            {
                iconVolumen.setIcon(new ImageIcon("src\\Media\\" + "volM" + ".png"));
            }
            else
            {
                iconVolumen.setIcon(new ImageIcon("src\\Media\\" + "volMax" + ".png"));
            }
        }
    }
    
    private void volumenAjusteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_volumenAjusteStateChanged
        this.ControlVolumen();
    }//GEN-LAST:event_volumenAjusteStateChanged

    private void reproduccionAutomaticaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reproduccionAutomaticaMouseClicked
        
            
    }//GEN-LAST:event_reproduccionAutomaticaMouseClicked

    private void iconVolumenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconVolumenMouseClicked
        if(auxvolumen==false)
        {
            volumenAjuste.setValue((int)(volumen*100));
            auxvolumen = true;
            this.ControlVolumen();
        }
        else
        {
            volumenAjuste.setValue(0);
            iconVolumen.setIcon(new ImageIcon("src\\Media\\" + "volMute" + ".png"));
            auxvolumen = false;
        }
    }//GEN-LAST:event_iconVolumenMouseClicked

    private void reproduccionAutomaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reproduccionAutomaticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reproduccionAutomaticaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Acercade acercade = new Acercade();
        acercade.setVisible(true);
        acercade.b1.setBackground(new Configuraciones(usuario).getColor());
        acercade.b2.setBackground(new Configuraciones(usuario).getColor());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void coverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coverMouseClicked
        
    }//GEN-LAST:event_coverMouseClicked

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton agregarCancion;
    private javax.swing.JLabel artistaMusical;
    public javax.swing.JButton atrasCancion;
    public javax.swing.JSlider avanceMusical;
    public javax.swing.JPanel brr1;
    public javax.swing.JPanel brr2;
    private javax.swing.JLabel cancionMusical;
    private javax.swing.JButton cnfiguraciones;
    public javax.swing.JLabel cover;
    private javax.swing.JLabel iconVolumen;
    private javax.swing.JLabel infoVol;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPaneCanciones;
    public javax.swing.JButton lblCerrarSesion;
    private javax.swing.JLabel logoDGPlayer;
    public javax.swing.JLabel nombreUsuario;
    public javax.swing.JLabel nroCanciones;
    private javax.swing.JPanel pContenido;
    private javax.swing.JCheckBox reproduccionAutomatica;
    public javax.swing.JButton reproducirCancion;
    public javax.swing.JButton siguienteCancion;
    private javax.swing.JTable tablaMusical;
    public javax.swing.JLabel tiemporestante;
    public javax.swing.JLabel tiempotranscurrido;
    public javax.swing.JSlider volumenAjuste;
    // End of variables declaration//GEN-END:variables

}