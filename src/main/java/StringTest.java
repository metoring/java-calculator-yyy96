import java.util.Scanner;

public class StringTest {
    String string;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StringTest stringTest = new StringTest("");

        String[] splitString = stringTest.getSplitString();
        String subString = stringTest.getRemoveParenthesis();
        int index = stringTest.setStringIndex();
        char word = stringTest.getStringIndex(index);
    }

    public StringTest(String string) {
        this.string = string;
    }

    //요구사항1
    public String[] getSplitString() {
        return string.split(",");
    }

    //요구사항2
    public String getRemoveParenthesis() {
        int open, close;
        open = string.indexOf('(');
        close = string.indexOf(')');
        return string.substring(open + 1, close);
    }

    //요구사항3
    public int setStringIndex() {
        System.out.println("index 를 입력하세요: ");
        int index = scanner.nextInt();
        indexOutOfBoundsException(index);
        return index;
    }

    public char getStringIndex(int index) {
        return string.charAt(index);
    }

    public void indexOutOfBoundsException(int index) {
        if (index < 0 || index >= string.length())
            throw new StringIndexOutOfBoundsException("index가 string범위를 벗어났습니다");
    }
}
