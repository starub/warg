package org.warg.modules.dnd2ed.dice

import org.scalatest.FlatSpec

class DiceRollerSpec extends FlatSpec {

  behavior of "utility for rolling classic DND dices"

  it should "roll standard d6 dice 1 time and be within its bounds" in {
    var roll = DiceRoller.d6(1)
    assert(roll >= 1 && roll <= 6)
  }

  it should "roll standard d20 dice 1 time and be within its bounds" in {
    var roll = DiceRoller.d20(1)
    assert(roll >= 1 && roll <= 20)
  }

  it should "roll standard d6 dice 5 times and get sum of minimum 5" in {
    var roll = DiceRoller.d6(5)
    assert(roll >= 5)
  }

  it should "roll standard d20 dice 5 times and get sum of minimum 5" in {
    var roll = DiceRoller.d20(5)
    assert(roll >= 5)
  }

  it should "raise exception when attempting rolling dice 0 times" in {

    try {
      DiceRoller.roll(0, null)
      fail
    } catch {
      case e: IllegalArgumentException => assert("requirement failed: roll count should be greater than 0" === e.getMessage())
    }

  }

}