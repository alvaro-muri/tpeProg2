package sistemaGanadero;

public class CondCapado extends Condicion {
	private boolean cap;
	public CondCapado(boolean c) {
		cap = c;
	}
	@Override
	public boolean Cumple(Animal a) {
		return a.isCapado() == cap;
	}

}
