package termometro_digital;

public class termometro {

    private double temperatura;
    public termometro() {
        this.temperatura = 20.0;
    }
        public double getTemperatura() {
        return temperatura;
    }
        public void setTemperatura(double temperatura) {
        if (temperatura >= -10.0 && temperatura <= 50.0) {
            this.temperatura = temperatura;
        } else {
            System.out.println("Erro: temperatura fora do limite permitido (-10°C a 50°C).");
        }
    }
}