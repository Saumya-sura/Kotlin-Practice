fun main() {
    for(direction in Direction.values())
{
    println(direction)
}
Direction.WEST.PrintData()
}
enum class Direction(var direction: String,var distance:Int)
{
    NORTH("north",10),
    SOUTH("south",20),
    EAST("east",30),
    WEST("west",40);
    fun PrintData()
    {
        println("Directions is $direction and Distance is $distance")
    }
}