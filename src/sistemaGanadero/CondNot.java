package sistemaGanadero;

public class CondNot extends Condicion {
	private Condicion cond;
	public CondNot(Condicion c) {
		cond = c;
	}
	@Override
	public boolean Cumple(Animal a) {
		return !cond.Cumple(a);
	}

}
