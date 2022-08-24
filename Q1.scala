object Q1{

    def prime(a:Int,b:Int=2):Boolean= a match{
        case a if (a==b) => true;
        case a if(gcd(a,b)>1) => false;
        case _ => prime(a,b+1);
    }

    def gcd(a:Int,b:Int):Int= b match{
        case 0 => a;
        case b if(b>a) => gcd(b,a);
        case _ => gcd(b,a%b)
    }

    def main(args: Array[String]) = {
        print(prime(5))
    }

}