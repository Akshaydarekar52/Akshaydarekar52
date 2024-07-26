
public class Stringbuinsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);

        sb.insert(2, 'n');
        System.out.println(sb);

        // delete the extra n 
        sb.delete(2,4 );
        System.out.println(sb);
        
    }
    
}
