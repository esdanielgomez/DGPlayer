package Logica;


import Clases.Usuario;
import Presentacion.PlataformaMusical;
import java.awt.Color;

/**
 *
 * @author Estudiante
 */
public class ControlPlataforma {
    
    PlataformaMusical plataforma;
    Usuario usuario;
    
    public ControlPlataforma(PlataformaMusical plataforma, Usuario usuario)
    {
        this.plataforma = plataforma;
        this.usuario = usuario;
    }
    
    public void hayCanciones()
    {
        if(usuario.getListaCanciones().isEmpty())
        {
            plataforma.siguienteCancion.setEnabled(false);
            plataforma.reproducirCancion.setEnabled(false);
            plataforma.atrasCancion.setEnabled(false);
            plataforma.avanceMusical.setEnabled(false);
            
        }
        else
        {
            plataforma.siguienteCancion.setEnabled(true);
            plataforma.reproducirCancion.setEnabled(true);
            plataforma.atrasCancion.setEnabled(true);
            plataforma.avanceMusical.setEnabled(true);
            plataforma.cover.setEnabled(true);
        }
        
        plataforma.nombreUsuario.setText("" + usuario.getNombreUsuario());
        plataforma.nroCanciones.setText(usuario.getListaCanciones().size() + " canciones");
            
    }
    
    public void AjustarColores()
    {
        Color color = new Configuraciones(usuario).getColor();
        plataforma.brr1.setBackground(color);
        plataforma.brr2.setBackground(color);
        plataforma.lblCerrarSesion.setBackground(color);
        plataforma.avanceMusical.setBackground(color);
        plataforma.volumenAjuste.setBackground(color);
        plataforma.tiemporestante.setBackground(color);
        plataforma.tiempotranscurrido.setBackground(color);
        plataforma.atrasCancion.setBackground(color);
        plataforma.siguienteCancion.setBackground(color);
        plataforma.reproducirCancion.setBackground(color);
                
    }
    
    public String getTiempo(int segundos)
    {
        int horas =segundos/3600;
        int minutos =(segundos-(3600*horas))/60;
        int seg = segundos-((horas*3600)+(minutos*60));
        
        return String.format("%02d",horas) + ":" + String.format("%02d",minutos) + ":" + String.format("%02d",seg);
        
    }
    
}
