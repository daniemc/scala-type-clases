package co.com.daniel

// **** define a type class ****
// this is the type class itself
trait JsonWriter[A] {
  def write(value: A): Json
}

// then we define Json and its subtypes to provide support code
sealed trait Json

final case class JsObject(get: Map[String, Json]) extends Json
final case class JsString(get: String) extends Json
final case class JsNumberInt(get: Int) extends Json
final case class JsNumberDouble(get: Double) extends Json

case object JsNull extends Json

// **** Define the interface ****
// there are two ways

// 1. Interface Object
// simplest way -> singleton Object ->
object Json {
  def toJson[A](value: A)(implicit w: JsonWriter[A]): Json = w.write(value)
}

// 2. Interface Syntax
// the other way is defined in file JsonSyntax (can't define it here )
