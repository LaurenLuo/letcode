package GuessNumberHigherorLower;
import java.util.Arrays;

//No 375
public class GuessNumberHigherorLowerII {
	//δͨ�������ö��ֲ��ҵ�˼·���������������
	public int getMoneyAmount(int n) {
		int[] Money=new int[n+1];
		for(int i=1;i<=n;i++){
			//����ÿ��Ŀ����i�����
			int lower=1;
			int higher=n;
			int binary;
			while(true){
				binary=(lower+higher)/2;
				if(binary==i){
					//�³�����һ�β�ҪǮ
					break;
				}else if(binary>i){
					higher=binary-1;
				}else if(binary<i){
					lower=binary+1;
				}
				Money[i]+=binary;
			}	
			
		}
		for(int i=0;i<=n;i++){
			System.out.print(Money[i]+" ");
		}
		
		Arrays.sort(Money);
		return Money[n];//ȡ��Ҫ���Ǯ�����
	}
	
	public int binaryFind(int key,int n){//���ֲ����㷨
		int lower=1;
		int higher=n;
		int binary;
		while(true){
			binary=(lower+higher)/2;
			if(binary==key){
				return binary;
			}else if(binary>key){
				higher=binary-1;
			}else if(binary<key){
				lower=binary+1;
			}
		}	
	}
	public static void main(String[] args){

		GuessNumberHigherorLowerII g=new GuessNumberHigherorLowerII();
		System.out.print(g.getMoneyAmount(4));
	}
}
