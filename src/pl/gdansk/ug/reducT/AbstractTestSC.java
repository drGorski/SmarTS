package pl.gdansk.ug.reducT;

import pl.gdansk.ug.abstractSC.AbstractSmartContract;
import pl.gdansk.ug.abstractSC.AbstractTransaction;

import java.util.ArrayList;
public abstract class AbstractTestSC {
    protected ArrayList<AbstractTransaction> transactions = new ArrayList<>();
    public AbstractTestSC(){
        initiateTransactions();
    }
    public abstract void initiateTransactions();
    public void runTestSuite(AbstractSmartContract sC){
        AbstractRunTestCases.runTestSuite(sC, transactions);
    }
}
