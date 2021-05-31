package singleton;

public class CC {
	
	public CC() {
		
	}
	
	public void cambiar(String de, String a, double monto) {
		System.out.println("Cambiando " +monto+de+ " a " +a);
		Cambio.getInstance().getMoney(de, a, monto);
	}
	
	
	
}
