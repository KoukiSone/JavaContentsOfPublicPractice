package sample;

import java.util.Scanner;


public class SkillCheckB01 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
/*問題某サイト　Ｂ級問題
 * あなたは、とあるウェブサイトを管理していました。
ある連続したk日間、このウェブサイトでキャンペーンを行ったのですが、いつからいつまでの期間に行ったかを忘れてしまいました。
幸い、ウェブサイトを運営していた全n日分のアクセスログが残っており、1日ごとの訪問者数が分かっています。
とりあえず、連続するk日の中で、1日あたりの平均訪問者数が最も多い期間を、キャンペーンを行った期間の候補だと考えることにしました。
n日分の訪問者数のリストとキャンペーンの日数kが入力されるので、キャンペーンを行った期間の候補数と、候補の中で最も早い開始日を出力してください。

入力される値
入力は2行から成ります。

1行目にはnとkが半角スペース区切りで入力されます。
2行目にはn個の整数a_1, a_2, …, a_nが半角スペース区切りで入力されます。a_iはi日目の訪問者数を表します。
入力値最終行の末尾に改行が１つ入ります。 
文字列は標準入力から渡されます。

期待する出力
キャンペーンを行った期間の候補数と、候補の中で最も早い開始日を、この順で半角スペース区切りで1行で出力してください。

入力例1
5 3
1 2 3 2 1

出力例1
1 2

入力例2
10 2
6 2 0 7 1 3 5 3 2 6

出力例2
5 1
	 *
	 */
	//入力２種 n日分、ｋ日間
		String[] nk = sc.nextLine().split(" ");//nkの格納配列
		String[] man = sc.nextLine().split(" ");//実際の人数の格納配列
		
		int[] nk2 = new int [nk.length];//数値変換先配列
		int[] man2 = new int[man.length];
		
		for(int i = 0;i<nk2.length;i++){//変換装置
		nk2[i] = Integer.parseInt(nk[i]);}
		for(int i = 0;i<man2.length;i++){
			man2[i] = Integer.parseInt(man[i]);	}
		
		int de = nk2[0]-nk2[1]+1;//何個合計すればいいか求まる
		int[] a1 = new int[de];
		
		for(int ii = 0;ii<de;ii++){//各区切りの平均をリストに
			for(int i= 0;i<nk2[1];i++){
				a1[ii] += man2[i+ii];}}
		
		int max = a1[0];//リストの中の最大値をとる
		for(int i = 0;i<a1.length;i++){
			if(max<a1[i]){
				max = a1[i];
			}
		}
		
		int kh =0; //リストの中の最大値と一致する個数を数える（候補数）
		for(int i =0;i<a1.length;i++){
			if(max == a1[i]){
				kh++;
			}
		}
		
		int key =0; //リストの中の最大値と最初に一致した順番
		a:for(int i =0;i<a1.length;i++){
			key++;
			if(max == a1[i]){
				break a;
			}}
		
		
		
	//出力、期間の候補数(最高値がいくつあるか）、最も早い開始日（1番目とか）
	System.out.println(kh + " " + key);
}
}
