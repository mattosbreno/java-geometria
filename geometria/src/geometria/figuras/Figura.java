package geometria.figuras;

/**
 *
 * @author polar
 */
public abstract class Figura {
    protected double medida1;
    protected double medida2;

    public Figura(double medida) {
        this.medida1 = medida;
    }
    
    public Figura(double medida1, double medida2) {
        this.medida1 = medida1;
        this.medida2 = medida2;
    }
    
    public abstract double areaDaFigura();
}
