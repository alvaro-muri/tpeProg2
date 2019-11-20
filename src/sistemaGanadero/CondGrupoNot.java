package sistemaGanadero;

public class CondGrupoNot extends CondicionGrupo {
	private CondicionGrupo cond;
	public CondGrupoNot(CondicionGrupo c) {
		cond = c;
	}
	@Override
	public boolean Cumple(Lugar l) {
		return !cond.Cumple(l);
	}

}
