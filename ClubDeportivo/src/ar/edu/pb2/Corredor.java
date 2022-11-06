package ar.edu.pb2;

public class Corredor extends Socio implements IRunning{
	
	private String nombre;
	private distanciaPreferida km;
	
	
	public Corredor(Integer nroSocio, String nombre, distanciaPreferida km) {
		super(nroSocio);
		this.nombre = nombre;
		this.km = km;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public distanciaPreferida getKm() {
		return km;
	}


	public void setKm(distanciaPreferida km) {
		this.km = km;
	}


	@Override
	public void correr() {
		System.out.println("compito en maraton");
	}
	
	
	
	
}
