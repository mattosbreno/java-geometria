package geometria.figuras;

/**
 *
 * @author polar
 */
public class Quadrado extends Figura {
    
    public Quadrado(double medida) {
        super(medida);
    }

    @Override
    public double areaDaFigura() {
        return Math.pow(this.medida1, 2);
    }
}
