package ar.edu.pb2;

public class Ciclista extends Socio implements ICiclismo {
	
	private String nombre;
	private tipoDeBici tipo;
	
	public Ciclista(Integer nroSocio, String nombre, tipoDeBici tipo) {
		super(nroSocio);
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public tipoDeBici getTipo() {
		return tipo;
	}

	public void setTipo(tipoDeBici tipo) {
		this.tipo = tipo;
	}

	@Override
	public void bicicletear() {
		System.out.println("Compito en ciclismo");
	}
	
	
	
	

}
