object Q5{

    def isEven(n:Int):Boolean = n match {
        case 0 => true
        case _ => isOdd(n-1)
    }

    def isOdd(n:Int):Boolean = !(isEven(n))

    def allEven (n:Int):Any={
        if(isEven(n)) println(n)
        if(n>0) allEven(n-1)
    }

    def main(args: Array[String]) = {
        allEven(11)
    }

}