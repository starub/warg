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

import org.warg.modules.dnd2ed.abilities.Ability
import org.warg.modules.dnd2ed.abilities.Charisma
import org.warg.modules.dnd2ed.abilities.Constitution
import org.warg.modules.dnd2ed.abilities.Dexterity
import org.warg.modules.dnd2ed.abilities.Intelligence
import org.warg.modules.dnd2ed.abilities.Strength
import org.warg.modules.dnd2ed.abilities.Wisdom

final object AvailableClassesChecker {

  final def findAvailableClasses(abilities: Set[Ability], classes: Set[org.warg.modules.dnd2ed.classes.archetypes.Class]): Set[org.warg.modules.dnd2ed.classes.archetypes.Class] = {

    require(classes != null && classes.size > 0, "Classes collection is null or empty")
    require(abilities != null && abilities.size > 0, "Abilities collection is null or empty")

    def isSupported(klass: org.warg.modules.dnd2ed.classes.archetypes.Class, ability: Ability): Boolean = {
      ability.Name match {
        case Strength.Name => klass.minStr.score <= ability.score
        case Dexterity.Name => klass.minDex.score <= ability.score
        case Constitution.Name => klass.minCon.score <= ability.score

        case Wisdom.Name => klass.minWis.score <= ability.score
        case Intelligence.Name => klass.minInt.score <= ability.score
        case Charisma.Name => klass.minCha.score <= ability.score

        case _ => throw new IllegalArgumentException("Unknown ability : " + ability.Name)
      }
    }

    classes.filter(klass => abilities.forall(ability => isSupported(klass, ability)))
  }
}