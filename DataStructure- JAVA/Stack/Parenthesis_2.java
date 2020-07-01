package Stack;
import java.util.*;


class Parenthesis_2 {
    public static boolean match(String parens) {
        //write your code here
        Stack<Character> parenthesis=new Stack<Character>();
        int len = parens.length();
       Character[] chars = new Character[len];
       for (int i = 0; i < len ; i++) {
          chars[i] = parens.charAt(i);
         // System.out.print(chars[i]+" ");
       }
       //System.out.println();
        
        for(Character c: chars){
            if(c=='('){
                parenthesis.push('(');
            }
            else{
                if(!parenthesis.isEmpty()){
                    if(parenthesis.peek()=='('){
                        parenthesis.pop();
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            //System.out.println(parenthesis);
        }
        if(parenthesis.isEmpty()){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(match(in.nextLine()));
        in.close();
    }
}