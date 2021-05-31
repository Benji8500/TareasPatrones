package singleton;

public class LC {
	
	public LC() {
		
	}
	
	public void cambiar(String de, String a, double monto) {
		System.out.println("Cambiando " +monto+de+ " a " +a);
		Cambio.getInstance().getMoney(de, a, monto);
	}
	
	
	
}
