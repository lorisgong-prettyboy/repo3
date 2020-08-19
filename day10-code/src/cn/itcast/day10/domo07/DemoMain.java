package cn.itcast.day10.domo07;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        computer.useDevice(new Mouse());
        computer.useDevice(new Keyboard());
        computer.powerOff();
        System.out.println("==============");
    }
}
