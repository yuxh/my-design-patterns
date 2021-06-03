package com.yuxh.dp.strategy

/**
  *
  *
  * @author yuxh
  * @Date: 2021-06-01.
  * @Time: 13:43
  */
trait Parser[T] {
  def parse(file: String): List[T]
}
object Parser {
  def apply(filename: String): Parser[Person] =
    filename match {
      case f if f.endsWith(".json") => new JsonParser
      case f if f.endsWith(".csv")  => new CSVParser
      case f                        => throw new RuntimeException(s"Unknown format: $f")
    }
}
