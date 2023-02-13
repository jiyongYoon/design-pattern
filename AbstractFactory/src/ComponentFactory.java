public abstract class ComponentFactory {
    public abstract Button createButton(String caption);
    public abstract CheckBox createCheckBox(boolean isChecked);
    public abstract TextEdit createTextEdit(String value);
}
