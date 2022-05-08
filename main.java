 import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        Shape[] array = new Shape[5];
        for(int i =0;i<5;i++){
            String type = sc.nextLine();
            if(type.equals("Triangle")){
                Triangle tr = new Triangle();
                tr.setBase(sc.nextDouble());
                tr.setHeight(sc.nextDouble());
                array[i] = tr;
            }
            
            else if(type.equals("Rectangle")){
                Rectangle re = new Rectangle();
                re.setLength(sc.nextDouble());
                re.setWidth(sc.nextDouble());
                array[i] = re;
            }
        
            else if(type.equals("Sphere")){
                Sphere sp = new Sphere();
                sp.setRadius(sc.nextDouble());
                array[i] = sp;
            }
            else if(type.equals("Cube")){
                Cube cu = new Cube();
                cu.setLength(sc.nextDouble());
                cu.setWidth(sc.nextDouble());
                cu.setHeight(sc.nextDouble());
                array[i] = cu;
            }
        }
        
        for(int i = 0;i<5;i++){
            System.out.println("Area "+array[i].area());
            if(array[i].volume() > 0){
                System.out.println("Volume "+array[i].volume());
            }
        }
        
        
        
    }
}
