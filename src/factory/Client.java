package factory;

public class Client {
	public static void main(String[] args) {
		PasajeStandard stand1= new CreatorPasajeStandard().create();
		Pasajero pas = new Pasajero();
		pas.setNombre("Felipe");
		pas.setCi("3333");
		pas.setFechaNac("25-2-1912");
		stand1.setNumAsiento("3A");
		stand1.setPasajero(pas);
		stand1.crear();
		
		PasajeStandard stand2= new CreatorPasajeStandard().create();
		pas.setNombre("Juan");
		pas.setCi("245");
		pas.setFechaNac("19-2-1912");
		stand2.setPasajero(pas);
		stand2.setNumAsiento("12A");
		stand2.crear();
		
		
		PasajeSolidario solid= new CreatorPasajeSolidario().create();
		pas.setNombre("Erik");
		pas.setCi("25555");
		pas.setFechaNac("19-2-2000");
		solid.setPasajero(pas);
		solid.setNumAsiento("400A");
		solid.crear();
		
		PasajeSolidario solid2= new CreatorPasajeSolidario().create();
		
		pas.setNombre("fjdkjfkd");
		pas.setCi("25555");
		pas.setFechaNac("3-2-2000");
		solid2.setPasajero(pas);
		solid2.setNumAsiento("00A");
		solid2.crear();
		
		
		
		
	}
	
}
