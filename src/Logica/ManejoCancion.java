/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Cancion;
import Clases.Usuario;
import Datos.GestionBD;
import com.mpatric.mp3agic.ID3v1;
import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class ManejoCancion 
{
    
    public boolean AgregarCanciones(File f, Usuario usuario)
    {
        Cancion cancion = new Cancion();
        
        if (f.isFile())
        {
            String ruta = f.getAbsolutePath().replace('\'', '?');
            File arch = new File(ruta);

            Mp3File mp3file = null;
            try 
            {
                mp3file = new Mp3File(ruta);
            } 
            catch (IOException | UnsupportedTagException | InvalidDataException ex) 
            {
                return false;
            }

            
            File folder = new File("src\\DG Player\\Media");
            folder.mkdirs();
            
            if (mp3file.hasId3v1Tag()==true) 
            {
                //TAG de la cancion
                ID3v1 tagCancion = mp3file.getId3v2Tag();
                

                //Obtener y crear archivo imagen del album
                ID3v2 id3v2Tag = mp3file.getId3v2Tag();
                byte[] imageData = id3v2Tag.getAlbumImage();
                String nomImg = null;
                if (imageData != null) 
                {
                    String mimeType = id3v2Tag.getAlbumImageMimeType();
                    // Write image to file - can determine appropriate file extension from the mime type
                    
                   RandomAccessFile file = null;
                   
                    try 
                    {                        
                        nomImg = "src\\DG Player\\Media\\" + tagCancion.getArtist() + tagCancion.getAlbum() + "" + ".png";
                        cancion.setDirCover(nomImg);
                        
                        file = new RandomAccessFile(nomImg, "rw");
                        file.write(imageData);
                        file.close();
                    } 
                    catch (FileNotFoundException ex ) 
                    {
                        return false;
                    } 
                    catch (IOException ex) 
                    {
                        return false;
                    }
                }
                else
                {
                    Color color = new Configuraciones(usuario).getColor();
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
                    
                    
                    cancion.setDirCover(nomImg);
                }
                        
                
                //Registro de atributos
                
                cancion.setDuracion(mp3file.getLengthInSeconds());//Duracion en segundos
                cancion.setArtista(tagCancion.getArtist());//Artista
                cancion.setTitulo(tagCancion.getTitle());//Nombre de la cancion
                cancion.setAlbum(tagCancion.getAlbum());//Album o null
                cancion.setCover(nomImg);//No,bre del archivo de la imagen
                cancion.setDireccion(f.getPath());
                
                //Validacion de canciones existentes
                
                List<Cancion> lista = usuario.getListaCanciones();
                Iterator<Cancion> it = lista.iterator();
                
                boolean val = false;
                while (it.hasNext()) 
                {
                    Cancion cn = it.next();
                    if(cn.getDireccion().equals(cancion.getDireccion()))
                        val = true;
                }
                
                //Agregar cancion en la lista de canciones del usuario
                if(val == false)
                    usuario.addCancionALista(cancion);
            }
        }

        return true;
    }
    
    public List<Cancion> getListaCancionesUsuario(Usuario usuario) {
        return usuario.getListaCanciones();
    }
    
    public boolean ActualizarListaCancionesUsuario(Usuario usuario)
    {
        return new GestionBD().ActualizarUsuarios(usuario);
    }
}
