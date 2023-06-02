public class P13creatingString {
    public static void main(String[] args) {
        // String s1 = "Hello";
        // String s2 = "Hello";

        String s1 = new String("Hello");
        String s2 = new String("Hello");

        if(s1==s2){
            System.out.println("Same");
        }

       else{
        System.out.println("Different");
       }
    }
    
}
