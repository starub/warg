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

final object DiceRoller {

  final def d6(times: Int) = {
    roll(times, D6Dice)
  }

  final def d10(times: Int) = {
    roll(times, D10Dice)
  }

  final def d20(times: Int) = {
    roll(times, D20Dice)
  }

  final def roll(times: Int, dice: Dice) = {

    require(times > 0, "Roll count <= 0")
    require(dice != null, "Dice is null")

    var total = 0

    (1 to times) foreach (time => (total += dice.roll()))

    total
  }

}

