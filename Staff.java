/*
# @author     LeeraDev
# @copyright  Copyright LeeraDev 2017
*/
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LeeraStaff implements CommandExecutor {

	if(!sender.hasPermission("ADMIN")) {
		sender.sendMessage(ChatColor.RED + "You do not have permission to execute this command.");
		return true;
	}	

    public void onEnable() {
        Bukkit.getServer().getLogger("Plugin LeeraStaff has been enabled!")
    }

    public void onDisable() {
        Bukkit.getServer().getLogger("Plugin LeeraStaff has been disabled!")
    }

    if (commandLabel.equalsIgnoreCase("staff")) {
        sender.sendMessage(ChatColor.GREEN + "Staff Mode Enabled");
    }
    
	
    
    /*
    For when I get to moderation in this plugin. 
    Will do a checker to see if the player is online or not.
    Probably should make it to be able to ban the player if they are offline regardless but what ever. :stuck_out_tongue:
    public boolean isOnline() {
    }
    */

} 
