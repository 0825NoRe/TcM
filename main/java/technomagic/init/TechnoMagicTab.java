package main.java.technomagic.init;

import technomagic.TechnoMagic;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;


@Mod.EventBusSubscriber(modid = "technomagic", bus = Mod.EventBusSubscriber.Bus.MOD)
public class TechnoMagicTab {
	public static final DeferredRegister<CreativeModeTab> CMTAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "technomagic");
	public static final RegistryObject<CreativeModeTab> TAB = CMTAB.register("technomagic", () -> CreativeModeTab.builder()
		        .title(Component.translatable("item_group.technomagic.tab"))
				.icon(() -> new ItemStack(Items.WRITABLE_BOOK))
				.displayItems((parameters, group) -> {
                group.accept(WRITABLE_BOOK.get());//test
		        })
				.build());
}
/*
as blocks: tabData.accept(DongdongmodModBlocks.SPHENE_BRICK.get().asItem());
at blocks: public static final RegistryObject<Block> COOLER = REGISTRY.register("cooler", () -> new CoolerBlock());

as items: tabData.accept(DongdongmodModItems.LAVA_DETECTOR.get());
at items: public static final RegistryObject<Item> DONGDONGBAG = REGISTRY.register("dongdongbag", () -> new DongdongbagItem());
*/