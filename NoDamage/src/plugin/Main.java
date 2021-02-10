package plugin;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin implements Listener{ 

	
		
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
					
			
			
		 getServer().getPluginManager().registerEvents(this,this);
		}
		
		@Override
		public void onDisable() {
			System.out.println("Plugin Disabilitato");
		}
		
		@EventHandler
		public void onPlayerDamage(EntityDamageByEntityEvent e) {
			//Player damager = (Player) e.getDamager();
			//Player damageTaker = (Player) e.getEntity();
			
			if (e.getEntity() instanceof Player) {
			    //DamageTaker is a Player
			   Player damageTaker = (Player)e.getEntity();
			    
			    if (e.getDamager() instanceof Player) {
			       Player damager = (Player)e.getDamager();
			       
			    	if(damager.getInventory().getItemInMainHand().getType().equals(Material.AIR)){
			    		e.setDamage(0);
			    		messageSender(damager,damageTaker);
			    	}
			        
			    }
			    
			}
			

	}
		
		public void messageSender(Entity damager, Entity damageTaker) {
			
			damager.sendMessage("ho picchiato   " + damageTaker.getName());
			
		}
		
		
		
		
		
		
		
}
