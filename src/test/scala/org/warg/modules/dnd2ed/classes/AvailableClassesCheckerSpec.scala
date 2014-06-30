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
package org.warg.modules.dnd2ed.classes

import org.scalatest.FlatSpec
import org.warg.modules.dnd2ed.character.Character

class AvailableClassesCheckerSpec extends FlatSpec {

  behavior of "available classes checker based on min values of rolled abilities"

  it should "suggest paladin class because requirements are met" in {

    var character = new Character

    character.str.score = 12
    character.dex.score = 0
    character.con.score = 9

    character.int.score = 0
    character.cha.score = 17
    character.wis.score = 13

    var result = AvailableClassesChecker.findAvailableClasses(character.abilities, Set(Paladin))

    assert(result.contains(Paladin))
  }
}