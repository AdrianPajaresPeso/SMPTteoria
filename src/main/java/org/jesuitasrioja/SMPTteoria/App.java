package org.jesuitasrioja.SMPTteoria;

import java.util.ArrayList;

import org.jesuitasrioja.SMPTteoria.logica.GeneradorAmigoInvisible;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<String> listaParticipantes = new ArrayList<>();
    	listaParticipantes.add("Nathan Drake");
    	listaParticipantes.add("Master Chief");
    	listaParticipantes.add("Link");
    	listaParticipantes.add("Mario");
    	listaParticipantes.add("Oscar de Astora");
    	listaParticipantes.add("Sif el Gran Lobo");
    	listaParticipantes.add("Capitán Price");
    	listaParticipantes.add("Ezio Auditore");
    	listaParticipantes.add("Kayle");
    	listaParticipantes.add("Gamora");
    	listaParticipantes.add("Stark");
    	
        GeneradorAmigoInvisible gAmigo = new GeneradorAmigoInvisible();
        System.out.println(gAmigo.generarAmigoInvisible(listaParticipantes));
    }
}
