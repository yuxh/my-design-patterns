package com.yuxh.dp.strategy

/**
  *
  *
  * @author yuxh
  * @Date: 2021-06-01.
  * @Time: 13:58
  */
object ParserExample {
  def main(args: Array[String]): Unit = {
    val csvPeople = Parser("people.csv")
    val jsonPeople = Parser("people.json")
    val applicationCsv = new PersonApplication(csvPeople)
    val applicationJson = new PersonApplication(jsonPeople)
    System.out.println("Using the csv: ")
    applicationCsv.write("people.csv")
    System.out.println("Using the json: ")
    applicationJson.write("people.json")
  }
}
