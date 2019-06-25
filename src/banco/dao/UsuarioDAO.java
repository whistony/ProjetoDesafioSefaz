/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.dao;

import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author Desconhecida
 */
public class UsuarioDAO {
  private final Connection connection;  
  
  public UsuarioDAO(Connection connection){
      this.connection = connection;
  }
  
    /**
     *
     * @param user
     */
    public void insert (Usuario user){
      String sql = "INSERT INTO USUARIO VALUES ('TESTE', '12345678901', '81999995588', 'TESTE2019@GMAIL.COM', 'TESTE', '123');  ";
      PreparedStatement stmt = connection.PreparedStatement(sql);
      stmt.execute();
      connection.close();
  
  }
  
}
