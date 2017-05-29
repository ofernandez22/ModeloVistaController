package calc_Control;
import Calc_Modelo.Calculadora;
public class calc_Control {
	Calculadora calc= new Calculadora();
	
	public int calcurladora_uso(int dato1,int dato2, String op)
	{
		int rs;
		calc.setDato1(dato1);
		calc.setDato2(dato2);
		calc.setOperacion(op);
		calc.calcular();
		rs= calc.getResultado();
		return rs;
	}
}
