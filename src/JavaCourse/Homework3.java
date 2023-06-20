package JavaCourse;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("notes3.txt", false)) {
            // запись всей строки
            Scanner scanner = new Scanner(System.in);
            String str = scanner.next();
            writer.write(str);
            // запись по символам
            writer.append('\n');


            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        try (FileReader reader = new FileReader("notes3.txt")) {
            // читаем посимвольно
            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
