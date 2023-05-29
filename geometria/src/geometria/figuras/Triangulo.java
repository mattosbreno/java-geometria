package geometria.figuras;

/**
 *
 * @author polar
 */
public class Triangulo extends Figura {
    
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double areaDaFigura() {
        return this.medida1 * this.medida2 / 2;
    }
}
