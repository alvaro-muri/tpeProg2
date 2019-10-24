package sistemaGanadero;

public class MainGanadero {

	public static void main(String[] args) {
		Animal v1 = new Animal(1,24,"macho",true,0,50);
		Animal v2 = new Animal(2,15,"hembra",true,0,50);
		Animal v3 = new Animal(3,36,"macho",false,0,100);
		Animal v4 = new Animal(4,7,"hembra",true,1,200);
		
		CompLugar L1=new CompLugar();
		CompLugar L2=new CompLugar();
		
		L2.addComp(v1);
		L2.addComp(v2);
		L2.addComp(v3);
		
		L1.addComp(v4);
		L1.addComp(L2);
		
		System.out.println("Lugar 1:");
		L1.printAnimales();
		
		System.out.println("Lugar 2:");
		L2.printAnimales();
		
		CondPeso conPeso=new CondPeso(90);
		Camion cam=new Camion(10);
		cam.CargarCamion(conPeso, L1);
		System.out.println("Camion:");
		cam.printAnimales();
		
		System.out.println("Lugar 1:");
		L1.printAnimales();
		
		System.out.println("Lugar 2:");
		L2.printAnimales();
		
		System.out.println("************************************************");
		

		SisGanadero sis = new SisGanadero(new MetMinisterio());
		
		System.out.println(sis.calificar(v1));
		System.out.println(sis.calificar(v2));
		System.out.println(sis.calificar(v3));
		System.out.println(sis.calificar(v4));
		
	}

}
