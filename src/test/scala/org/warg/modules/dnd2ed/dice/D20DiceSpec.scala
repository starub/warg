package org.warg.modules.dnd2ed.dice

import org.scalatest.FlatSpec

class D20DiceSpec extends FlatSpec {

  behavior of "standard 20-sided dice"

  it should "roll non-zero values from 1 to 20 inclusive only" in {

    for (i <- 1 to 10000) {
      var roll = D20Dice.roll()
      assert(roll != 0 && roll >= 1 && roll <= 20)
    }
  }

}