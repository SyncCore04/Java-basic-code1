import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入体重（单位：千克）：");
        double weight = Double.parseDouble(scanner.nextLine());

        System.out.println("请输入身高（单位：米）：");
        double height = Double.parseDouble(scanner.nextLine());

        double bmi =weight / (height * height);

        System.out.printf("BMI值为：%.2f\n",bmi);
        if(bmi<18.5){
            System.out.println("体重过轻");
        }else if(bmi>=18.5 && bmi<25){
            System.out.println("体重正常");
        }else if(bmi>=25 && bmi<30){
            System.out.println("体重过重");
        }else if(bmi>=30 && bmi<35){
            System.out.println("体重肥胖");
        }else if(bmi>=35){
            System.out.println("良子");
        }
    }
}
