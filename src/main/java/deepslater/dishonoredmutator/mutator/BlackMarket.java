package deepslater.dishonoredmutator.mutator;

public class BlackMarket extends Mutator {

    protected static final BlackMarket NO_ROB = new BlackMarket("Rob no Black Market", MutatorType.BANE);
    protected static final BlackMarket ONE_ROB = new BlackMarket("Rob only one Black Market", MutatorType.NEUTRAL);
    protected static final BlackMarket ALL_ROB = new BlackMarket("Rob all Black Market shops", MutatorType.BOON);

    public BlackMarket(String displayName, MutatorType luckiness) {
        super(displayName, luckiness);
    }

}
