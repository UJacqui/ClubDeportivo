package ar.edu.pb2;

public class TriAtleta extends Socio implements INatacion, IRunning,ICiclismo {
	
	private String nombre;
	private estiloNadado estilo;
	private distanciaPreferida km;
	private tipoDeBici tipo;
	
	TriAtleta(Integer nroSocio, String nombre, estiloNadado estilo, distanciaPreferida km, tipoDeBici tipo) {
		super(nroSocio);
		this.nombre = nombre;
		this.estilo = estilo;
		this.km = km;
		this.tipo = tipo;
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

	public distanciaPreferida getKm() {
		return km;
	}

	public void setKm(distanciaPreferida km) {
		this.km = km;
	}

	public tipoDeBici getTipo() {
		return tipo;
	}

	public void setTipo(tipoDeBici tipo) {
		this.tipo = tipo;
	}

	@Override
	public void bicicletear() {
		System.out.println("compito en Triatlon");
	}

	@Override
	public void correr() {
		System.out.println("compito en Triatlon");
		
	}

	@Override
	public void nadar() {
		System.out.println("compito en Triatlon");
		
	}
	
	
	
	
	

}
