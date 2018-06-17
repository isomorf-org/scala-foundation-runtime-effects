package org.isomorf.foundation.runtime.effects

// errors returnable by effects services

// DANGER/FRAGILE: this type is bound to the effect.core.MEffectError generated type!!!

sealed trait EffectError

case class NotFoundEffectError(msg: List[Char]) extends EffectError
case class InternalEffectError(msg: List[Char]) extends EffectError
