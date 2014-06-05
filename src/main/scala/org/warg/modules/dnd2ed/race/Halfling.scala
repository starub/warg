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

final object Halfling extends Race {

  override final val Name = "Halfling"

  // Racial Ability Requirements

  override final val MinStr = 7
  override final val MaxStr = 18

  override final val MinDex = 7
  override final val MaxDex = 18

  override final val MinCon = 10
  override final val MaxCon = 18

  override final val MinInt = 6
  override final val MaxInt = 18

  override final val MinWis = 3
  override final val MaxWis = 17

  override final val MinCha = 3
  override final val MaxCha = 18

  // Racial Ability Adjustments

  override final val DexAdj = 1
  override final val StrAdj = -1

}