public class java3{
	public static void main(String[] args)

	byte var1=-128;
	byte var2=-20;
	byte var3=0;
	byte var4=39;
	//byte var5=128;
	//byte는 -128~127사이, 즉 256개만을 다룸

	System.out.println(var1);
	System.out.println(var2);
	System.out.println(var3);
	System.out.println(var4);
	//System.out.println(var5);

	byte var6 = 125;
	int var7 = 125;

	for(int i=0;i<5;i++){
		var6++;
		var7++;
		System.out.println("var6: "+var6+"\t"+"var7"+var7);
		//\t는 tab칸만큼 칸을 띄워주는 역할을 한다.
	}

}