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

import org.warg.modules.dnd2ed.abilities.Charisma
import org.warg.modules.dnd2ed.abilities.Constitution
import org.warg.modules.dnd2ed.abilities.Dexterity
import org.warg.modules.dnd2ed.abilities.Intelligence
import org.warg.modules.dnd2ed.abilities.Strength
import org.warg.modules.dnd2ed.abilities.Wisdom
import org.warg.modules.dnd2ed.abilities.Charisma
import org.warg.modules.dnd2ed.races.Race
import org.warg.modules.dnd2ed.races.Human
import org.warg.modules.dnd2ed.classes.ClassGroup
import org.warg.modules.dnd2ed.classes.Warrior
import org.warg.modules.dnd2ed.races.Race

final class Character {

  final val Str = Strength

  final val Dex = Dexterity

  final val Con = Constitution

  final val Int = Intelligence

  final val Wis = Wisdom

  final val Cha = Charisma

  final val abilities = Set(Str, Dex, Con, Int, Wis, Cha)

  var race: Race = Human

  var classGroup: ClassGroup = Warrior

}