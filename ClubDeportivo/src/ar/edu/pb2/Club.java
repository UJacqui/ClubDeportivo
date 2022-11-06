package ar.edu.pb2;

import java.util.HashMap;
import java.util.HashSet;

public class Club {
	
	private tipoDeCompetencias competencias;
	private HashSet<Socio> listaDeSociosClub= new HashSet<>();
	private HashMap <Competencia, Socio> listaDeInscriptos = new HashMap<Competencia, Socio>();
	
	//////////////////////////////////////////////////////////////////////////

	public void agregarDeportistas(Socio deportista) {
		this.listaDeSociosClub.add(deportista);
	}
	
	public Integer cantDeSociosDelClub() {
		return listaDeSociosClub.size();
	}

	public void asignarCompetencia(Socio deportista, Competencia competencia) throws DeportistaNoPreparado {
		
		switch (competencia.getCompetencias()) {
		
		case CARRERA_NATACION:
			
			if (deportista instanceof Nadador) { //agrego a mapa
				this.listaDeInscriptos.put(competencia, deportista);
			}else{
				throw new DeportistaNoPreparado("No es apto para nadar");
			}
			
		case CARRERA_CICLISMO:
			
			if (deportista instanceof Ciclista) {
				this.listaDeInscriptos.put(competencia, deportista);
				
			} else {
				throw new DeportistaNoPreparado("No es apto para ciclismo");
			}
			
		case MARATON:
			
			if (deportista instanceof Corredor) {
				this.listaDeInscriptos.put(competencia, deportista);
			} else {
				throw new DeportistaNoPreparado("No apto para correr");
			}
				
		case ACUATLON:
			
			if (deportista instanceof Nadador && deportista instanceof Corredor ) {
				this.listaDeInscriptos.put(competencia, deportista);

			} else {
				throw new DeportistaNoPreparado("No apto para correr");
				
			}break;
		
		}
	}
	
//	///////////////////////////////////////

	public Integer cantDeCompetidores() {
		return listaDeInscriptos.size();
	}

	
	

	

	

}
