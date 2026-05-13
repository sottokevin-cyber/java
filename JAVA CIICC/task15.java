interface Shape {
    default void calculateArea(double radius){
       double area = Math.PI*radius * radius;
    }
    
    default void calculatePerimeter(double radius){
        double perimeter = 2 * Math.PI * radius;
    }
}

abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;
    public AbstractShape(String color,double length,double width){
        this.color = color;
        this. length = length;
        this. width = width;
        
    }
}

public class task15 {

}
