package org.jesuitasrioja.SMPTteoria.logica;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class GeneradorAmigoInvisible {

	public Map<String, String> generarAmigoInvisible(List<String> listaParticipantes){
		Map<String, String> mapaReturn = new HashMap();
		Random generator = new Random ();
		ArrayList<String> listaOrdenadaRandom = new ArrayList<>();
		
		while (listaParticipantes.size() > 0)
	       {
	           int position = generator.nextInt(listaParticipantes.size());
	           listaOrdenadaRandom.add(listaParticipantes.get(position));
	           listaParticipantes.remove(position);
	       }

		for (String string : listaOrdenadaRandom) {
			if(listaOrdenadaRandom.indexOf(string) == 0) {
				mapaReturn.put(string, listaOrdenadaRandom.get(1));
			}
			
			if(listaOrdenadaRandom.indexOf(string) == (listaOrdenadaRandom.size()-1)) {
				mapaReturn.put(string, listaOrdenadaRandom.get(0)); 
			}
			int next = listaOrdenadaRandom.indexOf(string)+1;
			mapaReturn.put(string, listaOrdenadaRandom.get(next));
		}
		
		return mapaReturn;
	}
}
