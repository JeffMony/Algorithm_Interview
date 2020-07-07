
import java.util.Stack;

class MinStack {
    private int mMinValue;
    private Stack<Integer> mStack;
    /** initialize your data structure here. */
    public MinStack() {
        mMinValue = Integer.MAX_VALUE;
        mStack  = new Stack<Integer>();
    }
    
    public void push(int x) {
        if(mMinValue >= x){
            mStack.push(mMinValue);
            mMinValue = x;
        }
        mStack.push(x);
    }

    public void pop() {
        if(mStack.pop() == mMinValue){
            mMinValue = mStack.pop();
        }
    }
    
    public int top() {
        return mStack.peek();
    }
    
    public int getMin() {
        return mMinValue;
    }
}