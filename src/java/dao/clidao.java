/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Andres Olmos
 */
public class clidao {
    JdbcTemplate jdbctemplate;
    dbconect con =new dbconect();

/**
 * @param nonbre nombre a consultar
 * @return retorna una lista
 * @author Andres Olmos
 */
 public List consultarcliente(String nonbre){
 List personabean = new ArrayList();
 this.jdbctemplate = new JdbcTemplate(con.conectar());
 String sql = "select * from prueba where nombre like '%"+nonbre+"%'";
 personabean = this.jdbctemplate.queryForList(sql);
 return personabean;
 }
/**
 * @return retorna una lista
 * @author Andres Olmos
 */
 public List testcliente(){
 List personabean = new ArrayList();
 this.jdbctemplate = new JdbcTemplate(con.conectar());
 String sql = "select * from prueba";
 personabean = this.jdbctemplate.queryForList(sql);
 return personabean;
 }
/**
 * @param nonbre nombre del cliente a agregar
 * @param apellido apellido del cliente a agregar
 * @param edad edad del cliente a agregar
 * @param correo correo del cliente a agregar
 * @author Andres Olmos
 */
 public void actcliente(String nonbre,String apellido,int edad,String correo){
  this.jdbctemplate = new JdbcTemplate(con.conectar());
        String sql = "insert into prueba (nombre,apellido,edad,correo) values ('"+nonbre+"','"+apellido+"',"+edad+",'"+correo+"')";
        this.jdbctemplate.update(sql);
}
/**
 * @param nonbre nombre del cliente a modificar
 * @param apellido apellido del cliente a modificar
 * @param edad edad del cliente a modificar
 * @param correo correo del cliente a modificar
 * @param id id del cliente a modificar
 * @author Andres Olmos
 */
public void modcliente(String nonbre,String apellido,int edad,String correo,int id){
  this.jdbctemplate = new JdbcTemplate(con.conectar());
        String sql = "update prueba set nombre = '"+nonbre+"', apellido = '"+apellido+"', edad = '"+edad+"', correo = '"+correo+"'  where id = '"+id+"' ";
        this.jdbctemplate.update(sql);
}
/**
 * @param id id del cliente a eliminar
 * @author Andres Olmos
 */
 public void borcliente(int id){
  this.jdbctemplate = new JdbcTemplate(con.conectar());
        String sql = "delete from prueba  where id ="+id;
        this.jdbctemplate.update(sql);
}
}