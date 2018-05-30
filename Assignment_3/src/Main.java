public class Main {
	public static void main(String[] args){
		
		int n=Integer.parseInt(args[0]),index;
		array=new int[n];
		for(index=0;index<n;index++){
			array[index]=index+1;
		}
		
		
		System.out.println("Prime numbers between 1 and "+n+" are below:");
		Sieve.sieve(array);
		System.out.println("\nnew line:");
		System.out.println("Even numbers from 4 to "+n+" expressed as sum of two primes:\n");
		Goldbach.goldbach(array);

				
	}

static int[] array;
}
class Goldbach {

	
	public static void goldbach(int[] array){
		boolean primesfound;
		length=array.length;
		for(i=4;i<=length;i=i+2){
			primesfound=false;
			for(j=i-1;j>=1;j--){
				
				for(k=j;k>=1;k--){
					if(array[j]+array[k]==i){
						primesfound=true;
						System.out.println(i+"="+array[j]+"+"+array[k]);
						break;
					}
					
				}
				if (primesfound==true)
					break;
					
			}
			
		}
		
		
	}
	
static int i,j,k;
static int length;

}

class Sieve {
	public static void sieve(int[] numbers){
		int i,j,x;
		int length_of_array=numbers.length;
		int limit=(int)(Math.sqrt(length_of_array));
		for(i=2;i<=limit;i++){
			if(numbers[i-1]==0)  /*if number is already zeroed then it means its multiples are also zeroed so continue..*/
				continue;
			else{
				j=0;
				for(x=1;x<=i;x++)
				{
					j=j+i;
				}
				if(j<=length_of_array) /* to be changed...if i*i > length then it means all multiples of i are zeroed since tables of 2 to i-1 have already been zeroed */
				{   
					for(j=j;j<=length_of_array;j+=i)  /*j=i*i..because tables of 2 to i-1 have already been zeroed so no need to start from 2*/
					{
						numbers[j-1]=0;
					}			
				}
			}
		}
		
		for(i=1;i<length_of_array;i++){
			if(numbers[i]!=0){
				System.out.println(numbers[i]+" ");
				
			}
		}
		
	}
	
}
