import java.io.BufferedReader;
import java.io.InputStreamReader;

public class snake {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        // 맵 크기 입력 받기 
        int N = input.charAt(0) - '0';
        int M = input.charAt(1) - '0';
        
        char[][] map = new char[N][M]; 
            for(int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    map[i][j] = '.';  // 맵 요소를 .으로 초기화 
                }
            }

        boolean moveRight = true;  // 오른쪽으로 이동하는지 여부 확인 
        for (int i = 0; i < N; i++) {
            if (moveRight) {
                // 오른쪽을 이동 후 이동경로 #으로 표시 
                for (int j = 0; j < M; j++) {
                    map[i][j] = '#';
                }
                // 이동 종료 
                moveRight = false;
            } 
            else {
                // 왼쪽으로 이동 후 이동경로 #으로 표시 
                for (int j = M-1; j >= 0; j--) {
                    map[i][j] = '#';
                }
                // 다시 오른쪽으로 이동 
                moveRight = true;
            }

             // N을 넘지 않는 경우 2행 아래로 이동 
             if (i + 2 < N) {
                i++; // 현재 이동을 마친 후 한 행을 더 내려감
                // 내려간 행은 오른쪽으로 이동할지, 왼쪽으로 이동할지에 따라 다른 방향으로 움직임
                if (moveRight) {
                    for (int j = 0; j < M; j++) {
                        map[i][j] = '#';
                    }
                    moveRight = false; // 다음번에는 왼쪽으로 이동
                } else {
                    for (int j = M - 1; j >= 0; j--) {
                        map[i][j] = '#';
                    }
                    moveRight = true; // 다음번에는 오른쪽으로 이동
                }
            }
        }
        
        // 결과 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
        
    }
        
}

