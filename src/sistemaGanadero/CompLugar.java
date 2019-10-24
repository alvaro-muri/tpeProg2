package sistemaGanadero;

import java.util.ArrayList;

public class CompLugar extends CompGanadero {
	private ArrayList <CompGanadero> Componentes;
	
	public CompLugar(){
		Componentes=new ArrayList <CompGanadero>();
	}
	
	public void addComp(CompGanadero cg){
		if(!Componentes.contains(cg))
			Componentes.add(cg);
	}
	
	@Override
	public int GetPeso() {
		int res=0;
		for(CompGanadero c:Componentes)
			res+=c.GetPeso();
		return res;
	}

	@Override
	public int GetEdad() {
		int res=0;
		for(CompGanadero c:Componentes)
			res+=c.GetEdad();
		return res;
	}

	@Override
	public int GetCant() {
		int res=0;
		for(CompGanadero c:Componentes)
			res+=c.GetCant();
		return res;
	}

	@Override
	public ArrayList <Animal> GetAnimales(Condicion c) {
		ArrayList <Animal> salida=new ArrayList <Animal>();
		for(CompGanadero comp:Componentes){
			for(Animal a: comp.GetAnimales(c)){
				if(!salida.contains(a)){
					salida.add(a);
				}
			}
		}	
		return salida;
	}
	
	public void VenderAnimales(ArrayList<Animal> arr){
		for(Animal a: arr){
			for(CompGanadero c: Componentes){
				if(c.equals(a)){
					Componentes.remove(a);
				}else if(((CompLugar)c).contiene(a)){
					((CompLugar)c).vender(a);
				}
			}
				
		}
	}
	
	
	public void printAnimales(){
		for(CompGanadero c: Componentes)
			System.out.println(c.print());
		System.out.println();
	}
	
	public ArrayList<Animal> getAnimales(){
		ArrayList<Animal> sal = new ArrayList<Animal>();
		for(CompGanadero c: Componentes)
			sal.add((Animal)c);
		return sal;
	}

	@Override
	public boolean contiene(Animal a) {
		return this.Componentes.contains(a);
	}
	@Override
	public String print(){
		return "Lugar Peso: "+GetPeso();
	}
	public void vender(Animal a){
		this.Componentes.remove(a);
	}

	
	public int PromedioEdad(){
		return GetEdad()/GetCant();
	}
	
	public int PromedioPeso(){
		return GetPeso()/GetCant();
	}

}
