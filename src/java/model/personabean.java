/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.ejb.Stateless;

/**
 *
 * @author andres Olmos
 */
@Stateless
public class personabean {

    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private int edad;

    public personabean() {
    }
/**
 * @param nombre nombre del cliente 
 * @param apellido apellido del cliente 
 * @param edad edad del cliente 
 * @param correo correo del cliente
 * @param id id del cliente 
 * @author Andres Olmos
 */
    public personabean(int id, String correo, String nombre, String apellido, int edad)  {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.correo = correo ;
    this.edad = edad;
    }



   
      

/**
 * @return retorna un dato
 * @author andre
 */
    public int getId() {
        return id;
    }
/**
 * @param id id del cliente
 * @author andre
 */
    public void setId(int id) {
        this.id = id;
    }
/**
 * @return retorna un dato
 * @author andre
 */
    public String getNombre() {
        return nombre;
    }
/**
 * @param nombre nombre del cliente
 * @author andre
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * @return retorna un dato
 * @author andre
 */
    public String getApellido() {
        return apellido;
    }
/**
 * @param apellido apellido del cliente
 * @author andre
 */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
/**
 * @return retorna un dato
 * @author andre
 */
    public String getCorreo() {
        return correo;
    }
/**
 * @param correo correo del cliente
 * @author andre
 */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
/**
 * @return retorna un dato
 * @author andre
 */
    public int getEdad() {
        return edad;
    }
/**
 * @param edad edad del cliente
 * @author andre
 */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
