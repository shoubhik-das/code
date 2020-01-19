def abs(x: Double): Double = if (x < 0) -x else x

def sqrt(number: Double): Double = {
  def isGoodEnough(guess: Double): Boolean = {
    abs(guess * guess - number) / number < 0.0001
  }

  def improve(guess: Double): Double = {
    (guess + (number / guess)) / 2
  }

  @scala.annotation.tailrec
  def sqrtIter(guess: Double): Double = {
    if (isGoodEnough(guess)) guess
    else sqrtIter(improve(guess))
  }

  sqrtIter(1.0)
}


sqrt(2)
sqrt(4)
