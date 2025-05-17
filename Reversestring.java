public class Reversestring {
public static  String resversestring (String str){
    if (str.length() <= 0){
        return str ;

    }
    String reversed = " ";
    for (int i = str.length()-1 ; i >=  0; i--){
            System.out.println(str.charAt(i));
        reversed += str.charAt(i);    
}
return reversed;
}
    public static void main (String [] args ){
        String input = "hello ";
        String result = resversestring(input);
        System.out.print("Reversed string : " + result);
        
        }

    }

