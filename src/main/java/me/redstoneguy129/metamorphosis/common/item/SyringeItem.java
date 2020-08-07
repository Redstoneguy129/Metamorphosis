package me.redstoneguy129.metamorphosis.common.item;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;

public class SyringeItem extends Item {

    public SyringeItem() {
        super(new Item.Properties().maxStackSize(1));
    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if(attacker.isSneaking()) {
            CompoundNBT tagData = stack.getOrCreateChildTag("metamorphosis");
            if(target instanceof PlayerEntity) {
                tagData.putUniqueId("entity", target.getUniqueID());
            } else {
                tagData.putString("entity", String.valueOf(EntityType.getKey(target.getType())));
            }
        }
        return super.hitEntity(stack, target, attacker);
    }
}
