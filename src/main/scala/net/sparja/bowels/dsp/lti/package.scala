package net.sparja.bowels.dsp

package object lti {

  def sigma(n: Int) = if (n == 0) 1 else 0

  def u(n: Int) = if (n >= 0) 1 else 0

  def buildY(x: Int => Double, h: Int => Double, start: Int, end: Int) = (n: Int) => (start to end).map(k => x(k) * h(n - k)).sum

}
