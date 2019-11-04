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
		this.sexo = s;
		this.raza = r;
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
		if(aptoParaVenta(c))
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
	@Override
	public boolean aptoParaVenta(Condicion c) {
		return c.Cumple(this);
	}
}
