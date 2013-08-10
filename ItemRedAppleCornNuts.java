package net.minecraft.src;

public class ItemRedAppleCornNuts extends ItemFood
{


    public ItemRedAppleCornNuts(int par1, int par2, float par3, boolean par4)
    {
        super(par1, par2, par3, par4);
        this.setPotionEffect(Potion.heal.id, 1, 0, 1.0f);
    }


}