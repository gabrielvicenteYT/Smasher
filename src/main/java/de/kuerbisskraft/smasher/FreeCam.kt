package de.kuerbisskraft.smasher

import org.bukkit.event.player.PlayerMoveEvent
import org.bukkit.util.Vector
import kotlin.math.abs

class FreeCam {
    fun onPlayerMove(event: PlayerMoveEvent) {
        if (!event.player.isSprinting) {
            return
        }

        val direction = event.to.toVector().subtract(event.from.toVector()).multiply(Vector(1, 0, 1))
        val camera = event.player.location.direction
        val multiply = 1 / direction.length()

        val difference = abs(direction.x * multiply - camera.x) + abs(direction.z * multiply - camera.z)

        if (difference != Double.NaN && difference>=1) {
            event.isCancelled = true
        }
    }
}
