// 1번
package d4Queue;

// 큐의 형태로 데이터를 관리하는 클래스
public class MyQueue {
  private int[] arr = new int[16];
  // 제일 앞의 데이터가 어딘지 확인하기 위한 front(데이터를 뺄 때 어디의 데이터를 뺄지를 결정하는)
  private int front = -1;
  // 제일 뒤의 데이터가 어딘지 나타내는 rear (데이터를 넣을 때 어디에 넣을지를 결정하는)
  private int rear = -1;
  // 데이터를 큐에 담기 위한 enQueue
  public void enQueue(int x) {
    // 넣어줄 공간을 설정하고
    rear++;
    // 해당 위치에 넣어준다.
    arr[rear] = x;
  }

  // 데이터를 꺼내기 위한 deQueue
  public int deQueue() {
    // 데이터를 가져올 공간을 설정하고
    front++;
    // 해당 위치에서 가져온다.
    return arr[front];
  }

  // Queue가 비어있는지 확인하기 위한 isEmpty
  public boolean isEmpty() {
    // front와 rear가 같은 index를 가리키면 비워있는 것이다.
    return this.front == this.rear;
  }

  // 잘못된 포화 상태 인식
  // 큐가 채워져있는지 확인하기 위한 isFull()
  public boolean isFull() {
    // front가 이동한 상황은 고려가 되지 않는다. (데이터를 deQueue한 것을 고려하지 않는다.)
    // 배열의 길이만큼 데이터를 넣는다면 더이상 쓰지 못한다.
    return this.rear == arr.length -1;
  }

  public static void main(String[] args) {
    MyQueue myQueue = new MyQueue();
    myQueue.enQueue(10);
    myQueue.enQueue(11);
    myQueue.enQueue(12);
    System.out.println(myQueue.isEmpty()); // false

    System.out.println(myQueue.deQueue()); // 10
    System.out.println(myQueue.deQueue()); // 11
    System.out.println(myQueue.deQueue()); // 12
    // 들어있는 데이터는 0개
    System.out.println(myQueue.isEmpty()); // true

    for (int i = 0; i < 13; i++) {
      myQueue.enQueue(i);
    }
    // 들어있는 데이터는 12개
    System.out.println(myQueue.deQueue());
    // 남은 공간이 4칸이어도 가득찼다고 인식한다.
    System.out.println(myQueue.isFull());
    // myQueue.enQueue(10);  // 오류
  }
}
