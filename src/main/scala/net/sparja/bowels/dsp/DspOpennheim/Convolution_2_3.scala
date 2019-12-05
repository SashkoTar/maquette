package net.sparja.bowels.dsp.DspOpennheim

import net.sparja.bowels.dsp.lti.{u, buildY}

object Convolution_2_3 {

  def main(args: Array[String]): Unit = {

    def h(n: Int) = u(-n) * Math.pow(0.7, -n)

    val y = buildY(u, h, -10, 10)

    (-120 to 20) foreach(n => {println(s"y($n) = ${y(n)}")})
  }

}
