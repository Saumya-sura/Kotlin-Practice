fun main()
{
var n=1
    val last = 20
    var even = 0
    while (n <= last)
    {
        n++
        if (!isEvenNumber(n))
        {
            continue
        }
        even++
        println(n)
    }
    println("total number of ecven numbers are :$even")
}
fun isEvenNumber(n:Int):Boolean {
    if ((n % 2) == 0)
        return true
    else
        return false
}