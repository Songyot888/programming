import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class D {
    public static void main(String[] args) throws Exception, IOException {
        D run = new D();
        run.program();

    }

    void program() {
        String data = input();
        String result = result(data);
        file(result);

        output();

    }

    String input() {
        Scanner sysIn = new Scanner(System.in);
        String data = sysIn.nextLine();
        String data_clean = data_convertor(data);

        return data_clean;

    }

    String data_convertor(String data) {
        String data_cleaned = "";
        for (char c : data.toCharArray()) {
            data_cleaned += Character.toLowerCase(c);

        }

        String number = number(data_cleaned);

        return number;
    }

    String number(String data_cleaned) {
        // System.out.println(data_cleaned);
        String[] data_contain = data_cleaned.split(" ");

        String data = "";
        for (String s : data_contain) {
            data += convertToNumber(s);

        }

        // System.out.println(data);

        return data;

    }

    String convertToNumber(String numbers) {
        String[] _case = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String[] _value = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

        String number = "";

        for (int i = 0; i < _case.length; i++) {
            if (numbers.equals(_case[i])) {
                number = _value[i];
                break;

            } else {
                number = " " + numbers + " ";

            }

        }

        return number;

    }

    String convertToStr(String result) {
        String[] _case = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        char[] _value = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

        String number = "";

        for (int i = 0; i < result.length(); i++) {
            for (int c = 0; c < _value.length; c++) {
                if (result.charAt(i) == _value[c]) {
                    number += _case[c] + " ";
                    break;

                } else {
                    continue;

                }
            }

        }

        return number;

    }

    // result
    String result(String data) {
        // System.out.println(data);
        String output = data + "=";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(data);

        int numbers[] = new int[2];

        int index = 0;
        while (matcher.find()) {
            numbers[index] = Integer.parseInt(matcher.group());
            // System.out.println(matcher.group());
            index++;

        }

        char op = operator(data);
        // System.out.println(op);

        int result = 0;
        switch (op) {
            case '+':
                result = numbers[0] + numbers[1];

                break;

            case '-':
                result = numbers[0] - numbers[1];

                break;
            case '*':
                result = numbers[0] * numbers[1];

                break;
            case '/':
                result = numbers[0] / numbers[1];

                break;

            case '%':
                result = numbers[0] % numbers[1];

                break;

            default:
                break;
        }

        output += result + "\n";
        output += convertToStr(result + "");

        return output;

    }

    // split number
    // split operator
    char operator(String data) {
        String operator[] = data.split("\\d+");

        String op_result = "";
        for (String op : operator) {
            // System.out.println(op);
            if (!op.isEmpty()) {
                op_result = op;

            }

        }

        return op_result.charAt(1);

    }

    void output() {
        String file_path = System.getProperty("user.dir") + "/Ex_D/result.txt";
        try {
            Scanner readFile = new Scanner(new File(file_path));

            while (readFile.hasNextLine()) {
                System.out.println(readFile.nextLine());

            }

            readFile.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("File not found");

        }

    }

    // error case

    // file read write
    void file(String result) {
        File file = new File((System.getProperty("user.dir") + "/Ex_D/") + "result.txt");

        try {
            file.createNewFile();

            FileWriter writer = new FileWriter(file);

            writer.append(result);
            writer.close();

        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Ex_D.file() was denied");
        }

    }

}