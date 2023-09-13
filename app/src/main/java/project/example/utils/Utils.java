package project.example.utils;

import project.example.geometricfigure.GeometricFigure;

public class Utils {
    
    public static void printGeometricFigure(final GeometricFigure aFigure){
        System.out.println(aFigure.getName());
        System.out.println("Area: " + aFigure.calculateArea());
        System.out.println();
    }

}
