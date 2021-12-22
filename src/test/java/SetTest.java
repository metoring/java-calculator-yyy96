import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("요구사항1) Set 크기 확인 테스트")
    void getSetSize() {
        int size = numbers.size();
        Assertions.assertThat(size).isEqualTo(3);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    @DisplayName("요구사항2) 1,2,3 존재 여부 참인지 테스트")
    void isContainsTrue(int number) {
        Assertions.assertThat(numbers.contains(number)).isTrue();
    }


    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "4:false"}, delimiter = ':')
    @DisplayName("요구사항3) 1,2,4 존재 여부 참,거짓 테스트")
    void isContains(int number, boolean expected) {
        Assertions.assertThat(numbers.contains(number)).isEqualTo(expected);
    }

}