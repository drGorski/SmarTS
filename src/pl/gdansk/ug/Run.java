package pl.gdansk.ug;

import pl.gdansk.ug.abstractSC.AbstractSmartContract;
import pl.gdansk.ug.concreteSC.InsuranceConclusionSC;
import pl.gdansk.ug.concreteSC.SendEnergySC;
import pl.gdansk.ug.reducT.AbstractTestSC;
import pl.gdansk.ug.testSC.TestInsuranceConclusionSC;
import pl.gdansk.ug.testSC.TestSendEnergySC;

public class Run {
    public static void main(String[] args){
        // declare variables
        AbstractSmartContract sC;
        AbstractTestSC testSC;
        // run tests for SendEnergySC
        sC = new SendEnergySC();
        testSC = new TestSendEnergySC();
        testSC.runTestSuite(sC);
        // run tests for InsuranceTransactionSC
        sC = new InsuranceConclusionSC();
        testSC = new TestInsuranceConclusionSC();
        testSC.runTestSuite(sC);
    }
}
