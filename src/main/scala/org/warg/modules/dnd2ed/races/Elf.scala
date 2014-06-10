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
package org.warg.modules.dnd2ed.races

final object Elf extends Race {

  override final val Name = "Elf"

  // Racial Ability Requirements

  override final val StrReq = 3 to 18
  override final val DexReq = 6 to 18
  override final val ConReq = 7 to 18

  override final val IntReq = 8 to 18
  override final val WisReq = 3 to 18
  override final val ChaReq = 3 to 18

  // Racial Ability Adjustments

  override final val ConAdj = -1
  override final val DexAdj = 1

}