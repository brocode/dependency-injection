package com.example

import java.io.PrintStream

import de.is24.business.printing.Printer
import de.is24.provider.{HelloWorldProvider, WorldProvider, HelloProvider}

trait HelloModule {
  lazy val helloProvider: HelloProvider = new HelloProvider()
  lazy val worldProvider: WorldProvider = new WorldProvider()

  lazy val systemOutStream: PrintStream = System.out

  lazy val systemOutPrinter: Printer = new Printer(systemOutStream)

  lazy val helloWorldProvider: HelloWorldProvider = new HelloWorldProvider(helloProvider, worldProvider)
}

object HelloManual extends App {
  val module = new HelloModule {}
  import module._

  systemOutPrinter.print(helloWorldProvider.helloWorld)
}
