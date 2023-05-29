package geometria;

import geometria.figuras.Quadrado;
import geometria.figuras.Triangulo;

/**
 *
 * @author polar
 */
public class Main {

    public static void main(String[] args) {
        //Figura fig = new Figura(2.5);
        Triangulo t = new Triangulo(4.0, 6.0);
        Quadrado q = new Quadrado(8.0);
        
        System.out.println("A área do triângulo é: " + t.areaDaFigura());
        System.out.println("A área do quadrado é: " + q.areaDaFigura());
    }
}