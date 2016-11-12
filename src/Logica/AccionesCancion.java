/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

/**
 *
 * @author Daniel
 */
public class AccionesCancion {
    static BasicPlayer player;

    public AccionesCancion()
    {
        player = new BasicPlayer();
    }
    
    
    public boolean Parar(String ruta)
    {
        
        try 
        {
            player.open(new File(ruta));
            player.stop();
        } 
        catch (BasicPlayerException ex) 
        {
            Logger.getLogger(ManejoCancion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    public boolean Pausa()
    {
        try 
        {
            player.pause();
        } 
        catch (BasicPlayerException ex) 
        {
            return false;
        }
        
        return true;
    }
    
    public boolean Resumen()
    {
        try 
        {
            player.resume();
        } 
        catch (BasicPlayerException ex) 
        {
            return false;
        }
        
        return true;
    }
    
    public boolean Reproducir(String ruta)
    {
        if(!new File(ruta).isFile())
            return false;
        
        
        try 
        {
            player.open(new File(ruta));
            player.play();             
            // Set Pan (-1.0 to 1.0).
            player.setPan(0.0);
            
        } 
        catch (BasicPlayerException | NullPointerException ex) 
        {
            return false;
        }
        return true;
    }
    
    public void setVolumen(float volumen)
    {
        try 
        {
            player.setGain(volumen);
        } 
        catch (BasicPlayerException ex) 
        {
            Logger.getLogger(ManejoCancion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
