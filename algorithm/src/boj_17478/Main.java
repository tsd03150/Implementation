package boj_17478;

import java.util.Scanner;

class Main {
    static int max;

    public void DFS(int n) {
        DFS2(n);
        System.out.println("\"재귀함수가 뭔가요?\"");
        if (n == 0) {
            DFS2(n);
            System.out.println("\"재귀함수는 자기 자신을 호출하는 함수라네\"");
        } else {
            DFS2(n);
            System.out.println("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
            DFS2(n);
            System.out.println("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
            DFS2(n);
            System.out.println("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
            DFS(n - 1);
        }
        DFS2(n);
        System.out.println("라고 답변하였지.");
    }
    public void DFS2(int num) {
        for (int i = num; i < max; i++) {
            System.out.print("____");
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        max = n;
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        T.DFS(n);
    }
}