fun main()
{
val car =Caar("suzuki","Blue","X500")
    car.move()
}
open class Vehicle(val name:String,val color:String)
{
    fun move()
    {
        println("The car is moving")
    }
}
class Caar(name:String,color: String,val engine:String):Vehicle(name,color)
{

}
