package carro_moto;

public class Moto{
	int velocidade = 0;
	
	
	public void aumentarvelocidade(int velocidade) {
		this.velocidade+= velocidade;
		System.out.println("velocidade do moto  " + this.velocidade + "km/hr");	
	}
}
		