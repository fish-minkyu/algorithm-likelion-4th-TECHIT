import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[][] board) {

        int n = board.length;
        int answer = n * n;
        List<List<Integer>> dangerous = new ArrayList<>();

        // {좌상단, 상단, 우상단, 좌측, 우측, 좌하단, 하단, 우하단} 순서
        int[] dY = {-1, -1, -1,  0,  0,  1,  1,  1}; // row 변화량
        int[] dX = {-1,  0,  1, -1,  1, -1,  0,  1}; // column 변화량

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 지뢰를 발견하면
                if (board[i][j] == 1) {
                    // 8방향으로 확인
                    List<Integer> bomb = new ArrayList<>();
                    bomb.add(i);
                    bomb.add(j);
                    if (!dangerous.contains(bomb)) dangerous.add(bomb);

                    for (int k = 0; k < dY.length; k++) {
                        int y = i + dY[k];
                        int x = j + dX[k];
                        // y, x의 값이 board 안에 있는지 확인
                        boolean withInHeight = 0 <= y && y < n;
                        boolean withInWidth = 0 <= x && x < n;

                        // 범위를 벗어나면 pass
                        if (!(withInHeight && withInWidth)) continue;

                        // 범위 안에 들어갔지만 dangerous에 이미 있는 위험지역이라면 pass
                        List<Integer> area = new ArrayList<>();
                        area.add(y);
                        area.add(x);

                        if (dangerous.contains(area)) continue;

                        // dangerous 2차원 배열에 추가
                        dangerous.add(area);
                    }
                }
            }
        }

        return answer - dangerous.toArray().length;
    }
}