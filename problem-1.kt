import java.util.Scanner

fun main(@Suppress("UNUSED_PARAMETER") args: Array<String>) {
    val reader = Scanner(System.`in`)
    var n:Int = reader.nextInt()
	for (i in 1..n) {
		var foo:Int = reader.nextInt()
		foo += 1
	}
    println("YES")
}