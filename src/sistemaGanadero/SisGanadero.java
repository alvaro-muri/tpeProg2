package sistemaGanadero;
import java.util.ArrayList;
public class SisGanadero {
	private ArrayList<MetCali> clasificaciones;
	private ArrayList<MetCali> clasiAnidadas;
	public SisGanadero(){
		clasificaciones = new ArrayList<MetCali>();
		clasiAnidadas = new ArrayList<MetCali>();
	}
	public void addClasificacion(MetCali m) {
		if(!clasificaciones.contains(m))
			clasificaciones.add(m);
	}
	public void addClasificacionAnidada(MetCali m) {
		if(!clasiAnidadas.contains(m))
			clasiAnidadas.add(m);
	}
	public String calificar(Animal a){
		String sal = "";
		for(MetCali c:clasificaciones) {
			if(c.calificar(a) != "")
				sal = c.calificar(a);
		}
		for(MetCali e:clasiAnidadas) {
			if(e.calificar(a) != "")
				sal += e.calificar(a);
		}
		return sal;
	}
}