package org.isomorf.foundation.runtime.effects

import scala.reflect.ClassTag

import org.isomorf.foundation.runtime.RTEffect
import org.isomorf.foundation.runtime.RuntimeEffectsValueConverter

import org.isomorf.foundation.runtime.effects.plugins.EffectProvider

/*
 * TODO:
 * this should eventually have some means to get the MorfUser who initiated the effect?
 */
trait EffectState {

  final type Action[P <: EffectProvider, B] = (P, RuntimeEffectsValueConverter) => B

  def withProvider[A <: EffectProvider, B](f: Action[A, B])(implicit tag: ClassTag[A]): RTEffect[B]

  def withProvider[A <: EffectProvider, B](resource: EffectResource)(f: Action[A, B])(implicit tag: ClassTag[A]): RTEffect[B]
}
