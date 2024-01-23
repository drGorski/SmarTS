package pl.gdansk.ug.concreteSC;

import pl.gdansk.ug.smarTS.AbstractSmartContract;
import java.util.Arrays;

public final class SendEnergySC extends AbstractSmartContract{
    public SendEnergySC(){
        rulesList = Arrays.asList(
                t -> ((SendEnergyTransaction) t).getSourceCommunityID() == ((SendEnergyTransaction) t).getTargetCommunityID(),
                t -> ((SendEnergyTransaction) t).getSourceID() != ((SendEnergyTransaction) t).getTargetID(),
                t -> ((SendEnergyTransaction) t).getQuantity() > 0,
                t -> ((SendEnergyTransaction) t).getSourceSurplus() > 0,
                t -> ((SendEnergyTransaction) t).getSourceSurplus() >= ((SendEnergyTransaction) t).getQuantity(),
                t -> ((SendEnergyTransaction) t).getTargetNeed() > 0,
                t -> ((SendEnergyTransaction) t).getTargetNeed() > ((SendEnergyTransaction) t).getQuantity(),
                t -> ((SendEnergyTransaction) t).getTargetNeed() > ((SendEnergyTransaction) t).getTargetBatteryEnergySurplus());
    }
}
