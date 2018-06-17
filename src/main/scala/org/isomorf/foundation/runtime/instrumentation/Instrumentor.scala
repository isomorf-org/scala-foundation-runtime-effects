package org.isomorf.foundation.runtime.instrumentation

import scala.concurrent.duration.FiniteDuration

trait InstrumentResult

trait Instrumentor {
  def generateResults(): InstrumentResult
}

trait TracerInstrumentor extends Instrumentor {

  def captureInput(id: RawIdentifier, as: Any*): Unit

  def captureOutput(id: RawIdentifier, a: Any): Unit
}

trait TimerInstrumentor extends Instrumentor {
  def recordTime(id: RawIdentifier, duration: FiniteDuration): Unit
}
