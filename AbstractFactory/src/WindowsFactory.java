public class WindowsFactory extends ComponentFactory {

    @Override
    public Button createButton(String caption) {
        return new WindowsButton(caption);
    }

    @Override
    public CheckBox createCheckBox(boolean isChecked) {
        return new WindowsCheckBox(isChecked);
    }

    @Override
    public TextEdit createTextEdit(String value) {
        return new WindowsTextEdit(value);
    }
}
