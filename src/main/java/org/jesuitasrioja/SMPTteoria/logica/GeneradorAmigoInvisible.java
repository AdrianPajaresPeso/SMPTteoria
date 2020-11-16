package org.jesuitasrioja.SMPTteoria.logica;

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
			int position = listaOrdenadaRandom.indexOf(string)+1;
			
			
			if(position >= listaOrdenadaRandom.size()){
				position = 0;
			}
			mapaReturn.put(string, listaOrdenadaRandom.get(position));
//			System.out.println(string +" "+ listaOrdenadaRandom.get(position));
//			System.out.println(position);
		}
		
		return mapaReturn;
	}
}
