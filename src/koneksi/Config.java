/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;

/**
 *
 * @author radhikayusuf
 */
public class Config {
    
    public static String username = "root";
    public static String password = "";
    public static String databaseName = "db_cafe";
    
    
    public static Connection currentConnection = ConnectionBuilder.with(Config.username, Config.password, Config.databaseName)
                                                                  .isDisableSsl(true)
                                                                  .create();
    
}
