package artifacts.common.init;

import artifacts.Artifacts;
import artifacts.client.model.ModelPanicNecklace;
import artifacts.client.model.ModelUltimatePendant;
import artifacts.common.item.*;
import baubles.api.BaubleType;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    public static final BaubleBase SHINY_RED_BALLOON = new BaublePotionEffect("shiny_red_balloon", BaubleType.CHARM, MobEffects.JUMP_BOOST, 1).setEquipSound(SoundEvents.ENTITY_ITEM_PICKUP, 0.5F);
    public static final BaubleBase SNORKEL = new BaublePotionEffect("snorkel", BaubleType.HEAD, MobEffects.WATER_BREATHING, 0).setEquipSound(SoundEvents.ITEM_ARMOR_EQUIP_LEATHER);
    public static final BaubleBase SHOCK_PENDANT = new BaubleAmulet("shock_pendant", new ResourceLocation(Artifacts.MODID, "textures/entity/layer/shock_pendant.png")).setEquipSound(SoundEvents.ITEM_ARMOR_EQUIP_CHAIN);
    public static final BaubleBase FLAME_PENDANT = new BaubleAmulet("flame_pendant", new ResourceLocation(Artifacts.MODID, "textures/entity/layer/flame_pendant.png")).setEquipSound(SoundEvents.ITEM_ARMOR_EQUIP_CHAIN);
    public static final BaubleBase THORN_PENDANT = new BaubleAmulet("thorn_pendant", new ResourceLocation(Artifacts.MODID, "textures/entity/layer/thorn_pendant.png")).setEquipSound(SoundEvents.ITEM_ARMOR_EQUIP_CHAIN);
    public static final BaubleBase PANIC_NECKLACE = new BaubleAmulet("panic_necklace", new ResourceLocation(Artifacts.MODID, "textures/entity/layer/panic_necklace.png")).setModel(new ModelPanicNecklace()).setEquipSound(SoundEvents.ITEM_ARMOR_EQUIP_CHAIN);
    public static final BaubleBase ULTIMATE_PENDANT = new BaubleAmulet("ultimate_pendant", new ResourceLocation(Artifacts.MODID, "textures/entity/layer/ultimate_pendant.png")).setModel(new ModelUltimatePendant()).setEquipSound(SoundEvents.ITEM_ARMOR_EQUIP_CHAIN);
    public static final BaubleBase LUCKY_HORSESHOE = new BaubleBase("lucky_horseshoe", BaubleType.CHARM).setEquipSound(SoundEvents.ITEM_ARMOR_EQUIP_GOLD);
    public static final BaubleBase COBALT_SHIELD = new BaubleBase("cobalt_shield", BaubleType.CHARM).setEquipSound(SoundEvents.ITEM_ARMOR_EQUIP_IRON);
    public static final BaubleBase OBSIDIAN_SKULL = new BaubleObsidianSkull();
    public static final BaubleBase WHOOPIE_CUSHION = new BaubleWhoopieCushion().setEquipSound(ModSoundEvents.FART);
    public static final BaubleBase BOTTLED_CLOUD = new BaubleBottledCloud("bottled_cloud", false).setEquipSound(SoundEvents.ITEM_BOTTLE_FILL_DRAGONBREATH);
    public static final BaubleBase BOTTLED_FART = new BaubleBottledCloud("bottled_fart", true).setEquipSound(SoundEvents.ITEM_BOTTLE_FILL_DRAGONBREATH);
    public static final BaubleBase MAGMA_STONE = new BaubleBase("magma_stone", BaubleType.RING).setEquipSound(SoundEvents.ITEM_ARMOR_EQUIP_LEATHER);
    public static final BaubleBase FERAL_CLAWS = new AttributeModifierBauble("feral_claws", BaubleType.RING, AttributeModifierBauble.ExtendedAttributeModifier.ATTACK_SPEED).setEquipSound(SoundEvents.ITEM_ARMOR_EQUIP_GENERIC);
    public static final BaubleBase POWER_GLOVE = new AttributeModifierBauble("power_glove", BaubleType.RING, AttributeModifierBauble.ExtendedAttributeModifier.ATTACK_DAMAGE).setEquipSound(SoundEvents.ITEM_ARMOR_EQUIP_LEATHER);
    public static final BaubleBase MECHANICAL_GLOVE = new AttributeModifierBauble("mechanical_glove", BaubleType.RING, AttributeModifierBauble.ExtendedAttributeModifier.ATTACK_SPEED, AttributeModifierBauble.ExtendedAttributeModifier.ATTACK_DAMAGE).setEquipSound(SoundEvents.ITEM_ARMOR_EQUIP_IRON);
    public static final BaubleBase FIRE_GAUNTLET = new AttributeModifierBauble("fire_gauntlet", BaubleType.RING, AttributeModifierBauble.ExtendedAttributeModifier.ATTACK_SPEED, AttributeModifierBauble.ExtendedAttributeModifier.ATTACK_DAMAGE).setEquipSound(SoundEvents.ITEM_ARMOR_EQUIP_IRON);
    public static final BaubleBase DRINKING_HAT = new BaubleBase("drinking_hat", BaubleType.HEAD).setEquipSound(SoundEvents.ITEM_BOTTLE_FILL);
    public static final BaubleBase STAR_CLOAK = new BaubleStarCloak().setEquipSound(SoundEvents.ITEM_ARMOR_EQUIP_LEATHER);
    public static final BaubleBase POCKET_PISTON = new BaubleBase("pocket_piston", BaubleType.RING).setEquipSound(SoundEvents.BLOCK_PISTON_EXTEND, SoundEvents.BLOCK_PISTON_CONTRACT);
    public static final BaubleBase NIGHT_VISION_GOGGLES = new BaublePotionEffect("night_vision_goggles", BaubleType.HEAD, MobEffects.NIGHT_VISION, 0, 300).setEquipSound(SoundEvents.ITEM_ARMOR_EQUIP_LEATHER);
    public static BaubleBase TINY_SHIRT;

    public static final ItemEverlastingFood EVERLASTING_PORKCHOP = new ItemEverlastingFood("everlasting_porkchop", 3, 0.3F);
    public static final ItemEverlastingFood EVERLASTING_COOKED_PORKCHOP = new ItemEverlastingFood("everlasting_cooked_porkchop", 8, 0.8F);
    public static final ItemEverlastingFood EVERLASTING_BEEF = new ItemEverlastingFood("everlasting_beef", 3, 0.3F);
    public static final ItemEverlastingFood EVERLASTING_COOKED_BEEF = new ItemEverlastingFood("everlasting_cooked_beef", 8, 0.8F);
    public static final ItemEverlastingFood EVERLASTING_CHICKEN = (ItemEverlastingFood) new ItemEverlastingFood("everlasting_chicken", 2, 0.3F).setPotionEffect(new PotionEffect(MobEffects.HUNGER, 600, 0), 0.3F);
    public static final ItemEverlastingFood EVERLASTING_COOKED_CHICKEN = new ItemEverlastingFood("everlasting_cooked_chicken", 6, 0.6F);
    public static final ItemEverlastingFood EVERLASTING_ROTTEN_FLESH = (ItemEverlastingFood) new ItemEverlastingFood("everlasting_rotten_flesh", 4, 0.1F).setPotionEffect(new PotionEffect(MobEffects.HUNGER, 600, 0), 0.8F);
    public static final ItemEverlastingFood EVERLASTING_SPIDER_EYE = (ItemEverlastingFood) new ItemEverlastingFood("everlasting_spider_eye", 2, 0.8F).setPotionEffect(new PotionEffect(MobEffects.POISON, 100, 0), 1);
    public static final ItemEverlastingFood EVERLASTING_RABBIT = new ItemEverlastingFood("everlasting_rabbit", 3, 0.3F);
    public static final ItemEverlastingFood EVERLASTING_COOKED_RABBIT = new ItemEverlastingFood("everlasting_cooked_rabbit", 5, 0.6F);
    public static final ItemEverlastingFood EVERLASTING_MUTTON = new ItemEverlastingFood("everlasting_mutton", 2, 0.3F);
    public static final ItemEverlastingFood EVERLASTING_COOKED_MUTTON = new ItemEverlastingFood("everlasting_cooked_mutton", 6, 0.8F);
    public static final ItemEverlastingFood EVERLASTING_RABBIT_STEW = new ItemEverlastingFood("everlasting_rabbit_stew", 10, 0.6F);
    public static final ItemEverlastingFood EVERLASTING_COD = new ItemEverlastingFood("everlasting_cod", 2, 0.1F);
    public static final ItemEverlastingFood EVERLASTING_COOKED_COD = new ItemEverlastingFood("everlasting_cooked_cod", 5, 0.6F);
    public static final ItemEverlastingFood EVERLASTING_SALMON = new ItemEverlastingFood("everlasting_salmon", 2, 0.1F);
    public static final ItemEverlastingFood EVERLASTING_COOKED_SALMON = new ItemEverlastingFood("everlasting_cooked_salmon", 6, 0.8F);
    public static final ItemEverlastingFood EVERLASTING_CLOWNFISH = new ItemEverlastingFood("everlasting_clownfish", 1, 0.1F);

    public static void registerItems(IForgeRegistry<Item> registry) {
        TINY_SHIRT = new BaubleTinyShirt().setEquipSound(SoundEvents.ITEM_ARMOR_EQUIP_GENERIC);

        registry.registerAll(
                SHINY_RED_BALLOON,
                OBSIDIAN_SKULL,
                SNORKEL,
                SHOCK_PENDANT,
                FLAME_PENDANT,
                THORN_PENDANT,
                ULTIMATE_PENDANT,
                PANIC_NECKLACE,
                LUCKY_HORSESHOE,
                COBALT_SHIELD,
                WHOOPIE_CUSHION,
                BOTTLED_CLOUD,
                BOTTLED_FART,
                MAGMA_STONE,
                FERAL_CLAWS,
                POWER_GLOVE,
                MECHANICAL_GLOVE,
                FIRE_GAUNTLET,
                DRINKING_HAT,
                STAR_CLOAK,
                POCKET_PISTON,
                NIGHT_VISION_GOGGLES,
                TINY_SHIRT,

                EVERLASTING_PORKCHOP,
                EVERLASTING_COOKED_PORKCHOP,
                EVERLASTING_BEEF,
                EVERLASTING_COOKED_BEEF,
                EVERLASTING_CHICKEN,
                EVERLASTING_COOKED_CHICKEN,
                EVERLASTING_ROTTEN_FLESH,
                EVERLASTING_SPIDER_EYE,
                EVERLASTING_RABBIT,
                EVERLASTING_COOKED_RABBIT,
                EVERLASTING_MUTTON,
                EVERLASTING_COOKED_MUTTON,
                EVERLASTING_RABBIT_STEW,
                EVERLASTING_COD,
                EVERLASTING_COOKED_COD,
                EVERLASTING_SALMON,
                EVERLASTING_COOKED_SALMON,
                EVERLASTING_CLOWNFISH
        );
    }

    public static void registerModels() {
        SHINY_RED_BALLOON.registerModel();
        OBSIDIAN_SKULL.registerModel();
        SNORKEL.registerModel();
        SHOCK_PENDANT.registerModel();
        FLAME_PENDANT.registerModel();
        THORN_PENDANT.registerModel();
        ULTIMATE_PENDANT.registerModel();
        LUCKY_HORSESHOE.registerModel();
        COBALT_SHIELD.registerModel();
        PANIC_NECKLACE.registerModel();
        WHOOPIE_CUSHION.registerModel();
        BOTTLED_CLOUD.registerModel();
        BOTTLED_FART.registerModel();
        MAGMA_STONE.registerModel();
        FERAL_CLAWS.registerModel();
        POWER_GLOVE.registerModel();
        MECHANICAL_GLOVE.registerModel();
        FIRE_GAUNTLET.registerModel();
        DRINKING_HAT.registerModel();
        STAR_CLOAK.registerModel();
        POCKET_PISTON.registerModel();
        NIGHT_VISION_GOGGLES.registerModel();
        TINY_SHIRT.registerModel();

        EVERLASTING_PORKCHOP.registerModel();
        EVERLASTING_COOKED_PORKCHOP.registerModel();
        EVERLASTING_BEEF.registerModel();
        EVERLASTING_COOKED_BEEF.registerModel();
        EVERLASTING_CHICKEN.registerModel();
        EVERLASTING_COOKED_CHICKEN.registerModel();
        EVERLASTING_ROTTEN_FLESH.registerModel();
        EVERLASTING_SPIDER_EYE.registerModel();
        EVERLASTING_RABBIT.registerModel();
        EVERLASTING_COOKED_RABBIT.registerModel();
        EVERLASTING_MUTTON.registerModel();
        EVERLASTING_COOKED_MUTTON.registerModel();
        EVERLASTING_RABBIT_STEW.registerModel();
        EVERLASTING_COD.registerModel();
        EVERLASTING_COOKED_COD.registerModel();
        EVERLASTING_SALMON.registerModel();
        EVERLASTING_COOKED_SALMON.registerModel();
        EVERLASTING_CLOWNFISH.registerModel();
    }
}
