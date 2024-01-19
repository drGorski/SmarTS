package pl.gdansk.ug.testSC;

import pl.gdansk.ug.concreteSC.InsuranceTransaction;
import pl.gdansk.ug.reducT.AbstractTestSC;
import java.time.LocalDate;
public class TestInsuranceConclusionSC extends AbstractTestSC {
    public void initiateTransactions(){
        transactions.clear();
        transactions.add(new InsuranceTransaction(LocalDate.of(2024,1,20), LocalDate.of(2025,1,19),250.0,10000.0));
        transactions.add(new InsuranceTransaction(LocalDate.of(2025,1,20), LocalDate.of(2025,1,19),250.0,10000.0));
        transactions.add(new InsuranceTransaction(LocalDate.of(2024,1,20), LocalDate.of(2025,1,19),250.0,0.0));
        transactions.add(new InsuranceTransaction(LocalDate.of(2024,1,20), LocalDate.of(2025,1,19),0.0,10000.0));
        transactions.add(new InsuranceTransaction(LocalDate.of(2024,1,20), LocalDate.of(2025,1,19),250.0,100.0));
    }
}
