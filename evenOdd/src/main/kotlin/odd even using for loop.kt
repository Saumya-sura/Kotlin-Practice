fun main()
{
    var even =0
    for (i in 1 ..20)
    {
        if ((i%2)!=0)
        {
            continue
        }
        even++
        println(i)
    }
}
