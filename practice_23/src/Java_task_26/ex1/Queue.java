package Java_task_26.ex1;

public interface Queue {
    Object dequeue();

    Object element();

    void enqueue(Object o);

    boolean isEmpty();

    boolean clear();
}
