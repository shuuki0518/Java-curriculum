package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {
	
	//Q1 Stringとintを引数にとってメッセージ出力。
    public static void printMessage(String message, int version) {
        System.out.println(message + " " + version);
    }

    //Q2 intの積を出力。
    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    //Q3 配列の中身を1つずつ出力。
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.println(num);
        }
    }

    //Q4 Q2のオーバーロード（引数がdouble）で加算。
    public static void add(double a, double b) {
        System.out.println(a + b);
    }

    //Q5 0以外の1〜100の乱数を生成して出力＆返却。
    public static int[] generateRandomNumbers(int count) {
        Random rand = new Random();
        int[] numbers = new int[count];//count個の整数を保存するための配列を作成
        int i = 0;
        while (i < count) {
            int num = rand.nextInt(100) + 1; //1〜100（0を除く）
            if (num != 0) {
                numbers[i] = num;
                System.out.println(num);
                i++;
            }
        }
        return numbers;
    }

    //Q6 配列の平均を出力＆返却。
    public static double printAverage(int[] numbers) {
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = sum / numbers.length;
        System.out.println(average);
        return average;
    }

    //Q7 平均値が50以上かどうかをチェックしtrue/falseを出力＆返却。
    public static boolean isAverageAbove50(double average) {
        boolean result = average >= 50;
        System.out.println(result);
        return result;
    }
    //Q5 → Q6 → Q7は連携、乱数生成→平均計算→判定


	public static void main(String[] args) {
		
		//Q1
        printMessage("Hello JavaSE", 11);
        System.out.println();

        //Q2
        multiply(5, 3);
        System.out.println();
        
        //Q3
        int[] nums = {1, 2, 3, 4};
        printArray(nums);
        System.out.println();

        //Q4
        add(1.5, 2.5);
        System.out.println();

        //Q5
        int[] randomNumbers = generateRandomNumbers(4);
        System.out.println();

        //Q6
        double avg = printAverage(randomNumbers);
        System.out.println();

        //Q7
        isAverageAbove50(avg);
        System.out.println();
		
	}

}
