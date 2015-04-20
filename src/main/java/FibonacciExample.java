import java.util.ArrayList;

/**
 * Created by РС on 20.04.2015.
 */
public class FibonacciExample {
    public static void main(String[] args) {
        int lastValue = 10000;
        int firstNumber = 1;
        int secondNumber = 2;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int tempValue = 0;
        while (tempValue < lastValue) {
            arrayList.add(firstNumber);
            tempValue = secondNumber;
            secondNumber = firstNumber + secondNumber;
            firstNumber = tempValue;
        }
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                list2.add(arrayList.get(i));
            }
        }
        print(list2);
        findSumOfElem(list2);
    }

    public static void print(ArrayList a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }

    public static void findSumOfElem(ArrayList a) {
        int sumV = 0;
        for (int i = 0; i < a.size(); i++) {
            sumV = (int) a.get(i)+sumV;
        }
        System.out.println("------------" + sumV + "------------");
    }
}
