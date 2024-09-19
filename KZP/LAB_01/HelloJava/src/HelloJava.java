import java.io.*;
import java.util.*;

public class HelloJava {

    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        char[][] arr;
        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        System.out.print("Введіть розмір квадратної матриці: ");
        nRows = in.nextInt();
        in.nextLine();

        System.out.print("\nВведіть символ-заповнювач: ");
        filler = in.nextLine();

        char fillChar = filler.charAt(0);

        arr = new char[nRows][nRows];

        // Заповнення масиву нулями
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nRows; j++) {
                arr[i][j] = '0';
                          }
        }

        // Заповнення масиву
        for (int i = nRows / 2; i < nRows; i++) {
            int start = (nRows - 1) / 2 - (i - nRows / 2);
            int end = (nRows - 1) / 2 + (i - nRows / 2);

            for (int j = start; j <= end; j++) {
                arr[i][j] = fillChar;
            }
        }

        // Виведення результату
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nRows; j++) {
                System.out.print(arr[i][j] + " ");
                fout.print(arr[i][j] + " ");
            }
            System.out.println();
            fout.println();
        }

        fout.flush();
        fout.close();
    }
}