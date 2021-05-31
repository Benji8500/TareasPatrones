package factory;

public class CreatorPasajeStandard extends CreatorPasaje{

	@Override
	public PasajeStandard create() {
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
		des.setPais("Bolivia");
		des.setCiudad("La Paz");
		des.setAeropuerto("ElAlto");
		Pasajero pas = new Pasajero();
		pas.setNombre("");
		pas.setCi("");
		pas.setFechaNac("");
		PasajeStandard ps = new PasajeStandard();
		ps.setDestino(des);
		ps.setOrigen(or);
		ps.setAvion(av);
		ps.setPasajero(pas);
		ps.setNumeroVuelo("33GH");
		ps.setNumAsiento("");
		ps.setCosto("400");

		return ps;
	}

}
