import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
 
class HelloActor extends Actor {
  def receive = {
    case "hello" => println("hello back at you")
    case "Hari"  => println("Hi there Hari, how are you?")
    case _       => println("huh?")
  }
}
 
object Main extends App {
  val system = ActorSystem("HelloSystem")
  // default Actor constructor
  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")
  helloActor ! "hello"
  helloActor ! "buenos dias"

  val helloActor1 = system.actorOf(Props[HelloActor], name = "helloactor1")
  helloActor1 ! "Hari"	
}

