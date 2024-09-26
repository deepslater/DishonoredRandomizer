package deepslater.dishonoredmutator.game;

import deepslater.dishonoredmutator.hero.Corvo;
import deepslater.dishonoredmutator.hero.Emily;
import deepslater.dishonoredmutator.hero.Hero;
import deepslater.dishonoredmutator.hero.NewGamePlus;

import java.util.HashSet;
import java.util.Set;

public class Dishonored2 extends Game {
    public static final Set<Hero> DISHONORED_2_CHARACTERS = new HashSet<>();
    private Dishonored2(Set<Hero> characters) {
        super(characters);
    }

    static {
        DISHONORED_2_CHARACTERS.add(Emily.getHero());
        DISHONORED_2_CHARACTERS.add(Corvo.getHero());
        DISHONORED_2_CHARACTERS.add(NewGamePlus.getHero());
    }

    private static final Dishonored2 DISHONORED_2 = new Dishonored2(DISHONORED_2_CHARACTERS);

    public static Dishonored2 getDISHONORED_2() {
        return DISHONORED_2;
    }
}
