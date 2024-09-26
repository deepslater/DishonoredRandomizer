package deepslater.dishonoredmutator.tools.power;

import deepslater.dishonoredmutator.tools.Lethality;
import deepslater.dishonoredmutator.tools.Loudness;

public class PassivePower extends Power {
    private PassivePower(String displayName, Lethality powerLethality, Loudness powerLoudness) {
        super(displayName, powerLethality, powerLoudness);
    }

    public static final PassivePower DARK_VISION = new PassivePower("Dark Vision", Lethality.NEUTRAL, Loudness.NEUTRAL);
    public static final PassivePower VITALITY = new PassivePower("Vitality",Lethality.NEUTRAL, Loudness.NEUTRAL);
    public static final PassivePower BLOOD_THIRSTY = new PassivePower("Blood Thirsty",Lethality.LETHAL, Loudness.ASSAULT);
    public static final PassivePower AGILITY = new PassivePower("Agility",Lethality.NEUTRAL, Loudness.NEUTRAL);
    public static final PassivePower SHADOW_KILL = new PassivePower("Shadow Kill",Lethality.LETHAL, Loudness.STEALTH);
    public static final PassivePower REFLEXES = new PassivePower("Reflexes",Lethality.NEUTRAL, Loudness.ASSAULT);
    public static final PassivePower STRENGTH = new PassivePower("Strength",Lethality.NEUTRAL, Loudness.NEUTRAL);
}
