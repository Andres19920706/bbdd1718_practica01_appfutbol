//Paquetes necesarios
package bbdd1718.practica01.clases;

import java.io.Serializable;

/**
 * Clase Jugador
 * Clase hija de Personas
 * @author Andres
 * @version 0
 */
public class Jugador extends Personas implements Serializable{
    //Constnates
    
    
    //Atributos
    private Double salario;
    private int  num;
    private String posicion;
    private boolean titular;
    private int idEquipo;
    //Constructores
    //Constructor por defecto
    public Jugador (){
  
    }
    //Constructor con parametros
    public Jugador (Personas persona,Double salario,int num,  String posicion,boolean titular){
        super(persona); 
        this.salario = salario;
        this.num = num;
        this.posicion = posicion;
        this.titular = titular;
        this.idEquipo = 0;        
    }
    
    //Métodos
    //Métodos de acceso (Getters & Setters)
    //Métodos Getters
    public Double getSalario() {
        return salario;
    }
    public int getNum() {
        return num;
    }
    public String getPosicion() {
        return posicion;
    }
    public boolean getTitular() {
        return titular;
    }
    public int getIdEquipo(){
        return idEquipo;
    }
    //Métodos Setters
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public void setNum(int num) {
        this.num = num;
    } 
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public void setTitular(boolean titular) {
        this.titular = titular;
    }
    public void setIdEquipo(int idEquipo){
        this.idEquipo = idEquipo;
    }

    @Override
    public String toString() {
        return "Jugador{" + ", salario=" + salario + ", num=" + num + ", posicion=" + posicion + ", titular=" + titular + '}';
    }
    
}
