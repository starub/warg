package org.warg.modules.dnd2ed.ability

trait Ability {

  def getName(): String

  def getCurrentValue(): Int

  def setCurrentValue(value: Int)

}