import kotlin.Result

fun main()
{
val success = Result1.Success("Sucess")
    val error = Result1.Error("Error")
    getData(success)
}
fun getData(result: Result1)
{
    when(result)
    {

        is Result1.Error -> result.showMessage()
        is Result1.Success -> result.showMessage()
    }

}
sealed class Result1(val messsage:String)
{
    fun showMessage()
    {
        println("Result: $messsage")
    }
class Success(messsage: String): Result1(messsage)
    class  Error(messsage: String): Result1(messsage)
}
