package de.is24.example.spring

import de.is24.business.printing.Printer
import de.is24.provider.HelloWorldProvider
import org.springframework.context.support.ClassPathXmlApplicationContext


object HelloSpring extends App {

  val applicationContext = new ClassPathXmlApplicationContext("/application-context.xml")
  val helloWorldProvider: HelloWorldProvider = applicationContext.getBean("helloWorldProvider", classOf[HelloWorldProvider])
  val printer: Printer = applicationContext.getBean("printer", classOf[Printer])

  printer.print(helloWorldProvider.helloWorld)
}
