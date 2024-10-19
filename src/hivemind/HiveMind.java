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
        //모드 초기화 코드
    }

    @Override
    public void loadContent(){
        //콘텐츠 로드 코드
        HiveMindUnitTypes.load();
    }

}
