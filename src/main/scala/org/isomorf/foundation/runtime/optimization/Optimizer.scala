package org.isomorf.foundation.runtime.optimization

trait Optimizer {
  def cache[K, V](id: String): Cache[K, V]
}

trait Cache[K, V] {
  def load(key: K, orElse: => V): V
}
