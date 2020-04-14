import java.util.*

// https://www.hackerrank.com/challenges/30-binary-numbers/problem

fun main() {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val bin = n.toString(2)
    val max1 = "1+".toRegex().findAll(bin).maxBy { it.value.length }!!.value.length

    println(max1)
}