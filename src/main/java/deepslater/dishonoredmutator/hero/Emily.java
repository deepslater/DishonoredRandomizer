package deepslater.dishonoredmutator.hero;

import deepslater.dishonoredmutator.mutator.MutatorSets;
import deepslater.dishonoredmutator.tools.power.ActivePower;
import deepslater.dishonoredmutator.tools.power.PassivePower;
import deepslater.dishonoredmutator.tools.power.PowerSets;
import deepslater.dishonoredmutator.tools.weapon.Weapon;
import deepslater.dishonoredmutator.tools.weapon.WeaponSets;

import java.util.HashSet;
import java.util.Set;

public class Emily extends Hero {
    private static final Set<ActivePower> EMILY_ACTIVE_POWER_SET = new HashSet<>();
    private static final Set<PassivePower> EMILY_PASSIVE_POWER_SET = new HashSet<>();
    private static final Set<Weapon> EMILY_WEAPON_SET = new HashSet<>();
    private static final Set<HashSet<?>> EMILY_MUTATORS = new HashSet<>();
    private Emily(String displayName, Set<ActivePower> heroActivePowers, Set<PassivePower> heroPassivePowers, Set<Weapon> heroWeapons, Set<HashSet<?>> heroMutators) {
        super(displayName, heroActivePowers, heroPassivePowers, heroWeapons, heroMutators);
    }

    static {
        EMILY_ACTIVE_POWER_SET.addAll(PowerSets.getActivePowers());
        EMILY_ACTIVE_POWER_SET.remove(ActivePower.BLINK);
        EMILY_ACTIVE_POWER_SET.remove(ActivePower.DEVOURING_SWARM);
        EMILY_ACTIVE_POWER_SET.remove(ActivePower.POSSESSION);
        EMILY_ACTIVE_POWER_SET.remove(ActivePower.WINDBLAST);
        EMILY_ACTIVE_POWER_SET.remove(ActivePower.BEND_TIME);

        EMILY_PASSIVE_POWER_SET.addAll(PowerSets.getPassivePowers());

        EMILY_WEAPON_SET.addAll(WeaponSets.getWeaponSet());

        EMILY_MUTATORS.add(MutatorSets.getBlackMarketMutators());
        EMILY_MUTATORS.add(MutatorSets.getMainTargetMutators());
        EMILY_MUTATORS.add(MutatorSets.getOptionalMissionMutators());
        EMILY_MUTATORS.add(MutatorSets.getBonecharmCraftingMutators());
    }

    private static final Emily EMILY = new Emily("Emily", EMILY_ACTIVE_POWER_SET, EMILY_PASSIVE_POWER_SET, EMILY_WEAPON_SET, EMILY_MUTATORS);

    public static Emily getHero() {
        return EMILY;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }

    @Override
    public Set<ActivePower> getHeroActivePowers() {
        return EMILY_ACTIVE_POWER_SET;
    }

    @Override
    public Set<PassivePower> getHeroPassivePowers() {
        return EMILY_PASSIVE_POWER_SET;
    }

    @Override
    public Set<Weapon> getHeroWeapons() {
        return EMILY_WEAPON_SET;
    }

    @Override
    public Set<HashSet<?>> getHeroMutators() {
        return EMILY_MUTATORS;
    }
}
