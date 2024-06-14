// 게임 개발 시뮬레이션 문제 
// 방향을 설정해서 이동하는 문제 유형 : dx, dy 리스트를 만들어 방향을 정할 것

import java.util.Scanner;

public class GameMap {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 맵 크기 입력 받기 
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // 캐릭터 좌표 입력 받기
        int A = sc.nextInt();
        int B = sc.nextInt();

        // 캐릭터 방향 입력 받기
        int d = sc.nextInt();

        // 맵 정보 
        int[][] map = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j; j < M; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        

        

        


    }
}
