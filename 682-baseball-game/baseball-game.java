class Solution {
    public int calPoints(String[] operations) {
         Stack<Integer> stack = new Stack<>();

        for (String op : operations) {

            if (op.equals("+")) {
                int a = stack.pop();
                int b = stack.peek();
                int sum = a + b;
                stack.push(a);      // push back
                stack.push(sum);

            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());

            } else if (op.equals("C")) {
                stack.pop();

            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        int total = 0;
        for (int num : stack) {
            total += num;
        }

        return total;
    }
}