package singleton;

public class Client {
	public static void main(String []args){
		 
         
         LC libre = new LC();
         libre.cambiar("bs","E",900);
         
         CC casa = new CC();
         casa.cambiar("E","bs",300);
         
         Banco ba = new Banco();
         ba.cambiar("$","bs",100);

    }

}
