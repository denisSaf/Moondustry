package moondustry.content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;

public class MoonItems implements ContentList {
	public static Item chromium;

	@Override
	public void load() {
		chromium = new Item("chromium", Color.valueOf("FFE998")){{
			hardness = 2;
			cost = 0.667f;
		}};
	}
}