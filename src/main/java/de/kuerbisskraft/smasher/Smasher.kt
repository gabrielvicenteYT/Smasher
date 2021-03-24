package de.kuerbisskraft.smasher

import org.bukkit.Bukkit
import org.bukkit.command.CommandExecutor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerMoveEvent
import org.bukkit.plugin.java.JavaPlugin

class Smasher : JavaPlugin(), Listener, CommandExecutor {
    private val inventoryWalk = InventoryWalk()
    private val freeCam=FreeCam()

    override fun onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this)
    }

    @EventHandler
    fun onPlayerMove(event: PlayerMoveEvent) {
        inventoryWalk.onPlayerMove(event)
        freeCam.onPlayerMove(event)
    }
}
