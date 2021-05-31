package singleton;

public class Cambio {
	private static Cambio instance = null;
	private String bill;
	private Cambio() {
		bill = "/";
		
	}
	
	
	
	public static Cambio getInstance() {
		if(instance==null) {
			instance = new Cambio();
		}
		return instance;
	}



	public void getMoney(String de, String a, double monto) {
		if(de =="bs" && a =="$") {
			monto=monto/7;
			bill="$";
			System.out.println("INFO > Monto Cambiado ="+ monto +bill);
		} else if(de =="bs" && a =="E") {
			monto=monto/9;
			bill="E";
			System.out.println("INFO > Monto Cambiado ="+ monto +bill);

			
		} else if(de =="$" && a =="E") {
			monto=(monto*7/9);
			bill="E";
			System.out.println("INFO > Monto Cambiado ="+ monto +bill);

			
		} else if(de =="$" && a =="bs") {
			monto=monto*7;
			bill="bs";
			System.out.println("INFO > Monto Cambiado ="+ monto +bill);

			
		} else if(de =="E" && a =="bs") {
			monto=monto*9;
			bill="bs";
			System.out.println("INFO > Monto Cambiado ="+ monto +bill);

			
		} else if(de =="E" && a =="$") {
			monto=(monto*9/7);
			bill="$";
			System.out.println("INFO > Monto Cambiado ="+ monto +bill);
			
		} 
		
	}
	
	
	
	

}
