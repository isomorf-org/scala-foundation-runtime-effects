package org.isomorf.foundation.runtime.optimization

trait Cacher[K, V] {
  def id: String
  def optimizer: Optimizer
  lazy val cache: Cache[K, V] = optimizer.cache(id)
}

trait Cacher1[A1, B] extends Cacher[A1, B] with scala.Function1[A1, B] {
  abstract override def apply(a1: A1): B = {
    val key = a1
    cache.load(key, super.apply(a1))
  }
}

trait Cacher2[A1, A2, B] extends Cacher[(A1, A2), B] with scala.Function2[A1, A2, B] {
  abstract override def apply(a1: A1, a2: A2): B = {
    val key = (a1, a2)
    cache.load(key, super.apply(a1, a2))
  }
}

trait Cacher3[A1, A2, A3, B] extends Cacher[(A1, A2, A3), B] with scala.Function3[A1, A2, A3, B] {
  abstract override def apply(a1: A1, a2: A2, a3: A3): B = {
    val key = (a1, a2, a3)
    cache.load(key, super.apply(a1, a2, a3))
  }
}

trait Cacher4[A1, A2, A3, A4, B] extends Cacher[(A1, A2, A3, A4), B] with scala.Function4[A1, A2, A3, A4, B] {
  abstract override def apply(a1: A1, a2: A2, a3: A3, a4: A4): B = {
    val key = (a1, a2, a3, a4)
    cache.load(key, super.apply(a1, a2, a3, a4))
  }
}

trait Cacher5[A1, A2, A3, A4, A5, B] extends Cacher[(A1, A2, A3, A4, A5), B] with scala.Function5[A1, A2, A3, A4, A5, B] {
  abstract override def apply(a1: A1, a2: A2, a3: A3, a4: A4, a5: A5): B = {
    val key = (a1, a2, a3, a4, a5)
    cache.load(key, super.apply(a1, a2, a3, a4, a5))
  }
}
