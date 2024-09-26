package deepslater.dishonoredmutator.mutator;

public class OptionalMission extends Mutator {
    protected static final OptionalMission DO = new OptionalMission("Complete all optional objectives.", MutatorType.BOON);
    protected static final OptionalMission DO_NOT = new OptionalMission("Complete no optional missions.", MutatorType.BANE);

    public OptionalMission(String displayName, MutatorType luckiness) {
        super(displayName, luckiness);
    }
}
