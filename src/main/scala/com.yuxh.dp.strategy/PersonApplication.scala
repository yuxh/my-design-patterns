package com.yuxh.dp.strategy

/**
  *
  *
  * @author yuxh
  * @Date: 2021-06-01.
  * @Time: 13:42
  */
class PersonApplication[T](parser: Parser[T]) {
  def write(file: String): Unit = {
    System.out.println(s"Got the following data ${parser.parse(file)}")
  }
}
