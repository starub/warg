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

import org.warg.modules.dnd2ed.ability.Ability
import org.warg.modules.dnd2ed.ability.Charisma
import org.warg.modules.dnd2ed.ability.Constitution
import org.warg.modules.dnd2ed.ability.Dexterity
import org.warg.modules.dnd2ed.ability.Intelligence
import org.warg.modules.dnd2ed.ability.Strength
import org.warg.modules.dnd2ed.ability.Wisdom

final object AvailableRacesChecker {

  final def findAvailableRaces(races: List[Race], abilities: List[Ability]): List[Race] = {

    require(races != null && races.length > 0, "Races collection is null or empty")
    require(abilities != null && abilities.length > 0, "Abilities collection is null or empty")

    def isSupported(race: Race, ability: Ability): Boolean = {
      ability.Name match {
        case Strength.Name => (race.MinStr to race.MaxStr).contains(ability.score)
        case Dexterity.Name => (race.MinDex to race.MaxDex).contains(ability.score)
        case Constitution.Name => (race.MinCon to race.MaxCon).contains(ability.score)
        case Intelligence.Name => (race.MinInt to race.MaxInt).contains(ability.score)
        case Wisdom.Name => (race.MinWis to race.MaxWis).contains(ability.score)
        case Charisma.Name => (race.MinCha to race.MaxCha).contains(ability.score)

        case _ => throw new IllegalArgumentException("Unknown ability : " + ability.Name)
      }
    }

    races.filter(race => abilities.forall(ability => isSupported(race, ability)))
  }

}