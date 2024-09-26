package deepslater.dishonoredmutator.mutator;

import java.util.HashSet;
import java.util.Set;

public class MutatorSets {

    private static final Set<BlackMarket> BLACK_MARKET_MUTATORS = new HashSet<>();

    static {
        BLACK_MARKET_MUTATORS.add(BlackMarket.NO_ROB);
        BLACK_MARKET_MUTATORS.add(BlackMarket.ONE_ROB);
        BLACK_MARKET_MUTATORS.add(BlackMarket.ALL_ROB);
    }

    private static final Set<MainTarget> MAIN_TARGET_MUTATORS = new HashSet<>();

    static {
        MAIN_TARGET_MUTATORS.add(MainTarget.KILL);
        MAIN_TARGET_MUTATORS.add(MainTarget.SPARE);
        MAIN_TARGET_MUTATORS.add(MainTarget.CHOOSE);
    }

    private static final Set<OptionalMission> OPTIONAL_MISSION_MUTATORS = new HashSet<>();

    static {
        OPTIONAL_MISSION_MUTATORS.add(OptionalMission.DO);
        OPTIONAL_MISSION_MUTATORS.add(OptionalMission.DO_NOT);
    }

    private static final Set<BonecharmCrafting> BONECHARM_CRAFTING_MUTATORS = new HashSet<>();

    static {
        BONECHARM_CRAFTING_MUTATORS.add(BonecharmCrafting.CLASSIC);
        BONECHARM_CRAFTING_MUTATORS.add(BonecharmCrafting.RESTRICTED);
        BONECHARM_CRAFTING_MUTATORS.add(BonecharmCrafting.CORRUPTED);
    }

    public static HashSet<BlackMarket> getBlackMarketMutators() {
        return (HashSet<BlackMarket>) BLACK_MARKET_MUTATORS;
    }

    public static HashSet<MainTarget> getMainTargetMutators() {
        return (HashSet<MainTarget>) MAIN_TARGET_MUTATORS;
    }

    public static HashSet<OptionalMission> getOptionalMissionMutators() {
        return (HashSet<OptionalMission>) OPTIONAL_MISSION_MUTATORS;
    }

    public static HashSet<BonecharmCrafting> getBonecharmCraftingMutators() {
        return (HashSet<BonecharmCrafting>) BONECHARM_CRAFTING_MUTATORS;
    }
}
