package Implement;
// 2차원 공간에서의 방향 벡터 
public class DirectionVector {
    public static void main (String[] args){
        // 방향 벡터 초기화
        // 동, 북, 서, 남
        int[] dx = {0, -1, 0, 1};
        int[] dy = {1, 0, -1, 0}; 

        // 현재 위치 (2, 2)
        int x = 2;
        int y = 2;

        // 방향 벡터를 사용해 다음 위치 계산
        for (int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            System.out.println("(" + nx + "," + ny + ")");
        }
    }
}