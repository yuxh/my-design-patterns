package com.yuxh.dp.strategy

/**
  *
  *
  * @author yuxh
  * @Date: 2021-06-01.
  * @Time: 13:44
  */
import com.github.tototoshi.csv.CSVReader

import java.io.InputStreamReader

class CSVParser extends Parser[Person] {
  override def parse(file: String): List[Person] =
    CSVReader
      .open(new InputStreamReader(this.getClass.getResourceAsStream(file)))
      .all()
      .map {
        case List(name, age, address) =>
          Person(name, age.toInt, address)
      }
}
