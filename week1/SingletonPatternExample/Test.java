public class Test {

    public static void main(String[] args){

        Logger object1=Logger.getLogger();

        Logger object2=Logger.getLogger();

        if(object2==object1){
            System.out.println("Successfully Implemented");
        }else{
            System.out.println("Not Implemented Correctly");
        }

    }

}