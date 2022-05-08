
public class Sphere extends Shape implements Spatial
{
    private double radius;
    final double pi = Math.PI;
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double area(){
        return (4 * this.radius * this.radius * pi );
    }
    
    public double volume(){
        return ((4 * pi * this.radius * this.radius * this.radius ) / 3);
    }
}
