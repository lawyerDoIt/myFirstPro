import java.util.Scanner;


public class Game {

	Person person=new Person();
	Computer computer=new Computer();
	int count=0;//存储对战次数；
	//创建甲方对象、乙方对象，初始化对战次数为0；
	//编写初始化方法 startGame（）
	public void startGame(){
		System.out.println("----------欢迎进入游戏世界----------");
		System.out.println("\n      ***************        ");
		System.out.println("\n      ****  猜拳      ****        ");
		System.out.println("\n      ***************        ");
		System.out.println("出拳规则：1.剪刀；2.石头；3.布");
		Scanner input=new Scanner(System.in);
		System.out.println("请选择对方角色：（1.警察；2.检察官；3.法官）");
		int choose =input.nextInt();
		if (choose==1){
			System.out.println("你选择了警察对战");
			//放入一个方法，返回警察值
		}
		if (choose==2){
			System.out.println("你选择了检察官对战");
			//放入一个方法，返回警察值
		}
		if (choose==3){
			System.out.println("你选择了法官对战");
			//放入一个方法，返回警察值
		}
		System.out.print("\n要开始吗？（y/n）");
		String con=input.next();
		int perFist=0 ;
		int compFist=0;
		if(con.equals("y")){
			perFist=person.showFist();
			compFist=computer.comShowfist();
		}
		if ((perFist==1&&compFist==1)||
		     (perFist==2&&compFist==2)||
		     (perFist==3&&compFist==3)){
		    	 System.out.println("结果：平局。你们真和谐啊~");
		     }else if ((perFist==1&&compFist==3)||
		     (perFist==2&&compFist==1)||
		     (perFist==3&&compFist==2)){
		    	 System.out.println("结果：赢了。老牛逼了~");
		     }else{
		    	 System.out.println("结果：惨败。卷铺盖走人吧~");
		     }
	}

}
