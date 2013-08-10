package net.minecraft.src;

public class ItemCactusCornNuts extends ItemFood
{

    public ItemCactusCornNuts(int par1, int par2, float par3, boolean par4)
    {
        super(par1, par2, par3, par4);
        this.setPotionEffect(Potion.moveSpeed.id, 300, 0, 0.7f);
    }



}