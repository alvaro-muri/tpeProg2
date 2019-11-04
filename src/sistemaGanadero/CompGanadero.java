package sistemaGanadero;
import java.util.ArrayList;
public abstract class CompGanadero {
	public abstract ArrayList <Animal> getAnimales(Condicion c);
	public abstract int getPeso();
	public abstract int getEdad();
	public abstract int getCant();
	public abstract boolean contiene(Animal a);
	public abstract String print();
	public abstract boolean aptoParaVenta(Condicion c);
}
