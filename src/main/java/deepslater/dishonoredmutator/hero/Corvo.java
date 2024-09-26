package deepslater.dishonoredmutator.hero;

import deepslater.dishonoredmutator.mutator.MutatorSets;
import deepslater.dishonoredmutator.tools.power.ActivePower;
import deepslater.dishonoredmutator.tools.power.PassivePower;
import deepslater.dishonoredmutator.tools.power.PowerSets;
import deepslater.dishonoredmutator.tools.weapon.Weapon;
import deepslater.dishonoredmutator.tools.weapon.WeaponSets;

import java.util.HashSet;
import java.util.Set;

public class Corvo extends Hero {
    private static final Set<ActivePower> CORVO_ACTIVE_POWER_SET = new HashSet<>();
    private static final Set<PassivePower> CORVO_PASSIVE_POWER_SET = new HashSet<>();
    private static final Set<Weapon> CORVO_WEAPON_SET = new HashSet<>();
    private static final Set<HashSet<?>> CORVO_MUTATORS = new HashSet<>();
    private Corvo(String displayName, Set<ActivePower> heroActivePowers, Set<PassivePower> heroPassivePowers, Set<Weapon> heroWeapons, Set<HashSet<?>> heroMutators) {
        super(displayName, heroActivePowers, heroPassivePowers, heroWeapons, heroMutators);
    }

    static {
        CORVO_ACTIVE_POWER_SET.addAll(PowerSets.getActivePowers());
        CORVO_ACTIVE_POWER_SET.remove(ActivePower.DOMINO);
        CORVO_ACTIVE_POWER_SET.remove(ActivePower.DOPPELGANGER);
        CORVO_ACTIVE_POWER_SET.remove(ActivePower.FAR_REACH);
        CORVO_ACTIVE_POWER_SET.remove(ActivePower.MESMERIZE);
        CORVO_ACTIVE_POWER_SET.remove(ActivePower.SHADOW_WALK);

        CORVO_PASSIVE_POWER_SET.addAll(PowerSets.getPassivePowers());

        CORVO_WEAPON_SET.addAll(WeaponSets.getWeaponSet());

        CORVO_MUTATORS.add(MutatorSets.getBlackMarketMutators());
        CORVO_MUTATORS.add(MutatorSets.getMainTargetMutators());
        CORVO_MUTATORS.add(MutatorSets.getOptionalMissionMutators());
        CORVO_MUTATORS.add(MutatorSets.getBonecharmCraftingMutators());
    }

    private static final Corvo CORVO = new Corvo("Corvo", CORVO_ACTIVE_POWER_SET, CORVO_PASSIVE_POWER_SET, CORVO_WEAPON_SET, CORVO_MUTATORS);

    public static Corvo getHero() {
        return CORVO;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }

    @Override
    public Set<ActivePower> getHeroActivePowers() {
        return CORVO_ACTIVE_POWER_SET;
    }

    @Override
    public Set<PassivePower> getHeroPassivePowers() {
        return CORVO_PASSIVE_POWER_SET;
    }

    @Override
    public Set<Weapon> getHeroWeapons() {
        return CORVO_WEAPON_SET;
    }

    @Override
    public Set<HashSet<?>> getHeroMutators() {
        return CORVO_MUTATORS;
    }
}
