package sistemaGanadero;

public class CondGenero extends Condicion {
	private String s;
	public CondGenero(String s) {
		this.s=s.toLowerCase();
	}
	@Override
	public boolean Cumple(Animal a) {
		return a.getSexo().equals(s);
	}

}
