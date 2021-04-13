package testautomationuniversity;

public class Chapter13b {
    public static void main(String[] args) {
        divider2();
       //divider();
        try{
            int c = 30/0;
        }catch(ArithmeticException e){
            System.out.println("Dividing by zero is not permitted");
        }finally{
            System.out.println("Division is fun!");
        }
    try{
        int z = 11 / 0;
    }catch(ArithmeticException x){
        System.out.println("Dividing by zero is illegal!");
    }finally{
        System.out.println("but don't be discouraged, try again");
        }

    try {
        int v = 0 / 0;
    }catch(ArithmeticException b){
        System.out.println("What yer doing aint taken kindly to around these parts");
     }finally{
        System.out.println("beepbop");
    }
    }
    static void divider2() throws ArithmeticException {
        int c = 30/0;
        System.out.println("this throws arithmetic exception");
    }
}

