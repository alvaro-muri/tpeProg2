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
			for(Animal a: comp.getAnimales(c)){
				if(!salida.contains(a)){
					salida.add(a);
				}
			}
		}	
		return salida;
	}
	@Override
	public String print(){
		return "Lugar -> Peso total: "+getPeso()+" |Promedio Peso: "+avgPeso()+
				" |Promedio Edad: "+avgEdad()+" |Cantidad: "+getCant();
	}
	@Override
	public boolean contiene(Animal a) {
		return this.componentes.contains(a);
	}
	@Override
	public boolean aptoParaVenta(Condicion cond) {
		for(CompGanadero c: componentes) {
			if(!c.aptoParaVenta(cond))
				return false;
		}
		return true;
	}
	
	public void VenderAnimales(ArrayList<Animal> arr){
		for(Animal a: arr){
			for(CompGanadero c: componentes){
				if(c.equals(a)){
					componentes.remove(a);
				}else if(c.contiene(a)){
					((Lugar) c).vender(a);
				}
			}
		}
	}
	public void addComp(CompGanadero cg){
		if(!componentes.contains(cg))
			componentes.add(cg);
	}
	public void vender(Animal a){
		this.componentes.remove(a);
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