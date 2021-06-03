package com.yuxh.dp.strategy

/**
  *
  *
  * @author yuxh
  * @Date: 2021-06-01.
  * @Time: 18:29
  */
import com.github.tototoshi.csv.CSVReader
import org.json4s.{DefaultFormats, StreamInput}
import org.json4s.jackson.JsonMethods

import java.io.InputStreamReader

object StrategyFactory {
  implicit val formats: DefaultFormats.type = DefaultFormats

  def apply(filename: String): String => List[Person] =
    filename match {
      case f if f.endsWith(".json") => parseJson
      case f if f.endsWith(".csv")  => parseCsv
      case f                        => throw new RuntimeException(s"Unknown format: $f")
    }

  def parseJson(file: String): List[Person] = ???
//    JsonMethods
//      .parse(StreamInput(this.getClass.getResourceAsStream(file)))
//      .extract[List[Person]]

  def parseCsv(file: String): List[Person] =
    CSVReader
      .open(new InputStreamReader(this.getClass.getResourceAsStream(file)))
      .all()
      .map {
        case List(name, age, address) => Person(name, age.toInt, address)
      }
}
