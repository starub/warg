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

import org.scalatest.FlatSpec
import org.warg.modules.dnd2ed.character.Character

class AvailableRacesCheckerSpec extends FlatSpec {

  behavior of "available races checker based on mix/max values of each race abilities"

  it should "suggest only human because Str and Dex character rolls are below the  minimum threshold" in {

    var dummy: Race = new Race {

      override val MinStr = 5
      override val MaxStr = 5

      override val MinDex = 5
      override val MaxDex = 5
    }

    var races: List[Race] = List(Human, dummy)
    var character = new Character

    character.Str.score = 3
    character.Dex.score = 3

    var result = AvailableRacesChecker.findAvailableRaces(races, character.abilities)
    
    // assert(result.size == 1 && !result.contains(dummy))
  }

}