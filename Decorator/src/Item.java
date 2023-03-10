public abstract class Item {
    public abstract int getLinesCount(); // 문자열이 몇 줄인지
    public abstract int getMaxLength(); // 가장 긴 문자열의 길이
    public abstract int getLength(int index); // 지정된 인덱스의 문자열의 길이
    public abstract String getString(int index); // 지정된 인덱스의 문자열
    public void print() {
        int cntLines = getLinesCount();
        for (int i = 0; i < cntLines; i++) {
            String string = getString(i);
            System.out.println(string);
        }
    }
}
