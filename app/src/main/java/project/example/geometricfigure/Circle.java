package project.example.geometricfigure;

public class Circle extends GeometricFigure {

    private float radius;

    public Circle(final float aRadius, final String aName){
        super(aName);
        this.radius = aRadius;
    }

    public float calculateArea() {
        return (float) (this.radius * this.radius * Math.PI);
    }
}
