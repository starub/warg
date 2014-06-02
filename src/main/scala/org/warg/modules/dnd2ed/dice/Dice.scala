package org.warg.modules.dnd2ed.dice

import scala.util.Random

trait Dice {

  val sides = 0 to 0

  def roll(): Int = {
    sides(Random.nextInt(sides length))
  }

}