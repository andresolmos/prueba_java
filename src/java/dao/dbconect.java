/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author andres Olmos
 */
public class dbconect {
/**
 *@return retorna la conexion a base de datos
 * @author andres Olmos
 */
    public DriverManagerDataSource conectar (){
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setDriverClassName("com.mysql.jdbc.Driver");
        datasource.setUrl("jdbc:mysql://localhost/prueba");
        datasource.setUsername("root");
        datasource.setPassword("");
        
        return datasource;
    }
}
