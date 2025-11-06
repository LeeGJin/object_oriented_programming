package Week9.Practice1;

//싷습문제1 : 수강신청 프로그램 작성

public class Lecturer {
    private String email;
    private String name;
    private String room;

    public Lecturer(String email, String name, String room) {
        this.email = email;
        this.name = name;
        this.room = room;
    }
    public String getEmail() {return email;}
    public String getName() {return name;}
    public String getRoom() {return room;}
}
