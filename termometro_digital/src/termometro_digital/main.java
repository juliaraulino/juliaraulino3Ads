package termometro_digital;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        termometro t = new termometro();

        System.out.println("Temperatura atual: " + t.getTemperatura() + "°C");

        System.out.print("Digite a nova temperatura: ");
        double novaTemperatura = sc.nextDouble();

        t.setTemperatura(novaTemperatura);

        System.out.println("Temperatura final: " + t.getTemperatura() + "°C");

        sc.close();
    }
}