// Student Name: Kamile Kacinskaite
// Student No:   C00312390
// Date:         22/11/25
// Purpose:      Lab 8. Tests your understanding of the concept of abstract classes and inheritance in Java.


public class Driver
{
    public static void main(String args[])
    { 
        ThreeDShape threeDShape;
        Shape       shape;

        // the 2D shapes
        Circle      circle = new Circle("Circle One", "Red", 10.0);
        Rectangle   rectangle = new Rectangle("Rectangle One", "Yellow", 15.0, 20.0);
        Triangle    triangle = new Triangle("Triangle One", "Purple", 10.0, 5.0);

        // the 3D shapes
        Cylinder    cylinder = new Cylinder("Cylinder One", "Green", 6, 8);
        Sphere      sphere = new Sphere("Sphere One", "Blue", 77);

        // --- print using direct references ---
        System.out.println("\n---Using circle reference---\n" + circle.toString());
        System.out.println("Circle area = " + circle.area());

        System.out.println("\n---Using rectangle reference---\n" + rectangle.toString());
        System.out.println("Rectangle area = " + rectangle.area());

        System.out.println("\n---Using triangle reference---\n" + triangle.toString());
        System.out.println("Triangle area = " + triangle.area());

        System.out.println("\n---Using cylinder reference---\n" + cylinder.toString());
        System.out.println("Cylinder area = " + cylinder.area());
        System.out.println("Cylinder volume = " + cylinder.volume());

        System.out.println("\n---Using sphere reference---\n" + sphere.toString());
        System.out.println("Sphere area = " + sphere.area());
        System.out.println("Sphere volume = " + sphere.volume());

        // --- then here using Shape superclass reference ---
        shape = circle;
        System.out.println("\n---Using Shape reference for circle---\n" + shape.toString());
        System.out.println("Circle area = " + shape.area());

        shape = rectangle;
        System.out.println("\n---Using Shape reference for rectangle---\n" + shape.toString());
        System.out.println("Rectangle area = " + shape.area());

        shape = triangle;
        System.out.println("\n---Using Shape reference for triangle---\n" + shape.toString());
        System.out.println("Triangle area = " + shape.area());

        shape = cylinder;
        System.out.println("\n---Using Shape reference for cylinder---\n" + shape.toString());
        System.out.println("Cylinder area = " + shape.area());

        shape = sphere;
        System.out.println("\n---Using Shape reference for sphere---\n" + shape.toString());
        System.out.println("Sphere area = " + shape.area());

        // --- using ThreeDShape superclass reference ---
        threeDShape = cylinder;
        System.out.println("\n---Using ThreeDShape reference for cylinder---\n" + threeDShape.toString());
        System.out.println("Cylinder area = " + threeDShape.area());
        System.out.println("Cylinder volume = " + threeDShape.volume());

        threeDShape = sphere;
        System.out.println("\n---Using ThreeDShape reference for sphere---\n" + threeDShape.toString());
        System.out.println("Sphere area = " + threeDShape.area());
        System.out.println("Sphere volume = " + threeDShape.volume());
    }
}
