import java.util.Scanner;


public class Person {
	String name;
	int score;
	public int showFist(){
		//提示用户出拳
		//从键盘接受1-3的数字，作为用户的选择；
		//1 显示 你出拳：剪刀 ；  2  显示 你出拳：石头    3 显示  你出拳：布
		//返回出拳结果（1-3）
		System.out.println("请出拳：1、剪刀；2、石头；3、布。（输入相应数字）");
		Scanner input =new Scanner(System.in);
		int no=input.nextInt();
		if (no==1){
			System.out.println("你出拳：剪刀");
		}
		if (no==2){
			System.out.println("你出拳：石头");
		}
		if (no==3){
			System.out.println("你出拳：布");
		}
		System.out.println(no);
		return no ;//这个地方是no ，还是 showFist（）???
	}
}
