package deepslater.dishonoredmutator.tools.weapon;

import deepslater.dishonoredmutator.tools.Lethality;
import deepslater.dishonoredmutator.tools.Loudness;
import deepslater.dishonoredmutator.tools.Tool;

public class Weapon extends Tool {
    public Weapon(String displayName, Lethality toolLethality, Loudness toolLoudness) {
        super(displayName, toolLethality, toolLoudness);
    }

    public static final Weapon SWORD = new Weapon("Sword", Lethality.LETHAL, Loudness.NEUTRAL);
    public static final Weapon CHOKE = new Weapon("Choke", Lethality.NONLETHAL, Loudness.STEALTH);
    public static final Weapon BOLT = new Weapon("Crossbow Bolt", Lethality.LETHAL, Loudness.NEUTRAL);
    public static final Weapon SLEEP_DART = new Weapon("Sleep Dart", Lethality.NONLETHAL, Loudness.STEALTH);
    public static final Weapon INCENDIARY_BOLT = new Weapon("Incendiary Bolt", Lethality.LETHAL, Loudness.NEUTRAL);
    public static final Weapon STINGING_BOLT = new Weapon("Stinging Bolt", Lethality.NONLETHAL, Loudness.NEUTRAL);
    public static final Weapon HOWLING_BOLT = new Weapon("Howling Bolt", Lethality.NONLETHAL, Loudness.ASSAULT);
    public static final Weapon BULLET = new Weapon("Pistol", Lethality.LETHAL, Loudness.ASSAULT);
    public static final Weapon EXPLOSIVE_BULLET = new Weapon("Explosive Bullets", Lethality.LETHAL, Loudness.ASSAULT);
    public static final Weapon STUN_MINE = new Weapon("Stun Mine", Lethality.NONLETHAL, Loudness.NEUTRAL);
    public static final Weapon SPRINGRAZOR = new Weapon("Springrazor", Lethality.LETHAL, Loudness.NEUTRAL);
    public static final Weapon GRENADE = new Weapon("Grenade", Lethality.LETHAL, Loudness.ASSAULT);
    public static final Weapon STICKY_GRENADE = new Weapon("Sticky Grenade", Lethality.LETHAL, Loudness.ASSAULT);
}
