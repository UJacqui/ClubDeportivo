package ar.edu.pb2;

public class Nadador extends Socio implements INatacion {
	
	private String nombre;
	private estiloNadado estilo;
	
	public Nadador(Integer nroSocio, String nombre, estiloNadado estilo) {
		super(nroSocio);
		this.nombre = nombre;
		this.estilo = estilo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public estiloNadado getEstilo() {
		return estilo;
	}

	public void setEstilo(estiloNadado estilo) {
		this.estilo = estilo;
	}

	@Override
	public void nadar() {
		System.out.println("Compito nadando");		
	}
	
	
	
}
