package org.isomorf.foundation.runtime.effects.plugins

import scala.util.Try

trait EffectContext {

  def findEffectProviderBuilders(): Try[List[EffectProviderBuilder]]

  def findEffectApiDescriptors(): Try[List[EffectApiDescriptor[_ <: EffectProvider]]]
}
