/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd1718.practica01.clases;

import java.io.Serializable;
import java.util.ArrayList;


/**
 *
 * @author Andres
 */
public class Partido implements Serializable{
    
    //Atributos
    private int idPartido;
    private int golesA;
    private int golesB;
    private Boolean ida;  
    private String fecha;
    private Estadio estadio;
    private Equipo eq1,eq2;
    private ArrayList<Arbitro> larbitros = new ArrayList<Arbitro>();
    
    
    //Constructor
    //Constructor por defecto.
    public Partido(){
        this.idPartido = 0;
        this.golesA = 0;
        this.golesB = 0;
        this.ida = false;
        this.fecha = "";
        this.estadio = new Estadio();
        this.eq1 = new Equipo();
        this.eq2 = new Equipo();
        this.larbitros = null;
    
    }
    //Constructor con parámetros.
    public Partido(int idPartido,int golesA,int golesB,
                    boolean ida,String fecha, Estadio estadio,
                    ArrayList<Arbitro> larbitros,Equipo eq1,
                    Equipo eq2){
        this.idPartido = idPartido;
        this.golesA = golesA;
        this.golesB = golesB;
        this.ida = ida;
        this.fecha = fecha;
        this.estadio = estadio;
        this.eq1 = eq1;
        this.eq2 = eq2;
        this.larbitros = larbitros;
        
    }
    
    //Métodos
    //Métodos de acceso Getters & Setters
    public int getIdPartido() {
        return idPartido;
    }
    public int getGolesA() {
        return golesA;
    }
    public int getGolesB() {
        return golesB;
    }
    public Boolean getIda() {
        return ida;
    }
    public String getFecha() {
        return fecha;
    }
    public Estadio getEstadio() {
        return estadio;
    }
    public Equipo getEq1() {
        return eq1;
    }
    public Equipo getEq2() {
        return eq2;
    }
    public ArrayList<Arbitro> getLarbitros() {
        return larbitros;
    }
    public Equipo getLeq1() {
        return eq1;
    }
    public Equipo getLeq2() {
        return eq2;
    }
    //Métodos Setters
    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }
    public void setGolesA(int golesA) {
        this.golesA = golesA;
    }
    public void setGolesB(int golesB) {
        this.golesB = golesB;
    }
    public void setIda(Boolean ida) {
        this.ida = ida;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
    public void setEq1(Equipo eq1) {
        this.eq1 = eq1;
    }
    public void setEq2(Equipo eq2) {
        this.eq2 = eq2;
    }
    public void setLarbitros(ArrayList<Arbitro> larbitros) {
        this.larbitros = larbitros;
    }
    public void setLeq1(Equipo leq1) {
        this.eq1 = leq1;
    }
    public void setLeq2(Equipo leq2) {
        this.eq2 = leq2;
    }
}
