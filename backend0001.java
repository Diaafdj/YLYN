package com.diaafdj.ylyn;

import java.util.Scanner;

public class backend0001 {
    public static void main(String[] args) {
        int class_number=0;//班级数目
        float  class_grades=0;
        System.out.println("请输入班级数：");
        Scanner s=new Scanner(System.in);
        class_number=s.nextInt();
        int[][] array =new int[class_number][];      //arrar[i][0]存储班级人数，array[i][1]存储总成绩
        int person_number=0;            //存储总人数
        float[] average =new float[class_number];//存储各班的平均分
        for(int i=0;i<class_number;i++){
            System.out.println("请输入"+(i+1)+"班的班级人数");
            //s=new Scanner(System.in);
            int temp=s.nextInt();
            array[i]=new int[temp+2];
            array[i][0]=temp;
            person_number+=temp;     //累加人数计算总人数
            System.out.println("请输入"+(i+1)+"班同学的成绩(用空格隔开)");
            for(int j=2;j<temp+2;j++){
                array[i][j]=s.nextInt();        //存储成绩
               
                array[i][1]+=array[i][j];       //计算各班总成绩
            }
            class_grades+=array[i][1];
            average[i]=(float)(array[i][1]/array[i][0]);
            System.out.print("班级"+(i+1)+"的平均成绩为:");
            System.out.printf("%.3f\n",average[i]);
        }
        float grade_average=(float) (class_grades/person_number);
        System.out.printf("%.3f\n",grade_average);
        return ;
    }
}
