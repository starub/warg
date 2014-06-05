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
package org.warg.modules.dnd2ed.race

trait Race {

  val Name = "Generic"

  // Racial Ability Requirements

  val MinStr = 3
  val MaxStr = 18

  val MinDex = 3
  val MaxDex = 18

  val MinCon = 3
  val MaxCon = 18

  val MinInt = 3
  val MaxInt = 18

  val MinWis = 3
  val MaxWis = 18

  val MinCha = 3
  val MaxCha = 18

  // Racial Ability Adjustments

  val StrAdj = 0
  val DexAdj = 0
  val ConAdj = 0

  val IntAdj = 0
  val WisAdj = 0
  val ChaAdj = 0

}