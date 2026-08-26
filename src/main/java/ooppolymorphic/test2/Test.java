package ooppolymorphic.test2;

public class Test {
    /*
        变量调用：
                编译看左边，运行看左边
        方法调用：
                编译看左边，运行看右边
     */
    public static void main(String[] args) {
        Fu f=new Zi();
        f.show();

        System.out.println(f.name);

        f.fuShow();
        //此时方法调用会先到Zi中，然后穿透到Fu中调用fuShow方法
        //如果Fu中没有fuShow方法，会报错


        //f.ziShow();
        //多态的弊端，无法调用子类的特有方法

        //解决多态的问题：
        //强制类型转换
        Zi zi=(Zi)f;
        zi.ziShow();

        Ye y= new Fu();
        if(y instanceof Fu){
            Fu ff=(Fu)y;
            ff.fuShow();
        }else {
            System.out.println("类型错误");
        }


    }

}
