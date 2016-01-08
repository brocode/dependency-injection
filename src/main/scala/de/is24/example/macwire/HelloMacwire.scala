package de.is24.example.macwire

import java.io.PrintStream

import de.is24.business.printing.Printer
import de.is24.provider.{HelloProvider, HelloWorldProvider, WorldProvider}
import com.softwaremill.macwire._

trait HelloModule {
  lazy val helloProvider: HelloProvider = wire[HelloProvider]
  lazy val worldProvider: WorldProvider = wire[WorldProvider]

  lazy val systemOutStream: PrintStream = System.out

  lazy val systemOutPrinter: Printer = wire[Printer]

  lazy val helloWorldProvider: HelloWorldProvider = wire[HelloWorldProvider]
}

object HelloMacwire extends App {
  val module = new HelloModule {}
  import module._

  systemOutPrinter.print(helloWorldProvider.helloWorld)
}
