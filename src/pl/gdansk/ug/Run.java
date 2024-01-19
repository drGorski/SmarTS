package pl.gdansk.ug;

import pl.gdansk.ug.abstractSC.AbstractSmartContract;
import pl.gdansk.ug.concreteSC.InsuranceConclusionSC;
import pl.gdansk.ug.concreteSC.SendEnergySC;
import pl.gdansk.ug.reducT.AbstractTestSC;
import pl.gdansk.ug.testSC.TestInsuranceConclusionSC;
import pl.gdansk.ug.testSC.TestSendEnergySC;

public class Run {
    public static void main(String[] args){
        // run tests for SendEnergySC
        AbstractSmartContract sC = new SendEnergySC();
        AbstractTestSC testSC = new TestSendEnergySC();
        testSC.runTestSuite(sC);
        // run tests for InsuranceTransactionSC
        sC = new InsuranceConclusionSC();
        testSC = new TestInsuranceConclusionSC();
        testSC.runTestSuite(sC);
    }
}
