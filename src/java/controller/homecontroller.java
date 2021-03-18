/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.clidao;
import dao.dbconect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.personabean;
import model.personavalidationbean;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author andres Olmos
 */
@Controller
public class homecontroller {
    private personavalidationbean personavalidar;
    private  JdbcTemplate jdbcTemplate; 

/**
 *
 * @author andres Olmos
 */
    public homecontroller(){
        dbconect con = new dbconect();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
        this.personavalidar = new personavalidationbean();
    }
    
    
        @RequestMapping(value = "formjstl.htm", method= RequestMethod.GET)
    public ModelAndView form(){
        ModelAndView mav = new ModelAndView();
        personabean personabean = new personabean();
        mav.addObject("personabean", personabean);
        mav.setViewName("formjstl");
        return mav;
    }
    
/**
 * @return retorna una vista
 * @author andres Olmos
 */
    @RequestMapping(value = "formjstl.htm", method= RequestMethod.POST)
    public ModelAndView verform(){
        ModelAndView mav = new ModelAndView();
        clidao clida = new clidao();
        mav.addObject("personabean",clida.testcliente() );
        mav.setViewName("mostrarpersona");
        return mav;
    }
    @RequestMapping(value = "agegar_cliente.htm", method= RequestMethod.GET)
    public ModelAndView client(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("personabean", new personabean());
        mav.setViewName("agegar_cliente");
        return mav;
    }
    
   
   
        /**
         * @param personabean es de donde recupero los datos
         * @param result parametro de validacion
         * @param status parametro de validacion
         * @return retorna una vista
         * @author andres Olmos
         */
        @RequestMapping(value = "agegar_cliente.htm", method= RequestMethod.POST)
    public ModelAndView addvlient(@ModelAttribute("personabean") personabean personabean 
            ,BindingResult result
            ,SessionStatus status ){
        this.personavalidar.validate(personabean, result);
        if(result.hasErrors()){
        ModelAndView mav = new ModelAndView();
        mav.addObject("personabean" , new personabean());
        mav.setViewName("agegar_cliente");
        return mav;
        }else{
         ModelAndView mav = new ModelAndView();
        clidao clida = new clidao();
        String nombre = personabean.getNombre();
        String apellido = personabean.getApellido();
        int edad = personabean.getEdad();
        String correo = personabean.getCorreo();
        clida.actcliente(nombre, apellido, edad, correo);
        mav.setViewName("redirect:/formjstl.htm");
        return mav;
        }
    }
    
    @RequestMapping(value = "modi_persona.htm", method= RequestMethod.GET)
    public ModelAndView acttclient(HttpServletRequest request){
        ModelAndView mav = new ModelAndView();
    int id = Integer.parseInt(request.getParameter("id"));
       personabean personabean = this.cargarclientebyid(id);
    mav.addObject("personabean", new personabean(id,personabean.getCorreo(),personabean.getNombre(),personabean.getApellido(),personabean.getEdad()));
    mav.setViewName("modi_persona");
    return mav;
    }
    /**
         * @param personabean es de donde recupero los datos
         * @param result parametro de validacion
         * @param status parametro de validacion
         * @return retorna una vista
         * @author andres Olmos
         */
    @RequestMapping(value = "modi_persona.htm", method= RequestMethod.POST)
    public ModelAndView modclient(@ModelAttribute("personabean") personabean personabean 
            ,BindingResult result
            ,SessionStatus status ){
        this.personavalidar.validate(personabean, result);
        if(result.hasErrors()){
        ModelAndView mav = new ModelAndView();
        mav.addObject("personabean" , new personabean());
        mav.setViewName("agegar_cliente");
        return mav;
        }else{ModelAndView mav = new ModelAndView();
        clidao clida = new clidao();
        String nombre = personabean.getNombre();
        String apellido = personabean.getApellido();
        int edad = personabean.getEdad();
        String correo = personabean.getCorreo();
        int id = personabean.getId();
        clida.modcliente(nombre, apellido, edad, correo, id);
        mav.setViewName("redirect:/formjstl.htm");
        return mav;}
    }
    /**
         * @param request metodo para obtener parametros
         * @return retorna una vista
         * @author andres Olmos
         */
    @RequestMapping(value = "bor_persona.htm")
    public ModelAndView borrclient(HttpServletRequest request){
        ModelAndView mav = new ModelAndView();
    int id = Integer.parseInt(request.getParameter("id"));
    clidao clida = new clidao();
        clida.borcliente(id);
        mav.setViewName("redirect:/formjstl.htm");
    return mav;
    }
    /**
         * @param id id del cliente
         * @return retorna una vista
         * @author andres Olmos
         */
    public personabean cargarclientebyid(int id){
    final personabean personabean = new personabean();
    String sql = "select * from prueba where id =" + id;
    return (personabean) jdbcTemplate.query(sql, new ResultSetExtractor<personabean>()
    {
        public personabean extractData(ResultSet rs) throws SQLException, DataAccessException {
        if(rs.next()){
        personabean.setId(rs.getInt("id"));
        personabean.setNombre(rs.getString("nombre"));
        personabean.setApellido(rs.getString("apellido"));
        personabean.setCorreo(rs.getString("correo"));
        personabean.setEdad(rs.getInt("edad"));
        }  
        return personabean;
        }
        
    }
           );
    }
    @RequestMapping(value = "consulta.htm", method= RequestMethod.GET)
    public ModelAndView selectform(){
        ModelAndView mav = new ModelAndView();
        personabean personabean = new personabean();
        mav.addObject("personabean", personabean);
        mav.setViewName("consulta");
        return mav;
    }
    
/**
        /**
         * @param personabean es de donde recupero los datos
         * @param result parametro de validacion
         * @param status parametro de validacion
         * @return retorna una vista
         * @author andres Olmos
         */
    @RequestMapping(value = "consulta.htm", method= RequestMethod.POST)
    public ModelAndView selectverform(@ModelAttribute("personabean") personabean personabean 
            ,BindingResult result
            ,SessionStatus status ){
        ModelAndView mav = new ModelAndView();
        clidao clida = new clidao();
        String nom = personabean.getNombre();
        mav.addObject("personabean",clida.consultarcliente(nom) );
        mav.setViewName("mostrarpersona");
        return mav;
    }

    
}


    
    
    


