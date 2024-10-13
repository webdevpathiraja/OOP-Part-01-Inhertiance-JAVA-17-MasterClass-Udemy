public class ComplexNumber {
    private double real;
    private double imaginary;

    // Constructor to initialize the complex number with given real and imaginary values
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // to return the real part
    public double getReal() {
        return real;
    }

    // to return the imaginary part
    public double getImaginary() {
        return imaginary;
    }

    // add given real and imaginary values to the current complex number
    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    // Overloaded method to add another ComplexNumber object to the current complex number
    public void add(ComplexNumber other) {
        add(other.real, other.imaginary);
    }

    // subtract given real and imaginary values from the current complex numbe
    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    // Overloaded method to add another ComplexNumber object to the current complex number
    public void subtract(ComplexNumber other) {
        subtract(other.real, other.imaginary);
    }



}
