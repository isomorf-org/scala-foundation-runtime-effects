package org.isomorf.foundation.runtime.effects

import org.isomorf.foundation.runtime.RTFunction

trait RTStateAwareFunction extends RTFunction {
  def state(): EffectState
}
