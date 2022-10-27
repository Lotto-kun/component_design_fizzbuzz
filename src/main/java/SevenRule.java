public class SevenRule implements Rule{
    private final int ruleValue = 7;
    private final String result = "Jazz";

    @Override
    public boolean apply(int num) {
        return num % ruleValue == 0;
    }

    @Override
    public String getResult(int num) {
        if (apply(num)) {
            return result;
        }
        return String.valueOf(num);
    }

    public int getRuleValue(){
        return ruleValue;
    }
}
