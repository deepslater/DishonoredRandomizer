package deepslater.dishonoredmutator.game;

import java.util.HashMap;
import java.util.Map;

public class GameList {
    private static final Map<String, Game> inputToGame = new HashMap<>();

    static {
        // inputToGame.put("d1", Dishonored);
        // inputToGame.put("kod", KnifeOfDunwall);
        // inputToGame.put("tbw", BrigmoreWitches);
        inputToGame.put("d2", Dishonored2.getDISHONORED_2());
        // inputToGame.put("doto", DeathOfTheOutsider);
    }

    public static Game getGame(String input){
        return inputToGame.get(input);
    }
}
