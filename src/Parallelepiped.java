import javax.xml.validation.Validator;
import java.util.InputMismatchException;

public class Parallelepiped implements CalculateAble{
    private double length;
    private double width;
    private double height;

    public Parallelepiped() {
    }

    public Parallelepiped(double length, double width, double height) {
        try {
            if (length >= 0 && length <= 20 && width >= 0 && width <= 20 && height >= 0 && height <= 20) {
                this.length = length;
                this.width = width;
                this.height = height;
            }else {
                throw new ArithmeticException();
            }
        }catch(ArithmeticException e){
            System.out.println("The parameter cannot be less than 0 and greater than 20!");
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return 2*((getHeight() * getLength()) + (getLength() * getWidth()) + (getHeight() * getWidth()));
    }

    @Override
    public double volume() {
        return (getLength() * getWidth() * getHeight());
    }

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

}
