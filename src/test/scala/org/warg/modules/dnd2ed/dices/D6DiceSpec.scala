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
package org.warg.modules.dnd2ed.dices

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