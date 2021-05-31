package factory;

public class Avion {
	private String marca;
	private String capacidad;
	private String modelo;
	private String numerodeAsiento;
	
public Avion() {
	
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getCapacidad() {
	return capacidad;
}

public void setCapacidad(String capacidad) {
	this.capacidad = capacidad;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public String getNumerodeAsiento() {
	return numerodeAsiento;
}

public void setNumerodeAsiento(String numerodeAsiento) {
	this.numerodeAsiento = numerodeAsiento;
}



public void showInfo(){
    System.out.println("avion - marca: "+marca);
    System.out.println("avion - capacidad: "+capacidad);
    System.out.println("avion - modelo: "+modelo);
    System.out.println("avion - numerodeAsiento: "+numerodeAsiento);

}



}
