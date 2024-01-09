fun main()
{
val result = Cal.sum(5,10)
    println("$result")
}
class Cal()
{
    companion object
    {
        fun sum(a:Int,b:Int):Int
        {
            return a+b
        }
    }
}