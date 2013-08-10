package net.minecraft.src;

public class ItemLilyPadCornNuts extends ItemFood
{


    public ItemLilyPadCornNuts(int par1, int par2, float par3, boolean par4)
    {
        super(par1, par2, par3, par4);
        this.setPotionEffect(Potion.waterBreathing.id, 300, 0, 0.7f);
    }



}