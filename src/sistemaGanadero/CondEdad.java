package sistemaGanadero;

public class CondEdad extends Condicion {
	private int edad;
	
	public CondEdad(int edad){
		this.edad=edad;
	}
	
	
	@Override
	public boolean Cumple(Animal a) {
		return a.GetEdad()>edad;
	}
	
	
	

}
