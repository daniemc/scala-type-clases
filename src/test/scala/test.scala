import org.scalatest._
import co.com.daniel.{Json, Person}
import co.com.daniel.JsonWriterInstances._
import co.com.daniel.JsonSyntax._

class test extends FunSuite {

  test("type class interface test (interface Object)") {
    val res = Json.toJson(Person("Daniel Meneses", 21))
    println(res)
  }

  test("type class interface test (interface Syntax)") {
    val res = Person("Daniel Meneses", 21).toJson
    println(res)
  }

  test("test implicit stringWriter") {
    val res = Json.toJson("Hi implicit")
    println(res)
  }

}
