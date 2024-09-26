package deepslater.dishonoredmutator.tools;

public enum Loudness implements Axis {
    ASSAULT("Assault"),
    STEALTH("Stealth"),
    NEUTRAL("");


    private final String DISPLAY_NAME;
    Loudness(String displayName) {
        this.DISPLAY_NAME = displayName;
    }

    public String getDISPLAY_NAME() {
        return DISPLAY_NAME;
    }
}
