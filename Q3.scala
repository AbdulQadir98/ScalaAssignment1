object Q3 extends App{

  def cost(x:Int)=(x * 24.95) * 0.6 + 3

  def extra(x:Int)=(x - 50) * 0.75

  def price(x:Int)={
    if (x<=50) cost(x)
    else cost(x) + extra(x)
  }
  println(price(60))
}
