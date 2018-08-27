import org.scalatest._
import co.com.daniel.{Json, Person}
import co.com.daniel.JsonWriterInstances._

class test extends FunSuite {

  test("type class interface test") {

    val res = Json.toJson(Person("Daniel Meneses", 21))
    println(res)
  }

}
