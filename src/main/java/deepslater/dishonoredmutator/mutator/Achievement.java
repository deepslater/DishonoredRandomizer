package deepslater.dishonoredmutator.mutator;

public class Achievement extends Mutator {
    protected static final Achievement GHOST = new Achievement("Ghost: Complete the game without being detected.", MutatorType.BANE);
    protected static final Achievement CLEAN_HANDS = new Achievement("Clean Hands: Complete the game without killing anyone.", MutatorType.BANE);

    public Achievement(String displayName, MutatorType luckiness) {
        super(displayName, luckiness);
    }
}
