 public class Stringlength {
    public static void main(String[] args) {
        //comcatenation
        String firstname = "akshay";
        String lastname = "darekar";
        String fullname = firstname + " "+ lastname;
        // akshay@darekar
        System.out.println( "length is :" +fullname.length()); 

        //charAt method
        for(int i=0; i<fullname.length(); i++){
          System.out.println(fullname.charAt(i));

          

        }
        
    }
    
}
