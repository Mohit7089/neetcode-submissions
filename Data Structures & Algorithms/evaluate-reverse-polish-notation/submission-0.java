class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stk = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String ch = tokens[i];
            stk.push(tokens[i]);
            if (ch.equals("*") || ch.equals("+") || ch.equals("-") || ch.equals("/")) {
                String ch1 = stk.pop();
                int result = 0;
                int b = Integer.parseInt(stk.pop());
                int a = Integer.parseInt(stk.pop());
                switch (ch) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        result = a / b;
                        break;

                }
                stk.push(Integer.toString(result));

            }
        }
        return Integer.parseInt(stk.pop());

    }
}