package cn.itcast.day10.domo07;
//电脑类负责使用USB接口，鼠标键盘负责实现接口
public class Computer {
    public void powerOn(){
        System.out.println("笔记本电脑开机");
    }
    public void powerOff(){
        System.out.println("笔记本电脑关机");

    }
//电脑来使用USB接口
    public void useDevice(USB usb){
        usb.open();
        usb.close();
    }
}
