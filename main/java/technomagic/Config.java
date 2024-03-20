package technomagic;

import net.minecraftforge.common.ForgeConfigSpec;


public class Config {
	private static final ForgeConfigSpec.Builder GENERAL_BUILDER = new ForgeConfigSpec.Builder();
	public static final General GENERAL = new General(GENERAL_BUILDER);
	public static final ForgeConfigSpec GENERAL_SPEC = GENERAL_BUILDER.build();
	public static class General {
		public final ForgeConfigSpec.IntValue Min;
		public final ForgeConfigSpec.IntValue Max;
		General(ForgeConfigSpec.Builder builder) {
			builder.push("General");
			Min = builder.defineInRange("Min", 2, 1, 64);
			Max = builder.defineInRange("Max", 63, 1, 64);
			builder.pop();
		}
	}
}