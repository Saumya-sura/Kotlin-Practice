fun main()
{
val listView = ListView(arrayOf("n1","n2","n3"))
    listView.ListViewItem().display(2)
}
class ListView(val items:Array<String>)
{
    inner  class ListViewItem()
    {
        fun display(pos:Int)
        {
            println(items[pos])
        }
    }
}