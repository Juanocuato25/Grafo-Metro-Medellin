/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metro;

/**
 *
 * @author jJuan Camilo Arenas Florez
 */
public class Mapa {
    
    public static Grafo estaciones() {
        

      //   CREACION DE OBJETOS TIPO ESTACION.
        Estacion la_estrella = new Estacion("La estrella");
        Estacion sabaneta = new Estacion("Sabaneta");
        Estacion itagui = new Estacion("Itagui");
        Estacion envigado = new Estacion("Envigado");
        Estacion ayura = new Estacion("Ayura");
        Estacion aguacatala = new Estacion("Aguacatala");
        Estacion poblado = new Estacion("Poblado");
        Estacion industriales = new Estacion("Industriales");
        Estacion exposiciones = new Estacion("Exposiciones");
        Estacion alpujarra = new Estacion("Alpujarra");
        Estacion san_antonio = new Estacion("San antonio");
        Estacion parque_berrio = new Estacion("Parque berrio");
        Estacion prado = new Estacion("Prado");
        Estacion hospital = new Estacion("Hospital");
        Estacion universidad = new Estacion("Universidad");
        Estacion caribe = new Estacion("Caribe");
        Estacion tricentenario = new Estacion("Tricentenario");
        Estacion acevedo = new Estacion("Acevedo");
        Estacion madera = new Estacion("Madera");
        Estacion bello = new Estacion("Bello");
        Estacion niquia = new Estacion("Niquia");
        Estacion cisneros = new Estacion("Cisneros");
        Estacion sudamericana = new Estacion("Sudamericana");
        Estacion estadio = new Estacion("Estadio");
        Estacion floresta = new Estacion("Floresta");
        Estacion santa_lucia = new Estacion("Santa lucia");
        Estacion san_javier = new Estacion("San javier");
        Estacion san_benito = new Estacion("USBMED");

     // Linea A. LA EXTRELLA => NIQUIA. CON SUS APUNTADORES EN ESE SENTIDO.
        la_estrella.addArista(new Arista(la_estrella,sabaneta,4));
        sabaneta.addArista(new Arista(sabaneta, itagui, 3));
        itagui.addArista(new Arista(itagui, envigado, 3));
        envigado.addArista(new Arista(envigado, ayura, 3));
        ayura.addArista(new Arista(ayura, aguacatala, 3));
        aguacatala.addArista(new Arista(aguacatala, poblado, 3));
        poblado.addArista(new Arista(poblado, industriales, 3));
        industriales.addArista(new Arista(industriales, exposiciones, 4));
        exposiciones.addArista(new Arista(exposiciones, alpujarra, 3));
        alpujarra.addArista(new Arista(alpujarra, san_antonio, 2));
        san_antonio.addArista(new Arista(san_antonio, parque_berrio, 2));
        parque_berrio.addArista(new Arista(parque_berrio, prado, 3));
        prado.addArista(new Arista(prado, hospital, 3));
        hospital.addArista(new Arista(hospital, universidad, 3));
        universidad.addArista(new Arista(universidad, caribe, 4));
        caribe.addArista(new Arista(caribe, tricentenario, 3));
        tricentenario.addArista(new Arista(tricentenario, acevedo, 3));
        acevedo.addArista(new Arista(acevedo, madera, 2));
        madera.addArista(new Arista(madera, bello, 3));
        bello.addArista(new Arista(bello, niquia, 3));

       //  LINEA A. NIQUIA => LA ESTRELLA. 
        niquia.addArista(new Arista(niquia, bello, 3));
        bello.addArista(new Arista(bello, madera, 3));
        madera.addArista(new Arista(madera, acevedo, 2));
        acevedo.addArista(new Arista(acevedo, tricentenario, 3));
        tricentenario.addArista(new Arista(tricentenario, caribe, 3));
        caribe.addArista(new Arista(caribe, universidad, 4));
        universidad.addArista(new Arista(universidad, hospital, 3));
        hospital.addArista(new Arista(hospital, prado, 3));
        prado.addArista(new Arista(prado, parque_berrio, 3));
        parque_berrio.addArista(new Arista(parque_berrio, san_antonio, 2));
        san_antonio.addArista(new Arista(san_antonio, alpujarra, 2));
        alpujarra.addArista(new Arista(alpujarra, exposiciones, 3));
        exposiciones.addArista(new Arista(exposiciones, industriales, 4));
        industriales.addArista(new Arista(industriales, poblado, 3));
        poblado.addArista(new Arista(poblado, aguacatala, 3));
        aguacatala.addArista(new Arista(aguacatala, ayura, 3));
        ayura.addArista(new Arista(ayura, envigado, 3));
        envigado.addArista(new Arista(envigado, itagui, 3));
        itagui.addArista(new Arista(itagui, sabaneta, 3));
        sabaneta.addArista(new Arista(sabaneta, la_estrella, 4));

        // LINEA B SAN ANTONIO => SAN JAVIER
        san_antonio.addArista(new Arista(san_antonio, cisneros, 1));
        cisneros.addArista(new Arista(cisneros, sudamericana, 2));
        sudamericana.addArista(new Arista(sudamericana, estadio, 2));
        estadio.addArista(new Arista(estadio, floresta, 2));
        floresta.addArista(new Arista(floresta, santa_lucia, 2));
        santa_lucia.addArista(new Arista(santa_lucia, san_javier, 2));

        //LIBEA B SAN JAVIER => SAN ANTONIO
        san_javier.addArista(new Arista(san_javier, santa_lucia, 2));
        santa_lucia.addArista(new Arista(santa_lucia, floresta, 2));
        floresta.addArista(new Arista(floresta, estadio, 2));
        estadio.addArista(new Arista(estadio, sudamericana, 2));
        sudamericana.addArista(new Arista(sudamericana, cisneros, 2));
        cisneros.addArista(new Arista(cisneros, san_antonio, 1));
        
        
        //Tiempos desde las estaciones Parque berrio y cisneros a USBMED
        
        cisneros.addArista(new Arista(cisneros,san_benito,10));
//        san_benito.addArista(new Arista(san_benito,cisneros,10));
        parque_berrio.addArista(new Arista(parque_berrio,san_benito,7));
//        san_benito.addArista(new Arista(san_benito,parque_berrio,7));
        
        
        Grafo g = new Grafo();
        g.addEstaciones(la_estrella);
        g.addEstaciones(sabaneta);
        g.addEstaciones(itagui);
        g.addEstaciones(envigado);
        g.addEstaciones(ayura);
        g.addEstaciones(aguacatala);
        g.addEstaciones(poblado);
        g.addEstaciones(industriales);
        g.addEstaciones(exposiciones);
        g.addEstaciones(alpujarra);
        g.addEstaciones(san_antonio);
        g.addEstaciones(parque_berrio);
        g.addEstaciones(prado);
        g.addEstaciones(hospital);
        g.addEstaciones(universidad);
        g.addEstaciones(caribe);
        g.addEstaciones(tricentenario);
        g.addEstaciones(acevedo);
        g.addEstaciones(madera);
        g.addEstaciones(bello);
        g.addEstaciones(niquia);
        g.addEstaciones(cisneros);
        g.addEstaciones(sudamericana);
        g.addEstaciones(estadio);
        g.addEstaciones(floresta);
        g.addEstaciones(santa_lucia);
        g.addEstaciones(san_javier);
        g.addEstaciones(san_benito);
        
        return g;
    }
    
}
