package sistemaGanadero;

public class CondRaza extends Condicion {
	private String raza;
	
	public CondRaza(String raza){
		this.raza=raza;
	}
	@Override
	public boolean Cumple(Animal a) {
		return a.getRaza().equals(raza);
	}
	

}
