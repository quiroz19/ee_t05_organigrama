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
public class Arbol {
    NodoArbol raiz;
    
    public Arbol(String jefe){
        raiz = new NodoArbol(jefe);
    }
    
    public void addSubalterno(String jefe, String subalterno){
        NodoArbol nuevo, buscar = raiz.buscar(jefe);
        
        if(buscar != null){
            nuevo = new NodoArbol(subalterno);
            nuevo.setHorizontal(buscar.getVertical());
            buscar.setVertical(nuevo);
        }
    }
    
    public void imprime(){
        imprime(raiz);
    }

    protected void imprime(NodoArbol nodo){
        if(nodo != null){
            System.out.print(nodo + " ");
            imprime(nodo.getHorizontal());
            System.out.println();
            imprime(nodo.getVertical());
        }
    }

}
