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

	char c1 = 'A';
	char c2 = 65;
	char c3 = '\u0041';

	char c4 = '가';
	char c5 = 44032;
	char c6 = '\uac00';

	int uniCode = c1;

	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
	System.out.println(c5);
	System.out.println(c6);
	System.out.println(uniCode);

	}

}