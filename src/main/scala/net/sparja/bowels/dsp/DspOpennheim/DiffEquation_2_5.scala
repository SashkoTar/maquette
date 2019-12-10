package net.sparja.bowels.dsp.DspOpennheim

import net.sparja.bowels.dsp.lti.sigma
object DiffEquation_2_5 {

  // y(n) - 5y(n-1) + 6y(n-2) = 2x(n-1)

  def buildDiffEquation(x: Int => Double) =  {

    def y(n: Int): Double = if (n < 0) 0 else 5 * y(n-1) - 6 * y(n-2) + 2*x(n - 1)
    //def y(n: Int): Double = if (n < 0) 0 else 0.75 * y(n-1) - 1/8 * y(n-2) + 2*x(n - 1)
    y _
  }


  def main(args: Array[String]): Unit = {
    val y = buildDiffEquation((n: Int) => 0.0)
    -10 to 10 foreach {n => {println(s"y($n) = ${y(n)}")}}
  }


}
