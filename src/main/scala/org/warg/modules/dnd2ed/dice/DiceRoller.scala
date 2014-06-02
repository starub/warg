package org.warg.modules.dnd2ed.dice

object DiceRoller {

  def d6(times: Int) = {
    roll(times, D6Dice)
  }

  def roll(times: Int, dice: Dice) = {

    var total = 0

    (1 to times) foreach (time => (total += dice.roll()))

    total
  }

}

