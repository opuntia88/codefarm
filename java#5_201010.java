public class java5{
	public static void main(String[] args) {
		
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000;
		long var4 = 1000000000000L;

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);

        double var5 = 3.14;
        float var6 = 3.14; //컴파일 에러(type mismatch: cannot convert from double to float)
        float var7 = 3.14F;

        int var8 = 3000000;
        double var9 = 3e6;
        float var10 = 3e6f;
        double var11 = 2e-3;

		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
		System.out.println(var10);
		System.out.println(var11);


		

	}
}