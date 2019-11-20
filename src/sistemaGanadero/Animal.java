package sistemaGanadero;
import java.util.ArrayList;
public class Animal extends CompGanadero{
	private static int cont = 0;
	private int id;
	private int peso;
	private int edad;
	private String raza;
	private String sexo;
	private boolean capado;
	private int hijos;

	public Animal(int peso,int edad, String raza, String sexo, boolean capado,int terneros_paridos) {
		this.peso = peso;
		this.edad = edad;
		this.raza = raza.toLowerCase();
		this.sexo = sexo.toLowerCase();
		this.capado = capado;
		this.hijos = terneros_paridos;
		cont++;
		this.id = cont;
	}
	public Animal(int e, String s, String r, boolean c, int t, int p) {
		this.edad = e;
		this.sexo = s.toLowerCase();
		this.raza = r.toLowerCase();
		this.capado = c;
		this.hijos = t;
		this.peso = p;
		cont++;
		this.id = cont;
	}
	public int getId() {return id;}
	public String getRaza() {return raza;}
	public String getSexo() {return sexo;}
	public boolean isCapado() {return capado;}
	public int getTerneros_paridos() {return hijos;}
	
	@Override
	public int getPeso() {return peso;}
	@Override
	public int getEdad() {return edad;}
	@Override
	public int getCant() {return 1;}
	
	@Override
	public ArrayList<Animal> getAnimales(Condicion c) {
		ArrayList <Animal> salida=new ArrayList <Animal>();
		if(c.Cumple(this))
			salida.add(this);
		return salida;
	}
	public boolean equals(Animal a) {
		return this.getId() == a.getId();
	}
	public boolean aptoParaVenta(Condicion c) {
		return c.Cumple(this);
	}
	@Override
	public ArrayList<Animal> venderAnimal(Animal a) {
		ArrayList <Animal> salida=new ArrayList <Animal>();
		if(this.equals(a))
			salida.add(this);
		return salida;
	}
	@Override
	public String print(){
		return "ID: "+id+" |Peso: "+peso+" |Edad: "+edad+" |Raza: "+raza
				+" |Sexo: "+sexo+" |Capado: "+capado+" |Hijos: "+hijos;
	}
}