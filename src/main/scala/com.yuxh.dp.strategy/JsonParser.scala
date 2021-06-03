package com.yuxh.dp.strategy

/**
  *
  *
  * @author yuxh
  * @Date: 2021-06-01.
  * @Time: 13:50
  */
import org.json4s._
import org.json4s.jackson.JsonMethods

class JsonParser extends Parser[Person] {
//  implicit val formats = DefaultFormats
//  override def parse(file: String): List[Person] =
//    JsonMethods
//      .parse(StreamInput(this.getClass.getResourceAsStream(file)))
//      .extract[List[Person]]

  override def parse(file: String): List[Person] = ???
}
