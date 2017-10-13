/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.https://www.youtube.com/watch?v=VGnIoT_Ocok
 */
package bbdd1718.practica01.clases;

import java.io.Serializable;

/**
 *
 * @author Andres
 */
public class Estadio implements Comparable <Estadio>,Serializable {
    private int idEstadio;
    private int capacidad;
    private String direccion;
    private String ciudad;
    
    //Constructores
    //Constructor por defecto
    public Estadio(){
        this.idEstadio = 0;
        this.capacidad = 0;
        this.direccion = "";
        this.ciudad = "";
    }
    //Constructor con parámetros
    public Estadio(int idEstadio,int capacidad, String direccion, String ciudad){
        this.idEstadio = idEstadio;
        this.capacidad =  capacidad;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }
    public Estadio(Estadio recintoDeportivo){
        this.idEstadio = recintoDeportivo.getIdEstadio();
        this.capacidad = recintoDeportivo.getCapacidad();
        this.ciudad = recintoDeportivo.getCiudad();
        this.direccion = recintoDeportivo.getDireccion();
    }
    //Métodos
    
    //Métodos de acceso getters & setters
    //Métodos Getters
    public int getIdEstadio() {
        return idEstadio;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getCiudad() {
        return ciudad;
    }
    //Métodos setters

    public void setIdEstadio(int idEstadio) {
        this.idEstadio = idEstadio;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Estadio{" + "idEstadio=" + idEstadio + ", capacidad=" + capacidad + ", direccion=" + direccion + ", ciudad=" + ciudad + '}';
    }
    
    
        
    @Override
    public int compareTo(Estadio o) {
        //Solucionado en: https://stackoverflow.com/questions/25145789/comparator-int-cannot-be-dereferenced
        //Para Java <7+
        //return this.getIdEstadio().compareTo(o.getIdEstadio());
        //Para Java >7+ 
        return  Integer.compare(idEstadio, o.getIdEstadio());
    }
    

}
