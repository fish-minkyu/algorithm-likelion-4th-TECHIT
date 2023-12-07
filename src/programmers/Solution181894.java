package programmers;// 2의 영역
// https://school.programmers.co.kr/learn/courses/30/lessons/181894?language=java

public class Solution181894 {
//  public static int[] solution(int[] array) {
//    List<Integer> arr = new ArrayList<>();
//    // array을 for문으로 반복하여 2의 인덱스를 arr에 넣는다.
//    for (int i = 0; i < array.length; i++) {
//      if (array[i] == 2) arr.add(i);
//    }
//    // 배열이 비었을 경우 -1 반환
//    if (arr.isEmpty()) return new int[]{-1};
//    // arr의 처음과 끝의 인덱스를 뽑는다.
//    int a = arr.get(0);
//    int b = arr.get(arr.size() -1);
//    // 새로운 배열을 만든다.
//    return Arrays.copyOfRange(array, a, b+1);
//  }

  // 다른 2개의 방향으로 접근하는 문제를 2point 문제라고 한다.
  public static int[] solution(int[] array) {
    // 앞쪽 2의 위치 저장용 변수
    int front = -1; // flag
    // 각 원소를 앞에서부터 살펴본다.
    for (int i = 0; i < array.length; i++) {
      // 2를 찾으면 위치를 기록하고 반복을 중단한다.
      if (array[i] == 2) {
        front = i;
        break;
      }
    }
    // 만약 2를 찾지 못하면 front는 여전히 -1일 것이다.
    if (front == -1) return new int[]{-1};

    // 뒤쪽 2의 위치 저장용 변수
    int back = 0;
    // 각 원소를 뒤에서부터 살펴본다.
    for (int i = array.length-1; i >= 0; i--) {
      if (array[i] == 2) {
        back = i;
        break;
      }
    }

    // 필요한 길이의 배열을 만든다.
    int[] answer = new int[back - front + 1];
    // array[front] ~ array[back]까지 answer에 할당한다.
    for (int i = front; i <= back ; i++) {
      answer[i - front] = array[i];
    }

    return answer;
  }
}
