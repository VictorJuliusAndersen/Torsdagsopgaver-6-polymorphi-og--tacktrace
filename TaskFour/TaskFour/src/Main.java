public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(10);
        System.out.println(circle.getArea());

        Square square = new Square(5);
        System.out.println(square.getArea());

        ShapeBuilder shapeBuilder = new ShapeBuilder();
        // Tilføjer former til ShapeBuilder
        shapeBuilder.addShape(circle);
        shapeBuilder.addShape(square);

        // Beregner og udskriver det samlede areal
        double totalArea = shapeBuilder.getTotalArea();
        System.out.println("Det samlede areal af alle former: " + totalArea);
    }
    
}