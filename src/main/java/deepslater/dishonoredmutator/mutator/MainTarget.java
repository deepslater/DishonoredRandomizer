package deepslater.dishonoredmutator.mutator;

public class MainTarget extends Mutator {

    protected static final MainTarget KILL = new MainTarget("Kill all main targets", MutatorType.BANE);
    protected static final MainTarget SPARE =  new MainTarget("Spare all main targets", MutatorType.NEUTRAL);
    protected static final MainTarget CHOOSE = new MainTarget("Choose the fate of all main targets", MutatorType.BOON);

    public MainTarget(String displayName, MutatorType luckiness) {
        super(displayName, luckiness);
    }

}
