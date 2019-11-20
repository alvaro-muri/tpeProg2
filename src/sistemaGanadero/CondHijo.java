package sistemaGanadero;

public class CondHijo extends Condicion {
	private int hijos;
	public CondHijo(int h) {
		hijos = h;
	}
	@Override
	public boolean Cumple(Animal a) {
		return a.getTerneros_paridos()>hijos;
	}

}
