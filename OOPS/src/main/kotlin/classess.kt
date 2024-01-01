fun main()
{
    val car1 =Car()
    car1.name ="maruti"
    car1.model ="X100"
    car1.doors ="4"
    println("The name of car is ${car1.name}")
    println("the model of car is ${car1.model}")
    println("The doors in car are ${car1.doors}")
    println("\n")
    val car2 =Car()
    car2.name ="nano "
    car2.model ="X600"
    car2.doors ="2"
    println("The name of car is ${car2.name}")
    println("the model of car is ${car2.model}")
    println("The doors in car are ${car2.doors}")
}
class Car
{
    var name =""
    var model =""
    var doors =""
}