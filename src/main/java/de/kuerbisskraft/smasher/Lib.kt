package de.kuerbisskraft.smasher

import org.bukkit.util.Vector
import kotlin.math.roundToInt

object Lib {
    fun vectorToPrint(vec: Vector): String {
        return "${((vec.x*100).roundToInt()).toFloat()/100}/${((vec.y*100).roundToInt()).toFloat()/100}/${((vec.z*100).roundToInt()).toFloat()/100}"
    }
}
