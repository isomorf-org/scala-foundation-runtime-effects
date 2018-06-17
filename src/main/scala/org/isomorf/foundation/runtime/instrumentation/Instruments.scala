package org.isomorf.foundation.runtime.instrumentation

trait Instrument[I <: Instrumentor] {

  def id: RawIdentifier

  def instrumentor: I
}
