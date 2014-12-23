/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ManagedBeans;

import Controladores.PersonasJpaController;
import Entidades.Personas;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author IdlhDeveloper
 */
@ManagedBean
@RequestScoped
public class Obtener {
    PersonasJpaController Control_personas = new PersonasJpaController();
    /**
     * Creates a new instance of Obtener
     */
    public Obtener() {
    }
    public List<Personas>getPersonas(){
        return Control_personas.findPersonasEntities();
    }
    
}
