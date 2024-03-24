public class methodoverloading {

    static int IntNumber(int x, int y){

        return x+y;

    }
   
    
    static double DoubleNumber(double x, double y){

        return x+y;

    }

    public static void main(String[] args){

        // IntNumber(12, 11);
        // DoubleNumber(10.10, 20.20);


        int mynumber1 = IntNumber(12, 012);
        double mynumber2 = DoubleNumber(10.00, 10.00);
        
        System.out.println("Int " +  mynumber1);
        System.out.println("Double " + mynumber2);
        

    }
   
}
