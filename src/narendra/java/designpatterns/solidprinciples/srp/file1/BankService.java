package narendra.java.designpatterns.solidprinciples.srp.file1;

//Here the class has multiple reasons to change
public class BankService {

    public long deposit(long amount, int account) {
        return amount;
    }

    public long withDraw(long amount, int account) {
        return amount;
    }

    public void printPassbook() {

    }

    //LoanInfo function has multiple reasons to change if service need to add
    //                                   1.Motgage Loan
    //                                   2. Car Loan
    //                                   3. Two Wheler Loan
    public void getLoanInfo(String loanType) {
        if ("Home-Loan".equalsIgnoreCase(loanType)) {

        }

        if ("vehicle-Loan".equalsIgnoreCase(loanType)) {

        }

        if ("Gold-Loan".equalsIgnoreCase(loanType)) {

        }
    }

    // sendOtp function also has multiple reasons to change
    //              1. If medium is Text
    //             2.  Email
    //            3.  WhatsApp
    public void sendOtp(String medium) {
        if ("Email".equalsIgnoreCase(medium)) {

        }
    }


}
