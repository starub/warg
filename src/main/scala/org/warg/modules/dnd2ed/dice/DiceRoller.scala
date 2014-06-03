package org.warg.modules.dnd2ed.dice

object DiceRoller {

  def d20(times: Int) = {
    roll(times, D20Dice)
  }

  def d6(times: Int) = {
    roll(times, D6Dice)
  }

  def roll(times: Int, dice: Dice) = {

    require(times > 0, "roll count should be greater than 0")

    var total = 0

    (1 to times) foreach (time => (total += dice.roll()))

    total
  }

}

