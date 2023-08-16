package dto;

public class EditDto {

    private int no;
    private String writer;
    private String title;
    private String password;
    private String contents;
    private String fileName;
    private String regDate;

    public EditDto() {
    }

    public EditDto(int no, String writer, String title, String password, String contents, String fileName, String regDate) {
        this.no = no;
        this.writer = writer;
        this.title = title;
        this.password = password;
        this.contents = contents;
        this.fileName = fileName;
        this.regDate = regDate;
    }

    public int getNo() {
        return no;
    }

    public String getWriter() {
        return writer;
    }

    public String getTitle() {
        return title;
    }

    public String getPassword() {
        return password;
    }

    public String getContents() {
        return contents;
    }

    public String getFileName() {
        return fileName;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "EditDto{" +
                "no=" + no +
                ", writer='" + writer + '\'' +
                ", title='" + title + '\'' +
                ", password='" + password + '\'' +
                ", contents='" + contents + '\'' +
                ", fileName='" + fileName + '\'' +
                ", regDate='" + regDate + '\'' +
                '}';
    }
}
