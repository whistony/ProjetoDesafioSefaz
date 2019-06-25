/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.dao;
import java.sql.Connection;
import org.hsqldb.jdbc.JDBCDriver;
import static org.hsqldb.jdbc.JDBCDriver.driverInstance;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
/**
 *
 * @author Desconhecida
 */
@SuppressWarnings("serial")
public class Conexao {

  public Connection getConnection() throws SQLException{
    Connection conexao = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
     return conexao; 
  }  

    public static class PreparedStatement {

        public PreparedStatement() {
        }
    }
}
