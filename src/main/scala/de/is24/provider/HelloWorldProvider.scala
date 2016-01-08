package de.is24.provider

import org.springframework.beans.factory.annotation.Autowired

class HelloWorldProvider @Autowired() (helloProvider: HelloProvider, worldProvider: WorldProvider) {

  def helloWorld: String = {
    val hello = helloProvider.hello
    val world = worldProvider.world

    s"$hello, $world!"
  }
}
