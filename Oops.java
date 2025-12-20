class Account {
    private String name;
    private String accNo;
    private double bal;

    public Account(String name, String accNo, double bal) {
        this.name = name;
        this.accNo = accNo;
        this.bal = bal;
    }

    public String getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public double getBal() {
        return bal;
    }

    public void deposit(double amt) {
        bal += amt;
        System.out.println("Deposited Amount: " + amt);
    }

    public void withdraw(double amt) {
        if (amt <= bal) {
            bal -= amt;
            System.out.println("Withdrawn Amount: " + amt);
        } else {
            System.out.println("Low Balance.");
        }
    }

    public void dispaly() {
        System.out.println("Account: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + bal);
    }
}

class Savings extends Account {

    private double rate;

    public Savings(String accNo, String name, double bal, double rate) {
        super(accNo, name, bal);
        this.rate = rate;
    }

    public void addInterest() {
        double interest = getBal() * rate / 100;
        deposit(interest);
    }

    public void dispaly() {
        super.dispaly();
        System.out.println("Type: Savings");
        System.out.println("Rate: " + rate + "%");
    }
}

class Current extends Account {

    private double limit;

    public Current(String name, String accNo, double bal, double limit) {
        super(name, accNo, bal);
        this.limit = limit;
    }

    public void withdraw(double amt) {
        if (amt <= getBal() + limit) {
            super.withdraw(amt);
        } else {
            System.out.println("Exceed the Limit.");
        }
    }

    public void dispaly() {
        super.dispaly();
        System.out.println("Type: Current.");
        System.out.println("Overdraft: " + limit);
    }
}

public class Oops {
    public static void main(String[] args) {
        Account acc1 = new Savings("S1", "DAMON", 10000, 2);
        Account acc2 = new Current("STEFAN", "C2", 5000, 500);

        acc1.dispaly();
        System.out.println();
        acc2.dispaly();

        System.out.println("Transations: ");
        acc1.deposit(20000); // 30000
        acc1.withdraw(5000); // 25000

        Savings s = (Savings) acc1;
        s.addInterest();

        System.out.println("Final Balance: " + acc1.getBal());
    }
}