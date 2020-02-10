# On-boarding 미션

## 1단계 - 학습 테스트 

### `String` 클래스에 대한 학습 테스트

#### 요구사항 1
- [x] `"1,2"`을 `,`로 `split` 했을 때 `1`과 `2`로 잘 분리되는지 확인하는 학습 테스트를 구현한다.
- [x] `"1"`을 `,`로 `split` 했을 때 `1`만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.

#### 요구사항 2
- [x] `"(1,2)"` 값이 주어졌을 때 `String`의 `substring()` 메소드를 활용해 `()`을 제거하고 `"1,2"`를 반환하도록 구현한다.

#### 요구사항 3
- [x] `"abc"` 값이 주어졌을 때 `String`의 `charAt()` 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트를 구현한다.
- [x] `String`의 `charAt()` 메소드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면 `StringIndexOutOfBoundsException`이 발생하는 부분에 대한 학습 테스트를 구현한다.

### `Set` Collection에 대한 학습 테스트

#### 요구사항 1
- [x] `Set`의 `size()` 메소드를 활용해 `Set`의 크기를 확인하는 학습테스트를 구현한다.

#### 요구사항 2
- [x] `Set`의 `contains()` 메소드를 활용해 `1`, `2`, `3`의 값이 존재하는지를 확인하는 학습테스트를 구현하려한다.
- [x] JUnit의 `ParameterizedTest`를 활용해 중복 코드를 제거해 본다.

#### 요구사항 3
- [x] 요구사항 2는 `contains` 메소드 결과 값이 `true`인 경우만 테스트 가능하다. 입력 값에 따라 결과 값이 다른 경우에 대한 테스트도 가능하도록 구현한다.

## 2단계 - 단위 테스트

### 단위 테스트 실습 - 문자열 계산기

#### 기능목록

- [x] 입력
    - 빈공백기준으로 문자열 분리
    - **예외처리**
        - [x] 숫자와 사칙연산이 아닌 모든 것들이 포함되어 있을 때
        - [x] 곱셈과 나눗셈이 공백없이 앞쪽에 붙어있는 숫자가 하나라도 존재 할 때
        - [x] 연산자가 숫자 뒤에 붙어있는 경우
        - [x] 전체 식이 사칙연산으로 끝나는 경우
        - [x] 입력값이 `double`의 범위를 넘어가는 경우 
        - [x] 숫자 또는 연산자가 연속하여 중복되는 경우
        - [x] 전체 식이 연산자와 공백으로 시작하는 경우
        - [x] 나누기 뒤에 0이 오는 경우
- [x] 사칙연산
    - [x] 수학적 순서 무시
    - **예외처리**
        - [ ] 결과값이 `double`의 범위를 넘어가는 경우
- [x] 출력
    - [x] 다시 실행할지 입력받기
        - **예외처리**
            - [x] `y`나 `n`이 아닌 경우 재입력

## 프로그래밍 요구사항
- Java 코드 컨벤션을 지키면서 프로그래밍한다.
- 3항 연산자를 쓰지 않는다.
- `else` 예약어를 쓰지 않는다. `switch`/`case`도 허용하지 않는다.
- indent depth를 1까지만 허용한다.
- 모든 함수의 길이를 10라인 이하로 제한한다.
- 모든 함수의 인자 수를 3개까지만 허용한다.
- 모든 함수의 인스턴스 변수를 3개까지만 허용한다.
- 모든 원시값과 문자열을 포장한다.
- 콜렉션에 대해 일급 콜렉션을 적용한다.
- 불필요한 `getter`/`setter` 없이 구현한다.
- JUnit의 `@DisplayName`을 활용해 테스트 메소드의 의도를 드러낸다.

## 우아한테크코스 코드리뷰
* [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)
