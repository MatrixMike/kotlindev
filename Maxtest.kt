	
package com.javasampleapproach.kotlin.maxvalue
//import com.google.android.gms.location.Location
data class Product(
  val name: String,
  val price: Double // usd
)
var   ans1: Double  = 1.0  // : FloatArray[2]
//var   ans2: Double[1.0f,1.0f]  //  = {1.0f,1.0f}  // : FloatArray[2]
//var x:  = arrayOf(1.0, 2.0, 3.0)  // was Double
var doubleArray = doubleArrayOf(1.1, 2.2, 3.3, 4.4, 5.5, 6.6)
//var floatArray : floatArrayOf(1.1f,1.2f)
var   ans3: Double = 1.0
//var distance2: Double = Location.distanceBetween(-37.892, 144.775, -37.874, 144.785, floatArray)

fun main(args : Array<String>) {
  val simpleList = listOf(1.99, 55.4, 20.0, 99.99, 23.0, 34.2, 88.0, 72.1, 61.2, 43.9)
  
  // public fun Iterable<Double>.max(): Double?
  val largestElement = simpleList.max()
  println(largestElement)
  // ->
  /*
    99.99
  */
  
  val productList = listOf(Product("Samsung Galaxy S8 64GB Unlocked Phone", 699.99),
              Product("iPad Pro 9.7-inch 32 GB", 474.98),
              Product("Samsung Electronics Ultra HD Smart LED TV", 677.92),
              Product("Google Pixel Phone - 5 inch display", 279.95),
              Product("iPad Pro 9.7-inch 128G", 574.99),
              Product("Google Wifi system 1-Pack", 149.90),
              Product("iPhone 8 Plus 64G", 850.00),
              Product("Samsung Galaxy Tab 4", 127.67))
 
  // public inline fun <T, R : Comparable<R>> Iterable<T>.maxBy(selector: (T) -> R): T?
  var productWithHighestPrice = productList.maxBy { it ->  it.price }
  
  println(productWithHighestPrice)
  // ->
  /*
    Product(name=iPhone 8 Plus 64G, price=850.0)
  */
  
  // public fun <T> Iterable<T>.maxWith(comparator: Comparator<in T>): T?
  productWithHighestPrice = productList.maxWith(object: Comparator<Product> {
    override fun compare(p1: Product, p2: Product): Int = when {
      p1.price > p2.price -> 1
      p1.price == p2.price -> 0
      else -> -1
    }
  })
  
  println(productWithHighestPrice)
  // ->
  /*
    Product(name=iPhone 8 Plus 64G, price=850.0)
  */
}
