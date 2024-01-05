fun main()
{
    val user =Use("Alex")
    println("Name is : ${user.name}")
}
class Use(var name:String,var lastname:String,var age:Int)
{
    constructor(name:String):this(name,"jhonsons",5)
    {
        println("2nd")
    }
}