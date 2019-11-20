package sistemaGanadero;
public class CondGrupoPeso extends CondicionGrupo {
	private int peso;
	public CondGrupoPeso(int p) {
		peso = p;
	}
	@Override
	public boolean Cumple(Lugar l) {
		return l.avgPeso() >= peso;
	}
}