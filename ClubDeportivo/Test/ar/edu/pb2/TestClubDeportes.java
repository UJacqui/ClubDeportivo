package ar.edu.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestClubDeportes {

	@Test
	public void queSePuedaCrearUnNadador() {
		Integer codSocio= 01;
		
		Socio socioClub = new Nadador(01, "Bety", estiloNadado.MARIPOSA) ;
		
		Nadador nadador = new Nadador(02, "emi", estiloNadado.MARIPOSA);
		
		assertNotNull(nadador);
	}
	@Test
	public void queSePuedaCrearUnCorredor() {
		
		Socio socioClub = new Corredor(12,"Lion", distanciaPreferida.MARATON45KM);
		
		Corredor corredor = new Corredor(13,"lidia", distanciaPreferida.MARATON45KM);
		
		assertNotNull(corredor);
		
	}
	
	@Test
	public void  queSePuedaCrearUnCiclista() {
		
		Socio socioClub = new Ciclista(21,"viki", tipoDeBici.MONTAÑA);
		
		Ciclista ciclista = new Ciclista(22,"viki", tipoDeBici.MONTAÑA);
		
		assertNotNull(ciclista);
	}
	
	@Test
	public void  queSePuedaCrearUnTriatleta() {
		Socio socioClub =new TriAtleta(32,"billie", estiloNadado.CROLL, distanciaPreferida.KM21, tipoDeBici.TRIATLON );

		
		TriAtleta triatleta = new TriAtleta(31,"billie", estiloNadado.CROLL, distanciaPreferida.KM21, tipoDeBici.TRIATLON );
		
		assertNotNull(triatleta);

	}
	
	@Test
	public void  queSePuedanIncorporarDistintosDeportistasAlClub() {
		
		Club clubDeportivo = new Club();
		
		clubDeportivo.agregarDeportistas(new Ciclista(21,"viki", tipoDeBici.MONTAÑA));
		clubDeportivo.agregarDeportistas(new Nadador(01, "Bety", estiloNadado.MARIPOSA));
		clubDeportivo.agregarDeportistas(new Nadador(02, "yeni", estiloNadado.MARIPOSA));
		clubDeportivo.agregarDeportistas(new Corredor(12,"Lion", distanciaPreferida.MARATON45KM));
		clubDeportivo.agregarDeportistas(new TriAtleta(31,"billie", estiloNadado.CROLL, distanciaPreferida.KM21, tipoDeBici.TRIATLON ));
		
		Integer cantDeportistasEsperados = 5;
		Integer deportistasObtenidos = clubDeportivo.cantDeSociosDelClub();
		
		assertEquals(cantDeportistasEsperados, deportistasObtenidos);


		
	}
	@Test (expected = DeportistaNoPreparado.class)
	public void queUnCorredorNoSePuedaInscribirEnUnaCarreraDeNatacion () throws DeportistaNoPreparado{
		
		Club clubDeportivo = new Club();
		
		Corredor corredor = new Corredor(13,"lidia", distanciaPreferida.MARATON45KM);
		Competencia competenciaInscribir = new Competencia(tipoDeCompetencias.CARRERA_NATACION);
		
		clubDeportivo.agregarDeportistas(corredor);
		
		clubDeportivo.asignarCompetencia(corredor, competenciaInscribir);
		
		Integer competidoresEsperados = 1;
		
		
		assertEquals(competidoresEsperados, clubDeportivo.cantDeCompetidores());
	}
	
	
	@Test (expected = DeportistaNoPreparado.class)
	public void  queUnCiclistaNoSePuedaInscribirEnUnAcuatlon () throws DeportistaNoPreparado {

		Club clubDeportivo = new Club();
		
		Corredor corredor = new Corredor(13,"lidia", distanciaPreferida.MARATON45KM);
		Competencia competenciaInscribir = new Competencia(tipoDeCompetencias.ACUATLON);
		
		clubDeportivo.agregarDeportistas(corredor);
		
		clubDeportivo.asignarCompetencia(corredor, competenciaInscribir);
		
		Integer competidoresEsperados = 1;
		
		assertEquals(competidoresEsperados, clubDeportivo.cantDeCompetidores());
		
	}
	
	

}
