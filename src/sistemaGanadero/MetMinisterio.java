package sistemaGanadero;

public class MetMinisterio implements MetCali {

	@Override
	public String calificar(Animal a) {
		String sal = "";
		int edad = a.GetEdad();
		String sexo = a.getSexo();
		boolean cap = a.isCapado();
		int hijos = a.getTerneros_paridos();

		
		if(edad <= 8)sal = "Lechal";
		if(edad >= 8 && edad <= 12)sal = "Ternero";
		if(edad >= 12 && edad <= 24)sal = "Añojo";
		if(edad >= 24 && edad < 48)sal = "Novillo";
		
		if(sexo == "macho"){
			if(cap){
				if(edad >= 12 && edad < 48){
					sal = "Cebon";
				}else if(edad > 48){
					sal = "Buey";
				}
			}else{
				sal += "-Toro";
			}
		}else{
			if(hijos >= 1){
				sal += "-Vaca";
			}else if(edad >= 15){
				sal += "-Vaquillona";
			}
		}
		return sal;
	}

}
