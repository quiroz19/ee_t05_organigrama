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
public class Organigrama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arbol org = new Arbol("Director general");
        org.addSubalterno("Director general", "Subdirector de ventas");
        org.addSubalterno("Director general", "Subdirector de producción");
        org.addSubalterno("Director general", "Subdirector de finanzas");
        org.addSubalterno("Director general", "Subdirector de administración");
        org.addSubalterno("Director general", "Subdirector de contabilidad");
        org.addSubalterno("Director general", "Subdirector de materiales");
        org.addSubalterno("Director general", "Subdirector de control");
        org.addSubalterno("Subdirector de ventas", "Jefe de caja");
        org.addSubalterno("Jefe de caja", "Cajero 1");
        org.addSubalterno("Jefe de caja", "Cajero 2");
        org.addSubalterno("Jefe de caja", "Cajero 3");
        org.addSubalterno("Subdirector de producción", "Supervisor");
        org.addSubalterno("Supervisor", "Operador 1");
        org.addSubalterno("Supervisor", "Operador 2");
        org.imprime();
    }
}
