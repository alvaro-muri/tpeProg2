package sistemaGanadero;

public class CondGrupoAnd extends CondicionGrupo {
	private CondicionGrupo cond1;
	private CondicionGrupo cond2;
	public CondGrupoAnd(CondicionGrupo c1, CondicionGrupo c2) {
		cond1 = c1;
		cond2 = c2;
	}
	@Override
	public boolean Cumple(Lugar l) {
		return cond1.Cumple(l) && cond2.Cumple(l);
	}

}
