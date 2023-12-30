fun main()
{
val max = Maximum(arrayOf(20,30,10,50),true)
    val min = Maximum(arrayOf(30,40,50,10),false)
    println("The max number is $max")
    println("The min number is $min")
}
fun Maximum(num:Array<Int>,searchmax:Boolean):Int
{
    var max = num[0]
    var min = max
    if(searchmax)
    {
        for(i in num)
        {
            if(i>max)
            {
                max = i
            }
        }
        return max
    }
    else
    {
        for (i in num)
        {
            if (i<min)
            {
                min =i
            }
        }

    return min
    }


}