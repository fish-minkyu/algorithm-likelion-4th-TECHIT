package boj.d3Stack;

// int 데이터를 스택의 형태로 관리할 수 있는 클래스
public class MyStack {
  // 배열로 실제 데이터 관리 & 보관
  private final int[] arr = new int[16]; // 배열이니까 그 크기가 정해져있다고 가정

  // 데이터를 얼마나 채워넣었는지 확인
  // 배열은 데이터를 얼만큼 넣었는지 알려주지 않기 때문
  private int top = -1;

  // 데이터 넣기 (필수)
  // x를 스택의 제일 위에 넣는다.
  public void push(int x) {
    if (top == arr.length -1) {
      throw new RuntimeException("stack is full");
    }

    this.top++;
    arr[this.top] = x;
  }

  // 데이터 회수 (필수)
  // 스택의 제일 위의 데이터를 꺼낸다.
  public int pop() {
    if (this.isEmpty()) {
      throw new RuntimeException("Stack is empty");
    }
    // 제일 위에 있는 데이터
    int value = arr[this.top];
    // 스택의 제일 윗칸을 줄여준다.
    this.top--;
    return value;
  }

  // 비어있는지 확인
  public boolean isEmpty() {
    return this.top == -1;
  }

  public static void main(String[] args) {
    MyStack intStack = new MyStack();
    intStack.push(10);
    intStack.push(15);
    intStack.push(20);
  }
}
