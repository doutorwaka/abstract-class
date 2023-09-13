package project.example.geometricfigure;

public class Square extends GeometricFigure {

    private float side;

    public Square(final float aSide, final String aName){
        super(aName);
        this.side = aSide;
    }

    public float calculateArea(){
        return this.side * this.side;
    }

}
