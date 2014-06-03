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

class DefaultCharacter extends Character {

  val strength = new Strength(0)

  val dexterity = new Dexterity(0)

  val constitution = new Constitution(0)

  val intelligence = new Intelligence(0)

  val wisdom = new Wisdom(0)

  val charisma = new Charisma(0)

}