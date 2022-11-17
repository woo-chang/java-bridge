package bridge.util;

public class NumericConverter implements Converter<String, Integer> {

    @Override
    public Integer convert(String from) {
        try {
            return Integer.parseInt(from);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("숫자로 변환할 수 없는 입력입니다. 입력 : %s", from));
        }
    }

}
