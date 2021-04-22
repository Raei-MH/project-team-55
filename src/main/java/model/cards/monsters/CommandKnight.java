package model.cards.monsters;

import model.cards.MonsterAttribute;
import model.cards.KindOfMonster;

import static model.cards.MonsterAttribute.*;
import static model.cards.KindOfMonster.*;

public class CommandKnight {

    private String name = "Command Knight";
    private int level = 4;
    private MonsterAttribute attribute = Fire;
    private String monsterType = "Warrior";
    private KindOfMonster kindOfMonster = Effect;
    private int atk = 1000;
    private int def = 1000;
    private static final String description = "All Warrior-Type monsters you control gain 400 ATK. If you control another monster, monsters your opponent controls cannot target this card for an attack.";
    private int price = 2100 ;


}
