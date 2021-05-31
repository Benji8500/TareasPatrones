package factory;

public class CreatorPasajeInfantes extends CreatorPasaje{

	@Override
	public PasajeInfantes create() {
		Avion av = new Avion();
		av.setMarca("Boeing");
		av.setCapacidad("300");
		av.setModelo("747");
		av.setNumerodeAsiento("200");
		Origen or = new Origen();
		or.setPais("Estados Unidos");
		or.setCiudad("Los Angeles");
		or.setAeropuerto("LAX");
		Destino des = new Destino();
		des.setPais("Espana");
		des.setCiudad("Madrid");
		des.setAeropuerto("MIA");
		Pasajero pas = new Pasajero();
		pas.setNombre("");
		pas.setCi("");
		pas.setFechaNac("");
		PasajeInfantes ps = new PasajeInfantes();
		ps.setDestino(des);
		ps.setOrigen(or);
		ps.setAvion(av);
		ps.setPasajero(pas);
		ps.setNumeroVuelo("33GH");
		ps.setNumAsiento("");
		ps.setCosto("200");

		return ps;
	}

}
