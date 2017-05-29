package Calc_Modelo;

public class Calculadora {
	private int dato1;
	private int dato2;
	private String op;
	private int resultado;
	public int getResultado() {
		return resultado;
	}
	public void setDato1(int dato1) {
		this.dato1 = dato1;
	}
	public void setDato2(int dato2) {
		this.dato2 = dato2;
	}
	public void setOperacion(String operacion) {
		this.op = operacion;
	}
	
	public void calcular(){
		if (op.equals("+")){
			this.resultado=this.dato1+this.dato2;
		}

		else{
			if(op.equals("-")){
				this.resultado=this.dato1-this.dato2;	
			}

		}
	}
}
