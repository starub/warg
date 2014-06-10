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

import org.scalatest.FlatSpec
import org.warg.modules.dnd2ed.character.Character

class AvailableRacesCheckerSpec extends FlatSpec {

  behavior of "available races checker based on mix/max values of each race abilities"

  it should "suggest only human because character rolls are below the  minimum threshold" in {

    var dummy: Race = new Race {

      override val StrReq = 5 to 5
      override val DexReq = 5 to 5
      override val ConReq = 5 to 5

      override val IntReq = 5 to 5
      override val WisReq = 5 to 5
      override val ChaReq = 5 to 5

    }

    var races: Set[Race] = Set(Human, dummy)
    var character = new Character

    character.Str.score = 3
    character.Dex.score = 3
    character.Con.score = 3

    character.Int.score = 3
    character.Cha.score = 3
    character.Wis.score = 3

    var result = AvailableRacesChecker.findAvailableRaces(races, character.abilities)

    assert(result.size == 1 && result.contains(Human))
  }

}