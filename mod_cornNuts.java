/** code generated by Kinyoshi */
package net.minecraft.src;
import java.io.*;
import java.util.*;
import net.minecraft.client.Minecraft;

public class mod_cornNuts extends BaseMod
{

 public mod_cornNuts()
    {
    readWriteProperties();
    
ItemSaltedCocoaBeans = new ItemSaltedCocoaBeans(ItemSaltedCocoaBeansID).setUnlocalizedName("ItemSaltedCocoaBeans");
ItemSaltedCactusGreens = new ItemSaltedCactusGreens(ItemSaltedCactusGreensID).setUnlocalizedName("ItemSaltedCactusGreens");
ItemCornNuts = new ItemCornNuts(ItemCornNutsID, 3, 0.5F, false).setUnlocalizedName("ItemCornNuts");
ItemMelonCornNuts = new ItemMelonCornNuts(ItemMelonCornNutsID, 6, 0.5F, false).setUnlocalizedName("ItemMelonCornNuts");
ItemPumpkinCornNuts = new ItemPumpkinCornNuts(ItemPumpkinCornNutsID, 6, 0.5F, false).setUnlocalizedName("ItemPumpkinCornNuts");
ItemNetherWartCornNuts = new ItemNetherWartCornNuts(ItemNetherWartCornNutsID, 7, 0.6F, false).setUnlocalizedName("ItemNetherWartCornNuts");
ItemCocoaBeanCornNuts = new ItemCocoaBeanCornNuts(ItemCocoaBeanCornNutsID, 4, 0.7F, false).setUnlocalizedName("ItemCocoaBeanCornNuts");
ItemCactusCornNuts = new ItemCactusCornNuts(ItemCactusCornNutsID, 4, 0.7F, false).setUnlocalizedName("ItemCactusCornNuts");
ItemRedAppleCornNuts = new ItemRedAppleCornNuts(ItemRedAppleCornNutsID, 100, 1.0F, false).setUnlocalizedName("ItemRedAppleCornNuts");
ItemSlimeBallCornNuts = new ItemSlimeBallCornNuts(ItemSlimeBallCornNutsID, 3, 0.6F, false).setUnlocalizedName("ItemSlimeBallCornNuts");
ItemMagmaCreamCornNuts = new ItemMagmaCreamCornNuts(ItemMagmaCreamCornNutsID, 9, 0.6F, false).setUnlocalizedName("ItemMagmaCreamCornNuts");
ItemEyeOfEnderCornNuts = new ItemEyeOfEnderCornNuts(ItemEyeOfEnderCornNutsID, 9, 0.6F, false).setUnlocalizedName("ItemEyeOfEnderCornNuts");
ItemEnderPearlCornNuts = new ItemEnderPearlCornNuts(ItemEnderPearlCornNutsID, 9, 0.6F, false).setUnlocalizedName("ItemEnderPearlCornNuts");
ItemLilyPadCornNuts = new ItemLilyPadCornNuts(ItemLilyPadCornNutsID, 3, 0.7F, false).setUnlocalizedName("ItemLilyPadCornNuts");
        	      	
        	      	
        ModLoader.addName(ItemCornNuts, "Corn Nuts");
        ModLoader.addName(ItemMelonCornNuts, "Melon Corn Nuts");
        ModLoader.addName(ItemPumpkinCornNuts, "Pumpkin Corn Nuts");        
        ModLoader.addName(ItemNetherWartCornNuts, "Nether Wart Corn Nuts");
        ModLoader.addName(ItemCactusCornNuts, "Cocoa Bean Corn Nuts");
        ModLoader.addName(ItemCocoaBeanCornNuts, "Cactus Corn Nuts");
        ModLoader.addName(ItemSaltedCocoaBeans, "Salted Cocoa Beans");
        ModLoader.addName(ItemSaltedCactusGreens, "Salted Cactus Greens");
        ModLoader.addName(ItemRedAppleCornNuts, "Red Apple Corn Nuts");
        ModLoader.addName(ItemSlimeBallCornNuts, "Slime Ball Corn Nuts");
        ModLoader.addName(ItemMagmaCreamCornNuts, "Magma Cream Corn Nuts");
        ModLoader.addName(ItemEyeOfEnderCornNuts, "Eye of Ender Corn Nuts");
        ModLoader.addName(ItemEnderPearlCornNuts, "Ender Pearl Corn Nuts");
        ModLoader.addName(ItemLilyPadCornNuts, "Lily Pad Corn Nuts");
        
        ModLoader.addSmelting(Item.appleRed.itemID, new ItemStack(ItemRedAppleCornNuts), 0.1F);
        ModLoader.addSmelting(Item.slimeBall.itemID, new ItemStack(ItemSlimeBallCornNuts), 0.1F);
        ModLoader.addSmelting(Item.magmaCream.itemID, new ItemStack(ItemMagmaCreamCornNuts), 0.1F);
        ModLoader.addSmelting(Item.eyeOfEnder.itemID, new ItemStack(ItemEyeOfEnderCornNuts), 0.1F);
        ModLoader.addSmelting(Item.enderPearl.itemID, new ItemStack(ItemEnderPearlCornNuts), 0.1F);
        ModLoader.addSmelting(Block.waterlily.blockID, new ItemStack(ItemLilyPadCornNuts), 0.1F);
        ModLoader.addSmelting(Item.seeds.itemID, new ItemStack(ItemCornNuts), 0.1F);
        ModLoader.addSmelting(Item.melonSeeds.itemID, new ItemStack(ItemMelonCornNuts), 0.1F);
        ModLoader.addSmelting(Item.pumpkinSeeds.itemID, new ItemStack(ItemPumpkinCornNuts), 0.1F);
        ModLoader.addSmelting(Item.netherStalkSeeds.itemID, new ItemStack(ItemNetherWartCornNuts), 0.1F);
        ModLoader.addSmelting(ItemSaltedCactusGreens.itemID, new ItemStack(ItemCactusCornNuts), 0.1F);
        ModLoader.addSmelting(ItemSaltedCocoaBeans.itemID, new ItemStack(ItemCocoaBeanCornNuts), 0.1F);
        ModLoader.addRecipe(new ItemStack(ItemSaltedCocoaBeans, 1), new Object[] {"C", 'C', new ItemStack(Item.dyePowder,1,3)});
        ModLoader.addRecipe(new ItemStack(ItemSaltedCactusGreens, 1), new Object[] {"G", 'G', new ItemStack(Block.cactus)});

        }
        
	public void readWriteProperties() {
		Properties properties = new Properties();
		try
		{	
            File file = new File((new StringBuilder()).append(Minecraft.getMinecraftDir()).append("/mods/CornNuts.config").toString());
            boolean flag = file.createNewFile();
            if(flag)
            {
                FileOutputStream fileoutputstream = new FileOutputStream(file);
                properties.setProperty("ItemSaltedCocoaBeansID", Integer.toString(2220));
                properties.setProperty("ItemSaltedCactusGreensID", Integer.toString(2221));
                properties.setProperty("ItemCornNutsID", Integer.toString(2222));
                properties.setProperty("ItemMelonCornNutsID", Integer.toString(2223));
                properties.setProperty("ItemPumpkinCornNutsID", Integer.toString(2224));
                properties.setProperty("ItemNetherWartCornNutsID", Integer.toString(2225));
                properties.setProperty("ItemCocoaBeanCornNutsID", Integer.toString(2226));
                properties.setProperty("ItemCactusCornNutsID", Integer.toString(2227));
                properties.setProperty("ItemRedAppleCornNutsID", Integer.toString(2228));
                properties.setProperty("ItemSlimeBallCornNutsID", Integer.toString(2229));
                properties.setProperty("ItemMagmaCreamCornNutsID", Integer.toString(2230));
                properties.setProperty("ItemEyeOfEnderCornNutsID", Integer.toString(2231));
                properties.setProperty("ItemEnderPearlCornNutsID", Integer.toString(2232));
                properties.setProperty("ItemLilyPadCornNutsID", Integer.toString(2233));
                

                properties.store(fileoutputstream, "Change the ID's to fix ID incompatibilities.");
                fileoutputstream.close();
            }
            properties.load(new FileInputStream((new StringBuilder()).append(Minecraft.getMinecraftDir()).append("/mods/CornNuts.config").toString()));
            ItemSaltedCocoaBeansID = Integer.parseInt(properties.getProperty("ItemSaltedCocoaBeansID"));
            ItemSaltedCactusGreensID = Integer.parseInt(properties.getProperty("ItemSaltedCactusGreensID"));
            ItemCornNutsID = Integer.parseInt(properties.getProperty("ItemCornNutsID"));
            ItemMelonCornNutsID = Integer.parseInt(properties.getProperty("ItemMelonCornNutsID"));
            ItemPumpkinCornNutsID = Integer.parseInt(properties.getProperty("ItemPumpkinCornNutsID"));
            ItemNetherWartCornNutsID = Integer.parseInt(properties.getProperty("ItemNetherWartCornNutsID"));
            ItemCocoaBeanCornNutsID = Integer.parseInt(properties.getProperty("ItemCocoaBeanCornNutsID"));
            ItemCactusCornNutsID = Integer.parseInt(properties.getProperty("ItemCactusCornNutsID"));
            ItemRedAppleCornNutsID = Integer.parseInt(properties.getProperty("ItemRedAppleCornNutsID"));
            ItemSlimeBallCornNutsID = Integer.parseInt(properties.getProperty("ItemSlimeBallCornNutsID"));
            ItemMagmaCreamCornNutsID = Integer.parseInt(properties.getProperty("ItemMagmaCreamCornNutsID"));
            ItemEyeOfEnderCornNutsID = Integer.parseInt(properties.getProperty("ItemEyeOfEnderCornNutsID"));
            ItemEnderPearlCornNutsID = Integer.parseInt(properties.getProperty("ItemEnderPearlCornNutsID"));
            ItemLilyPadCornNutsID = Integer.parseInt(properties.getProperty("ItemLilyPadCornNutsID"));
        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
            ItemSaltedCocoaBeansID = 2220;
            ItemSaltedCactusGreensID = 2221;
            ItemCornNutsID = 2222;
            ItemMelonCornNutsID = 2223;
            ItemPumpkinCornNutsID = 2224;
            ItemNetherWartCornNutsID = 2225;
            ItemCocoaBeanCornNutsID = 2226;
            ItemCactusCornNutsID = 2227;
            ItemRedAppleCornNutsID = 2228;
            ItemSlimeBallCornNutsID = 2229;
            ItemMagmaCreamCornNutsID = 2230;
            ItemEyeOfEnderCornNutsID = 2231;
            ItemEnderPearlCornNutsID = 2232;
            ItemLilyPadCornNutsID = 2233;
        }
        
	}
	
   	public static Item ItemSaltedCocoaBeans;
	public static int ItemSaltedCocoaBeansID;
	public static Item ItemSaltedCactusGreens;
	public static int ItemSaltedCactusGreensID;
	public static Item ItemCornNuts;
	public static int ItemCornNutsID;
	public static Item ItemMelonCornNuts;
	public static int ItemMelonCornNutsID;
	public static Item ItemPumpkinCornNuts;
	public static int ItemPumpkinCornNutsID;
	public static Item ItemNetherWartCornNuts;
	public static int ItemNetherWartCornNutsID;
	public static Item ItemCocoaBeanCornNuts;
	public static int ItemCocoaBeanCornNutsID;
	public static Item ItemCactusCornNuts;
	public static int ItemCactusCornNutsID;
	public static Item ItemRedAppleCornNuts;
	public static int ItemRedAppleCornNutsID;
	public static Item ItemSlimeBallCornNuts;
	public static int ItemSlimeBallCornNutsID;
	public static Item ItemMagmaCreamCornNuts;
	public static int ItemMagmaCreamCornNutsID;
	public static Item ItemEyeOfEnderCornNuts;
	public static int ItemEyeOfEnderCornNutsID;
	public static Item ItemEnderPearlCornNuts;
	public static int ItemEnderPearlCornNutsID;
	public static Item ItemLilyPadCornNuts;
	public static int ItemLilyPadCornNutsID;
	
public String getVersion()
            {
			 return "MineCraft1.5.2__CornNuts1.5.2r1";
            }
            
    public void load()
    	{
    	}
}
