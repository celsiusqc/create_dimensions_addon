package net.celsiusqc.cd_addon.item;

import net.celsiusqc.cd_addon.CreateDimensionsAddon;
import net.celsiusqc.cd_addon.base.ModArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateDimensionsAddon.MOD_ID);

    public static final RegistryObject<Item> SHATTERED_WARP_STONE = ITEMS.register("shattered_warp_stone",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> WARP_STONE = ITEMS.register("warp_stone",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> DIAMOND_DUST = ITEMS.register("diamond_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> AMETRINE_DUST = ITEMS.register("ametrine_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> BURNING = ITEMS.register("burning",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> WARM = ITEMS.register("warm",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> COMFY = ITEMS.register("comfy",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> COLD = ITEMS.register("cold",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> FREEZING = ITEMS.register("freezing",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));

    public static final RegistryObject<Item> AUTUMN = ITEMS.register("autumn",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> DRY = ITEMS.register("dry",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> SPRING = ITEMS.register("spring",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> SUMMER = ITEMS.register("summer",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> WET = ITEMS.register("wet",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> WINTER = ITEMS.register("winter",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));

    public static final RegistryObject<Item> GUNPOWDER_INFUSED_AMETRINE = ITEMS.register("gunpowder_infused_ametrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));

    public static final RegistryObject<Item> CRUSHED_VENTIUM_ORE = ITEMS.register("crushed_ventium_ore",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> CRUSHED_HORIZONITE_ORE = ITEMS.register("crushed_horizonite_ore",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> CRUSHED_FALSITE_ORE = ITEMS.register("crushed_falsite_ore",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> CRUSHED_CHAROITE_ORE = ITEMS.register("crushed_charoite_ore",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> CRUSHED_AQUITE_ORE = ITEMS.register("crushed_aquite_ore",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> WORM_GU = ITEMS.register("worm_gu",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));

    public static final RegistryObject<Item> UR_GHAST_HEART = ITEMS.register("ur_ghast_heart",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> ARMORED_GIANT_HEART = ITEMS.register("armored_giant_heart",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> SNOW_QUEEN_HEART = ITEMS.register("snow_queen_heart",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> COMPRESSED_HEARTS = ITEMS.register("compressed_hearts",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));


    public static final RegistryObject<SwordItem> VOID_WORM_SWORD = ITEMS.register("void_wormed_sword",
            () -> new SwordItem(ToolTiers.VOID_WORM, 12, -2.4f, props()));
                                                //Attack DMG Bonus from Base  - Attack Speed float -- Adds to the base of 1attack dmg, 4 attack speed

    public static final RegistryObject<AxeItem> VOID_WORM_AXE = ITEMS.register("void_wormed_axe",
            () -> new AxeItem(ToolTiers.VOID_WORM, 15, -3.0f, props()));

    public static class ToolTiers {
        public static final Tier VOID_WORM = new ForgeTier(
                4,
                2500,
                0,
                0,
                15,
                null,
                () -> Ingredient.of(ModItems.WORM_GU.get()));
    }
    //Wood is tier 0, stone/gold is 1, iron 2, diamond 3, netherite 4
    public static class ArmorTiers {
        public static final ArmorMaterial VOID_WORM = new ModArmorMaterial(
                "void_wormed",
                3000,
                new int[] {8, 12, 15, 8},
                15,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                1.7f,
                0.12f,
                () -> Ingredient.of(ModItems.WORM_GU.get()));
    }

    public static final RegistryObject<ArmorItem> VOID_WORM_HELMET = ITEMS.register("void_wormed_helmet",
            () -> new ArmorItem(ArmorTiers.VOID_WORM, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> VOID_WORM_CHESTPLATE = ITEMS.register("void_wormed_chestplate",
            () -> new ArmorItem(ArmorTiers.VOID_WORM, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> VOID_WORM_LEGGINGS = ITEMS.register("void_wormed_leggings",
            () -> new ArmorItem(ArmorTiers.VOID_WORM, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> VOID_WORM_BOOTS = ITEMS.register("void_wormed_boots",
            () -> new ArmorItem(ArmorTiers.VOID_WORM, EquipmentSlot.FEET, props()));

    private static Item.Properties props() {
        return new Item.Properties().tab(ModCreativeModTab.cd_addon);
    }

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
