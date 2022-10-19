package com.pm.stack;

public class StackMain {

  public static void main(String[] args) {

    Stack stack = new Stack(2);

    stack.push(4);
    stack.push(6);

    stack.pop();

    stack.printStacks();
    stack.size();
    stack.getTop();
  }
}
