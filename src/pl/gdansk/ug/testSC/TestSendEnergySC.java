package pl.gdansk.ug.testSC;

import pl.gdansk.ug.concreteSC.SendEnergyTransaction;
import pl.gdansk.ug.reducT.AbstractTestSC;
public class TestSendEnergySC extends AbstractTestSC {
    public void initiateTransactions(){
        transactions.clear();
        transactions.add(new SendEnergyTransaction(500.0,1000.0,2500.0,0.0, 10.0, 200,7000, 1,1));
        transactions.add(new SendEnergyTransaction(500.0,1000.0,2500.0,0.0, 10.0, 200,7000, 1,100));
        transactions.add(new SendEnergyTransaction(500.0,1000.0,2500.0,0.0, 10.0, 200,200, 1,1));
        transactions.add(new SendEnergyTransaction(0.0,1000.0,2500.0,0.0, 10.0, 200,7000, 1,1));
        transactions.add(new SendEnergyTransaction(500.0,0.0,2500.0,0.0, 10.0, 200,7000, 1,1));
        transactions.add(new SendEnergyTransaction(500.0,50.0,2500.0,0.0, 10.0, 200,7000, 1,1));
        transactions.add(new SendEnergyTransaction(500.0,1000.0,0.0,0.0, 10.0, 200,7000, 1,1));
        transactions.add(new SendEnergyTransaction(500.0,1000.0,50.0,0.0, 10.0, 200,7000, 1,1));
        transactions.add(new SendEnergyTransaction(500.0,1000.0,2500.0,0.0, 7500.0, 200,7000, 1,1));
    }
}
