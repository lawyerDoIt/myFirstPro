import java.util.Scanner;


public class Game {

	Person person=new Person();
	Computer computer=new Computer();
	int count=0;//�洢��ս������
	//�����׷������ҷ����󣬳�ʼ����ս����Ϊ0��
	//��д��ʼ������ startGame����
	public void startGame(){
		System.out.println("----------��ӭ������Ϸ����----------");
		System.out.println("\n      ***************        ");
		System.out.println("\n      ****  ��ȭ      ****        ");
		System.out.println("\n      ***************        ");
		System.out.println("��ȭ����1.������2.ʯͷ��3.��");
		Scanner input=new Scanner(System.in);
		System.out.println("��ѡ��Է���ɫ����1.���죻2.���٣�3.���٣�");
		int choose =input.nextInt();
		if (choose==1){
			System.out.println("��ѡ���˾����ս");
			//����һ�����������ؾ���ֵ
		}
		if (choose==2){
			System.out.println("��ѡ���˼��ٶ�ս");
			//����һ�����������ؾ���ֵ
		}
		if (choose==3){
			System.out.println("��ѡ���˷��ٶ�ս");
			//����һ�����������ؾ���ֵ
		}
		System.out.print("\nҪ��ʼ�𣿣�y/n��");
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
		    	 System.out.println("�����ƽ�֡��������г��~");
		     }else if ((perFist==1&&compFist==3)||
		     (perFist==2&&compFist==1)||
		     (perFist==3&&compFist==2)){
		    	 System.out.println("�����Ӯ�ˡ���ţ����~");
		     }else{
		    	 System.out.println("������Ұܡ����̸����˰�~");
		     }
	}

}
