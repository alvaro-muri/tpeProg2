package sistemaGanadero;
public class MainGanadero {
	public static void main(String[] args) {
		Animal v1 = new Animal(8, "macho","toddy",false,0,100);
		Animal v2 = new Animal(12,"macho","milka",false,0,150);
		Animal v3 = new Animal(24,"macho","oreo",true,0,200);
		Animal v4 = new Animal(48,"macho","nesquick",false,0,400);
		Animal v5 = new Animal(50,"macho","cindor",true,0,600);
		Animal v6 = new Animal(8, "hembra","pepitos",false,1,75);
		Animal v7 = new Animal(12,"hembra","terrabusi",false,2,110);
		Animal v8 = new Animal(24,"hembra","felfort",true,0,100);
		Animal v9 = new Animal(48,"hembra","kinder",true,4,200);
		Animal v10 =new Animal(50,"hembra","celiaco",true,5,350);
		
		Lugar L1=new Lugar();
		Lugar L2=new Lugar();
		Lugar L3=new Lugar();

		L3.addComp(v9);
		L3.addComp(v10);
		
		L2.addComp(v6);
		L2.addComp(v7);
		L2.addComp(v8);
		L2.addComp(L3);
		
		L1.addComp(v5);
		L1.addComp(v4);
		L1.addComp(v3);
		L1.addComp(v2);
		L1.addComp(v1);
		L1.addComp(L2);
		
		System.out.println("Lugar 3:");
		print(L3);
		L3.printAnimales();
		System.out.println();
		
		System.out.println("Lugar 2:");
		print(L2);
		L2.printAnimales();
		System.out.println();
		
		System.out.println("Lugar 1:");
		print(L1);
		L1.printAnimales();
		System.out.println();
		
		Condicion cond1 =new CondPeso(120);
		Condicion cond2 =new CondRaza("oreo");
		Condicion cond3 =new CondEdad(1);
		Condicion cond4 =new CondGenero("macho");
		
		CondicionGrupo condG1 = new CondGrupoEdad(24);
		CondicionGrupo condG2 = new CondGrupoPeso(100);
		
		System.out.println("Lugar 1 es apto para venta: "+L1.aptoParaVenta(condG1));
		System.out.println("Lugar 2 es apto para venta: "+L2.aptoParaVenta(condG2));
		System.out.println();
		
		Camion cam=new Camion(10);
//		cam.CargarCamion(new CondAnd(cond1,cond4), L1);
		cam.CargarCamion(cond1, L1);
		System.out.println("Camion:");
		cam.printAnimales();
		
		System.out.println("Lugar 3:");
		print(L3);
		L3.printAnimales();
		System.out.println();
		
		System.out.println("Lugar 2:");
		print(L2);
		L2.printAnimales();
		System.out.println();
		
		System.out.println("Lugar 1:");
		print(L1);
		L1.printAnimales();
		System.out.println();
		

		SisGanadero sis = new SisGanadero();
		
		Condicion condLechal = new CondNot(new CondEdad(8));
		Condicion condTernero = new CondAnd(
				new CondEdad(8),new CondNot(new CondEdad(12)));
		Condicion condAniojo = new CondAnd(
				new CondEdad(12),new CondNot(new CondEdad(24)));
		Condicion condNovillo = new CondAnd(
				new CondEdad(24),new CondNot(new CondEdad(48)));
		
		Condicion condCebon = new CondAnd(
				new CondAnd(new CondEdad(12),new CondNot(new CondEdad(48))),
				new CondAnd(new CondCapado(true),new CondGenero("macho")));
		
		Condicion condBuey = new CondAnd(new CondEdad(48),
				new CondAnd(new CondCapado(true),new CondGenero("macho")));
		
		Condicion condToro = new CondAnd(new CondCapado(false),new CondGenero("macho"));
		
		Condicion condVaca = new CondAnd(new CondHijo(0),
				new CondAnd(new CondGenero("hembra"), new CondEdad(15)));
		
		Condicion condVaquillona = new CondAnd(new CondNot(new CondHijo(0)),
				new CondAnd(new CondGenero("hembra"), new CondEdad(15)));
		
		Condicion condMacho = new CondGenero("macho");
		Condicion condHembra = new CondGenero("hembra");
		
		sis.addClasificacion(new MetCali("Lechal",condLechal));
		sis.addClasificacion(new MetCali("Ternero",condTernero));
		sis.addClasificacion(new MetCali("Aniojo",condAniojo));
		sis.addClasificacion(new MetCali("Novillo",condNovillo));
		sis.addClasificacion(new MetCali("Cebon",condCebon));
		sis.addClasificacion(new MetCali("Buey",condBuey));
		
//		sis.addClasificacionAnidada(new MetCali("-TORO",condMacho));
//		sis.addClasificacionAnidada(new MetCali("-VACA",condHembra));
		
		sis.addClasificacionAnidada(new MetCali("-Toro",condToro));
		sis.addClasificacionAnidada(new MetCali("-Vaca",condVaca));
		sis.addClasificacionAnidada(new MetCali("-Vaquillona",condVaquillona));
		
		
		System.out.println("*Clasificaciones*");
//		print(v1);
		System.out.println("Clasificacion: "+sis.calificar(v1));
		System.out.println("Clasificacion: "+sis.calificar(v2));
		System.out.println("Clasificacion: "+sis.calificar(v3));
		System.out.println("Clasificacion: "+sis.calificar(v4));
		System.out.println("Clasificacion: "+sis.calificar(v5));
		System.out.println("Clasificacion: "+sis.calificar(v6));
		System.out.println("Clasificacion: "+sis.calificar(v7));
		System.out.println("Clasificacion: "+sis.calificar(v8));
		System.out.println("Clasificacion: "+sis.calificar(v9));
		System.out.println("Clasificacion: "+sis.calificar(v10));
		
//		borrar();
//		System.out.println("todo bien");
	}
	public static void print(CompGanadero c) {
		System.out.println(c.print());
	}
//	public static void borrar() {
//		ArrayList <String> sal=new ArrayList <String>();
//		sal.add("aa");
//		sal.add("bb");
//		sal.add("cc");
//		for(int i=0; i<sal.size();i++) {
//			String s = sal.get(i);
//			if(s.length() > 1)
//				sal.remove(s);
//		}
//	}
}