package deepslater.dishonoredmutator.tools.power;

import java.util.HashSet;
import java.util.Set;

public class PowerSets {
    private static final Set<ActivePower> ACTIVE_POWERS = new HashSet<>();
    private static final Set<PassivePower> PASSIVE_POWERS = new HashSet<>();

    static {
        ACTIVE_POWERS.add(ActivePower.BLINK);
        ACTIVE_POWERS.add(ActivePower.DEVOURING_SWARM);
        ACTIVE_POWERS.add(ActivePower.POSSESSION);
        ACTIVE_POWERS.add(ActivePower.BEND_TIME);
        ACTIVE_POWERS.add(ActivePower.WINDBLAST);
        ACTIVE_POWERS.add(ActivePower.DOMINO);
        ACTIVE_POWERS.add(ActivePower.DOPPELGANGER);
        ACTIVE_POWERS.add(ActivePower.FAR_REACH);
        ACTIVE_POWERS.add(ActivePower.MESMERIZE);
        ACTIVE_POWERS.add(ActivePower.SHADOW_WALK);

        PASSIVE_POWERS.add(PassivePower.DARK_VISION);
        PASSIVE_POWERS.add(PassivePower.VITALITY);
        PASSIVE_POWERS.add(PassivePower.BLOOD_THIRSTY);
        PASSIVE_POWERS.add(PassivePower.AGILITY);
        PASSIVE_POWERS.add(PassivePower.SHADOW_KILL);
        PASSIVE_POWERS.add(PassivePower.REFLEXES);
        PASSIVE_POWERS.add(PassivePower.STRENGTH);
    }

    public static Set<ActivePower> getActivePowers() {
        return ACTIVE_POWERS;
    }

    public static Set<PassivePower> getPassivePowers() {
        return PASSIVE_POWERS;
    }
}
