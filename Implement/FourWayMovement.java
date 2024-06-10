/* 여행가 A는 N X N 크기의 정사각형 공간 위에 서 있습니다.
 * 이 공간은 1 X 1 크기의 정사각형으로 나누어져 있습니다.
 * 가장 왼쪽 위는 (1, 1)이며, 가장 오른쪽 아래 좌표는 (N, N)입니다.
 * 여행가 A는 상 하 좌 우 방향으로 이동 할 수 있으며 시작 좌표는 항상 (1, 1)입니다.
 * 계획서에는 하나의 줄에 띄어쓰기를 기준으로 L R U D 중 하나의 문자가 반복적으로 적혀 있습니다.
 * L : 왼쪽으로 한 칸 이동
 * R : 오른쪽으로 한 칸 이동
 * U : 위로 한 칸 이동
 * D : 아래로 한 칸 이동 
 * A가 N X N 크기의 공간을 벗어나는 움직임은 무시됩니다.
 */

import java.util.Scanner;

public class FourWayMovement {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
            // 공간 크기 N 입력받기
            int n = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기
            // 이동 계획을 입력받고 공백을 기준으로 나누어 배열에 저장
            String[] plans = sc.nextLine().split(" ");
            // 초기 위치 설정 
            int x = 1;
            int y = 1;

            // L, R, U, D에 따른 이동 방향
            int[] dx = {0, 0, -1, 1}; // 행 이동 방향
            int[] dy = {-1, 1, 0, 0}; // 열 이동 방향 

            char[] moveTypes = {'L', 'R', 'U', 'D'};

            // 이동 계획 하나씩 확인하기 
            for(int i = 0; i < plans.length; i++){
                char plan = plans[i].charAt(0);  // 현재 이동 계획 가져오기

                // 이동 후 이동 좌표 초기화 
                int nx = -1;
                int ny = -1;
                
                // 현재 이동 계획에 따라 새로운 좌표를 계산
                for(int j = 0; j < 4; j++){
                    if(plan == moveTypes[j]){
                        nx = x + dx[j];
                        ny = y + dy[j];
                    }
                }

                // 공간을 벗어나는 경우 무시하기
                if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
                // 현재 위치 업데이트 
                x = nx;
                y = ny;
            }
            System.out.println(x + " " + y);
        
    }
 }