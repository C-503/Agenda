package modelo;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class conexion 
{
    
     static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    Connection con;
    Statement stmt = null;
    String Base = "persons";
    String DB_URL = "jdbc:mysql://localhost:3306/"+Base+"?useSSL=false&serverTimezone=UTC";
    static final String user = "root";
    static final String pass = "";
    
    public conexion() throws SQLException
    {
        try
        {
        con = DriverManager.getConnection(DB_URL,user,pass);
        System.out.println("Conectado a la base de datos");
        }
        catch(Exception ex)
        {
         System.out.println("Error al conectar la base de datos"+ex.getMessage());
        }
    }
    
     public void guardarAgenda(personas persona)
    {
        try 
        {
            if(con!= null)
            {
                PreparedStatement st = con.prepareStatement("insert into personal(nombre,apellido,correo,telefono) values (?,?,?,?)");
                st.setString(1, persona.getNombre());
                st.setString(2, persona.getApellido());
                st.setString(3, persona.getCorreo());
                st.setString(4, persona.getTelefono());
                st.execute();
            }
            else
            {
                System.out.println("No fue posible guardar la persona");
            }    
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, "Error al guardar el numero1"+ex.getMessage());
        } 
    }
     
        public boolean ActualizarAgenda(personas persona, int id_persona)
    {
        
        boolean res = false;
        
        try 
        {
            if(con!=null)
            {
                 PreparedStatement st = con.prepareStatement("update personal set nombre=?,apellido=?,correo=?,telefono=? where id="+id_persona);
                st.setString(1, persona.getNombre());
                st.setString(2, persona.getApellido());
                st.setString(3, persona.getCorreo());
                st.setString(4, persona.getTelefono());
                st.executeUpdate();
                res = true;
            }
            else
            {
                res = false;
            }
            
        } 
        catch (Exception ex) 
        {
             JOptionPane.showMessageDialog(null, "Error al guardar la persona"+ex.getMessage());
        }
        
        return false;
    }
         public boolean Eliminar(int id_persona) 
    {
        boolean resultado = true;
        try {
            if (con != null) 
            {
                 PreparedStatement st = con.prepareStatement("delete from personal where id=" + id_persona + "");
                st.execute();
                st.close();
               
            } 
            else 
            {
             throw new Exception("Error de conexion a la base de datos");

            }

            } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, "error al eliminar el numero" + ex.getMessage());
            resultado = false;

        }
        return resultado;
    }
        
         public void Consultar(DefaultTableModel tablemodel) throws SQLException 
    {
        int numeroColumna = 0;
        ResultSet resultado = null;
        tablemodel.setRowCount(0);
        tablemodel.setColumnCount(0);
        PreparedStatement st = con.prepareStatement("select * from personal");
        try 
        {
            resultado = st.executeQuery();
            
           if(resultado != null)
            {
                
            
            numeroColumna = resultado.getMetaData().getColumnCount();

            //llenamos los encabezados de las columnas;
            for (int j = 1; j <= numeroColumna; j++) 
            {
                tablemodel.addColumn(resultado.getMetaData().getColumnName(j));
            } 
            //llenamos el cuerpo de la tabla

            while (resultado.next()) 
            {
                String[] datos = new String[numeroColumna];

                for (int i = 1; i <= numeroColumna; i++) 
                {
                    datos[i - 1] = (String) resultado.getString(i);
                }

                tablemodel.addRow(datos);

            }
            }

        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, "error al consultar los numeros" + ex.getMessage());
        }
        
         finally  // para operaciones de finalización si se ejecutan o no.
     {
         try
         {
             /*
             st.Close cierra la conexión a la consulta
             con.Close cerramos la conexión a la base de datos
             Cerramos la conexión a la base de datos
             */
             st.close();
             con.close();
             
             if(resultado != null)
             {
                resultado.close();
             }
         }
         catch (Exception e)
         {
               JOptionPane.showMessageDialog(null,"Error al realizar la actualización por"+e.getMessage());
         }
     }

    }
         
}


