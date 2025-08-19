package boj.d3Stack;

import java.util.Stack;

// 괄호 검사 테스트(소괄호만)
// 열 때 push, 닫을 때 pop
public class ParTest {
  // 메서드 추출 형태
    public static boolean test(String target) {
      Stack<Character> charStack = new Stack<>();
      // 1. target의 각 글자를 확인한다.
      for (int i = 0; i < target.length(); i++) {
        char next = target.charAt(i);
        // 2. 여는 괄호를 만나면 push
        if (next == '(') {
          charStack.push(next);
        }
        // 3. 닫는 괄호를 만나면, 상황에 따라 pop을 하는데,
        else {
          // 3-1. stack이 비어있다 == 정당한 괄호가 아니다.
          if (charStack.empty()) {
            // 결과는 false다
            return false;
          }
          // 3-2. stack이 비어있지 않으면 pop
          else charStack.pop();
        }
      }
      // 4. 문자열 내부 글자를 다 확인했으면, 스택이 비어있는지가 답이다.
      return charStack.empty();
    }

    // main 메소드에선 return을 할 수 없음
    public static void main(String[] args) { // main 메서드여서 break를 해줬지 따로 메소드를 만들었다면 return해줘
      // target이 맞는 괄호 조합인지 확인하고 싶다.
      // pop하는데 실패했다를 확인하는 용도
      boolean success = true; // flag
      String target = "(()((())))";
      Stack<Character> charStack = new Stack<>(); // Stack<String>도 상관없으나 java는 문자열에서 문자를 뽑을 때 character를 선호하는 경향이 있음
      // 1. target의 각 글자를 확인한다.
      for (int i = 0; i < target.length(); i++) {
        char next = target.charAt(i);
        // 2. 여는 괄호를 만나면 push
        if (next == '(') {
          charStack.push(next);
        }
        // 3. 닫는 괄호를 만나면, 상황에 따라 pop을 하는데,
        else {
          // 3-1. stack이 비어 있다 == 정당한 괄호가 아니다.
          if (charStack.empty()) {
            System.out.println("NO");
            success = false;
            // 나머지는 볼 필요가 없다. <- 가장 가까운 반복문이 부서진다.
            break;
          }
          // 3-2. stack이 비어있지 않으면 pop(괄호가 한 종류이므로 else문만 써도 충분하다.)
          else charStack.pop();
        }
      }
      // 4. 문자열 내부 글자를 다 확인했으면, 스택이 비어있는지가 답이다.
      if (charStack.empty() && success) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }



