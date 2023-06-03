package modelo;
public class Coordenada {
    //atributos
    private double x;
    private double y;
    //constructor
    public Coordenada() {

    }
    public Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //metodos
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double distancia(Coordenada c) {
        double dx = x - c.x; ;
        double dy = y - c.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
    
    @Override
    public String toString() {
        return "Coordenada x=" + x + ", y=" + y + "";
    }
    @Override
    public boolean equals(Object x) {
        // TODO Auto-generated method stub
        return x.equals(y);
    }
}
