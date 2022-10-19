package com.pm.queue;

public class QueueMain {

  public static void main(String[] args) {

    Queue queue = new Queue(5);

    queue.enqueue(10);
    queue.enqueue(20);

    queue.dequeue();

    queue.printQueue();
    System.out.println("\n------------------");
    queue.first();
    queue.last();
    queue.size();
  }
}
