package activities.eight;

public class Main {
    public static void exceptionTest(String str) throws CustomException{
        if(str == null){
            throw new CustomException("String is totally null");
        }else{
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        try{
            exceptionTest("surya");
            exceptionTest(null);
            exceptionTest("won't check");
        } catch (CustomException e) {
            System.out.println("Get the message from Custom class  : " + e.getMessage());
        }

    }
}
