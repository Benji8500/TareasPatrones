package builder;

public class Pizza {
	private String ingredientes;
    private String tipoMasa;
    private String tipoQUeso;
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	public String getTipoMasa() {
		return tipoMasa;
	}
	public void setTipoMasa(String tipoMasa) {
		this.tipoMasa = tipoMasa;
	}
	public String getTipoQUeso() {
		return tipoQUeso;
	}
	public void setTipoQUeso(String tipoQUeso) {
		this.tipoQUeso = tipoQUeso;
	}
   
	
	public void showData() {
        System.out.println("ingredientes : "+ ingredientes);
        System.out.println("tipo de masa : "+tipoMasa);
        System.out.println("tipo de queso : "+tipoQUeso);
        System.out.println("**************");

	}

}
