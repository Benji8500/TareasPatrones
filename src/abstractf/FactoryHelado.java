package abstractf;

public class FactoryHelado {
	public enum typeHelado{
		AGUA,CREMA,MIXTO
	}
	
	public static IHelado make(typeHelado type) {
		IHelado helado;
		switch(type) {
		case AGUA:
			helado = new HeladoAgua();
			 Base baseCono= new Base();
		        baseCono.setCosto("5");
		        baseCono.setNombre("cono");
		        baseCono.setTamano("grande");
		        baseCono.setTipo("galleta");
		        ((HeladoAgua) helado).setBase(baseCono);
		        ((HeladoAgua) helado).setForma("clasica");
		        Fruta fruta = new Fruta();
		        ((HeladoAgua) helado).setFruta(fruta);
		        ((HeladoAgua) helado).setTamano("mediano");
		        
		        fruta.setCosto("1");
		        fruta.setNombre("frutilla");
		        fruta.setTamano("mediano");
		        fruta.setTipoFruta("dulces");
		         
			break;
		case CREMA:
			helado = new HeladoCrema();
			break;
		case MIXTO:
			helado = new HeladoMixto();
			break;
		default:
			helado = new HeladoAgua();
			break;
		}
		
		
		return helado;
	}
}
