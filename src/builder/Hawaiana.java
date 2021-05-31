package builder;

public class Hawaiana extends BuilderPizza {

	@Override
	public void buildIngredientes() {
		pizza.setIngredientes("pina, salsa tomate, otro.");
		
	}

	@Override
	public void buildTipoMasa() {
		pizza.setTipoMasa("masa normal");
		
	}

	@Override
	public void buildTipoQueso() {
		pizza.setTipoQUeso("quezo mozarella tipo 2");
		
	}
	

}
