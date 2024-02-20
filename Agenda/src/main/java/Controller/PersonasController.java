
package Controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.conexion;
import modelo.personas;

public class PersonasController implements Ipersonas{
 private conexion Conexion;
    
    public PersonasController() throws SQLException
    {
        Conexion = new conexion();
    }
    
    @Override
    public boolean Guardar(personas persona) 
    {
          boolean respuesta = false;
        try 
        {
            Conexion.guardarAgenda(persona);
            JOptionPane.showMessageDialog(null, "Se guardo el registro");
            respuesta = true;
        } 
        catch (Exception ex) 
        {
             JOptionPane.showMessageDialog(null, "No se guardo el registro"+ ex.getMessage());
             respuesta = false;
        }

         return respuesta;
    }

    @Override
    public boolean Actualizar(personas persona, int id_persona) 
    {
          boolean respuesta = false;
        try 
        {
           if( Conexion.ActualizarAgenda(persona, id_persona))
           {
                 JOptionPane.showMessageDialog(null, "Se guardo el numero");
            respuesta = true;
           }
           else
           {
               JOptionPane.showMessageDialog(null, "No se guardo el numero");
             respuesta = false; 
           }
          
        } 
        catch (Exception ex) 
        {
             JOptionPane.showMessageDialog(null, "No se guardo el registro"+ ex.getMessage());
             respuesta = false;
        }
         return respuesta;
    }

    @Override
    public boolean Eliminar(int id_persona) 
    {
          boolean respuesta = false;
        try 
        {
           if( Conexion.Eliminar(id_persona))
           {
                 JOptionPane.showMessageDialog(null, "Se elimino el numero");
            respuesta = true;
           }
           else
           {
               JOptionPane.showMessageDialog(null, "No se elimino el numero");
             respuesta = false; 
           }
          
        } 
        catch (Exception ex) 
        {
             JOptionPane.showMessageDialog(null, "No se elimino el contacto"+ ex.getMessage());
             respuesta = false;
        }
         return respuesta; 
    }

    @Override
    public void Consultar(DefaultTableModel modelo) 
    {
        try 
        {
            Conexion.Consultar(modelo);
        } 
        catch (Exception e) 
        {
            
        }
    }
    
    
}
