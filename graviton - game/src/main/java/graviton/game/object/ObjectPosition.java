package graviton.game.object;



/**
 * Created by Botan on 21/06/2015.
 */
public enum ObjectPosition {
    NO_EQUIPED(-1),
    AMULETTE(0),
    ARME(1),
    ANNEAU1(2),
    CEINTURE(3),
    ANNEAU2(4),
    BOTTES(5),
    COIFFE(6),
    CAPE(7),
    FAMILIER(8),
    DOFUS1(9),
    DOFUS2(10),
    DOFUS3(11),
    DOFUS4(12),
    DOFUS5(13),
    DOFUS6(14),
    BOUCLIER(15);

    public final int id;

    public int get(boolean real){
        if (!real && this.id >= 35 && this.id <= 57)
            return -1;
        return this.id;
    }
    ObjectPosition(int id) {
        this.id = id;
    }

    public static ObjectPosition get(int id) {
        if(id >= 35 && id <= 57)
            return NO_EQUIPED;
        for (ObjectPosition position : ObjectPosition.values())
            if (position.id == id)
                return position;
        return null;
    }
}
