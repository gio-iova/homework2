class Fraction(private var numerator: Int, private var denominator: Int) {

    fun mult(other:Fraction):Double{
        var x:Double= numerator*other.numerator.toDouble()
        var y:Double= denominator*other.denominator.toDouble()
        return x/y
    }

    fun add(other:Fraction):Double{
        var y:Double= denominator*other.denominator.toDouble()
        var x1:Double= numerator*other.denominator.toDouble()
        var x2:Double= other.numerator*denominator.toDouble()
        return (x1+x2)/y

    }
    fun truncate():String{
        var num:Int = numerator
        var den:Int = denominator
        for (i in 2 .. num){
            while (num%i==0 && den%i==0){
                num /= i
                den /= i
            }
        }
        return "$num / $den"


    }

    override fun toString(): String {
        return "$numerator/$denominator"
    }

    override fun equals(other: Any?): Boolean {
        if(other is Fraction) {
            if(other.numerator == other.denominator) {
                return true
            }
        }
        return false
    }
}

fun main() {
    val fraction = Fraction(2, 4)
    fraction.truncate()
    println(fraction.truncate())

    val fraction2 = Fraction(2, 6)
    println(fraction.add(fraction2))

    val fraction3 = Fraction(1, 3)
    println(fraction.mult(fraction3))
}