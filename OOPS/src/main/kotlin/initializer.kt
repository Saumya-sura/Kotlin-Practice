fun main()
{
val user =User("Alex","jhonahon",55)
    val friend = User("sam","shah",59)
    println("Name :${friend.name}")
}
class User(var name:String,var lastname:String,var age:Int)
{
    init {
        if(name.lowercase().startsWith("a"))
        {
            this.name =name
        }
        else
        {
            println("NAme doesn't start with a")
        }
    }
}