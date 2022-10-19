import java.text.DecimalFormat;

public class AreaCirculo {
    private final double pi = 3.14159;
    private double raio;
    private double area;
    private DecimalFormat df = new DecimalFormat("0.0000");

    public AreaCirculo() {
        df.setMaximumFractionDigits(4);
    }

    public String calculaArea(double raio){
        this.raio = raio;
        this.area = pi * Math.pow(this.raio, 2);

        return "A=" + df.format(area);
    }

    public double getPi() {
        return pi;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
