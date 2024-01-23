package pl.gdansk.ug.concreteSC;

import pl.gdansk.ug.smarTS.AbstractSmartContract;
import java.time.LocalDate;
import java.util.Arrays;

public class InsuranceConclusionSC extends AbstractSmartContract {
    public InsuranceConclusionSC(){
        rulesList = Arrays.asList(
                t -> !((InsuranceTransaction) t).getDateFrom().isBefore(LocalDate.now()),
                t -> ((InsuranceTransaction) t).getDateFrom().isBefore(((InsuranceTransaction) t).getDateTo()),
                t -> ((InsuranceTransaction) t).getInsuranceAmount() > 0,
                t -> ((InsuranceTransaction) t).getInsurancePremium() > 0,
                t -> ((InsuranceTransaction) t).getInsurancePremium() < ((InsuranceTransaction) t).getInsuranceAmount());
    }
}
