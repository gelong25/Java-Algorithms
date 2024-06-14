// 게임 개발 시뮬레이션 문제 
// 방향을 설정해서 이동하는 문제 유형 : dx, dy 리스트를 만들어 방향을 정할 것

import java.util.Scanner;


public class GameMap {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 맵 크기 입력 받기 
        int N = sc.nextInt();  // 맵의 세로 크기
        int M = sc.nextInt();  // 맵의 가로 크기 
        
        // 캐릭터 좌표 입력 받기
        int A = sc.nextInt();  // 캐릭터 초기 x좌표
        int B = sc.nextInt();  // 캐릭터 초기 y좌표 

        // 캐릭터 방향 입력 받기
        int d = sc.nextInt();  // 0: 북, 1: 동, 2: 남, 3: 서 

        // 맵 정보 
        int[][] map = new int[N][M];   // 맵 정보를 저장할 2차원 배열 선언 
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = sc.nextInt();  // 각 칸의 상태를 입력 받아 저장 
            }
        }

        // 방문 기록을 위한 배열 초기화
        boolean[][] visited = new boolean[N][M];
        visited[A][B] = true;  // 캐릭터 시작 위치는 방문 처리 

        // 북, 동, 남, 서 방향 배열
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        int visitCnt = 1; // 방문 횟수를 1로 초기화 (시작 위치는 방문 처리)
        int turnCnt = 0;  // 회전 횟수 선언 

        // 방향을 왼쪽으로 회전
        d -= -1;
        if(d == -3) {
            d = 3; 
        }

        while(true) {
            int nx = A + dx[d]; // 회전한 방향의 x 좌표
            int ny = B + dy[d]; // 회전한 방향의 y 좌표 
            
            // 만약 방문 전이고 육지이면
            if(!visited[nx][ny] && map[nx][ny] == 0) {  
                visited[nx][ny] = true;   // 새로운 위치 방문 처리 
                A = nx;     // 새로운 x 좌표로 이동
                B = ny;     // 새로운 y 좌표로 이동 
                turnCnt = 0;  // 방향 전환 횟수 증가 
                visitCnt++;   // 방문 횟수 증가 
                continue;
            }
            else {
                turnCnt++;   // 회전한 방향으로 이동할 수 없으면 방향 전환 횟수 증가 
            }
            
            if (turnCnt == 4) {  // 네 방향 모두 이동 불가한 경우 
                nx = A - dx[d];  // 바라보는 방향의 반대 방향으로 이동 
                ny = B - dy[d];  

                if(map[nx][ny] == 0) {  // 뒤로 이동 가능한 경우
                    A = nx;  // 새로운 x 좌표로 이동
                    B = ny;  // 새로운 y 좌표로 이동 
                }
                else {
                    break;
                }
                turnCnt = 0;   // 방향 전환 횟수 초기화 
            }
        }
        
        // 방문한 횟수 출력
        System.out.println(visitCnt);

    }
}
