package org.isomorf.foundation.runtime.effects.plugins

import java.util.UUID
import java.nio.file.Path

case class EffectConfig(userHandle: String, userId: UUID, rootUserContentDir: Path, rootTemp: Path)

trait EffectProviderBuilder {

  def build(config: EffectConfig): EffectProvider

  def getHandle(): String

  def getApiProviders(): java.lang.Iterable[Class[_]]
}
