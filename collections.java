// task 1

import java.util.Scanner;
import java.util.ArrayList;

public class collections {
    public static void main(String[] args) {

        boolean flag = true;
        ArrayList <Float> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your first element.");
        while (true) {

            if (input.hasNext("quit")) {
                System.out.println("You've finished entering elements.");
                break;
            }
            else {
                if (input.hasNextFloat()) {
                System.out.println("Enter the next element. If you want to stop, enter 'quit'");
                list.add(input.nextFloat());
                }
                else {
                    System.out.println("Please, enter a real number.");
                    flag = false;
                    break;

                }
            }
        }

    if (flag) {
        int count = 0;
        float sum = 0;
        float result;
        System.out.println("Original version: " + list);
        System.out.println("Enter an index of the element, you'd like to replace");
        Scanner num = new Scanner(System.in);
        if (num.hasNextFloat()) {
            int InToRep = num.nextInt();
            for (int i = 0; i < InToRep; i++) {
                count += 1;
                sum += list.get(i);
                num.close();
            }
            result = sum / count;
            list.set(InToRep, result);
            System.out.println("Modified version: " + list);
        }

    }



    }
}
