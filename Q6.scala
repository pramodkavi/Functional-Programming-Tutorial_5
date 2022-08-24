object Q6{

    def fibonacci(n:Int):Int = n match {
        case x if(x==0) => 0
        case x if(x==1)=> 1
        case _ => fabonacci(n-1)+fabonacci(n-2)
    }

    def fibonacciSeq(n:Int):Any={
        if(n>0) fibonacciSeq(n-1)
        println(fibonacci(n))
    } 

    def main(args: Array[String]) = {
        fibonacciSeq(10)
    }

}