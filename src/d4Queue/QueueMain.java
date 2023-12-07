// 4번
package d4Queue;

import java.util.LinkedList;
import java.util.Queue;

// 큐는 인터페이스다.
// 스택은 구상 클래스다.
// collections method: add, remove, element
// Queue method: offer, poll, peek
public class QueueMain {
  public static void main(String[] args) {
    // java의 기본 Queue는 LinkedList를 활용한다.
    Queue<Integer> queue = new LinkedList<>(); // Deque를 상속 받고 있으므로 Queue를 구현할 수 있다.
    // enque 메서드 - add, offer
    // add: 넣기를 시도하고, 예외를 발생시킨다.
    queue.add(10);
    queue.add(20);
    queue.add(30);
    // 넣는다란 기능은 add와 동일하다.
    // add와 offer의 차이는 오류상황에 대한 대처가 조금 다르다.
    // offet: 넣기를 시도하고, 실패할 경우 false를 반환한다.(offer 사용을 권장한다.)
    queue.offer(15);
    queue.offer(25);
    queue.offer(35);

    // deQueue 메서드 = remove, poll
    // remove: 빼기를 시도하고, 실패할 경우 예외를 발생시킨다.
    System.out.println(queue.remove());
    System.out.println(queue.remove());
    System.out.println(queue.remove());

    // poll: 빼기를 시도하고, 실패할 경우 null을 반환한다.
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    // 예외가 발생, 프로그램 종료
//    System.out.println(queue.remove());
    // 예외가 발생하지 않고 null을 출력
    System.out.println(queue.poll());

    // 즉, offer와 poll을 우선 사용하는 것이 좋다.

    // 다음에 등장할 아이템을 확인하는 메서드 - element, peek
    // element: 비어있을 경우 예외 발생
//    System.out.println(queue.element());
    // peek: 비어있을 경우 null 반환
    System.out.println(queue.peek());

    // 비어있는지 확인
    System.out.println(queue.isEmpty());
    // 몇개 있는지 확인
    System.out.println(queue.size());
  }
}
