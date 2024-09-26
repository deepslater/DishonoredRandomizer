package deepslater.dishonoredmutator.tools.power;

import deepslater.dishonoredmutator.tools.Lethality;
import deepslater.dishonoredmutator.tools.Loudness;
import deepslater.dishonoredmutator.tools.Tool;

abstract class Power extends Tool {
    public Power(String displayName, Lethality toolLethality, Loudness toolLoudness) {
        super(displayName, toolLethality, toolLoudness);
    }
}
