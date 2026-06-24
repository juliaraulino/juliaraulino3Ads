package carro_moto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		Carro carro = new Carro();
		
		System.out.println("Digite a velocidae que deseja aumentar do automóvel");
		int velocidade = teclado.nextInt();
		carro.aumentarvelocidade(velocidade);
		
		
		
		Moto moto = new Moto();
		
		System.out.println("Digite a velocidae que deseja aumentar do automóvel");
		int velocidadeMoto = teclado.nextInt();
		moto.aumentarvelocidade(velocidadeMoto);
		
		teclado.close();
		
		

	}

}
