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

import org.warg.modules.dnd2ed.abilities.Ability
import org.warg.modules.dnd2ed.abilities.Charisma
import org.warg.modules.dnd2ed.abilities.Constitution
import org.warg.modules.dnd2ed.abilities.Dexterity
import org.warg.modules.dnd2ed.abilities.Intelligence
import org.warg.modules.dnd2ed.abilities.Strength
import org.warg.modules.dnd2ed.abilities.Wisdom

final object AvailableRacesChecker {

  final def findAvailableRaces(races: Set[Race], abilities: Set[Ability]): Set[Race] = {

    require(races != null && races.size > 0, "Races collection is null or empty")
    require(abilities != null && abilities.size > 0, "Abilities collection is null or empty")

    def isSupported(race: Race, ability: Ability): Boolean = {
      ability.Name match {
        
        case Strength.Name => race.StrReq.contains(ability.score)
        case Dexterity.Name => race.DexReq.contains(ability.score)
        case Constitution.Name => race.ConReq.contains(ability.score)
        
        case Intelligence.Name => race.IntReq.contains(ability.score)
        case Wisdom.Name => race.WisReq.contains(ability.score)
        case Charisma.Name => race.ChaReq.contains(ability.score)

        case _ => throw new IllegalArgumentException("Unknown ability : " + ability.Name)
      }
    }

    races.filter(race => abilities.forall(ability => isSupported(race, ability)))
  }

}