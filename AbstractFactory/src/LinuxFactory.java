public class LinuxFactory extends ComponentFactory {

    @Override
    public Button createButton(String caption) {
        return new LinuxButton(caption);
    }

    @Override
    public CheckBox createCheckBox(boolean isChecked) {
        return new LinuxCheckBox(isChecked);
    }

    @Override
    public TextEdit createTextEdit(String value) {
        return new LinuxTextEdit(value);
    }
}
