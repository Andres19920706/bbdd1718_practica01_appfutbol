//Paquetes necesarios
package bbdd1718.practica01.clases;

import java.io.Serializable;

/**
 * Clase Personas
 * Clase padre, y de ella heredan la clase Personas, Arbritos.
 * @author Andres
 * @version 0
 */
public class Personas implements Serializable {
    //Atributos
    public int id;
    public String nombre;
    private String email;
    private String tlf;
    
    //Constructores
    //Constructor por defecto
    public Personas (){
        this.id = 0;
        this.nombre = "";
        this.email = "";
        this.tlf = "";
    }
    //Constructor principal
    public Personas (int id, String nombre, String email, String tlf){
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.tlf = tlf;
    }
    //Constructor <-- incógnita
    public Personas (Personas persona){
        this.id = persona.id;
        this.nombre = persona.nombre;
        this.email = persona.getEmail();
        this.tlf = persona.getTlf();
        
    }
    //Métodos de la clase
    
    //Métodos de acceso a los atributos privados (getters & setter)
    //Métodos setters
    public String getEmail() {
        return email;
    }
    public String getTlf() {
        return tlf;
    }
    //Métodos Getters
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    @Override
    public String toString() {
        return "Personas{" + "id=" + id + ", nombre=" + nombre + ", email=" + email + ", tlf=" + tlf + '}';
    }
    
}
