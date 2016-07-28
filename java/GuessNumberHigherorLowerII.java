package GuessNumberHigherorLower;
import java.util.Arrays;

//No 375
public class GuessNumberHigherorLowerII {
	//未通过，采用二分查找的思路错误，重新理解题意
	public int getMoneyAmount(int n) {
		int[] Money=new int[n+1];
		for(int i=1;i<=n;i++){
			//对于每个目标数i的情况
			int lower=1;
			int higher=n;
			int binary;
			while(true){
				binary=(lower+higher)/2;
				if(binary==i){
					//猜出的那一次不要钱
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
		return Money[n];//取需要最多钱的情况
	}
	
	public int binaryFind(int key,int n){//二分查找算法
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
