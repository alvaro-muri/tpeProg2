package sistemaGanadero;

public class CondPeso extends Condicion {
	private int peso;
	
	public CondPeso(int peso){
		this.peso=peso;
	}

	@Override
	public boolean Cumple(Animal a) {
		return a.getPeso()>peso;
	}
}
