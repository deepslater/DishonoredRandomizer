package deepslater.dishonoredmutator.tools.power;

import deepslater.dishonoredmutator.tools.Lethality;
import deepslater.dishonoredmutator.tools.Loudness;

public class ActivePower extends Power {
    private ActivePower(String displayName, Lethality powerLethality, Loudness powerLoudness) {
        super(displayName, powerLethality, powerLoudness);
    }

    public static final ActivePower BLINK = new ActivePower("Blink", Lethality.NEUTRAL, Loudness.NEUTRAL);
    public static final ActivePower DEVOURING_SWARM = new ActivePower("Devouring Swarm", Lethality.LETHAL, Loudness.NEUTRAL);
    public static final ActivePower POSSESSION = new ActivePower("Possession", Lethality.NEUTRAL, Loudness.STEALTH);
    public static final ActivePower BEND_TIME = new ActivePower("Bend Time", Lethality.NEUTRAL, Loudness.NEUTRAL);
    public static final ActivePower WINDBLAST = new ActivePower("Windblast", Lethality.NEUTRAL, Loudness.ASSAULT);
    public static final ActivePower DOMINO = new ActivePower("Domino", Lethality.NEUTRAL, Loudness.NEUTRAL);
    public static final ActivePower DOPPELGANGER = new ActivePower("Doppelganger", Lethality.NEUTRAL, Loudness.NEUTRAL);
    public static final ActivePower FAR_REACH = new ActivePower("Far Reach", Lethality.NEUTRAL, Loudness.NEUTRAL);
    public static final ActivePower MESMERIZE = new ActivePower("Mesmerize", Lethality.NEUTRAL, Loudness.STEALTH);
    public static final ActivePower SHADOW_WALK = new ActivePower("Shadow Walk", Lethality.LETHAL, Loudness.STEALTH);
}
