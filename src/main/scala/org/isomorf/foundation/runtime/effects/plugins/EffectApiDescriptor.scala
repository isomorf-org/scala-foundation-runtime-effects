package org.isomorf.foundation.runtime.effects.plugins

trait EffectApiDescriptor[A <: EffectProvider] {

  def getHandle(): String

  def getType(): Class[A]

  def getResourceType(): Option[String] = None
}
