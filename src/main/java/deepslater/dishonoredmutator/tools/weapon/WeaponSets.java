package deepslater.dishonoredmutator.tools.weapon;

import java.util.HashSet;
import java.util.Set;

public class WeaponSets {
    private static final Set<Weapon> WEAPON_SET = new HashSet<>();

    static {
        WEAPON_SET.add(Weapon.SWORD);
        WEAPON_SET.add(Weapon.CHOKE);
        WEAPON_SET.add(Weapon.BOLT);
        WEAPON_SET.add(Weapon.SLEEP_DART);
        WEAPON_SET.add(Weapon.INCENDIARY_BOLT);
        WEAPON_SET.add(Weapon.STINGING_BOLT);
        WEAPON_SET.add(Weapon.HOWLING_BOLT);
        WEAPON_SET.add(Weapon.BULLET);
        WEAPON_SET.add(Weapon.EXPLOSIVE_BULLET);
        WEAPON_SET.add(Weapon.STUN_MINE);
        WEAPON_SET.add(Weapon.SPRINGRAZOR);
        WEAPON_SET.add(Weapon.GRENADE);
        WEAPON_SET.add(Weapon.STICKY_GRENADE);
    }

    public static Set<Weapon> getWeaponSet(){
        return WEAPON_SET;
    }

}
