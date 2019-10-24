package sistemaGanadero;
import java.util.ArrayList;
public class Animal extends CompGanadero{
	private int id;
	private int peso;
	private int edad;
	private String raza;
	private String sexo;
	private boolean capado;
	private int terneros_paridos;

	public Animal(int id, int peso,int edad, String raza, String sexo, boolean capado,int terneros_paridos) {
		this.id = id;
		this.peso = peso;
		this.raza = raza;
		this.sexo = sexo;
		this.capado = capado;
		this.terneros_paridos = terneros_paridos;
	}

	public Animal() {
		this.id = 1;
		this.edad = 12;
		this.peso = 650;
		this.raza = "milka";
		this.sexo = "hembra";
		this.capado = true;
		this.terneros_paridos = 3;
	}
	public Animal(int i,int e, String s, boolean c, int t, int p) {
		this.id = i;
		this.edad = e;
		this.peso = p;
		this.raza = "milka";
		this.sexo = s;
		this.capado = c;
		this.terneros_paridos = t;
	}

	public Animal(int peso){this.peso=peso;}
	public int getId() {return id;}
	public String getRaza() {return raza;}
	public String getSexo() {return sexo;}
	public boolean isCapado() {return capado;}
	public int getTerneros_paridos() {return terneros_paridos;}
	@Override
	public int GetPeso() {
		return peso;
	}
	@Override
	public int GetEdad() {
		return edad;
	}
	@Override
	public int GetCant() {
		return 1;
	}
	@Override
	public ArrayList<Animal> GetAnimales(Condicion c) {
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
		return "ID: "+id+" |Peso: "+GetPeso();
	}
}
