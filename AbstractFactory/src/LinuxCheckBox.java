public class LinuxCheckBox extends CheckBox {

    public LinuxCheckBox(boolean isChecked) {
        super(isChecked);
    }

    @Override
    void render() {
        System.out.println(
            "Linux 렌더링 API를 이용해 "
            + (this.isChecked ? "체크 된 " : "체크 안 된 ")
            + "체크 박스를 그립니다."
        );
    }
}
