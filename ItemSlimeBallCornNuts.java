package net.minecraft.src;

public class ItemSlimeBallCornNuts extends ItemFood
{


    public ItemSlimeBallCornNuts(int par1, int par2, float par3, boolean par4)
    {
        super(par1, par2, par3, par4);
        this.setPotionEffect(Potion.jump.id, 300, 1, 0.6f);
    }


}