package org.warg.modules.dnd2ed.dice

import org.scalatest.FlatSpec

class D6DiceSpec extends FlatSpec {

  behavior of "standard 6-sided dice"

  it should "roll non-zero values from 1 to 6 inclusive only" in {

    for (i <- 1 to 10000) {
      var roll = D6Dice.roll()
      assert(roll != 0 && roll >= 1 && roll <= 6)
    }
  }

}