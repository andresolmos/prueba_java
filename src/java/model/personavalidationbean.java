/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.ejb.Stateless;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


/**
 *
 * @author andres Olmos
 */
@Stateless
public class personavalidationbean implements Validator{

    @Override
    public boolean supports(Class<?> type) {
        return personabean.class.isAssignableFrom(type);
    }

/**
 * @param  o el objeto
 * @param errors errores
 * @author andres Olmos
 */
    @Override
    public void validate(Object o, Errors errors) {
        personabean personabean = (personabean)o;
    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre", "rquired.nombre", "el nombre es requerido");
    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "apellido", "rquired.apellido", "el apellido es requerido");
    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "edad", "rquired.edad", "la edad es requerido");
    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "correo", "correo.nombre", "el correo es requerido");
    }

    
}
