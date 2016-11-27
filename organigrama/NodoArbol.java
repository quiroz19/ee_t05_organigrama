/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organigrama;

/**
 *
 * @author Mi Pc
 */
public class NodoArbol {
    String dato;
    NodoArbol vertical, horizontal;
    
    public NodoArbol(String dato){		
            this.dato = dato;
            this.vertical = null;
            this.horizontal = null;
    }
    
    public String getDato() {
            return dato;
    }
    public void setDato(String dato) {
            this.dato = dato;
    }
    public NodoArbol getVertical() {
            return vertical;
    }
    public void setVertical(NodoArbol vertical) {
            this.vertical = vertical;
    }

    public NodoArbol getHorizontal() {
            return horizontal;
    }
    public void setHorizontal(NodoArbol horizontal) {
            this.horizontal = horizontal;
    }

    public NodoArbol buscar(String dato){
        return buscar(dato, this);
    }
    
    public NodoArbol buscar(String dato, NodoArbol nodo){
        NodoArbol retorno = null;
        
        if(nodo == null)
            return null;
        else if(nodo.getDato().equalsIgnoreCase(dato))
            return nodo;
        else{
            retorno = buscar(dato, nodo.getHorizontal());
            if(retorno == null)
                retorno = buscar(dato, nodo.getVertical());
            return retorno;
        }
    }

    public String toString(){
            return dato.toString();
    }
}
