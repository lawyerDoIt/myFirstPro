	
public class Computer {
	String comname;
	int comscores;
	public int comShowfist(){
		int noCom = (int)(Math.random()*3)+1;
		if (noCom==1){
			System.out.println("警察出拳：剪刀");
		}
		if (noCom==2){
			System.out.println("检察官出拳：石头");
		}
		if (noCom==3){
			System.out.println("法官出拳：布");
		}
		System.out.println(noCom);
		return noCom;
	}
}
