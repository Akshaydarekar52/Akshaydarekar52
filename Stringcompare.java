

public class Stringcompare {
    public static void main(String[] args) {
        //compare
        String name1= "akshay ";
        String name2= "darekar";

        // 1 s1 > s2 : +ve value 
        // 2 s1 == s2 : 0
        // 3 s1 < s2 : -ve value 
        if(name1.compareTo(name2)==0) {
            System.out.println("strings are equal");
        } else{
            System.out.println("strings are not equal");
        }
    }
    
}
