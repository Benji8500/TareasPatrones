package factory;

public class Pasajero {
	private String nombre;
	private String ci;
	private String fechaNac;
	
	public Pasajero() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}
	
	public void showInfo(){
        System.out.println("pasajero - nombre: "+nombre);
        System.out.println("pasajero - ci: "+ci);
        System.out.println("pasajero - fechaNac: "+fechaNac);

    }

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	

}
