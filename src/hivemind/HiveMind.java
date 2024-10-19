package hivemind;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

import hivemind.content.*;

public class HiveMind extends Mod{

    public HiveMind(){
    }

    @Override
    public void loadContent(){
        HiveMindUnitTypes.load();
    }

}
