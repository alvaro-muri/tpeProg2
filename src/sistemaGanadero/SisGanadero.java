package sistemaGanadero;

public class SisGanadero {
	private MetCali metodo;
	
	public SisGanadero(MetCali metodo){
		this.metodo=metodo;
	}
	public String calificar(Animal a){
		return metodo.calificar(a);
	}
	public void SetMetodo(MetCali metodo){
		this.metodo=metodo;
	}
}
