fun main()
{
 val m = Max(5,2)
    println(m)
}
fun Max(a:Int, b:Int ) :Int
{
    val max = if(a>b) a else b
    return max
}