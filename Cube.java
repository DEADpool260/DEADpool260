public class Cube extends Shape implements Spatial
{
    private double length, width, height;
    
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
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public double area(){
        return ((2 * this.getLength() * this.getWidth()) + (2 * this.getWidth() * this.getHeight()) + (2 * this.getHeight() * this.getLength()));
    }
    
    public double volume(){
        return (this.getLength() * this.getWidth() * this.getHeight());
    }
    
    
    
    
}
