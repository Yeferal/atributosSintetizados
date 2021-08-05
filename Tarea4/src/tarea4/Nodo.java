/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4;

/**
 *
 * @author yeferal
 */
public class Nodo {
    
    Nodo hijoIz, hijoDr;
    String texto, txtSalida;
    int id;

    public Nodo(String texto) {
        this.texto = texto;
    }

    public Nodo(Nodo hijoIz, Nodo hijoDr) {
        this.hijoIz = hijoIz;
        this.hijoDr = hijoDr;
    }

    public Nodo(Nodo hijoIz, Nodo hijoDr, String texto) {
        this.hijoIz = hijoIz;
        this.hijoDr = hijoDr;
        this.texto = texto;
    }
    

    public Nodo getHijoIz() {
        return hijoIz;
    }

    public void setHijoIz(Nodo hijoIz) {
        this.hijoIz = hijoIz;
    }

    public Nodo getHijoDr() {
        return hijoDr;
    }

    public void setHijoDr(Nodo hijoDr) {
        this.hijoDr = hijoDr;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTxtSalida() {
        return txtSalida;
    }

    public void setTxtSalida(String txtSalida) {
        this.txtSalida = txtSalida;
    }
    
    
    
}
