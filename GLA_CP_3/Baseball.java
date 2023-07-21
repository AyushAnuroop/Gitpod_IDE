package GLA_CP_3;

import java.util.Stack;

public class Baseball {

    public static int totalScore(String [] arr,int n){
        Stack<Integer> s = new Stack<>();
        for(int i=0 ; i<n ; i++){
            if(arr[i].equals("C")){
                s.pop();
            }
            else if(arr[i].equals("D")){
                s.push(s.peek()*2);
            }
            else if(arr[i].equals("+")){
                int top = s.pop();
                int newSum = s.peek()+top;
                s.push(top);
                s.push(newSum);
            }
            else{
                s.push(Integer.parseInt(arr[i]));
            }
        }

        int sum=0;
        while(!s.isEmpty()){
            sum+=s.pop();
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        String [] arr = {"5","2","C","D","+"};
        int val = totalScore(arr, n);
        System.out.println(val);
    }
}
