import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack; // khởi tạo linkedList...

    public MyGenericStack(){
        stack = new LinkedList<>();
    }
    // Phương thức push()...Thêm đầu.
    public void push(T element){
        stack.push(element);
    }
    // Phương thức pop()...Xoá đầu tiên.
    public T pop(){
        if (stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.pop();
    }
    // Phương thức size...đếm số lượng trong stack.
    public  int size(){
        return stack.size();
    }
    // Phương thức isEmpty...trả giá trị true nếu rỗng...
    public boolean isEmpty(){
        if(stack.size()==0){
            return true;
        }
        return false;
    }
}
