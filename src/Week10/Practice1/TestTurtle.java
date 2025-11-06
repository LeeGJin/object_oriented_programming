package Week10.Practice1;

//실습 문제1 : 점근 제어자를 이용해 거북이 문제를 해결

public class TestTurtle {
    public static void main(String[] args) {
        SeaTurtle st = new SeaTurtle();
        LandTurtle lt = new LandTurtle();
        st.printLimbs();
        lt.printLimbs();
    }
}
