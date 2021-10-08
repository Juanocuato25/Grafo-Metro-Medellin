/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metro;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juancamiloarenas
 */
public class Estacion {

    private String nombre;
    private List<Arista> aristas = new ArrayList<>();

//    public Estacion() {
//    }
    public Estacion(String nombre) {
        this.nombre = nombre;
    }

//    public Estacion(String nombre, List<Arista> arista) {
//        this.nombre = nombre;
//        this.aristas = arista;
//    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Arista> getArista() {
        return aristas;
    }

//    public void setArista(List<Arista> arista) {
//        this.aristas = arista;
//    }
    public void addArista(Arista a) {
        aristas.add(a);
    }

//
//    @Override
//    public String toString() {
//        return "\n Estacion{" + "nombre=" + nombre + '}';
//    }
    @Override
    public String toString() {
        return "Estacion{" + "nombre=" + nombre + " \n "+'}';
    }

}
