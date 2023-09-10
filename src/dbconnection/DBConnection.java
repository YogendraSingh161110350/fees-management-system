
package dbconnection;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author yogendra singh
 */
public class DBConnection 
{
    public static Connection getConnection()
    {
        Connection con=null; 
        try
            (
                FileInputStream fis =new FileInputStream("C:\\Users\\91740\\Documents\\Custom Office Templates\\fess managment system\\src\\dbconnection\\database_details.properties");
            )
        {
            Properties p = new Properties();
            p.load(fis);
            Class.forName(p.getProperty("class-name"));
            con = DriverManager.getConnection(p.getProperty("db-url"), p.getProperty("username"), p.getProperty("pass"));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
    public static void main(String[] args) {
        getConnection();
    }
}