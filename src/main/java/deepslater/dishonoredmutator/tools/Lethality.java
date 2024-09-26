package deepslater.dishonoredmutator.tools;

public enum Lethality implements Axis {
    LETHAL("Lethal"),
    NONLETHAL("Non-Lethal"),
    NEUTRAL("");


    private final String DISPLAY_NAME;
    Lethality(String displayName) {
        this.DISPLAY_NAME = displayName;
    }

    public String getDISPLAY_NAME() {
        return DISPLAY_NAME;
    }
}
