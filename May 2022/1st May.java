//Leetcode 844. Backspace String Compare

class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character> S = new Stack<>();   //creating stack to store characters
        Stack<Character> T = new Stack<>();
        ArrayList<Character> S1 = new ArrayList<>();  //final strings to be popped out of the stacks after iteration
        ArrayList<Character> T1 = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '#' && (S.empty() != true)){  //if character at ith index is # and the stack isn't empty pop the top of stack
                S.pop();
            }else if(s.charAt(i) != '#'){ //if not, push current character
                S.push(s.charAt(i));
            }
        }
        
        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) == '#' && (T.empty() != true)){
                T.pop();
            }else if(t.charAt(i) != '#'){
                T.push(t.charAt(i));
            }
        }
        
        while(S.empty() != true){
            S1.add(S.peek());   //adding remaining or final string to AL for final comparison
            S.pop();
        }
        
        while(T.empty() != true){
            T1.add(T.peek());
            T.pop();
        }
        
        if(S1.equals(T1) == true){    //final comparison
            return true;
        }else{
            return false;
        }
        
    }
}
