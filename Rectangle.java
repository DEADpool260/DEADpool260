public class Rectangle extends Shape
{
    private double length, width;
    
    public double getLength(){
        return length;
    }
    
    public void setLength(double length){
        this.length = length;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    //For Rectangle and Triangle class the method volume should return -1.
    public double area(){
        return (this.getWidth() * this.getLength());
    }
    
    public double volume(){
        return -1;
    }
}
