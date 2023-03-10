import java.util.ArrayList;

public class Strings extends Item {
    private ArrayList<String> strings = new ArrayList<>();
    public void add(String item) {
        strings.add(item);
    }

    @Override
    public int getLinesCount() {
        return strings.size();
    }

    @Override
    public int getMaxLength() {
        if (strings.size() > 0) {
            return this.strings.stream()
                    .mapToInt(String::length)
                    .max()
                    .getAsInt();
        } else {
            return 0;
        }
    }

    @Override
    public int getLength(int index) {
        return strings.get(index).length();
    }

    @Override
    public String getString(int index) {
        return strings.get(index);
    }
}
