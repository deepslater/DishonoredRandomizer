package deepslater.dishonoredmutator.tools;

public interface Axis {
    static Lethality getInverse(Lethality lethality) {
        if (lethality == Lethality.LETHAL) {
            return Lethality.NONLETHAL;
        } else {
            return Lethality.LETHAL;
        }
    }

    static Loudness getInverse(Loudness loudness) {
        if (loudness == Loudness.ASSAULT) {
            return Loudness.STEALTH;
        } else {
            return Loudness.ASSAULT;
        }
    }
}
