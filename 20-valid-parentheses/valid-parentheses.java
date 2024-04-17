class Solution {
    //https://www.youtube.com/watch?v=TaWs8tIrnoA&ab_channel=NikhilLohia
    //time0(n),space0(n)
    //It's brilliant. The basic idea is to push the right parentheses ')', ']', or '}' into the stack each time when we encounter left ones. And if a right bracket appears in the string, we need check if the stack is empty and also whether the top element is the same with that right bracket. If not, the string is not a valid one. At last, we also need check if the stack is empty.
    public boolean isValid(String s) {
        
        Stack<Character> stack=new Stack<>();
        
        for(char ch:s.toCharArray()){
            
            if(ch=='('){
                
                stack.push(')');
            }
             
            else if(ch=='{'){
                
                stack.push('}');
            }
             
            else if(ch=='['){
                
                stack.push(']');
            }
             
            else if(stack.isEmpty()||stack.pop()!=ch){
                
               return false;
            }
            
            
        }
        
        return stack.isEmpty();
        
    }
}