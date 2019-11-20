package sistemaGanadero;
public class CondGrupoEdad extends CondicionGrupo {
	private int edad;
	public CondGrupoEdad (int e) {
		edad = e;
	}
	@Override
	public boolean Cumple(Lugar l) {
		return l.avgEdad() >= edad;
	}
}