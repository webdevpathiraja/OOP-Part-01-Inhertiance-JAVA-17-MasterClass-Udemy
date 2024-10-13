public class Animal {
    private String type;
    private String size;
    private double weight;

    public Animal() {} // empty constructor

    // parameterized constructor - allows to set the
    // type size and weight of the animal obj
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override // String representation of the Animal obj
    // to print out the details of the animal in a readable format
    public String toString() {
        return "Animal{" +
                "type = '" + type + '\'' +
                ", size = '" + size + '\'' +
                ", weight = " + weight +
                '}';
    }

    public void move(String speed) {
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise() {
        System.out.println(type + " makes some kind of noise");
    }


}
