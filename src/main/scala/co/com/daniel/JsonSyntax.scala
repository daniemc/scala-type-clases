package co.com.daniel

// this is an interface syntax
// use extension methods to extending types with interface methods
object JsonSyntax {
  implicit class JsonWriteOps[A](value: A) {
    def toJson(implicit w: JsonWriter[A]): Json = w.write(value)
  }
}
