package Logica;

import Clases.Usuario;
import Datos.GestionBD;
import Presentacion.PlataformaMusical;
import Presentacion.Registro;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Daniel
 */
public class ManejoSesion 
{
    public boolean IniciarSesion(String nombreUsuario, String contrasenaUsuario)
    {
        GestionBD usuario = new GestionBD();
        if(usuario.BuscarUsuario(nombreUsuario, contrasenaUsuario) == false)
        {
            return false;
        }
        else
        {
            Usuario user = usuario.getUsuario();
            PlataformaMusical plataforma = new PlataformaMusical(user, new AccionesCancion());
            plataforma.setVisible(true);
            return true;
        }
    }
    
    
    
    public boolean RegistroIniciar(Registro registro, String nombreUsuario, String contrasenaUsuario, String correoUsuario, String pais, String nacimiento, char genUsuario)
    {
        if(new GestionBD().usuarioExistente(nombreUsuario))
        {
            registro.lblError.setText("Error en el registro, el nombre de usuario ingresado ya existe");
            registro.lblError.setVisible(true);
            return false;
        }
        else
        {
            GestionBD nuevo = new GestionBD();
            
            //Color
            List<Integer> colores = new ArrayList();
            colores.add(102);
            colores.add(0);
            colores.add(0);

            if(this.valRegistro(registro, nombreUsuario, correoUsuario, contrasenaUsuario))
            {
                if(nuevo.registrarUsuario(nombreUsuario, correoUsuario, contrasenaUsuario,pais, Integer.parseInt(nacimiento), genUsuario, colores))
                {
                    registro.lblError.setText("¡¡Usuario registrado satisfactoriamente!!");
                    registro.lblError.setVisible(true);

                    JOptionPane.showMessageDialog(null,"¡¡Usted ha sido registrado satisfactoriamente!!");

                    //Registro
                    Usuario usuario = new Usuario(nombreUsuario, correoUsuario, contrasenaUsuario,pais, Integer.parseInt(nacimiento), genUsuario);
                    usuario.setColores(colores);
                    PlataformaMusical plataforma = new PlataformaMusical(usuario, new AccionesCancion());
                    plataforma.setVisible(true);
                    return true;
                }
                else
                {
                    registro.lblError.setText("Algo salio mal, por favor intentelo mas tarde");
                    registro.lblError.setVisible(true);
                    return false;
                }
                
            }
            else
            {
                registro.lblError.setVisible(true);
                return false;
            }
        }
    }
    
    public boolean ValidacionesIngresoRegistro(Registro registro)
    {
        
        if(registro.nombreUsuario.getText().isEmpty())
        {
            registro.lblError.setText("Por favor, ingrese un nombre de usuario");
            registro.lblError.setVisible(true);
            return false;
        }
        else if(registro.contrasenaUsuario.getText().isEmpty())
        {
            registro.lblError.setText("Por favor, ingrese una contraseña");
            registro.lblError.setVisible(true);
            return false;
        }
        else if(registro.contrasenaUsuario.getText().length()<6)
        {
            registro.lblError.setText("Por favor, ingrese una contraseña de almenos 6 caracteres");
            registro.lblError.setVisible(true);
            return false;
        }
        else if(registro.correoUsuario.getText().length()<6)
        {
            registro.lblError.setText("Por favor, ingrese un correo electronico");
            registro.lblError.setVisible(true);
            return false;
        }
        else if(!registro.masculino.isSelected() && !registro.femenino.isSelected())
        {
            registro.lblError.setText("Por favor, ingrese su genero");
            registro.lblError.setVisible(true);
            return false;
        }

        return true;
        
    }
    
    public boolean isCaracteresInvalidos(String cadena)
    {
        return cadena.contains("\\") || cadena.contains(";") 
                || cadena.contains(",") || cadena.contains("/") || 
                cadena.contains(":") || cadena.contains("#");
                
    }
    
    public boolean valRegistro(Registro registro, String nombre, String correo, String clave)
    {
        boolean estado = true;
        if(this.isCaracteresInvalidos(nombre))
        {
            registro.lblError.setText("Caracteres invalidos en el nombre de usuario, ingrese solo letras y/o digitos");
            estado = false;
        }
        else if(this.isCaracteresInvalidos(clave))
        {
            registro.lblError.setText("Caracteres invalidos en la contraseña, ingrese solo letras y/o digitos");
            estado = false;
        }
        else
        {
            // Patrón para validar el email
            Pattern pattern = Pattern
                    .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

            // El email a validar
            Matcher mather = pattern.matcher(correo);

            if (!mather.find()) {
                registro.lblError.setText("Por favor, ingrese una dirección de correo electronico correcto");
                estado = false;
            }    
        }
        return estado;
    }
}
