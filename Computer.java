	
public class Computer {
	String comname;
	int comscores;
	public int comShowfist(){
		int noCom = (int)(Math.random()*3)+1;
		if (noCom==1){
			System.out.println("�����ȭ������");
		}
		if (noCom==2){
			System.out.println("���ٳ�ȭ��ʯͷ");
		}
		if (noCom==3){
			System.out.println("���ٳ�ȭ����");
		}
		System.out.println(noCom);
		return noCom;
	}
}
