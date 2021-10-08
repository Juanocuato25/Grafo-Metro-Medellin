/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metro;

/**
 *
 * @author juancamiloarenas
 */
public class Arista {

    private Estacion origen;
    private Estacion destino;
    private int tiempo;
    
    public Arista(){
        
    }

    public Arista(Estacion origen, Estacion destino, int tiempo) {
        this.origen = origen;
        this.destino = destino;
        this.tiempo = tiempo;
    }

    public Estacion getOrigen() {
        return origen;
    }

    public void setOrigen(Estacion origen) {
        this.origen = origen;
    }

    public Estacion getDestino() {
        return destino;
    }

    public void setDestino(Estacion destino) {
        this.destino = destino;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "\n Arista{" + "origen=" + origen.getNombre() + ", destino=" + destino.getNombre() + ", tiempo = " + tiempo + " minutos " + '}';
    }
    
    

}
