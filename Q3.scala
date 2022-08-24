object Q3{

    def addNumbers(n:Int):Int= n match{
        case n if(n==1) => 1
        case _ => n+addNumbers(n-1)
    }

    def main(args: Array[String]) = {
        print(addNumbers(5))
    }

}