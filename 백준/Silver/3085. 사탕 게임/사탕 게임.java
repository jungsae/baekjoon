import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
    static int N, answer=Integer.MIN_VALUE;
    static char[][] board;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        board = new char[N][N];
        for (int i = 0; i < N; i++) {
            String input = bf.readLine();
            for (int j = 0; j < N; j++) {
                board[i][j] = input.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                checkSameColor(i, j);
            }
        }
        System.out.println(answer);

    }

    static void checkSameColor(int x, int y){
        //상,하,좌,우에 다른 색이 있는지 탐색
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<N && ny>=0 && ny<N){
                //인접한 사탕이 다르다면
                if(board[nx][ny] != board[x][y]){
                    //swap
                    char tmp = board[x][y];
                    board[x][y] = board[nx][ny];
                    board[nx][ny] = tmp;
                    //같은색 가장 긴 연속부분 찾아서 answer에 저장
                    answer = Math.max(answer, longLengthCount());
                    //swap(원래대로 되돌리기)
                    char tmp2 = board[x][y];
                    board[x][y] = board[nx][ny];
                    board[nx][ny] = tmp2;
                }
            }
        }
    }

    static int longLengthCount() {
        int maxC = 0, maxP = 0, maxZ = 0, maxY = 0;

        // Check each row
        for (int i = 0; i < N; i++) {
            int cntC = 1, cntP = 1, cntZ = 1, cntY = 1;
            for (int j = 0; j < N - 1; j++) {
                if (board[i][j] == board[i][j + 1]) {
                    if (board[i][j] == 'C') cntC++;
                    else if (board[i][j] == 'P') cntP++;
                    else if (board[i][j] == 'Z') cntZ++;
                    else if (board[i][j] == 'Y') cntY++;
                } else {
                    maxC = Math.max(maxC, cntC);
                    maxP = Math.max(maxP, cntP);
                    maxZ = Math.max(maxZ, cntZ);
                    maxY = Math.max(maxY, cntY);

                    cntC = 1;
                    cntP = 1;
                    cntZ = 1;
                    cntY = 1;
                }
            }
            maxC = Math.max(maxC, cntC);
            maxP = Math.max(maxP, cntP);
            maxZ = Math.max(maxZ, cntZ);
            maxY = Math.max(maxY, cntY);
        }

        // Check each column
        for (int i = 0; i < N; i++) {
            int cntC = 1, cntP = 1, cntZ = 1, cntY = 1;
            for (int j = 0; j < N - 1; j++) {
                if (board[j][i] == board[j + 1][i]) {
                    if (board[j][i] == 'C') cntC++;
                    else if (board[j][i] == 'P') cntP++;
                    else if (board[j][i] == 'Z') cntZ++;
                    else if (board[j][i] == 'Y') cntY++;
                } else {
                    maxC = Math.max(maxC, cntC);
                    maxP = Math.max(maxP, cntP);
                    maxZ = Math.max(maxZ, cntZ);
                    maxY = Math.max(maxY, cntY);

                    cntC = 1;
                    cntP = 1;
                    cntZ = 1;
                    cntY = 1;
                }
            }
            maxC = Math.max(maxC, cntC);
            maxP = Math.max(maxP, cntP);
            maxZ = Math.max(maxZ, cntZ);
            maxY = Math.max(maxY, cntY);
        }

        return Math.max(Math.max(maxC, maxP), Math.max(maxZ, maxY));
    }


}