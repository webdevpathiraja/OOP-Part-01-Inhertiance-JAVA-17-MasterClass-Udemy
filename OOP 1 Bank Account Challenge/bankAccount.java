public class bankAccount {
    private long accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public bankAccount() {
        this(123456789, 2.50,
                "default name",
                "default email", "defualt phone number");
        System.out.println("Empty constructor called");
    }

    public bankAccount(long accountNumber, double accountBalance,
                       String customerName, String email, String phoneNumber) {

        System.out.println("bankAccount constructor with parameters called ");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhoneNumber = phoneNumber;
    }


    public bankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this(9999, 10.55, customerName,
                customerEmail, customerPhoneNumber);
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void depositFunds(double depositAmount) {
        System.out.println("Deposit of LKR" + depositAmount + " made, " +
                        "New balance is LKR" + accountBalance);
    }

    public void withdrawFunds(double withdrawalAmount) {
        if (accountBalance - withdrawalAmount < 0) {
            System.out.println("Insufficient Funds! You only have LKR" +
                    accountBalance + " in your account");
        } else {
            accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of LKR" + withdrawalAmount +
                    " is made, Remaining balance = LKR" + accountBalance);
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }


}