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
package org.warg.modules.dnd2ed.generators

import org.scalatest.FlatSpec
import org.warg.modules.dnd2ed.character.DefaultCharacter

class AbilityGeneratorSpec extends FlatSpec {

  behavior of "standard character ability generator"

  it should "generate abstract character with 6 non-zero abilities" in {

    var character = AbilityGenerator.generate(new DefaultCharacter)

    assert(character.strength.getCurrentValue > 0)
    assert(character.dexterity.getCurrentValue > 0)
    assert(character.constitution.getCurrentValue > 0)

    assert(character.intelligence.getCurrentValue > 0)
    assert(character.wisdom.getCurrentValue > 0)
    assert(character.charisma.getCurrentValue > 0)

  }

}