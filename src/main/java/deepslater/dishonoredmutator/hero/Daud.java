package deepslater.dishonoredmutator.hero;

import deepslater.dishonoredmutator.tools.power.ActivePower;
import deepslater.dishonoredmutator.tools.power.PassivePower;
import deepslater.dishonoredmutator.tools.weapon.Weapon;

import java.util.HashSet;
import java.util.Set;

public class Daud extends Hero {
    public Daud(String displayName, Set<ActivePower> heroActivePowers, Set<PassivePower> heroPassivePowers, Set<Weapon> heroWeapons, Set<HashSet<?>> heroMutators) {
        super(displayName, heroActivePowers, heroPassivePowers, heroWeapons, heroMutators);
    }

    @Override
    public String getDisplayName() {
        return null;
    }

    @Override
    public Set<ActivePower> getHeroActivePowers() {
        return null;
    }

    @Override
    public Set<PassivePower> getHeroPassivePowers() {
        return null;
    }

    @Override
    public Set<Weapon> getHeroWeapons() {
        return null;
    }

    @Override
    public Set<HashSet<?>> getHeroMutators() {
        return null;
    }
}
