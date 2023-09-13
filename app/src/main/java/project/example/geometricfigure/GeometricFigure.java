package project.example.geometricfigure;

public abstract class GeometricFigure {

    private String name;
    
    public GeometricFigure(final String aName){
        this.name = aName;
    }

    public abstract float calculateArea();

    public String getName(){
        return this.name;
    }
}
