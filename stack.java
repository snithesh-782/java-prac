import java.util.*;
interface Stack<T> {
void push(T item) throws Exception;
T pop() throws Exception;
T peek() throws Exception;
boolean isEmpty();
boolean isFull();
}
class StackFullException extends Exception {
Stack FullException(String msg) { super(msg); }
}
class StackEmptyException extends Exception {
Stack EmptyException(String msg) { super (msg); }
}
class ArrayStack<T> implements Stack<T> {
private Object[] arr;
private int top;
private int capacity;
ArrayStack(int size) {
capacity = size;
arr = new Object[capacity];
top = -1;
}
public void push(T item) throws Exception {
if (isFull())
throw new StackFullException("Stack Overflow: cannot push, stack is full");
arr[++top] = item;
}
@SuppressWarnings("unchecked")
public T pop() throws Exception{
if (isEmpty())
throw new StackEmptyException("Stack Underflow: cannot pop, stack is empty");
return (T) arr[top--];
}
@suppressWarnssings("unchecked")
public T peek() throws Exception {
if (isEmpty())
throw new StackEmptyException("Stack is empty");
return (T) arr[top];
}
public boolean isEmpty() { return top == -1; }
public boolean isFull() { return top == capacity - 1; }
}
public class StackDemo{
public static void main(String[] args) {
ArrayStack<integer> stack = new ArrayStack<>(5);
try{
stack.push(10);
stack.push(20);
stack.push(30);
stack.push(40);
stack.push(50);
System.out.println("Stack full? " + stack.isFull());
stack.push(60);
} catch (Exception e) {
System.out.println("Exception: " + e.getmsg());
}
try{
System.out.println("Peek: " + stack.peek());
while (!stack.isEmpty()) {
System.out.println("Popped: " + stack.pop());
}
stack.pop();
} catch (Exception e){
System.out.println("Exception: " + e.getmes());
}
}
}