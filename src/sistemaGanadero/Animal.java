package sistemaGanadero;
import java.util.ArrayList;
public class Animal extends CompGanadero{
	private int id;
	private int peso;
	private int edad;
	private String raza;
	private String sexo;
	private boolean capado;
	private int hijos;

	public Animal(int id, int peso,int edad, String raza, String sexo, boolean capado,int terneros_paridos) {
		this.id = id;
		this.peso = peso;
		this.raza = raza;
		this.sexo = sexo;
		this.capado = capado;
		this.hijos = terneros_paridos;
	}
	public Animal(int i,int e, String s, boolean c, int t, int p) {
		this.id = i;
		this.edad = e;
		this.peso = p;
		this.raza = "milka";
		this.sexo = s;
		this.capado = c;
		this.hijos = t;
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
	@Override
	public boolean contiene(Animal a){
		return this.equals(a);
	}
	@Override
	public String print(){
		return "ID: "+id+" |Peso: "+peso+" |Edad: "+edad+" |Raza: "+raza
				+" |Sexo: "+sexo+" |Capado: "+capado+" |Hijos: "+hijos;
	}
}
