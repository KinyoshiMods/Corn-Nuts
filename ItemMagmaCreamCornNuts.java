package net.minecraft.src;

public class ItemMagmaCreamCornNuts extends ItemFood
{
    public ItemMagmaCreamCornNuts(int par1, int par2, float par3, boolean par4)
    {
        super(par1, par2, par3, par4);
        this.setPotionEffect(Potion.fireResistance.id, 600, 0, 0.6f);
    }

}