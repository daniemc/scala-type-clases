package co.com.daniel

// define a type class
sealed trait Json

final case class JsObject(get: Map[String, Json]) extends Json
final case class JsString(get: String) extends Json
final case class JsNumberInt(get: Int) extends Json
final case class JsNumberDouble(get: Double) extends Json

case object JsNull extends Json

trait JsonWriter[A] {
  def write(value: A): Json
}

// type class interfaces
// there are two ways to specifying an interface: Objects and Interface Syntax

// Objects
object Json {
  def toJson[A](value: A)(implicit w:JsonWriter[A]): Json = w.write(value)
}