/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Usuario;
import Datos.GestionBD;
import Presentacion.Ajustes;
import Presentacion.PlataformaMusical;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Configuraciones 
{
    Usuario usuario;
    
    public Configuraciones(Usuario usuario)
    {
        this.usuario = usuario;
    }
    
    public void AbrirAjustes(PlataformaMusical plataforma)
    {
        new Ajustes(this, plataforma).setVisible(true);
    }
    
    public boolean CambiarContrasena(String passAnterior, String passNuevo)
    {
        if(!usuario.getContrasenaUsuario().equals(passAnterior))
        {
            return false;
        }
        else
        {
            usuario.setContrasenaUsuario(passNuevo);
            return new GestionBD().ActualizarUsuarios(usuario);
        }
    }
    
    public String getNombreUsuario()
    {
        return usuario.getNombreUsuario();
    }
    
    public String getCorreo()
    {
        return usuario.getCorreoUsuario();
    }
    
    public boolean CambiarColorInterfaz(Color color)
    {
        List<Integer> colores = new ArrayList();
        colores.add(color.getRed());
        colores.add(color.getGreen());
        colores.add(color.getBlue());
        usuario.setColores(colores);
        return new GestionBD().ActualizarUsuarios(usuario); 
    }
    
    public Color getColor()
    {
        Iterator<Integer> it = usuario.getColores().iterator();
        int w = 1;
        
        int rojo = 0, verde = 0, azul = 0;
        while (it.hasNext()) 
        {        
            Integer us = it.next();
            if(w==1)
                rojo = us;
            else if(w==2)
                verde = us;
            else if(w==3)
                azul = us;
            
            w++;
        }
        
        Color col = new Color(rojo, verde, azul);
        return col;
    }
    
    
}
