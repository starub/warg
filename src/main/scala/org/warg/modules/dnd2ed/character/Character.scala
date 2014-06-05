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
package org.warg.modules.dnd2ed.character

import org.warg.modules.dnd2ed.ability.Charisma
import org.warg.modules.dnd2ed.ability.Constitution
import org.warg.modules.dnd2ed.ability.Dexterity
import org.warg.modules.dnd2ed.ability.Intelligence
import org.warg.modules.dnd2ed.ability.Strength
import org.warg.modules.dnd2ed.ability.Wisdom
import org.warg.modules.dnd2ed.race.Human
import org.warg.modules.dnd2ed.race.Race

final class Character {

  final val Str: Strength = new Strength

  final val Dex: Dexterity = new Dexterity

  final val Con: Constitution = new Constitution

  final val Int: Intelligence = new Intelligence

  final val Wis: Wisdom = new Wisdom

  final val Cha: Charisma = new Charisma

  final val abilities = Map((Str.Name, Str), (Dex.Name, Dex), (Con.Name, Con), (Int.Name, Int), (Wis.Name, Wis), (Cha.Name, Cha))

  var race: Race = Human

}