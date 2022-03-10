fun main() {
    val num1 = intArrayOf(1, 2, 3, 4, 5)
    val num2 = intArrayOf(1, 200, 3, 4012, 50)
    val num3 = intArrayOf(10, 20, 330, 40, 540)

    println("average of even index element of list: ${num1.toList()} is: " + avgOfNumbers(num1))
    println("average of even index element of list: ${num2.toList()} is: " + avgOfNumbers(num2))
    println("average of even index element of list: ${num3.toList()} is: " + avgOfNumbers(num3))

    val s1 = "nika"
    val s2 = "dddsddd"

    println("$s1 is palindrome: " + isPalindrome(s1))
    println("$s2 is palindrome: " + isPalindrome(s2))
}


fun avgOfNumbers(numbers: IntArray): Int {
    return numbers.filter { i: Int -> numbers.indexOf(i) % 2 == 0 }.average().toInt()
}


fun isPalindrome(s: String): Boolean {
    return s == s.reversed()
}