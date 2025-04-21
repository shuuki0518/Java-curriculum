package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int numStudents;

        //生徒の人数チェック。2人以上が入力されるまで繰り返し
        //必ず1回以上実行する
        do {
            System.out.print("生徒の人数を入力してください（2以上）: ");
            numStudents = sc.nextInt();
        } while (numStudents < 2);//2未満で再度入力

        //教科数と教科名を配列で管理
        String[] subjects = {"英語", "数学", "理科", "社会"};
        int subjectCount = subjects.length;

        //各教科の合計
        int[] subjectTotals = new int[subjectCount];//書く教科の合計点
        double[] studentAverages = new double[numStudents];//生徒の平均点を格納する配列

        //生徒ごとの点数入力と平均計算
        //入力した生徒分ループ
        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            for (int j = 0; j < subjectCount; j++) {
                System.out.printf("%d人目の『%s』の点数を入力してください : ", i + 1, subjects[j]);
                int score = sc.nextInt();
                total += score;//生徒の点数を加算する
                subjectTotals[j] += score;//教科ごとの合計点数
            }
            System.out.println();
            studentAverages[i] = (double) total / subjectCount;//生徒の平均点
        }

        System.out.println();

        //生徒ごとの平均点出力
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%d人目の平均点は%.2f点です。\n", i + 1, studentAverages[i]);
        }

        System.out.println();

        //各教科の平均点出力
        double allTotal = 0;
        for (int i = 0; i < subjectCount; i++) {
            double average = (double) subjectTotals[i] / numStudents;
            System.out.printf("%sの平均点は%.2f点です。\n", subjects[i], average);
            allTotal += subjectTotals[i];
        }

        //全体平均点出力
        //得点合計 / 合計人数 *　教科数 
        double overallAverage = allTotal / (numStudents * subjectCount);
        System.out.printf("全体の平均点は%.2f点です。\n", overallAverage);
		
	}

}
