package org.jesuitasrioja.SMPTteoria;

import java.util.ArrayList;

import org.jesuitasrioja.SMPTteoria.logica.GeneradorAmigoInvisible;
import org.jesuitasrioja.SMPTteoria.modelo.Participante;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<Participante> listaParticipantes = new ArrayList<>();
    	listaParticipantes.add(new Participante("Nathand Drake", "NathanDrake@protonmail.com"));
    	listaParticipantes.add(new Participante("Master Chief","MasterChief@gmail.com"));
    	listaParticipantes.add(new Participante("Link","Link@hotmail.com"));
    	listaParticipantes.add(new Participante("pepe","pepe@hotmail.com"));
    	listaParticipantes.add(new Participante("jaja","jaja@hotmail.com"));
    	listaParticipantes.add(new Participante("patata","patat@hotmail.com"));
    	listaParticipantes.add(new Participante("macarrones","macarrones@hotmail.com"));
    	listaParticipantes.add(new Participante("tengo hambre","tengohambre@hotmail.com"));
    	
        GeneradorAmigoInvisible gAmigo = new GeneradorAmigoInvisible();
        System.out.println(gAmigo.generarAmigoInvisible(listaParticipantes));
    }
}
