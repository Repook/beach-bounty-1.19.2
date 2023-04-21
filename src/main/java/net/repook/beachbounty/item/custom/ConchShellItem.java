package net.repook.beachbounty.item.custom;


import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.repook.beachbounty.sound.ModSounds;


public class ConchShellItem extends Item {
    public ConchShellItem(Settings settings) {
        super(settings);
    }


    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        if (!world.isClient()){
            user.playSound(ModSounds.TOOT_CONCH,1.0F, 1.0F);
            user.getItemCooldownManager().set(this,20);
        }

        return super.use(world, user, hand);

    }
    private void outputRandomNumber(PlayerEntity player){
        player.sendMessage(Text.literal("Your number is "+ getRandomNumber()));
    }

    private int getRandomNumber(){
        return Random.createLocal().nextInt(10);
    }
}
//if (!world.isClient() && hand == Hand.MAIN_HAND){
//world.playSound (user, user.getX(), user.getY(), user.getZ(), SoundEvents.BLOCK_ANVIL_DESTROY, SoundCategory.PLAYERS, 1.0f, 1.0f);


//outputRandomNumber(user);
//user.getItemCooldownManager().set(this,20);

//}


