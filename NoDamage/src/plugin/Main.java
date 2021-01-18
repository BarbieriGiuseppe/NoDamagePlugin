package plugin;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	
		
		@Override
		public void onEnable() {
			 System.out.println("\r\n"
			 		+ "___  ___          _       ______        ______     _____ _                     \r\n"
			 		+ "|  \\/  |         | |      | ___ \\       | ___ \\   /  ___| |                    \r\n"
			 		+ "| .  . | __ _  __| | ___  | |_/ /_   _  | |_/ /___\\ `--.| |_ __ _ _ __         \r\n"
			 		+ "| |\\/| |/ _` |/ _` |/ _ \\ | ___ \\ | | | |    // _ \\`--. \\ __/ _` | '__|        \r\n"
			 		+ "| |  | | (_| | (_| |  __/ | |_/ / |_| | | |\\ \\  __/\\__/ / || (_| | |           \r\n"
			 		+ "\\_|  |_/\\__,_|\\__,_|\\___| \\____/ \\__, | \\_| \\_\\___\\____/ \\__\\__,_|_|           \r\n"
			 		+ "                                  __/ |                          ______ ______ \r\n"
			 		+ "                                 |___/                          |______|______|\r\n"
			 		+ "");
					
		}
		
		@Override
		public void onDisable() {
			System.out.println("Plugin Disabilitato");
		}
		
		public void onPlayerEvent(EntityDamageByEntityEvent pint) {
			if(pint.getEntity().getType() == EntityType.PLAYER) {
				pint.setCancelled(true);
			}
			
		}
		

	}


