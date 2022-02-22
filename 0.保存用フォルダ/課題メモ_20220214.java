
/****************************************第1章****************************************/
/*　演習1-1　p13　*/
class Hello {	//クラス宣言：Hello
	public static void main (String[] args) {	//パブリック宣言
		System.out.println("セミコロンが欠如しているとどうなるか")	//コメント出力：セミコロンが欠如しているとどうなるか
	}
}

/*　演習1-2　p20　*/
class Name {	//クラス宣言：Name
	public static void main (String[] args) {	//パブリック宣言
		System.out.println("信\n太\n一\n那");	//コメント出力
	}
}

/*　演習1-3　p20　*/
class NameLn {
	public static void main (String[] args) {
		System.out.println("信\n太\n\n一\n那");
	}
}

/****************************************第2章****************************************/
/*　演習2-1　p32　*/
class SumAve1 {
	public static void main (String[] args) {
		int x;
		int y;
		
		x = 63.5;
		y = 18.2;
		
		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("合計は" + (x + y) + "です。");
		System.out.println("平均は" + (x + y) / 2 + "です。");
	}
}

/*　演習2-2　p32　*/
class SumAve2 {
	public static void main (String[] args) {
		int x = 1, y = 2, z = 3;
		
		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("yの値は" + z + "です。");
		System.out.println("合計は" + (x + y + z) + "です。");
		System.out.println("平均は" + (x + y + z) / 3 + "です。");
	}
}

/*　演習2-3　p40　*/
import java.util.Scaner;
class ArithInt {
	public static void main (String[] args) {
		Scanner stdIn = new Scanner (System.in);
		
		System.out.println ("整数値:");
		System.out.println (stdIn.nextInt() + "と入力しましたね。");
	}
}

/*　演習2-4　p40　*/
import java.util.Scaner;
class ArithInt2 {
	public static void main (String[] args) {
		Scanner stdIn = new Scanner (System.in);
		
		System.out.println ("整数値:");
		int a = stdIn.nextInt() ;
		
		System.out.println ("10を加えた値は" + (a + 10) + "です。");
		System.out.println ("10を減じた値は" + (a - 10) + "です。");
	}
};

/*　演習2-5　p41　*/
import java.util.Scaner;
class ArithDouble {
	public static void main (String[] args) {
		Scanner stdIn = new Scanner (System.in);
		
		System.out.println ("xの値:");
		double x = stdIn.nextDouble();
		System.out.println ("yの値:");
		double y = stdln.nextDouble();
		
		System.out.println ("合計は" + (x + y) + "です。");
		System.out.println ("平均は" + (x + y) / 2 + "です。");
	}
}

/*　演習2-6　p41　*/
import java.util.Scaner;
class Trinangle {
	public static void main (String[] args) {
		Scanner stdIn = new Scanner (System.in);
		
		System.out.println ("三角形の面積を求めます。");
		
		System.out.println ("底辺:");
		double buttom = stdIn.nextDouble();
		System.out.println ("高さ:");
		double height = stdIn.nextDouble();
		
		System.out.println ("面積は" + (buttom * height) / 2 + "です。");
	}
}

/*　演習2-7　p44　*/
import java.util.Random;
class RandNum {
	public static void main (String[] args) {
		Random rand = new Random;
		
		int randNum1 = rand.next(10);
		int randNum2 = - rand.next(10);
		int randNum3 = rand.next(90) + 10;
		
		System.out.println (randNum1\nrandNum2\nrandNum3);
	}
}

/*　演習2-8　p45　*/
import java.util.Scaner;
import java.util.Random;

class RandNum2 {
	public static void main (String[] args) {
		Scanner stdIn = new Scanner (System.in);
		Random rand = new Random;

		System.out.println ("整数値:");
		int randNum4 = rand.next(stdIn.nextInt() + 10);
		
		System.out.println ("その値の±5の乱数を生成しました。それは + (randNum4 - 5) + "です。");
	}
}

/*　演習2-9　p45　*/
import java.util.Random;
class RandNum3 {
	public static void main (String[] args) {
		Random rand = new Random;
		
		int randNum5 = rand.nextdouble(1.0);
		int randNum6 = - rand.next(10.0);
		int randNum7 = rand.next(2.0) - 1.0;
		
		System.out.println (randNum5\nrandNum6\nrandNum7);
	}
}

/*　演習2-10　p47　*/
import java.util.Scaner;
class Greeting {
	public static void main (String[] args) {
		Scanner stdSt = new Scanner (System.in);
		
		System.out.println ("姓:");
		Strings s = stdSt.next();
		
		System.out.println ("名:");
		Strings m = stdSt.next();
		
		System.out.println ("こんにちは" + s + m + "さん。");
	}
}
/****************************************第3章****************************************/
/*　演習3-1　p59　*/
import java.util.Scaner;
class AbsoluteValue {
	public static void main (String[] args) {
		Scanner stdIn = new Scanner (System.in);
		
		System.out.println ("整数値:");
		Strings z = stdIn.next();
		
		if (z < 0)
			System.out.println("その絶対値は" + (-z) + "です。");
		else
			System.out.println("その絶対値は" + z + "です。")
	}
}

/*　演習3-2　p59　*/
import java.util.Scaner;
class Divisor {
	public static void main (String[] args) {
		Scanner stdIn = new Scanner (System.in);
		
		System.out.println ("整数A:");	Strings a = stdIn.next();
		System.out.println ("整数B:");	Strings b = stdIn.next();
		
		if (A % B == 0)
			System.out.println("BはAの約数です。");
		else
			System.out.println("BはAの約数ではありません。");
	}
}

/*　演習3-3　p59　*/
import java.util.Scaner;
class Sign {
	public static void main (String[] args) {
		Scanner stdIn = new Scanner (System.in);
		
		System.out.println ("整数値");
		int n = stdIn.nextInt();
		
		If (n > 0)
			System.out.println("その値は正です。");
		else if (n < 0)
			System.out.println("その値は負です。");
		else if (n == 0)
			System.out.println("その値は0です。");
	}
}

/*　演習3-4　p61　*/
import java.util.Scaner;
class NumberCom {
	public static void main (String[] args) {
		Scanner stdIn = new Scanner (System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		If (a > b)
			System.out.println("aの方が大きいです。");
		else if (a < b)
			System.out.println("bの方が大きいです。");
		else if (a == b)
			System.out.println("aとbは同じ値です。");
	}
}

/*　演習3-5　p61　*/
import java.util.Scaner;
class Divide5 {
	public static void main (String[] args) {
		Scanner stdIn = new Scanner (System.in);
		
		int n = stdIn.nextInt();
		
		if (n > 0)
			if (n % 5 == 0)
				System.out.println("その値は5で割り切れます。");
			else
				System.out.printin("その値は5で割り切れません。");
		else
			System.out.println("正ではない値が入力されました。");
	}
}

/*　演習3-6　p61　*/
import java.util.Scaner;
class Divide5 {
	public static void main (String[] args) {
		Scanner stdIn = new Scanner (System.in);
		
		int n = stdIn.nextInt();
		
		if (n > 0)
			if (n % 10 == 0)
				System.out.println("その値は10で割り切れます。");
			else
				System.out.printin("その値は10で割り切れません。");
		else
			System.out.println("正ではない値が入力されました。");
	}
}

/*　演習3-7　p61　*/
import java.util.Scaner;
class Divide5 {
	public static void main (String[] args) {
		Scanner stdIn = new Scanner (System.in);
		
		int n = stdIn.nextInt();
		
		if (n > 0)
			if (n % 3 == 0)
				System.out.println("その値は3で割り切れます。");
			else if (n % 3 ==1)
				System.out.printin("その値を3で割った余りは1です。");
			else if (n % 3 ==2)
				System.out.printin("その値を3で割った余りは2です。");
		else
			System.out.println("正ではない値が入力されました。");
	}
}