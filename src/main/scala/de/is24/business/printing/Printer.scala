package de.is24.business.printing

import java.io.PrintStream

import org.springframework.beans.factory.annotation.Autowired

class Printer @Autowired() (stream: PrintStream) {

  def print(text: String): Unit = stream.println(text)

}
