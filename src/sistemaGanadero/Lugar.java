package sistemaGanadero;
import java.util.ArrayList;
public class Lugar extends CompGanadero{
	private ArrayList <CompGanadero> componentes;
	public Lugar(){
		componentes=new ArrayList <CompGanadero>();
	}
	@Override
	public int getPeso() {
		int res=0;
		for(CompGanadero c:componentes)
			res+=c.getPeso();
		return res;
	}
	@Override
	public int getEdad() {
		int res=0;
		for(CompGanadero c:componentes)
			res+=c.getEdad();
		return res;
	}
	@Override
	public int getCant() {
		int res=0;
		for(CompGanadero c:componentes)
			res+=c.getCant();
		return res;
	}
	@Override
	public ArrayList<Animal> getAnimales(Condicion c) {
		ArrayList <Animal> salida=new ArrayList <Animal>();
		for(CompGanadero comp:componentes){
			salida.addAll(comp.getAnimales(c));
		}	
		return salida;
	}
	@Override
	public String print(){
		return "Lugar -> Peso total: "+getPeso()+" |Promedio Peso: "+avgPeso()+
				" |Promedio Edad: "+avgEdad()+" |Cantidad: "+getCant();
	}
	public boolean aptoParaVenta(CondicionGrupo cond) {
		return cond.Cumple(this);
	}
	public ArrayList<Animal> venderAnimal(Animal a) {
		ArrayList <Animal> salida=new ArrayList <Animal>();
		for(int i=0; i<componentes.size();i++) {
			CompGanadero s = componentes.get(i);
			if(s.venderAnimal(a).size() > 0)
				componentes.remove(s);
		}
		return salida;
	}
	public void addComp(CompGanadero cg){
		if(!componentes.contains(cg))
			componentes.add(cg);
	}
	public void printAnimales(){
		for(CompGanadero c: componentes)
			MainGanadero.print(c);
	}
//servicios
	public double avgEdad(){
		if(getCant() == 0)
			return 0;
		return getEdad()/getCant();
	}
	public double avgPeso(){
		if(getCant() == 0)
			return 0;
		return getPeso()/getCant();
	}
}