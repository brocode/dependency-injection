package de.is24.business.printing

import java.io.PrintStream

class Printer(stream: PrintStream) {

  def print(text: String): Unit = stream.println(text)

}
