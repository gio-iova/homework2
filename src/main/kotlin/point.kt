import kotlin.math.pow

class Point(private var x:Double, private var y:Double){
    override fun toString(): String {
        return "x=${this.x},y=${this.y}"
    }

    override fun equals(other: Any?): Boolean {
        return other is Point && this.x==other.x &&  this.y==other.y
    }
    fun moveSymetrically(){
        this.x=-x
        this.y=-y
    }
    fun distance(other:Point):Double{
        return ((this.x - other.x).pow(2)+(this.y - other.y).pow(2)).pow(0.5)


    }
}
fun main(){
    val point=Point(1.0,4.0)
    println(point)

    val point2=Point(2.0,4.0)
    println(point==point2)

    point.moveSymetrically()
    println(point)

    println(point.distance(point2))

}
