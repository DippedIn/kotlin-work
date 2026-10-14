fun main() {
    val t = Triangle(3.0, 4.0, 5.0)
    println(isValidTriangle(t))
    println(triangleArea(t))
    println(isValidTriangle(Triangle(1.0, 2.0, 10.0)))
}