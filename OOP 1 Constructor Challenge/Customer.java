public class Customer {
    // instances
    private String customerName;
    private double creditLimit;
    private String customerEmail;

    // getters
    public String getCustomerName() {
        return customerName;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }

    // constructors
    public Customer(String customerName, double creditLimit, String customerEmail) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.customerEmail = customerEmail;
        // can auto generate
    }
    public Customer() {
        this("aloka","aloka3@gmail.com");
    }
    public Customer(String customerName, String customerEmail) {
        this(customerName, 500.00, customerEmail);
    }





}
