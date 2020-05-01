package com.kwpugh.veggie_way.lists;

import net.minecraft.item.FoodComponent;

public class FoodList {

    static int chocolateBarHunger = VeggieWayConfig.chocolate_bar_hunger.get();
    static int chocolateBarSaturation = VeggieWayConfig.chocolate_bar_saturation.get();

    static int cactusChunkHunger = VeggieWayConfig.cactus_chunk_hunger.get();
    static int cactusChunkSaturation = VeggieWayConfig.cactus_chunk_saturation.get();

    static int melonChunkHunger = VeggieWayConfig.melon_chunk_hunger.get();
    static int melonChunkSaturation = VeggieWayConfig.melon_chunk_saturation.get();

    static int pumpkinChunkHunger = VeggieWayConfig.pumpkin_chunk_hunger.get();
    static int pumpkinChunkSaturation = VeggieWayConfig.pumpkin_chunk_saturation.get();

    static int applePieHunger = VeggieWayConfig.apple_pie_hunger.get();
    static int applePieSaturation = VeggieWayConfig.apple_pie_saturation.get();

    static int melonPieHunger = VeggieWayConfig.melon_pie_hunger.get();
    static int melonPieSaturation = VeggieWayConfig.melon_pie_saturation.get();

    static int berryPieHunger = VeggieWayConfig.berry_pie_hunger.get();
    static int berryPieSaturation = VeggieWayConfig.berry_pie_saturation.get();

    static int pumpkinSoupHunger = VeggieWayConfig.pumpkin_soup_hunger.get();
    static int pumpkinSoupSaturation = VeggieWayConfig.pumpkin_soup_saturation.get();

    static int melonSoupHunger = VeggieWayConfig.melon_soup_hunger.get();
    static int melonSoupSaturation = VeggieWayConfig.cactus_soup_saturation.get();

    static int cactusSoupHunger = VeggieWayConfig.cactus_soup_hunger.get();
    static int cactusSoupSaturation = VeggieWayConfig.cactus_soup_saturation.get();

    static int carrotSoupHunger = VeggieWayConfig.carrot_soup_hunger.get();
    static int carrotSoupSaturation = VeggieWayConfig.carrot_soup_saturation.get();

    static int superPetalsHunger = VeggieWayConfig.super_petals_hunger.get();
    static int superPetalsSaturation = VeggieWayConfig.super_petals_saturation.get();

    static int energyDrinkHunger = VeggieWayConfig.energy_drink_hunger.get();
    static int energyDrinkSaturation = VeggieWayConfig.energy_drink_saturation.get();

    static int shakeHunger = VeggieWayConfig.shake_hunger.get();
    static int shakeSaturation = VeggieWayConfig.shake_saturation.get();

    static int smoothieHunger = VeggieWayConfig.smoothie_hunger.get();
    static int smoothieSaturation = VeggieWayConfig.smoothie_saturation.get();

    static int energyBarHunger = VeggieWayConfig.energyBar_hunger.get();
    static int energyBarSaturation = VeggieWayConfig.energyBar_saturation.get();

    static int superFoodHunger = VeggieWayConfig.superFoodBar_hunger.get();
    static int superFoodSaturation = VeggieWayConfig.superFoodBar_saturation.get();

    public static FoodComponent chocolate_bar = (new FoodComponent.Builder()).hunger(chocolateBarHunger).saturationModifier(chocolateBarSaturation).alwaysEdible().snack().build();
    public static FoodComponent cactus_chunk = (new FoodComponent.Builder()).hunger(cactusChunkHunger).saturationModifier(cactusChunkSaturation).alwaysEdible().snack().build();
    public static FoodComponent pumpkin_chunk = (new FoodComponent.Builder()).hunger(pumpkinChunkHunger).saturationModifier(pumpkinChunkSaturation).alwaysEdible().snack().build();
    public static FoodComponent melon_chunk = (new FoodComponent.Builder()).hunger(melonChunkHunger).saturationModifier(melonChunkSaturation).alwaysEdible().snack().build();

    public static FoodComponent apple_pie = (new FoodComponent.Builder()).hunger(applePieHunger).saturationModifier(applePieSaturation).alwaysEdible().snack().build();
    public static FoodComponent melon_pie = (new FoodComponent.Builder()).hunger(melonPieHunger).saturationModifier(melonPieSaturation).alwaysEdible().snack().build();
    public static FoodComponent sweet_berry_pie = (new FoodComponent.Builder()).hunger(berryPieHunger).saturationModifier(berryPieSaturation).alwaysEdible().snack().build();

    public static FoodComponent pumpkin_soup = (new FoodComponent.Builder()).hunger(pumpkinSoupHunger).saturationModifier(pumpkinSoupSaturation).alwaysEdible().snack().build();
    public static FoodComponent cactus_soup = (new FoodComponent.Builder()).hunger(cactusSoupHunger).saturationModifier(cactusSoupSaturation).alwaysEdible().snack().build();
    public static FoodComponent melon_soup = (new FoodComponent.Builder()).hunger(melonSoupHunger).saturationModifier(melonSoupSaturation).alwaysEdible().snack().build();
    public static FoodComponent carrot_soup = (new FoodComponent.Builder()).hunger(carrotSoupHunger).saturationModifier(carrotSoupSaturation).alwaysEdible().snack().build();

    public static FoodComponent super_petals = (new FoodComponent.Builder()).hunger(superPetalsHunger).saturationModifier(superPetalsSaturation).alwaysEdible().snack().build();

    public static FoodComponent energy_drink = (new FoodComponent.Builder()).hunger(energyDrinkHunger).saturationModifier(energyDrinkSaturation).alwaysEdible().snack().build();
    public static FoodComponent superfood_shake = (new FoodComponent.Builder()).hunger(shakeHunger).saturationModifier(shakeSaturation).alwaysEdible().snack().build();
    public static FoodComponent superfood_smoothie = (new FoodComponent.Builder()).hunger(smoothieHunger).saturationModifier(smoothieSaturation).alwaysEdible().snack().build();

    public static FoodComponent energy_bar = (new FoodComponent.Builder()).hunger(energyBarHunger).saturationModifier(energyBarSaturation).alwaysEdible().snack().build();
    public static FoodComponent superfood_bar = (new FoodComponent.Builder()).hunger(superFoodHunger).saturationModifier(superFoodSaturation).alwaysEdible().snack().build();
}
