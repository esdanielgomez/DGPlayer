package Clases;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Usuario 
{
    
    private String nombreUsuario, correoUsuario, contrasenaUsuario, paisUsuario;
    private int anio;
    private char genero;
    private List<Integer> colores = new ArrayList<>();
    private List<Cancion> listaCanciones = new ArrayList<>();

    public Usuario(String nombreUsuario, String correoUsuario, String contrasenaUsuario, String paisUsuario, int anio, char genero) {
        this.nombreUsuario = nombreUsuario;
        this.correoUsuario = correoUsuario;
        this.contrasenaUsuario = contrasenaUsuario;
        this.paisUsuario = paisUsuario;
        this.anio = anio;
        this.genero = genero;
    }

    public List<Cancion> getListaCanciones() {
        return listaCanciones;
    }

    public List<Integer> getColores() {
        return colores;
    }
    
    public String getColoresS()
    {
        Iterator<Integer> it = this.getColores().iterator();
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
        
        return rojo + "," + verde + "," + azul;
    }

    public void setColores(List<Integer> colores) {
        this.colores = colores;
    }
    
    public void setListaCanciones(List<Cancion> listaCanciones) {
        this.listaCanciones = listaCanciones;
    }
    
    public void addCancionALista(Cancion c) {
        this.listaCanciones.add(c);
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }

    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
    }

    

    public String getPaisUsuario() {
        return paisUsuario;
    }

    public void setPaisUsuario(String paisUsuario) {
        this.paisUsuario = paisUsuario;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombreUsuario=" + nombreUsuario + ", correoUsuario=" + correoUsuario + ", contrasenaUsuario=" + contrasenaUsuario + ", paisUsuario=" + paisUsuario + ", anio=" + anio + ", genero=" + genero + ", colores=" + colores.toString() + ", listaCanciones=" + listaCanciones.toString() + '}';
    }

    
    
    
    
}
