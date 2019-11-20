package sistemaGanadero;
import java.util.ArrayList;
public class Camion {
	private int capacidad;
	private ArrayList <Animal> animales;
	public Camion(int capacidad){
		this.capacidad=capacidad;
		animales=new ArrayList <Animal>();
	}
	public void CargarCamion(Condicion c,Lugar cl){
		ArrayList <Animal> aux=cl.getAnimales(c);
		int i=0;
		while(i<capacidad && i<aux.size()){
			animales.add(aux.get(i));
			i++;
		}
		for(Animal a:animales)
			cl.venderAnimal(a);
	}
	public void printAnimales(){
		for(Animal a: animales)
			System.out.println(a.print());
		System.out.println();
	}
}