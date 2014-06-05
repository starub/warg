/**
 * This file is part of warg.
 *
 * warg is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * warg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with warg.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright (C) 2014 Stanislavs Rubens
 */
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

  it should "raise exception if no dice is specified in generic roll() method" in {
    try {
      DiceRoller.roll(1, null)
      fail
    } catch {
      case e: IllegalArgumentException => assert("requirement failed: Dice is null" === e.getMessage())
    }

  }

  it should "raise exception when attempting rolling dice 0 times" in {
    try {
      DiceRoller.roll(0, D6Dice)
      fail
    } catch {
      case e: IllegalArgumentException => assert("requirement failed: Roll count <= 0" === e.getMessage())
    }

  }

}