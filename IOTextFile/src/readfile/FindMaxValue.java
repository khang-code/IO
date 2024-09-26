package readfile;
import java.util.List;
public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\khang\\c0624g1Module2\\IOTextFile\\src\\readfile\\number.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("D:\\khang\\c0624g1Module2\\IOTextFile\\src\\readfile\\result.txt", maxValue);
    }
}
