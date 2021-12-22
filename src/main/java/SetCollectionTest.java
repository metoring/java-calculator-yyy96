import java.util.HashSet;
import java.util.Set;

public class SetCollectionTest {

    private Set<Integer> numbers = new HashSet<>();

    //요구사항1
    public int getNumbersSize() {
        return numbers.size();
    }

    //요구사항2,3
    public boolean isNumbersContains(int i) {
        return numbers.contains(i);
    }
}
