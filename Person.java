import java.util.Scanner;


public class Person {
	String name;
	int score;
	public int showFist(){
		//��ʾ�û���ȭ
		//�Ӽ��̽���1-3�����֣���Ϊ�û���ѡ��
		//1 ��ʾ ���ȭ������ ��  2  ��ʾ ���ȭ��ʯͷ    3 ��ʾ  ���ȭ����
		//���س�ȭ�����1-3��
		System.out.println("���ȭ��1��������2��ʯͷ��3��������������Ӧ���֣�");
		Scanner input =new Scanner(System.in);
		int no=input.nextInt();
		if (no==1){
			System.out.println("���ȭ������");
		}
		if (no==2){
			System.out.println("���ȭ��ʯͷ");
		}
		if (no==3){
			System.out.println("���ȭ����");
		}
		System.out.println(no);
		return no ;//����ط���no ������ showFist����???
	}
}
