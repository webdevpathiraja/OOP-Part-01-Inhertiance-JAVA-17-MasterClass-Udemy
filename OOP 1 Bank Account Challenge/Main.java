public class Main {
    public static void main(String[] args) {
//        bankAccount momAccount = new bankAccount(485414,
//                1000.00,
//                "S A N Pathiraja",
//                "sanpathi714@gmail.com",
//                "(94)715036461");
        bankAccount momAccount = new bankAccount();

        System.out.println("accountNumber = " + momAccount.getAccountNumber());
        System.out.println("accountBalance = " + momAccount.getAccountBalance());
        System.out.println("customerName = " + momAccount.getCustomerName());

//        momAccount.setAccountNumber(48965414);
//        momAccount.setAccountBalance(10000.00);
//        momAccount.setCustomerName("S A N Pathiraja");
//        momAccount.setCustomerEmail("sanpathi714@gmail.com");
//        momAccount.setCustomerPhoneNumber("(94)715036461");

        momAccount.withdrawFunds(100.00);
        
        momAccount.depositFunds(250.00);

        momAccount.withdrawFunds(50);
        momAccount.withdrawFunds(200);

        momAccount.depositFunds(100);

        momAccount.withdrawFunds(45.55);
        momAccount.withdrawFunds(55.54);

        bankAccount dadAccount = new bankAccount("dad",
                "dad1@gmail.com", "719005687");
        System.out.println("Account number (default) = " + dadAccount.getAccountNumber() +
                ", name = " + dadAccount.getCustomerName() +
                ", email = " + dadAccount.getCustomerEmail() +
                ", phoneNumber = " + dadAccount.getPhoneNumber());




    }
}