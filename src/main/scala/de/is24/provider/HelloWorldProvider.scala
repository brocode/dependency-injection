package de.is24.provider

class HelloWorldProvider(helloProvider: HelloProvider, worldProvider: WorldProvider) {

  def helloWorld: String = {
    val hello = helloProvider.hello
    val world = worldProvider.world

    s"$hello, $world!"
  }
}
