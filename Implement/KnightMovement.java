import java.util.Scanner;

public class KnightMovement {    
    public static void main (String[] arvs){
        Scanner sc = new Scanner(System.in);
        sc.close();
        
        // 나이트 위치 입력 받기
        String inputData = sc.nextLine();
        int row = inputData.charAt(1) - '0'; // 행 번호 추출 
        int column = inputData.charAt(0) - 'a' + 1; // 열 번호 추출 
        
        // 나이트 이동 가능 위치 
        int[] dx = {2, 2, -2, -2, 1, 1, -1, -1};
        int[] dy = {1, -1, 1, -1, 2, -2, 2, -2};

        
        int result = 0;
        for (int i = 0; i < 8; i++){
            // 이동하려는 위치 계산
            int nextRow = row + dx[i];  // 다음 행 위치 계산
            int nextColumn = column + dy[i];  // 다음 열 위치 계산 

            // 이동 가능하면, 카운트 증가
            if(nextRow >= 1 && nextRow < 8  && nextColumn >= 1 && nextColumn < 8) {
                result += 1;
            }
        }

        System.out.println(result);

    }
    
}
