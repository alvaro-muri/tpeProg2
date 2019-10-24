package sistemaGanadero;

public class CondOr extends Condicion{
	private Condicion condC1;
	private Condicion condC2;
	
	public CondOr(Condicion condC1,Condicion condC2){
		this.condC1=condC1;
		this.condC2=condC2;
	}

	@Override
	public boolean Cumple(Animal a) {
		return condC1.Cumple(a)||condC2.Cumple(a);
	}
	
}
