public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 1000.00,
                "tim@gmail.com");

        System.out.println("customerName = " + customer.getCustomerName()); // Tim
        System.out.println("creditLimit = " + customer.getCreditLimit()); // 1000.00
        System.out.println("customerEmail = " + customer.getCustomerEmail()); // tim@gmail.com

        Customer secondCustomer = new Customer();
        System.out.println("secondCustomerName = " + secondCustomer.getCustomerName()); // aloka
        System.out.println("secondCreditLimit = " + secondCustomer.getCreditLimit()); // 500.00
        System.out.println("secondCustomerEmail = " + secondCustomer.getCustomerEmail());

        Customer thirdCustomer = new Customer("Joe", "joe@gmail.com");
        System.out.println("thirdCustomerName = " + thirdCustomer.getCustomerName()); // Joe
        System.out.println("thirdCreditLimit = " + thirdCustomer.getCreditLimit()); // 500.00
        System.out.println("thirdCustomerEmail = " + thirdCustomer.getCustomerEmail());


    }
}