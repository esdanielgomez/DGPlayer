package Datos;
import Clases.Cancion;
import Clases.Usuario;
import Logica.ManejoCancion;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class GestionBD
{
    private Usuario usuario;
    private final String fileUsuarios = "users.txt";
    private List<Usuario> usuarios = new ArrayList<>();
    
    
    public boolean registrarUsuario(String nombreUsuario, String correoUsuario, String contrasenaUsuario, String paisUsuario, int anio, char genero, List<Integer> colUs)
    {
        if(CargarUsuarios() == false)
        {
            return false;
        }
        
        usuario = new Usuario(nombreUsuario, correoUsuario, contrasenaUsuario, paisUsuario, anio, genero);
        usuario.setColores(colUs);
        this.usuarios.add(usuario);
        
        try
        {
            Iterator<Usuario> it = usuarios.iterator();
            PrintWriter pw = new PrintWriter(fileUsuarios);
            String datos = null;
            
            while (it.hasNext()) 
            {
                Usuario us = it.next();
                datos = null;
                //if(it.hasNext())
                {
                    datos = us.getNombreUsuario() + ";" + us.getCorreoUsuario() + ";" + us.getContrasenaUsuario()
                        + ";" + us.getPaisUsuario() + ";"+ us.getAnio() + ";" + us.getGenero() 
                        + ";" + us.getColoresS() + ";"; 
                    
                    //Agregar linea al archivo de salida
                    pw.print(datos);
                    
                    //Canciones
                    
                    if(usuario.getNombreUsuario().equals(us.getNombreUsuario()))
                    {
                        us = usuario;
                    }
                    
                    List<Cancion> lista = us.getListaCanciones();
                    Iterator<Cancion> cn = lista.iterator();
                
                    while (cn.hasNext()) 
                    {
                        Cancion can = cn.next();
                        pw.print(can.getDireccion() + ";");
                    }
                    pw.println();
                
                    //
                }
            }
            
            //Finalizacion del guardado
            pw.close();
            
            return true;
        }
        catch (FileNotFoundException ex) 
        {
            return false;
        }
        
        
    }
    
    private boolean CargarUsuarios()
    {
     
        try 
        {
            usuarios = new ArrayList<>();
            
            File archivo = new File(fileUsuarios);
            if (!archivo.exists())
                return true;
            
            
            FileReader fentrada = new FileReader(fileUsuarios);
            BufferedReader br = new BufferedReader(fentrada);
            
            String cadena = null;
            int w = -1; //Numero de Atributo
            StringBuffer atributo = new StringBuffer();
            
            
            while((cadena = br.readLine())!=null)
            {
                String nombreUsuario = null, correoUsuario = null, contrasenaUsuario = null, directorioMusical = null, paisUsuario = null;
                
                int anio = 0; 
                char genero = 0;
                
                
                int i;
                for(i = 0; i< cadena.length(); i++)
                {
                    if(cadena.charAt(i)!=';')
                    {
                        atributo.append(cadena.charAt(i));
                    }
                    else
                    {   
                        w++;
                        if(w==0)
                            nombreUsuario = atributo.toString();
                        else if(w==1)
                        {
                            correoUsuario = atributo.toString();
                        }
                        else if(w==2)
                        {
                            contrasenaUsuario = atributo.toString();
                        }
                        else if(w==3)
                            paisUsuario = atributo.toString();
                        else if(w==4)
                            anio = Integer.parseInt(atributo.toString());
                        else if(w==5)
                        {
                            genero = atributo.charAt(0);
                            break;
                        }
                        
                        atributo = new StringBuffer();

                    }
                }
                
                //Nuevo usuario
                w=-1;
                
                Usuario us = new Usuario(nombreUsuario, correoUsuario, contrasenaUsuario, paisUsuario, anio, genero);
                
                //Colores
                List<Integer> colores = new ArrayList();
                atributo = new StringBuffer();
                int k = i+1;
                while(k<cadena.length())
                {
                    if(cadena.charAt(k)!=',' && cadena.charAt(k)!=';')
                    {
                        atributo.append(cadena.charAt(k));
                    }
                    else
                    {
                        colores.add(Integer.parseInt(atributo.toString()));
                        atributo = new StringBuffer();
                        
                        if(cadena.charAt(k)==';')
                        {
                            k++;
                            break;
                        }
                    }
                    k++;
                    
                }
                
                //Lista der reproducccion
                
                atributo = new StringBuffer();
                while(k<cadena.length())
                {
                    if(cadena.charAt(k)!=';')
                    {
                        atributo.append(cadena.charAt(k));
                    }
                    else
                    {
                        
                        ManejoCancion tag = new ManejoCancion();
                        tag.AgregarCanciones(new File(atributo.toString()), us);
                        atributo = new StringBuffer();
                    }

                    k++;
                }
                
                us.setColores(colores);
                
                this.usuarios.add(us);
            }
            
            return true;
        } 
        catch (FileNotFoundException ex) 
        {
            return false;
        } 
        catch (IOException ex) 
        {
            return false;
        }
            
    }
    
    public boolean ActualizarUsuarios(Usuario usuario)
    {
        try
        {
            CargarUsuarios();
            
            File borrA = new File(fileUsuarios);
            if(borrA.exists())
            {
                borrA.delete();
            }
            
            this.usuario = usuario;
            Iterator<Usuario> it = usuarios.iterator();
            PrintWriter pw = new PrintWriter(fileUsuarios);
            String datos = null;
            
            while (it.hasNext()) 
            {
                Usuario us = it.next();
                datos = null;
                //if(it.hasNext())
                {
                    if(usuario.getNombreUsuario().equals(us.getNombreUsuario()))
                    {
                        us = usuario;
                    }
                
                
                    datos = us.getNombreUsuario() + ";" + us.getCorreoUsuario() + ";" + us.getContrasenaUsuario()
                        + ";" + us.getPaisUsuario() + ";"+ us.getAnio() + ";" + us.getGenero() 
                        + ";"; 
                    
                    //Agregar linea al archivo de salida
                    pw.print(datos);
                    
                    //Colores de la interfaz
                    
                    List<Integer> colores = us.getColores();
                    Iterator<Integer> cl = colores.iterator();

                    int ww = 1;
                    while (cl.hasNext()) 
                    {
                        int nro = cl.next();
                        if(ww==1)
                            pw.print(nro + ",");
                        if(ww==2)
                            pw.print(nro + ",");
                        if(ww==3)
                            pw.print(nro + ";");
                        
                        ww++;
                    }
                    
                    //Canciones

                    List<Cancion> lista = us.getListaCanciones();
                    Iterator<Cancion> cn = lista.iterator();
                
                    while (cn.hasNext()) 
                    {
                        Cancion can = cn.next();
                        pw.print(can.getDireccion() + ";");
                    }
                    pw.println();
                
                    //
                }
                
            }
            
            //Finalizacion del guardado
            pw.close();
            
            return true;
        }
        catch (FileNotFoundException ex) 
        {
            return false;
        }
    }
    
    public boolean usuarioExistente(String nombreUsuario)
    {
        CargarUsuarios();
        Iterator<Usuario> it = usuarios.iterator();
        
        boolean estado = false;
        while (it.hasNext()) 
        {
            
           Usuario us = it.next();
           
            if(us.getNombreUsuario().equals(nombreUsuario))
            {
                estado = true;
                usuario = us;
                return true;
            }
        }
        
        return estado;
    }
    
    public Usuario getUsuario()
    {
        return usuario;
    }

    public boolean BuscarUsuario(String nombreUsuario, String contrasenaUsuario)
    {
        if(usuarioExistente(nombreUsuario)==true)
        {
            Iterator<Usuario> it = usuarios.iterator();
        
            boolean estado = false;
            while (it.hasNext()) 
            {
                
               Usuario us = it.next();
               if(us.getNombreUsuario().equals(nombreUsuario)==true)
               {
                   if(us.getContrasenaUsuario().equals(contrasenaUsuario)==true)
                       
                        estado = true;
                   break;
               }
            }
            
            return estado;
        }
        else
        {
            
            return false;
        }
    }
}