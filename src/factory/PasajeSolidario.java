package factory;

public class PasajeSolidario implements iPasaje {
	private String numeroVuelo;
	private String numAsiento;
	private String costo;
	private Destino destino;
	private String descuento;
	private String motivoDescuento;
	private Origen origen;
	private Avion avion;
	private Pasajero pasajero;
	
	public PasajeSolidario() {
		destino = new Destino();
		origen = new Origen();
		avion = new Avion();
		pasajero = new Pasajero();
		
	}
	
	
@Override
	public void crear(){
	System.out.println("Pasaje Standard - numVuelo: "+numeroVuelo);
	System.out.println("Pasaje Standard - numAsiento: "+numAsiento);
	System.out.println("Pasaje Standard - costo: "+costo);
	System.out.println("Pasaje Standard - descuento: "+descuento);
	System.out.println("Pasaje Standard - motivoDescuento: "+motivoDescuento);


	destino.showInfo();
	origen.showInfo();
	avion.showInfo();
	pasajero.showInfo();


	
	
}


public String getNumeroVuelo() {
	return numeroVuelo;
}


public void setNumeroVuelo(String numeroVuelo) {
	this.numeroVuelo = numeroVuelo;
}


public String getNumAsiento() {
	return numAsiento;
}


public void setNumAsiento(String numAsiento) {
	this.numAsiento = numAsiento;
}


public String getCosto() {
	return costo;
}


public void setCosto(String costo) {
	this.costo = costo;
}


public Destino getDestino() {
	return destino;
}


public void setDestino(Destino destino) {
	this.destino = destino;
}


public Origen getOrigen() {
	return origen;
}


public void setOrigen(Origen origen) {
	this.origen = origen;
}


public Avion getAvion() {
	return avion;
}


public void setAvion(Avion avion) {
	this.avion = avion;
}


public Pasajero getPasajero() {
	return pasajero;
}


public void setPasajero(Pasajero pasajero) {
	this.pasajero = pasajero;
}


public String getDescuento() {
	return descuento;
}


public void setDescuento(String descuento) {
	this.descuento = descuento;
}


public String getMotivoDescuento() {
	return motivoDescuento;
}


public void setMotivoDescuento(String motivoDescuento) {
	this.motivoDescuento = motivoDescuento;
}


}
