package sistemaGanadero;
public class MetGenero implements MetCali {
	@Override
	public String calificar(Animal a) {
		String s = "";
		if(a.getSexo() == "hembra"){
			s = "VACA";
		}else{
			s = "TORO";
		}
		return s;
	}

}
