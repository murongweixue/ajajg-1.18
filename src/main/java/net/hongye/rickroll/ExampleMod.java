package net.hongye.rickroll;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.hongye.rickroll.register.EventRgister;
import net.hongye.rickroll.register.ItemRegister;
import net.minecraft.block.BlockState;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {

	// an instance of our new item


	public static final Logger LOGGER = LoggerFactory.getLogger("rickroll");

	@Override
	public void onInitialize() {

		ItemRegister.registerItems();

		LOGGER.info("Hello Fabric world!");

		UseBlockCallback.EVENT.register((player, world, hand, hitResult) ->
		{
			BlockHitResult blockHitResult = (BlockHitResult) hitResult;
            /* Manual spectator check is necessary because AttackBlockCallbacks
               fire before the spectator check */
			//if (!player.isSpectator() &&
					//player.getMainHandStack().isEmpty())

			player.damage(DamageSource.GENERIC, 1.0F);

			return ActionResult.FAIL;
		});
	}

		;
}
