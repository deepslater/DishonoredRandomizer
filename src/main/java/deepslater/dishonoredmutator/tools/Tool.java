package deepslater.dishonoredmutator.tools;

public abstract class Tool {
    protected String displayName;
    protected Lethality toolLethality;
    protected Loudness toolLoudness;

    public Tool(String displayName, Lethality toolLethality, Loudness toolLoudness) {
        this.displayName = displayName;
        this.toolLethality = toolLethality;
        this.toolLoudness = toolLoudness;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Lethality getToolLethality() {
        return toolLethality;
    }

    public Loudness getToolLoudness() {
        return toolLoudness;
    }
}
