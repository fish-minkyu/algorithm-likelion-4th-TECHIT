package boj;
// 고무오리 디버
// https://www.acmicpc.net/status?user_id=e951219&problem_id=20001&from_mine=1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main20001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> problem = new Stack<>();

        while (true) {
            String duck = br.readLine();
            // break 조건 명시
            if ("고무오리 디버깅 끝".equals(duck)) break;

            // 문제라면 push
            if ("문제".equals(duck)) problem.push(duck);
            if (problem.isEmpty()) {
                if ("고무오리".equals(duck)) {
                    problem.push("문제");
                    problem.push("문제");
                }
            } else {
                if ("고무오리".equals(duck)) {
                    problem.pop();
                }
            }
        }
        // 순환 종료
        System.out.println(problem.empty() ? "고무오리야 사랑해" : "힝구");
    }
}
