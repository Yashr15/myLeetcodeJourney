class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        Stack<String> stack = new Stack<>();
        for(String s : operations){
            if(s.equals("C")) {
                stack.pop();
            }else if(s.equals("D")){
                int a = Integer.parseInt(stack.peek()) * 2;
                String b = String.valueOf(a);
                stack.push(b);
            }else if(s.equals("+")){
                String temp = stack.pop();
                String temp2 = stack.peek();
                int sum = Integer.parseInt(temp) + Integer.parseInt(temp2);
                String result = String.valueOf(sum);
                stack.push(temp);
                stack.push(result);
            }else{
                stack.push(s);
            }
        }
        int sum = 0;
        while(!stack.isEmpty()) {
            int num = Integer.parseInt(stack.pop());
            sum += num;
        }
        return sum;
    }
}