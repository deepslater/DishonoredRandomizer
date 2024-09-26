package deepslater.dishonoredmutator.mutator;

public abstract class Mutator {

    String displayName;
    MutatorType luckiness;

    public Mutator(String displayName, MutatorType luckiness) {
        this.displayName = displayName;
        this.luckiness = luckiness;
    }

    String getDisplayName(){
        return displayName;
    }

    MutatorType getLuckiness(){
        return luckiness;
    }

}