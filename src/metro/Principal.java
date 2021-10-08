/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static metro.Mapa.estaciones;

/**
 *
 * @author juancamiloarenas
 */
public class Principal {

    public final static class Decision<T> {

        ArrayList<T> e = new ArrayList<>();
        int acc;

        public Decision() {
        }

        public Decision(ArrayList<T> e, int acc) {
            this.e = e;
            this.acc = acc;
        }

        public Decision nextState(T e, int n) {
            ArrayList<T> x = new ArrayList<>(this.e);
            x.add(e);
            return new Decision(x, this.acc + n);
        }

        @Override
        public String toString() {
            return "Ans";
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grafo graph = estaciones();

        System.out.println("***BIENVENIDO***"
                + "\n ***CALCULA TU RUTA*** "
                + "\n*** INGRESE SU ESTACION ORIGEN***");

        String nombreOrigen = sc.nextLine();
//        String nombreOrigen = "Bello";
        System.out.println("INGRESE ESTACION DESTINO ");
        String nombreDestino = sc.nextLine();
//        String nombreDestino = "Universidad San buenaventura";
        Decision<Estacion> de = new Decision<>();

        Estacion origen = graph.getEstacion(nombreOrigen);
        Estacion destino = graph.getEstacion(nombreDestino);

        int tiempo = camino(origen, destino, 0, new ArrayList<>());
        System.out.println(tiempo + " Minutos ");
        System.out.println();
////        de = caminoBest(origen, destino, new Decision<>());
    }


    public static int camino(Estacion origen, Estacion destino, int pesoAcumulado, ArrayList<Estacion> decisiones) {
        if (origen == destino) {
            decisiones.add(origen);
            System.out.println(Arrays.toString(decisiones.toArray(new Estacion[]{})));
            return 0;
        } else if (decisiones.contains(origen)) {
            return 100000;
        } else {
            int min = 10000;
            for (Arista a : origen.getArista()) {
                ArrayList d = new ArrayList(decisiones);
                d.add(origen);
                int peso;
                peso = camino(a.getDestino(), destino, pesoAcumulado, d);
                if (peso < min) {
                    min = peso + a.getTiempo();
                }
            }
            return min;
        }
    }

    public static Decision caminoBest(Estacion origen, Estacion destino, Decision<Estacion> d) {
        if (origen == destino) {
            return d.nextState(origen, 0);
        } else if (d.e.contains(origen)) {
            return null;
        } else {
            Decision min = null;
            for (Arista a : origen.getArista()) {
                Decision t = caminoBest(a.getDestino(), destino, d.nextState(origen, a.getTiempo()));
                if (t != null && (min == null || t.acc < min.acc)) {
                    min = t;
                }
            }
            return min;
        }
    }
}
