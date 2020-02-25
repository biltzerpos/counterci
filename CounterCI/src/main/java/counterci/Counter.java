package counterci;

public class Counter {

    private int data;
    
    public Counter() {
        data = 1;
    }
    
    public int increment() {
        data++;
        return data;
    }
    
    public int decrement() {
        data--;
        return data;
    }
    
    public int getValue() {
        return data;
    }
}