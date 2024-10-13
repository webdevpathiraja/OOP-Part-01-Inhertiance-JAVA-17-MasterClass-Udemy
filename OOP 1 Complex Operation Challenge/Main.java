public class Main {
    public static void main(String[] args) {

        // create a complx.numb object with real 1.0 and imaginary 1.0
        // (1.0i + 1.0j)
        ComplexNumber one = new ComplexNumber(1.0, 1.0);

        // another complx.numb onj with real 2.5 and imaginary -1.5
        // (2.5i - 1.5j)
        ComplexNumber number = new ComplexNumber(2.5, -1.5);

        // add 1 to obj 'one'
        one.add(1,1);

        // real and imaginary parts of new 'one' object after addition
        System.out.println("one real = " + one.getReal());
        System.out.println("one imaginary = " + one.getImaginary());
        System.out.println("answer = " + one.getReal() + "i + " + one.getImaginary() + "j");
        System.out.println();

        // subtract 'number' obj from 'one' obj
        one.subtract(number);

        // real and imaginary parts of new 'one' object after subtraction
        System.out.println("one real = " + one.getReal());
        System.out.println("one imaginary = " + one.getImaginary());
        System.out.println("answer = " + one.getReal() + "i + " + one.getImaginary() + "j");
        System.out.println();

        // subtract 'one' obj from 'number' obj
        number.subtract(one);

        // // real and imaginary parts of new 'number' object after subtraction
        System.out.println("number real = " + number.getReal());
        System.out.println("number imaginary = " + number.getImaginary());
        System.out.println("answer = " + number.getReal() + "i + " + number.getImaginary() + "j");
        System.out.println();


    }
}