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

class SimpleAbilityScoreGeneratorSpec extends FlatSpec {

  behavior of "simple character ability score generator"

  it should "generate non-zero ability score for character ability by rolling 3d6" in {

    var character = new org.warg.modules.dnd2ed.character.Character

    character.str.score = SimpleAbilityScoreGenerator.generate
    character.dex.score = SimpleAbilityScoreGenerator.generate
    character.con.score = SimpleAbilityScoreGenerator.generate

    character.int.score = SimpleAbilityScoreGenerator.generate
    character.wis.score = SimpleAbilityScoreGenerator.generate
    character.cha.score = SimpleAbilityScoreGenerator.generate

    assert(character.str.score > 0)
    assert(character.dex.score > 0)
    assert(character.con.score > 0)

    assert(character.int.score > 0)
    assert(character.wis.score > 0)
    assert(character.cha.score > 0)

  }

}