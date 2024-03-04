public class Circulo {
    //private double centroX;
    //private double centroY;

    private Ponto centro;
    private double raio;

    public Circulo(double umX, double umY, double umRaio) {
        //this.centroX = umX;
        //this.centroY = umY;

        centro = new Ponto(umX, umY);
        this.raio = umRaio;
    }

    public Circulo() {
        centro = new Ponto(0, 0);
        this.raio = 1;
    }

    public void mover(double novoX, double novoY) {
        // centro = new Ponto(novoX, novoY);
        centro.mover(novoX, novoY);
    }

    public void zoom(double fator) {
        raio = raio * fator;
    }

    public double area() {
        return Math.PI * raio * raio; // Math.pow(raio, 2)
    }

    public String toString() {
        return String.format("%s raio: %.2f", 
                                centro.toString(), raio);
    }
}