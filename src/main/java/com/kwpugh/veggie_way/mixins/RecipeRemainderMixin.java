package com.kwpugh.veggie_way.mixins;

import com.kwpugh.veggie_way.api.CustomRecipeRemainder;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Recipe;
import net.minecraft.util.DefaultedList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Recipe.class)
public class RecipeRemainderMixin {
    @Redirect(at=@At("HEAD"),method="getRemainingStacks")
    public <C extends Inventory> DefaultedList<ItemStack> multipleStacks(C inventory) {
        DefaultedList<ItemStack> defaultedList = DefaultedList.ofSize(inventory.getInvSize(), ItemStack.EMPTY);

        for(int i = 0; i < defaultedList.size(); ++i) {
            Item item = inventory.getInvStack(i).getItem();
            if (item.hasRecipeRemainder()) {
                if (item instanceof CustomRecipeRemainder) {
                    defaultedList.set(i,((CustomRecipeRemainder) item).getRecipeRemainder(inventory.getInvStack(i)));
                }else {
                    defaultedList.set(i, new ItemStack(item.getRecipeRemainder()));
                }
            }
        }

        return defaultedList;
    }

}
