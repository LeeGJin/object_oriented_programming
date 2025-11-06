package Week10.Practice1;

public class Turtle {
    private int limbs = 4; //private를 protected 로 변경하거나 get 함수를 만들기
    // private으로 만들고 get함수를 만들면 읽기 전용이 되는거다 알겠나
    protected String food;
    public void setFood(String f) {
        food = f;
    }
    public void eat() {
        System.out.println("Turtle eats " + food);
    }
    public int getLimbs() { return limbs;}
}
