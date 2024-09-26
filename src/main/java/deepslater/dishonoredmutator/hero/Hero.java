package deepslater.dishonoredmutator.hero;

import deepslater.dishonoredmutator.tools.power.ActivePower;
import deepslater.dishonoredmutator.tools.power.PassivePower;
import deepslater.dishonoredmutator.tools.weapon.Weapon;

import java.util.HashSet;
import java.util.Set;

public abstract class Hero {
    protected String displayName;
    protected Set<ActivePower> heroActivePowers;
    protected Set<PassivePower> heroPassivePowers;
    protected Set<Weapon> heroWeapons;
    protected Set<HashSet<?>> heroMutators;

    protected Hero(String displayName, Set<ActivePower> heroActivePowers, Set<PassivePower> heroPassivePowers, Set<Weapon> heroWeapons, Set<HashSet<?>> heroMutators) {
        this.displayName = displayName;
        this.heroActivePowers = heroActivePowers;
        this.heroPassivePowers = heroPassivePowers;
        this.heroWeapons = heroWeapons;
        this.heroMutators = heroMutators;
    }

    public abstract String getDisplayName();

    public abstract Set<ActivePower> getHeroActivePowers();

    public abstract Set<PassivePower> getHeroPassivePowers();

    public abstract Set<Weapon> getHeroWeapons();

    public abstract Set<HashSet<?>> getHeroMutators();
}
