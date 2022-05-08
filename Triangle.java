public class Triangle extends Shape
{
    private double base, height;
    
    public double getBase(){
        return base;
    }
    
    public void setBase(double b){
        this.base = b;
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double h){
        this.height = h;
    }
    
    //For Rectangle and Triangle class the method volume should return -1.
    public double area(){
        return (0.5 * this.getHeight() * this.getBase());
    }
    
    public double volume(){
        return -1;
    }
}
