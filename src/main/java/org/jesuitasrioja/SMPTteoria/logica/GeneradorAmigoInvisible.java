package org.jesuitasrioja.SMPTteoria.logica;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jesuitasrioja.SMPTteoria.modelo.Participante;

public class GeneradorAmigoInvisible {

	public Map<Participante, Participante> generarAmigoInvisible(List<Participante> listaParticipantes) {
		Map<Participante, Participante> mapaReturn = new HashMap();

		Collections.shuffle(listaParticipantes);
		for (Participante participante : listaParticipantes) {
			int position = listaParticipantes.indexOf(participante) + 1;// obtiene la posicion del siguiente
			if (position >= listaParticipantes.size())
				position = 0;// si la posicion es mayor o igual al tamaño de la lista
			mapaReturn.put(participante, listaParticipantes.get(position));
		}

		return mapaReturn;
	}

}
