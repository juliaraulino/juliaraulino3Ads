package carro_moto;

public class Carro{
	int velocidade = 0;
	
	
	public void aumentarvelocidade(int velocidade) {
		this.velocidade+= velocidade;
		System.out.println("velocidade do carro  " + this.velocidade + "km/hr");	
	}
}
