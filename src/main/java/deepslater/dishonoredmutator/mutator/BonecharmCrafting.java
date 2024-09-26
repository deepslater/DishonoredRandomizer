package deepslater.dishonoredmutator.mutator;

public class BonecharmCrafting extends Mutator {
    protected static final BonecharmCrafting CLASSIC = new BonecharmCrafting("Craft only bonecharms with 3 traits.", MutatorType.NEUTRAL);
    protected static final BonecharmCrafting RESTRICTED = new BonecharmCrafting("Use no duplicate traits on crafted bonecharms.", MutatorType.NEUTRAL);
    protected static final BonecharmCrafting CORRUPTED = new BonecharmCrafting("Do not take Witch Crafting for Bonecharms. Keep all corrupted charms and use them.", MutatorType.BANE);

    public BonecharmCrafting(String displayName, MutatorType luckiness) {
        super(displayName, luckiness);
    }
}
