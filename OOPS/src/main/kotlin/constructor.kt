fun main()
{
val car1 =Cars("WAGONR","X100",5)
    println("Name is ${car1.name}")
    println("model is${car1.model}")
    println("number of doors are ${car1.doors}")
}
class Cars(var name:String,var model:String,var doors:Int)
{

}