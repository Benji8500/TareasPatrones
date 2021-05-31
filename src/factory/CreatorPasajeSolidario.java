package factory;

public class CreatorPasajeSolidario extends CreatorPasaje{

	@Override
	public PasajeSolidario create() {
		Avion av = new Avion();
		av.setMarca("Boeing");
		av.setCapacidad("500");
		av.setModelo("847");
		av.setNumerodeAsiento("200");
		Origen or = new Origen();
		or.setPais("Alemania");
		or.setCiudad("Berlin");
		or.setAeropuerto("BIA");
		Destino des = new Destino();
		des.setPais("Bolivia");
		des.setCiudad("La Paz");
		des.setAeropuerto("ElAlto");
		Pasajero pas = new Pasajero();
		pas.setNombre("");
		pas.setCi("");
		pas.setFechaNac("");
		PasajeSolidario ps = new PasajeSolidario();
		ps.setDestino(des);
		ps.setOrigen(or);
		ps.setAvion(av);
		ps.setPasajero(pas);
		ps.setNumeroVuelo("34GH");
		ps.setNumAsiento("");
		ps.setCosto("900");
		ps.setDescuento("50");
		ps.setMotivoDescuento("");
	
		return ps;
	}

}
