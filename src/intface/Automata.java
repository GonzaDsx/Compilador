/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intface;

/**
 *
 * @author Gonzalo
 */
public class Automata {
    String tipo;
    Object tipoDato;
    Object identificador;
    Object operador;
    Object valor;
    int linea;
    /*Lineas de inicio de los recorridos*/
    int l_inicio, l_fin;
    
    public Automata(String tipo, Object tipoDato, Object identificador, int linea){
        this.tipo = tipo;
        this.tipoDato = tipoDato;
        this.identificador = identificador;        
        this.linea = linea;
        this.operador = null;
        this.valor = null;
    }
    
    public Automata(String tipo, Object tipoDato, Object identificador, Object operador, Object valor, int linea){
        this.tipo = tipo;
        this.tipoDato = tipoDato;
        this.identificador = identificador;
        this.operador = operador;
        this.valor = valor;
        this.linea=linea;
    }
    
    public Automata(String tipo, Object identificador, Object operador, Object valor,int linea){
        this.tipoDato = null;
        this.tipo = tipo;        
        this.identificador = identificador;
        this.operador = operador;
        this.valor = valor;
        this.linea = linea;
    }

    public Automata(String tipo, Object identificador, int linea, Object operador, int l_inicio, int l_fin){
        this.tipo = tipo;
        this.identificador = identificador;
        this.linea = linea;
        this.operador = operador;
        this.l_inicio = l_inicio;
        this.l_fin = l_fin;
    }
    
    public Automata(String tipo, Object tipoDato, Object identificador, int linea, Object operador, int l_inicio, int l_fin){
        this.tipo = tipo;
        this.tipoDato = tipoDato;
        this.identificador = identificador;
        this.linea = linea;
        this.operador = operador;
        this.l_inicio = l_inicio;
        this.l_fin = l_fin;
    }

    public int getL_inicio(){
        return l_inicio;
    }
    
    public int getL_fin(){
        return l_fin;
    }
    
    public int getLinea(){
        return linea;
    }
    
    public void setLinea(int linea){
        this.linea = linea;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public Object getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(Object tipoDato) {
        this.tipoDato = tipoDato;
    }

    public Object getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Object identificador) {
        this.identificador = identificador;
    }

    public Object getOperador() {
        return operador;
    }

    public void setOperador(Object operador) {
        this.operador = operador;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }
    
    
}
