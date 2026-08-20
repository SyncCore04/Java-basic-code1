package oopadvanced.extendstest.test4;

public class ThirdGenerationPhone extends SecondGenerationPhone {
    //重写父类方法，升级为打视频
    @Override //重写注解
    public void call() {
        System.out.println("打视频");
    }

    public void play(){
        System.out.println("打游戏");
    }
}
