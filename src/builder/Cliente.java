package builder;

public class Cliente {

	public static void main(String[] args) {
		Restaurante LaPizzeria= new Restaurante();
        Carnivora Carnivora = new Carnivora();
        Hawaiana Hawaiana = new Hawaiana();
        Clasica Clasica = new Clasica();

        LaPizzeria.setBuilderPizza(Carnivora);
        
        LaPizzeria.prepararPizza();
        
        Pizza pizzaCarnivora = LaPizzeria.getPizza();
        pizzaCarnivora.showData();
        
        LaPizzeria.setBuilderPizza(Hawaiana);
        
        LaPizzeria.prepararPizza();
        
        Pizza pizzaHawaiana = LaPizzeria.getPizza();
        pizzaHawaiana.showData();
        
        LaPizzeria.setBuilderPizza(Clasica);
        
        LaPizzeria.prepararPizza();
        
        Pizza pizzaClasica = LaPizzeria.getPizza();
        pizzaClasica.showData();
        
        

	}

}
