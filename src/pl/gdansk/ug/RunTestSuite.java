package pl.gdansk.ug;

import pl.gdansk.ug.smarTS.AbstractSmartContract;
import pl.gdansk.ug.smarTS.AbstractTestSC;
import pl.gdansk.ug.concreteSC.InsuranceConclusionSC;
import pl.gdansk.ug.concreteSC.SendEnergySC;
import pl.gdansk.ug.testSC.TestInsuranceConclusionSC;
import pl.gdansk.ug.testSC.TestSendEnergySC;

import java.util.ArrayList;
import java.util.List;

public class RunTestSuite {
    private static List<AbstractSmartContract> smartContractList = new ArrayList<>();
    private static List<AbstractTestSC> testClassesList = new ArrayList<>();
    private static void createSmartContracts(){
        smartContractList.add(new SendEnergySC());
        smartContractList.add(new InsuranceConclusionSC());
    }
    private static void createTestClasses(){
        testClassesList.add(new TestSendEnergySC());
        testClassesList.add(new TestInsuranceConclusionSC());
    }
    public static void main(String[] args){
        // create smart contracts and test classes
        createSmartContracts();
        createTestClasses();
        // run test suites for smart contracts
        for (int i = 0; i < smartContractList.size(); i++ ) {
            testClassesList.get(i).runTestSuite(smartContractList.get(i));
        }
    }
}
