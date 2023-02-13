public class LinuxTextEdit extends TextEdit {

    public LinuxTextEdit(String value) {
        super(value);
    }

    @Override
    void render() {
        System.out.println(
            "Linux 렌더링 API를 이용해 " + this.value
            + " 값을 가진 텍스트 에디터를 그립니다."
        );
    }
}
