package abstractf;

public class Client {
	public static void main(String[] args) {
		HeladoAgua el = (HeladoAgua) FactoryHelado.make(FactoryHelado.typeHelado.AGUA);
		el.crear();
		
		HeladoMixto me = (HeladoMixto) FactoryHelado.make(FactoryHelado.typeHelado.MIXTO);
		me.crear();
	}
	
}
