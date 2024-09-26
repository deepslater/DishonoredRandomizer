package deepslater.dishonoredmutator.game;

import deepslater.dishonoredmutator.DishonoredMutator;
import deepslater.dishonoredmutator.hero.Hero;
import deepslater.dishonoredmutator.hero.NewGamePlus;
import deepslater.dishonoredmutator.tools.Lethality;
import deepslater.dishonoredmutator.tools.Loudness;
import deepslater.dishonoredmutator.tools.Axis;
import deepslater.dishonoredmutator.tools.Tool;
import deepslater.dishonoredmutator.tools.power.ActivePower;
import deepslater.dishonoredmutator.tools.power.PassivePower;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;

public abstract class Game {
    private final Set<Hero> CHARACTERS;
    protected Game(Set<Hero> characters) {
        this.CHARACTERS = characters;
    }

    public void generate() {
        Hero selectedHero = selectHero();
        if (!Objects.equals(selectedHero.getDisplayName(), "NG+")) {
            System.out.println("Character: " + selectedHero.getDisplayName());
        }

        Lethality selectedLethality = generateAxis(Lethality.class);
        Loudness selectedLoudness = generateAxis(Loudness.class);
        System.out.println("Playstyle: " + generateQuadrant(selectedLethality, selectedLoudness));

        selectActivePowers(selectedHero, selectedLethality, selectedLoudness);
        selectPassivePowers(selectedHero, selectedLethality, selectedLoudness);
    }

    private Hero selectHero() {
        if (CHARACTERS.size() == 1) {
            return CHARACTERS.stream().findFirst().orElseThrow();
        } else {
            System.out.println("Are you starting New Game Plus? Y/N");
            while (true) {
                String input = DishonoredMutator.scanner.next().trim().toLowerCase();
                if (input.equals("y")) {
                    return NewGamePlus.getHero();
                } else if (input.equals("n")) {
                    CHARACTERS.remove(NewGamePlus.getHero());
                    return CHARACTERS.stream()
                            .skip(DishonoredMutator.getRandomNumber(2))
                            .findFirst().orElseThrow();
                } else {
                    System.out.println("You have entered something other than Y or N.");
                }
            }
        }
    }

    private <E extends Enum<E>> E generateAxis(Class<E> randomStat) {
        E[] constants = randomStat.getEnumConstants();
        int random = DishonoredMutator.getRandomNumber(2);
        return constants[random];
    }

    private String generateQuadrant(Lethality lethality, Loudness loudness) {
        String lethalityDisplayName = lethality.getDISPLAY_NAME();
        String loudnessDisplayName = loudness.getDISPLAY_NAME();
        return lethalityDisplayName + " " + loudnessDisplayName;
    }

    private void selectActivePowers(Hero hero, Lethality lethality, Loudness loudness) {
        Set<ActivePower> set = new HashSet<>(hero.getHeroActivePowers());
        removeAxis(set, lethality);
        removeAxis(set, loudness);

        System.out.println("Active Powers:");
        for (int random = DishonoredMutator.RANDOM.nextInt(2, 4); random > 0; random--) {
            ActivePower selectedPower = set.stream()
                    .skip(DishonoredMutator.RANDOM.nextInt(set.size()))
                    .findFirst()
                    .orElseThrow();
            System.out.print(" | ");
            System.out.print(selectedPower.getDisplayName() + " | ");
            set.remove(selectedPower);
        }
        System.out.println();
    }

    private void selectPassivePowers(Hero hero, Lethality lethality, Loudness loudness) {
        Set<PassivePower> set = new HashSet<>(hero.getHeroPassivePowers());
        removeAxis(set, lethality);
        removeAxis(set, loudness);

        System.out.println("Passive Powers:");
        for (int random = DishonoredMutator.RANDOM.nextInt(3, 4); random > -1; random--) {
            PassivePower selectedPower = set.stream()
                    .skip(DishonoredMutator.RANDOM.nextInt(set.size()))
                    .findFirst()
                    .orElse(null);
            System.out.print(" | ");
            System.out.print(selectedPower.getDisplayName() + " | ");
            set.remove(selectedPower);
        }
        System.out.println();
    }

    private <T extends Tool> void removeAxis(Set<T> set, Lethality lethality) {
        Predicate<Tool> byAxis = tool -> tool.getToolLethality() == Axis.getInverse(lethality);
        set.removeIf(byAxis);
    }

    private <T extends Tool> void removeAxis(Set<T> set, Loudness loudness) {
        Predicate<Tool> byAxis = tool -> tool.getToolLoudness() == Axis.getInverse(loudness);
        set.removeIf(byAxis);
    }
}