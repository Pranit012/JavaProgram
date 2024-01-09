package CoreJava;

public class Program2 {

    public static void main(String[] args) {

        int a = 12, b = 14, c = 18;

        if( (a>b) && (a>c) ){
            System.out.println(a);
        } else if ( (b>a) && (b>c)) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }


    }
}


//logical and : &&
//a   b       a*b;
//0   0       0
//0   1       0
//1   0       0
//1   1       1