package deepslater.dishonoredmutator.hero;

import deepslater.dishonoredmutator.mutator.MutatorSets;
import deepslater.dishonoredmutator.tools.power.ActivePower;
import deepslater.dishonoredmutator.tools.power.PassivePower;
import deepslater.dishonoredmutator.tools.power.PowerSets;
import deepslater.dishonoredmutator.tools.weapon.Weapon;
import deepslater.dishonoredmutator.tools.weapon.WeaponSets;

import java.util.HashSet;
import java.util.Set;

public class NewGamePlus extends Hero {
    private static final Set<ActivePower> NEW_GAME_PLUS_ACTIVE_POWERS = new HashSet<>();
    private static final Set<PassivePower> NEW_GAME_PLUS_PASSIVE_POWERS = new HashSet<>();
    private static final Set<Weapon> NEW_GAME_PLUS_WEAPONS = new HashSet<>();
    private static final Set<HashSet<?>> NEW_GAME_PLUS_MUTATORS = new HashSet<>();
    private NewGamePlus() {
        super("NG+", NEW_GAME_PLUS_ACTIVE_POWERS, NEW_GAME_PLUS_PASSIVE_POWERS, NEW_GAME_PLUS_WEAPONS, NEW_GAME_PLUS_MUTATORS);
    }

    static {
        NEW_GAME_PLUS_ACTIVE_POWERS.addAll(PowerSets.getActivePowers());

        NEW_GAME_PLUS_PASSIVE_POWERS.addAll(PowerSets.getPassivePowers());

        NEW_GAME_PLUS_WEAPONS.addAll(WeaponSets.getWeaponSet());

        NEW_GAME_PLUS_MUTATORS.add(MutatorSets.getBlackMarketMutators());
        NEW_GAME_PLUS_MUTATORS.add(MutatorSets.getMainTargetMutators());
        NEW_GAME_PLUS_MUTATORS.add(MutatorSets.getOptionalMissionMutators());
        NEW_GAME_PLUS_MUTATORS.add(MutatorSets.getBonecharmCraftingMutators());
    }

    private static final NewGamePlus NEW_GAME_PLUS = new NewGamePlus();

    public static NewGamePlus getHero() {
        return NEW_GAME_PLUS;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }

    @Override
    public Set<ActivePower> getHeroActivePowers() {
        return NEW_GAME_PLUS_ACTIVE_POWERS;
    }

    @Override
    public Set<PassivePower> getHeroPassivePowers() {
        return NEW_GAME_PLUS_PASSIVE_POWERS;
    }

    @Override
    public Set<Weapon> getHeroWeapons() {
        return NEW_GAME_PLUS_WEAPONS;
    }

    @Override
    public Set<HashSet<?>> getHeroMutators() {
        return NEW_GAME_PLUS_MUTATORS;
    }
}
