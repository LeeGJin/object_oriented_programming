package Homework;

/**
 * 6장 개념 확인 과제
 * 문제
 * - 교재의 PersonalComputer, Monitor, Computer 클래스를 직접 구현
 * - 아래의 trunOn() 함수 외에, 멤버 변수에 저장된 정보를 출력하는 printInfo() 함수 추가
 * - personalComputer형의 객체를 만들어서, turnOn()과 printInfo() 함수 호출
 *
 * 오구 사항
 * - 아래 정보를 가지는 객체들을 생성 (이 정보들은 모두 String으로 저장)
 *   Monitor: 32인치(크기), 검은색(색상), 45W(전력소모)
 *   Computer: Core i7(CPU), 32GB(메모리), 2TB(HDD), 흰색(쿨러), 700W(파워)
 * - 멤버 변수는 private으로, 멤버 함수는 public으로 설정
 **/

class Computer {
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;

    public Computer() {
        cpu = "Core i7";
        memory = "16GB";
        hd = "2TB";
        color = "White";
        power = "500W";
    }

    public void turnOn() {
        System.out.println("Turning on the computer.");
    }

    public void printInfo() {
        System.out.printf(" CPU: %s\n" +
                " Memory: %s\n" +
                " HDD: %s\n" +
                " Color: %s\n" +
                " Power: %s\n", cpu, memory, hd, color, power);
    }
}

class Monitor {
    private String monitorSize;
    private String color;
    private String power;

    public Monitor() {
        monitorSize = "24 inch";
        color = "Black";
        power = "45W";
    }

    public void turnOn() {
        System.out.println("Turning on the monitor.");
    }

    public void printInfo() {
        System.out.printf(" Size: %s\n" +
                " Color: %s\n" +
                " Power: %s\n", monitorSize, color, power);
    }
}

class PersonalComputer {
    private Computer computer;
    private Monitor monitor;

    public PersonalComputer() {
        computer = new Computer();
        monitor = new Monitor();
    }

    public void turnOn() {
        computer.turnOn();
        monitor.turnOn();
    }

    public void printInfo() {
        System.out.println("The spec of the computer");
        computer.printInfo();
        System.out.println("The spec of the monitor");
        monitor.printInfo();
    }
}

public class Homework5 {
    public static void main (String[] args) {
        PersonalComputer pc = new PersonalComputer();
        pc.turnOn();
        pc.printInfo();
    }
}
