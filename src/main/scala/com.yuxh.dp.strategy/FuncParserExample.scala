package com.yuxh.dp.strategy

/**
  *
  *
  * @author yuxh
  * @Date: 2021-06-01.
  * @Time: 13:58
  */
object FuncParserExample {
  def main(args: Array[String]): Unit = {
    val applicationCsv =
      new FuncApplication[Person](StrategyFactory("people.csv"))
    val applicationJson =
      new FuncApplication[Person](StrategyFactory("people.json"))
    System.out.println("Using the csv: ")
    applicationCsv.write("people.csv")
    System.out.println("Using the json: ")
    applicationJson.write("people.json")
  }
}
