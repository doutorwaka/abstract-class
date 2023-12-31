/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package project.example;

import project.example.geometricfigure.Circle;
import project.example.geometricfigure.Square;
import project.example.utils.Utils;

public class App {
    public static void main(String[] args) {
        
        final var aCircle = new Circle(2, "Circle");
        final var aSquare = new Square(2, "Square");

        Utils.printGeometricFigure(aCircle);
        Utils.printGeometricFigure(aSquare);

    }
}
