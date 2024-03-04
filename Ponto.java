public class Ponto {
    private double coordX;
    private double coordY;

    public Ponto(double umX, double umY){
        coordX = umX;
        coordY = umY;
    }

    public void mover(double novoX, double novoY) {
        coordX = novoX;
        coordY = novoY;
    }

    public String toString() {
        return String.format("(%.1f, %.1f)", coordX, coordY);
    }
}
