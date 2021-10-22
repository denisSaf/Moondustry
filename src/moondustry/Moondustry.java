package moondustry;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ctype.*;

import moondustry.content.*;

public class Moondustry extends Mod {
    private final ContentList[] contents = {
        new MoonItems(),
        new MoonTree(),
        new MoonBlocks()
    };

    @Override
    public void init() {
        Log.info("[Moondustry]: Mod successfully loaded.");
    }

    @Override
    public void loadContent() {
        for(ContentList list : contents) {
            list.load();
        }
    }
}