package com.yuxh.dp.strategy

/**
  *
  *
  * @author yuxh
  * @Date: 2021-06-01.
  * @Time: 13:42
  */
class FuncApplication[T](parser: String => List[T]) {
  def write(file: String): Unit = {
    System.out.println(s"Got the following data ${parser(file)}")
  }
}
