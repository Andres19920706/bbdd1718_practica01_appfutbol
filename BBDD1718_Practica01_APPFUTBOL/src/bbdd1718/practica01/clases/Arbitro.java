/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd1718.practica01.clases;

import java.io.Serializable;

/**
 *
 * @author Andres
 */
public class Arbitro extends Personas implements Serializable{

    //Atributos.
    private String tipo; //Posicion del arbitro
    private Double salario;
    
    //Constructores
    //Constructor por defecto
    public Arbitro(){
        super();
        this.tipo="";
        this.salario=0.0;
    }
    public Arbitro(Personas persona,String tipo,Double salario){
        super(persona);
        this.tipo = tipo;
        this.salario = salario;
    }
    //Métodos
    //Métodos de acceso getters and setters
    public String getTipo() {
        return tipo;
    }
    public Double getSalario(){
        return salario;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }  
    public void setSalario(Double salario){
        this.salario = salario;
    }
}
