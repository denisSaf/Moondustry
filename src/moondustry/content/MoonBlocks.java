package moondustry.content;

import arc.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.struct.*;
import mindustry.content.*;
import mindustry.ctype.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.experimental.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import moondustry.content.MoonItems.*;

import static mindustry.type.ItemStack.*;

public class MoonBlocks implements ContentList {
	public static Block 
	// defense
	smallChromiumWall, largeChromiumWall,

	// production
	chromiumCompressor;

	@Override
	public void load() {
		// defense zone
		smallChromiumWall = new Wall("smallChromiumWall") {{
			requirements(Category.defense, with(MoonItems.chromium, 6));
			health = 750;
		}};
		largeChromiumWall = new Wall("largeChromiumWall") {{
			requirements(Category.defense, with(MoonItems.chromium, 24));
			size = 2;
			health = 2950;
		}};

		// production zone
		chromiumCompressor = new GenericSmelter("chromium-compressor"){{
            requirements(Category.crafting, with(Items.titanium, 140, Items.copper, 1200, Items.graphite, 150));

            health = 350;
            size = 3;
            hasPower = true;
            hasLiquids = false;
            hasItems = true;
            craftTime = 110;
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(MoonItems.chromium, 1);

            consumes.power(2.0f);
            consumes.items(with(Items.metaglass, 3, Items.silicon, 6, Items.titanium, 2));
        }};
	}
}