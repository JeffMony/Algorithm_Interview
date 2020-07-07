

public class Main {
    public static void main(String[] args) {
        MinStack instance = new MinStack();
        instance.push(-2);
        instance.push(0);
        instance.push(-3);
        instance.pop();
        System.out.println(instance.getMin());
    }
}