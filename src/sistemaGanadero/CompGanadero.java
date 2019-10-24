package sistemaGanadero;

import java.util.ArrayList;


public abstract class CompGanadero {
	
	public abstract ArrayList <Animal> GetAnimales(Condicion c);
	
	public abstract int GetPeso();
	
	public abstract int GetEdad();
	
	public abstract int GetCant();
	
	public abstract boolean contiene(Animal a);
	
	public abstract String print();
}
