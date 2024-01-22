package pl.gdansk.ug.testSC;

import pl.gdansk.ug.concreteSC.InsuranceTransaction;
import pl.gdansk.ug.reducT.AbstractTestSC;
import java.time.LocalDate;
public class TestInsuranceConclusionSC extends AbstractTestSC {
    public void initiateTransactions(){
        transactions.clear();
        transactions.add(new InsuranceTransaction(LocalDate.now(), LocalDate.now().plusYears(1),250.0,10000.0));
        transactions.add(new InsuranceTransaction(LocalDate.now().minusDays(1), LocalDate.now().plusYears(1),250.0,10000.0));
        transactions.add(new InsuranceTransaction(LocalDate.now(), LocalDate.now().minusMonths(1),250.0,10000.0));
        transactions.add(new InsuranceTransaction(LocalDate.now(), LocalDate.now().plusYears(1),250.0,0.0));
        transactions.add(new InsuranceTransaction(LocalDate.now(), LocalDate.now().plusYears(1),0.0,10000.0));
        transactions.add(new InsuranceTransaction(LocalDate.now(), LocalDate.now().plusYears(1),250.0,100.0));
    }
}
