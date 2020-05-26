package bsuir.vmsis.lab7.encodings

object Decoder5b6b {
  def decode(encodedData: Byte): Byte = {
    val data = encodedData % 64
    data match {
      case 39 => 0
      case 24 => 0
      case 29 => 1
      case 34 => 1
      case 45 => 2
      case 18 => 2
      case 49 => 3
      case 53 => 4
      case 10 => 4
      case 41 => 5
      case 25 => 6
      case 56 => 7
      case 7  => 7
      case 57 => 8
      case 6  => 8
      case 37 => 9
      case 21 => 10
      case 52 => 11
      case 13 => 12
      case 44 => 13
      case 28 => 14
      case 23 => 15
      case 40 => 15
      case 27 => 16
      case 36 => 16
      case 35 => 17
      case 19 => 18
      case 50 => 19
      case 11 => 20
      case 42 => 21
      case 26 => 22
      case 58 => 23
      case 5  => 23
      case 51 => 24
      case 12 => 24
      case 38 => 25
      case 22 => 26
      case 54 => 27
      case 9  => 27
      case 14 => 28
      case 46 => 29
      case 17 => 29
      case 30 => 30
      case 33 => 30
      case 43 => 31
      case 20 => 31
    }
  }
}