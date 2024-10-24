public class Circle implements Shape{

    double radius;
    
    public Circle(double radius){
     this.radius = radius;
    }
    @Override
    public double getArea(){
        double pi = 3.14;
        return ((pi)*(radius * radius));
    }
}
