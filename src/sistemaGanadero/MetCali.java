package sistemaGanadero;

public class MetCali {
	private String nombre;
	private Condicion condi;
	public MetCali(String n, Condicion c) {
		nombre = n;
		condi = c;
	}
	public String calificar(Animal a) {
		if(condi.Cumple(a))
			return nombre;
		return "";
	}
}
