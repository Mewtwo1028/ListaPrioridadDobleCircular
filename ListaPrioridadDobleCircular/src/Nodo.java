/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Osmar
 */
public class Nodo {
    
    private Nodo ant;
    private Nodo sig;
    private char dato;
    private int prioridad;

    public Nodo(char dato, int prioridad) {
        this.ant = null;
        this.sig = null;
        this.dato = dato;
        this.prioridad = prioridad;
    }
        
    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
    
    @Override
    public String toString(){
        return "Dato: " + dato + "  Prioridad: " + prioridad;
    }
    
}
