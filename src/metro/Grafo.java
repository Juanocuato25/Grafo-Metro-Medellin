/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metro;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author juancamiloarenas
 */
public class Grafo {

    private HashMap<String, Estacion> estaciones = new HashMap<>();
    // private List<Estacion> estaciones;

     
    
    public Estacion getEstacion(String key) {
        return estaciones.get(key);
    }

    public void addEstaciones(Estacion e) {
        estaciones.put(e.getNombre(), e);
    }

    @Override
    public String toString() {
        return "Grafo{" + "estaciones=" + estaciones.toString() + '}';
    }


}
