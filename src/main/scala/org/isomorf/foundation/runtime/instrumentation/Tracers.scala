package org.isomorf.foundation.runtime.instrumentation

trait Tracer0[B] extends Instrument[TracerInstrumentor] with scala.Function0[B] {
  abstract override def apply(): B = {
    instrumentor.captureInput(id)
    val ret = super.apply()
    instrumentor.captureOutput(id, ret)
    ret
  }
}

trait Tracer1[A1, B] extends Instrument[TracerInstrumentor] with scala.Function1[A1, B] {
  abstract override def apply(a1: A1): B = {
    instrumentor.captureInput(id, a1)
    val ret = super.apply(a1)
    instrumentor.captureOutput(id, ret)
    ret
  }
}

trait Tracer2[A1, A2, B] extends Instrument[TracerInstrumentor] with scala.Function2[A1, A2, B] {
  abstract override def apply(a1: A1, a2: A2): B = {
    instrumentor.captureInput(id, a1, a2)
    val ret = super.apply(a1, a2)
    instrumentor.captureOutput(id, ret)
    ret
  }
}

trait Tracer3[A1, A2, A3, B] extends Instrument[TracerInstrumentor] with scala.Function3[A1, A2, A3, B] {
  abstract override def apply(a1: A1, a2: A2, a3: A3): B = {
    instrumentor.captureInput(id, a1, a2, a3)
    val ret = super.apply(a1, a2, a3)
    instrumentor.captureOutput(id, ret)
    ret
  }
}

trait Tracer4[A1, A2, A3, A4, B] extends Instrument[TracerInstrumentor] with scala.Function4[A1, A2, A3, A4, B] {
  abstract override def apply(a1: A1, a2: A2, a3: A3, a4: A4): B = {
    instrumentor.captureInput(id, a1, a2, a3, a4)
    val ret = super.apply(a1, a2, a3, a4)
    instrumentor.captureOutput(id, ret)
    ret
  }
}

trait Tracer5[A1, A2, A3, A4, A5, B] extends Instrument[TracerInstrumentor] with scala.Function5[A1, A2, A3, A4, A5, B] {
  abstract override def apply(a1: A1, a2: A2, a3: A3, a4: A4, a5: A5): B = {
    instrumentor.captureInput(id, a1, a2, a3, a4, a5)
    val ret = super.apply(a1, a2, a3, a4, a5)
    instrumentor.captureOutput(id, ret)
    ret
  }
}
