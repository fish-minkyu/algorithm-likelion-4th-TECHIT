package programmers;// 카운트 다운
// https://school.programmers.co.kr/learn/courses/30/lessons/181899
import java.util.ArrayList;
import java.util.List;

class Solution181899 {
  public List<Integer> solution(int start, int end_num) {
    List<Integer> result = new ArrayList<>();

    for (int i = start; i >= end_num; i--) {
      result.add(i);
    }

    return result;
  }
}