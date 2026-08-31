public class forLoop {
    public static void main(String[] args) {

        //  Syntax:---->>
        //for(Initialization ; condition ; upadtion){
        //     // code.
        // }
         
        int i;
        for(i = 0 ; i<=3 ; i++)
        {
            System.out.println("i = " + i +" ");
        }

        // if we remove conditions its gives infinite msg 
        // msg++ => msg = msg + 1
        for(int msg = 0 ; msg <= 10 ; msg++){
            System.out.println("Hello World");
        }
    }
}
