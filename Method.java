package CTF01.Java.part1.No5;

public class Method
{
//	ทดลองสร้าง method แบบ Return และไม่ Return ค่า
//	และ เรียกใช้งาน method ที่สร้างขึ้น โดยให้แสดง
//	ผลลัพธ์บน Console
	public static void main(String[] args)
	{
		System.out.print("ผลลัพธ์การคูณ = " + multiply(1.5, 1.2));
		System.out.println();
		sayHi("Suphan!!");
	}
	
	public static double multiply (double a, double b)
	{
		return a * b;
	}
	
	public static void sayHi (String name)
	{
		System.out.println("Hi " + name);
	}
	
}
