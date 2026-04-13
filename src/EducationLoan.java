abstract class Bank {
    abstract double getRateOfInterest();
}

class SBI extends Bank {
    @Override
    double getRateOfInterest() {
        return 8.5;
    }
}

class HDFC extends Bank {
    @Override
    double getRateOfInterest() {
        return 9.0;
    }
}

class ICICI extends Bank {
    @Override
    double getRateOfInterest() {
        return 9.5;
    }
}

public class EducationLoan {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();

        System.out.println("SBI Education Loan Interest Rate: " + b1.getRateOfInterest() + "%");
        System.out.println("HDFC Education Loan Interest Rate: " + b2.getRateOfInterest() + "%");
        System.out.println("ICICI Education Loan Interest Rate: " + b3.getRateOfInterest() + "%");
    }
}
