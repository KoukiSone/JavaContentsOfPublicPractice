package sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

class SampleOfTotalPractice {


	public static void main(String[] args) throws Exception {
	//四則演算等、インクリメント （8項目）
	int a = 1 + 2 - 3 * 4 / 5 % 6 ;
	a++;
	--a;
	a += 1;
	//引数、乱数（２行）
	int b = Integer.parseInt(args[0]);
	int c = new Random().nextInt(10);
	//データ型(９種)、代入、キャス（全１１行）
	byte d = 1;
	short d2 = 1;
	int d3 = 1;
	long d4 = 1;
	float d5 = 1.2f;
	double d6 = 1.2;
	char d7 = 'あ';
	boolean d8 = true;
	String d9 = "あああ";
	d4 = d3;
	d4 = (long)d6;
	//エスケープシーケンス(８個)  \\,\t,\r,\",\',\n,\b,\u0000
	//関係演算子（６個）>,<,>=,<=,==,!=
	//if文
	if(d3 == 0){
		d = 1;
	}else if(d3 == 1){
		d=2;
	}else{
		d=3;
	}
	//条件演算子(３項演算子）
	System.out.println(d3 == 0 ? "ok": "no");
	//論理演算子（４種）優先順位 !, &&, ||, ^, a>b && a>c

	//switch文
	switch(d3){
	case 1:
		d =1;
		break;
	case 2:
		d = 2;
		break;
	default:
		d = 3;
		break;
	}

	//Scanner
	int f = new Scanner(System.in).nextInt();
	System.out.println(f);
	//for文
	for(int i = 0; i<1 ; i++){
		System.out.println("");
	}
	//while文
	int i =0;
	while(i < 2){
		System.out.println("");
		i++;
	}
	//do-while文
	do{
		i++;
		System.out.println("");
	}while(i<2);

	//複数ループ(コンティニュー)
	for(i = 0; i < 2; i++){
		for(int i2 =0; i2 < 1; i2++){
			if(i2 == 0){
			continue;
		}
		System.out.println(i);
	}}

	//複数ループ（ブレイク)
	ss:for(i = 0; i < 2; i++){
		for(int i2 =0; i2 < 1; i2++){
			break ss;
		}
		System.out.println(i);
	}
		//ラベル
	LL:for(i = 0; i < 2; i++){
		for(int i2 =0; i2 < 1; i2++){
			if(i2 == 0){
			continue LL;
		}
		System.out.println(i);
	}}
	//配列（書き方１）
		int[] e = new int[3];
		e[0] = 1;
		e[1] = 2;
		e[2] = 3;
	//拡張for文
		for(int e4: e){
			System.out.println(e4);
		}
	//配列（書き方２、３）
		int [] e2 = {1,2,3};
		int [] e3 = new int[]{1,2,3};
	//メソッドの呼び出し
		SampleOfTotalPractice app = new SampleOfTotalPractice();
		app.sub1();
		sub2(1);
	//クラスの作成・呼び出し（フィールド、メソッド）
		Totalclass g = new Totalclass();
		g.setter("Bob", 12);
	//引数なしコンストラクタ作成、引数ありコンストラクタ作成
	//コンストラクトの実行（オーバーロード）※メソッドも動きは同じ
		Totalclass gg = new Totalclass();
		Totalclass ggg = new Totalclass("アリス",12);
	//＊static修飾子
	//＊イニシャライザ
	//＊アクセス修飾子public,private,protected
	//セッタとゲッタ
		Totalclass g4 = new Totalclass();
		g4.setter("Mike",22);
		System.out.println(g4.getter());
	//Bigdecimal
		BigDcimalkun g5 = new BigDcimalkun(10);
		g5.bd();
	//Dateクラス
		Date h = new Date();
		System.out.println(h);
		System.out.println(h.getTime());

	//Calendarクラス
		Calendar h2 = Calendar.getInstance();
		System.out.println(Calendar.DATE);
		System.out.println((Calendar.MONTH) + 1);

	//SimpleDateFormatクラス
		String h3 = new SimpleDateFormat().format(h);
		String h4 = new SimpleDateFormat("yyyy/MM/dd").format(h);

		//Stringクラス
		String j = "abc";
		String j2 = "ABC";
		String j3 ="abc.abc";

		char jj = j3.charAt(3);//指定した変数の指定文字列番号の１文字を返す
		int jj2 = j3.length();
		jj2 = j3.indexOf("bc");
		jj2 = j3.lastIndexOf("bc");
		boolean jj3 = j.equals(j2);
		jj3 = j.equalsIgnoreCase(j2);
		jj3 = j3.startsWith("ab");
		jj3 = j3.endsWith("bc");
		String jj4 = j3.substring(2);
		jj4 = j3.substring(1, 3);
		jj4 = j3.trim();
		jj4 = j3.replace(".", "1");
		jj4 = j3.replaceAll(".", "1");
		jj4 = j3.replaceFirst(".", "1");
		String[] jj5 = j3.split("c.");

		StringBuilder jj6 = new StringBuilder();
		jj6.append("今年の元号は");
		jj6.append("令和");
		String jj62 = jj6.toString();

	//ラッパークラス（基本データ、文字列、ラッパークラス）
		int n = Integer.parseInt("12");//文字→基本

		Integer n2 = Integer.valueOf(12);//基本→ラッパー
		n2 = Integer.valueOf("12");//文字列→ラッパー

		int n3 = n2.intValue();//ラッパー→基本
		String n4 = n2.toString();//ラッパー→文字列

	//ラッパークラスの定数
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		Double infi = Double.POSITIVE_INFINITY;
		Double minfi = Double.NEGATIVE_INFINITY;
		Double nn = Double.NaN;

	//DecimalFormat（５要素）
		DecimalFormat k = new DecimalFormat("0000.####%;Δ#.##");
		String tex = k.format(2.55555);
		System.out.println(tex);

	//try-catch-finally、スタックトレース表示、補足コメントのみ表示
		try{
			int [] l = {1,2,3};
			System.out.println(l[3]);
		}catch(Exception EE){
			System.out.println("例外を検知");
			System.out.println(EE);
			EE.printStackTrace();
			//throw new ArrayIndexOutOfBoundsException("例外の自己スロー");
			ArrayIndexOutOfBoundsException EE2 = new ArrayIndexOutOfBoundsException("例外の自己スロー２");
		}finally{
			System.out.println("finallyを実行");}

		//例外の自己スロー
		System.out.println("例外の自己スロー");
		ArrayIndexOutOfBoundsException ej = new ArrayIndexOutOfBoundsException("例外のスロー");
		//throw ej;
		//throw new ArrayIndexOutOfBoundsException("例外のスロー");でもok

		//＊Thread、チェック例外、非チェック例外
		System.out.println("スレッドを実行：２秒");
		Thread.sleep(2000);
		System.out.println("スレッドを完了");

		try{
			System.out.println("スレッドを実行：２秒");
			Thread.sleep(2000);
			System.out.println("スレッドを完了");
		}
		catch(InterruptedException e12){
			System.out.println("例外の検知");
		}

		//スキャナークラス６種、繰り返し入力、再入力
		//boolean(hasnext, hasnextInt,hasnextline), int(nextInt,),String(next,nextline)

		Scanner f12 = new Scanner(System.in);
		System.out.println("半角数値を入力");
		nuke:while(true){
			if(f12.hasNextInt()){
				int f2 = f12.nextInt();
				System.out.println("入力された数値は" + f2);
				break;
			}else{
				System.out.println("数値を入力してね");
				f12.next();
			}
		}
		//1.4以前のコンソール
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("数字の入力");
		String fb = bf.readLine();
		int fbf = Integer.parseInt(fb);

		//書式付き出力、変換文字、フラグ、引数番号、
		System.out.println();
		System.out.printf("num1[%1$,10d],\rnum2[%2$-10.3f]",114514,810.1919);

		//可変長引数
		kahen("aaa","bbb","ccc");

		//簡易printf実行メソッド
		System.out.format("num1[%1$,10d],\rnum2[%2$-10.3f]",114514,810.1919);



		//interface(のルール)、実装、複数のインターフェース、インターフェースの継承
		infe inde = new fein();
		infe inde2 = new efin();

		//抽象クラス、型変換、（static）親子シャドウ変数メンバ、ポリモーフィズムとは
		tyusho tt = new tyusho2();
		tt.abstrac();

		//例外の種類、例外の作成、原因例外、キャッチの順序

		//アサーション
		int asa = 1;
		assert asa > 2 : "アサートメッセージ";
		//＊ネストクラス

		//列挙型
		enum01 type = enum01.valueOf("A");//指定された文字に一致する名前の定数を代入
		System.out.println(type);//代入されてる定数の名前を表示
		System.out.println(type.name());//代入されてる定数の名前を返す
		System.out.println(type.getcode());//代入されてる定数のコードを返すメソッド

		//コレクション：List、型引数の指定、自作クラスの型引数、Listの拡張for
		List<String> list = new ArrayList<String>();
		list.add("gokuu");
		list.add("bezita");
		list.add("pikkoro");

		String g2 = list.get(1);//オートボクシングはしない

		for(String ii : list){
			System.out.println(ii);
		}
		//コレクション：Set、ユニークな値、順番は不保持、再セット不可はfalse
		Set<String> sets = new HashSet<String>();
		sets.add("buruma");
		sets.add("titi");
		sets.add("pan");

		for(String ii : sets){
			System.out.println(ii);
		}
		if(sets.add("pan")){
			System.out.println("パンは追加できました");
		}else{
			System.out.println("パンは追加できませんでした");
		}
		//コレクション：Map、要素の一覧、(３登録、３メソッド)
		Map<String,String> maps = new HashMap<String,String>();
		maps.put("sora", "KH1");
		maps.put("riku", "KH2");
		maps.put("kairi", "KH3");
			System.out.println(maps.keySet());
		System.out.println(maps.values());
		System.out.println(maps.entrySet());
			//Iterator(List・Set)
		Iterator <String> itere = list.iterator();
		while(itere.hasNext()){
			System.out.println(itere.next());
		}
		//＊Vector Hashtable Enumeration
		//配列⇔List
		String[] huu = list.toArray(new String[0]);
		List<String> hoo = Arrays.asList(huu);
			for(String ii: hoo){
			System.out.println(ii);
		}
		//Collectionsクラスのソート、ソートのカスタマイズ
		Collections.sort(list);
		for(String i3 : list){
			System.out.println(i3);
		}
					System.out.println("");
		/*Collections.sort(list, new myrule2());
		for(String i4 : list){
			System.out.println(i4);
		}
		Collections.sort(list,new myrule(){
			public int compare(String a, String b){
				return a.length()-b.length();}
		});*/

		}
		//メソッドの基本、メソッドの戻り値
		void sub1(){
			System.out.println("メソッドの呼び出し");
		}
			static int sub2(int modo){
			int modori = modo + 112;
			return modori ;
		}
		//可変長引数メソッド
		static void kahen(String...henka){
			for(String i : henka){
				System.out.println(i);
			}
		}
	}

class Totalclass {
	private String name;
	private int age;
	String name2;
	int age2;

	Totalclass(String name, int age){
		this.name2 = name;
		this.age2 = age;
	}

	Totalclass(){}

	{}

	void setter(String name, int age){
		this.name = name;
		this.age = age;
	}

	void setter(){
		System.out.println("オーバーロード");
	}

	String getter(){
		return name;
	}

}

/*final*/class BigDcimalkun {//finalつけるとクラスの継承禁止

 	private int radius;

 	public BigDcimalkun(int radius) {
		this.radius = radius;
	}
 	 /*final*/ void bd (){//finalつけるとメソッドの継承禁止
 		 BigDecimal kun = new BigDecimal("" + radius);
 		 BigDecimal pi = new BigDecimal("3.14");
 		 BigDecimal cc = kun.multiply(kun).multiply(pi);
 		 System.out.println(cc);
 	 }

	}

class BigDecimalchan extends BigDcimalkun {

	int radius;//シャドウ変数、オーバーライドとは言わない

	public BigDecimalchan() {
		super(10);//継承されない親のコンストラクタを呼び出し（引数あり）
	}

	void bd(){//オーバーライド
		super.bd();//スーパークラスメソッドの実行
	}
}

class BigO extends BigDecimalchan {//多重継承

	}

interface infe {//インターフェイスの宣言

	String infe1();//インターフェイスメソッドの宣言

	}

class fein implements infe{
	public String infe1(){//インターフェイスメソッドの実装１
		String axc = "feinのinfe1を実行";
		System.out.println(axc);
		return axc;
	}
}
class efin implements infe {
	public String infe1() {//インターフェイスメソッドの実装２
		String acx = "efinのinfe1を実行";
		System.out.println(acx);
		return acx;
	}
}

interface infe2 extends infe{//インターフェイスの継承

}

abstract class tyusho {//抽象クラスの宣言

	abstract void abstrac();//抽象メソッドの宣言
}

class tyusho2 extends tyusho {//抽象クラスの継承
	void abstrac(){//抽象メソッドの実装
		System.out.println("抽象クラス実装メソッドの実行");
	}

}

class Myexception extends Exception {//例外継承のクラスを作成
	 void exc (){
		try{//下をトライでかこむ
			MyExc.sub();//例外をスローする他クラスメソッドの実行
		}catch(MyExc e){//作った例外の名前で例外変数作成
			e.printStackTrace();//エラーの表示
		}
	}

}
class MyExc extends Exception {//例外継承のクラスを作成

	MyExc(){//コンストラクタ宣言
		super();//親のコンストラクタ起動
	}

	static void sub() throws MyExc{//実際に例外をスローするメソッド
		MyExc a = new MyExc();//例外インスタンスを作成する
		throw a;//スローする、そのままだとスローでエラー終了なのでスローズで例外処理
	}
}

enum enum01 {//名前（コード）
	A("スタバ"),
	B("ドトール"),
	O("ヴェローチャ"),
	AB("マクド");

	private final String code;//定数フィールド

	enum01(String code){//指定された文字列と一致する名前を検索しコードを代入するコンストラクタ
		this.code = code;
	}

	String getcode(){//ゲッター
		return code;
	}

}

