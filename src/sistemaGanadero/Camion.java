package sistemaGanadero;

import java.util.ArrayList;

public class Camion {
	private int capacidad;
	private ArrayList <Animal> animales;
	
	public Camion(int capacidad){
		this.capacidad=capacidad;
		animales=new ArrayList <Animal>();
	}
	
	public void CargarCamion(Condicion c,CompLugar cl){
		ArrayList <Animal> aux=cl.GetAnimales(c);
		int i=0;
		while(i<capacidad && i<aux.size()){
			animales.add(aux.get(i));
			i++;
		}
		cl.VenderAnimales(animales);
	}
	
	
	public ArrayList <Animal> GetAnimales(){
		return animales;
	}
	public void printAnimales(){
		for(Animal a: animales)
			System.out.println(a.print());
		System.out.println();
	}
}
