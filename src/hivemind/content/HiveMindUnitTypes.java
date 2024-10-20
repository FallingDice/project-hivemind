package hivemind.content;

import arc.graphics.Color;
import arc.util.Log;

import mindustry.content.Fx;
import mindustry.content.StatusEffects;
import mindustry.entities.Effect;
import mindustry.entities.bullet.*;

import mindustry.ai.types.GroundAI;

import mindustry.game.Team;
import mindustry.gen.*;

import mindustry.graphics.Layer;
import mindustry.graphics.Pal;

import mindustry.type.UnitType;
import mindustry.type.Weapon;

public class HiveMindUnitTypes {
    public static UnitType
  
        //ground
        testunit
  
    ;

    public static void load() {

      testunit = new UnitType("testunit"){{
            constructor = UnitEntity::create;

            immunities.add(StatusEffects.burning);
          
            speed = 0.7f;
            hitSize = 8f;
            health = 300;
            armor = 4f;

            weapons.add(new Weapon("large-weapon"){{
                reload = 13f;
                shootSound = Sounds.pew;
                x = 4f;
                y = 2f;
                top = false;
                ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(2.5f, 9){{
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                    pierce = true;
                    pierceBuilding = true;
                    pierceCap = 2;
                    statusDuration = 60f * 4;
                    shootEffect = Fx.shootSmallFlame;
                    hitEffect = Fx.hitFlameSmall;
                    status = StatusEffects.burning;
                }};
            }});
        }};

      //endregion
    }
}
