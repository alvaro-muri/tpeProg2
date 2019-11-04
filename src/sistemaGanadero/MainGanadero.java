package sistemaGanadero;

public class MainGanadero {

	public static void main(String[] args) {
		Animal v1 = new Animal(11,"macho","milka",true,0,150);
		Animal v2 = new Animal(12,"macho","milka",true,0,50);
		Animal v3 = new Animal(36,"macho","oreo",false,0,100);
		Animal v4 = new Animal(7,"hembra","nesquick",true,1,200);
		
		Lugar L1=new Lugar();
		Lugar L2=new Lugar();
		
		L2.addComp(v1);
		L2.addComp(v2);
		L2.addComp(v3);
		
		L1.addComp(v4);
		L1.addComp(L2);
		
		System.out.println("Lugar 1:");
		print(L1);
		L1.printAnimales();
		System.out.println();
		
		System.out.println("Lugar 2:");
		print(L2);
		L2.printAnimales();
		System.out.println();
		
		Condicion cond1 =new CondPeso(90);
		Condicion cond2 =new CondRaza("oreo");
		Condicion cond3 =new CondEdad(8);
		Condicion cond4 =new CondGenero("hembra");
		
		System.out.println("Lugar 1 es apto para venta: "+L1.aptoParaVenta(cond2));
		System.out.println("Lugar 2 es apto para venta: "+L2.aptoParaVenta(cond2));
		System.out.println();
		
		Camion cam=new Camion(10);
//		cam.CargarCamion(new CondAnd(cond1,cond2), L1);
		cam.CargarCamion(cond2, L1);
		System.out.println("Camion:");
		cam.printAnimales();
		
		System.out.println("Lugar 1:");
		L1.printAnimales();
		System.out.println();
		
		System.out.println("Lugar 2:");
		L2.printAnimales();
		
		System.out.println("");
		

		SisGanadero sis = new SisGanadero(new MetMinisterio());
		
		System.out.println("Calificaciones");
		print(v1);
		System.out.println("Calificacion: "+sis.calificar(v1));
		System.out.println();
		print(v2);
		System.out.println("Calificacion: "+sis.calificar(v2));
		System.out.println();
		print(v3);
		System.out.println("Calificacion: "+sis.calificar(v3));
		System.out.println();
		print(v4);
		System.out.println("Calificacion: "+sis.calificar(v4));
		System.out.println();
		
		
	}
	public static void print(CompGanadero c) {
		System.out.println(c.print());
	}
}