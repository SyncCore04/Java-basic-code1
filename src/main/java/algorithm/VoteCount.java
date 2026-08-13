package algorithm;

import java.util.Random;

public class VoteCount {
    public static void main(String[] args) {
        /*
        学校选举学生会主席，有5个候选人
        全校1000名同学参与投票(每人一票，可以弃权，或者选1-5号)。
        投票使用Random模拟。0：弃权，1~5:给对应的候选人投票
        要求1：
            统计每个候选人的得票数和得票率，找出得票最多的候选人？
        要求2：
            统计弃票数和弃票率是多少?
        */
        //1.随机投票结果统计
        Random rand = new Random();
        int[] vote = new int[6];
        for (int i = 0; i < 1000; i++) {
            vote[rand.nextInt(6)]++;
        }
        System.out.println("投票结果：");
        System.out.println("弃权\t1号\t2号\t3号\t4号\t5号");
        for (int val : vote) {
            System.out.print(val + " ");
        }
        System.out.println();

        //2.统计每个候选人的得票数和得票率
        for(int i=1;i<6;i++){
            System.out.println("第"+i+"号的得票率为："+String.format("%.2f", vote[i]/1000.0*100)+"%");
        }

        //3.找出得票最多的候选人
        int max=vote[1];
        int maxIndex=1; //记录得票最多的候选人的索引
        for(int i=2;i<6;i++){
            if(vote[i]>max){
                max=vote[i];
                maxIndex=i;
            }
        }
        System.out.println("得票最多的候选人是："+(maxIndex));
        System.out.println("弃票率是："+String.format("%.2f", vote[0]/1000.0*100)+"%");

    }
}