// 5 x 5 행렬 생성하는 프로그램 
public class MatrixIndexPrinter {
    public static void main (String[] args) {
        // 이중 for 문을 사용해 2차원 배열 출력  
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("(" + i + "," + j + ")");
            }
            System.out.println();  // 행이 끝날 때마다 줄 바꿈 
        }
    }
} 