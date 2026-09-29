// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun area_of_triangle(width: Double, height: Double): Double{
    return (width*height)/2
}

fun main(){
    println(area_of_triangle(5.0, 10.0))
}