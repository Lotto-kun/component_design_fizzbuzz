public interface Rule {
    boolean apply(int num);
    String getResult(int num);
    int getRuleValue();
}