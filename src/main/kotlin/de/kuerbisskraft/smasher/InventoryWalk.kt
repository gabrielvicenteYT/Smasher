package de.kuerbisskraft.smasher

import org.bukkit.event.inventory.InventoryCloseEvent
import org.bukkit.event.player.PlayerMoveEvent

class InventoryWalk {
    fun onPlayerMove(event: PlayerMoveEvent) {
        if (event.to.toVector().subtract(event.from.toVector()).length()>0)
        event.player.closeInventory(InventoryCloseEvent.Reason.CANT_USE)
    }
}
