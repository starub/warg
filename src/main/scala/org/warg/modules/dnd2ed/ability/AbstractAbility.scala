package org.warg.modules.dnd2ed.ability

abstract class AbstractAbility extends Ability {

  private var currentValue: Int = 0

  def this(currentValue: Int) = {
    this()
    this.currentValue = currentValue;
  }

  def getCurrentValue(): Int = {
    currentValue
  }

  def setCurrentValue(value: Int) = {
    this.currentValue = value
  }

}