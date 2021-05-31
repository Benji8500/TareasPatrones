package singleton;

public class Banco {
	
	public Banco() {
		
	}
	
	public void cambiar(String de, String a, double monto) {
		System.out.println("Cambiando " +monto+de+ " a " +a);
		Cambio.getInstance().getMoney(de, a, monto);
	}
	
	
	
}
