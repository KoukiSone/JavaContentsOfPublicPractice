package pgm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import data.MoneyBook;

public class Create {
	private static List<MoneyBook> books = new ArrayList<>();
	public static void main(String[] args) {
		books.add(new MoneyBook("2019/04/25", "昼食代", 430));
		books.add(new MoneyBook("2019/04/25", "交通費", 175));
		books.add(new MoneyBook("2019/04/25", "書籍代", 890));
		books.add(new MoneyBook("2019/04/26", "昼食代", 510));
		books.add(new MoneyBook("2019/04/26", "交通費", 175));
		books.add(new MoneyBook("2019/04/27", "治療費", 5000));
		books.add(new MoneyBook("2019/04/27", "書籍代", 140));
		books.add(new MoneyBook("2019/04/27", "交通費", 175));

		create();

		list();
	}

	private static void create() {
		/*
		 * 日付、費目、金額を入力
		 */
		String date = inputString("日付：");
		String item = inputString("費目：");

		// 日付と費目が一致する要素を見つける
		int index = find(date, item);

		// 一致する要素があれば、中止する。
		if (index != -1) {
			System.out.println("すでに登録されています");
			return;
		}

		// 金額を入力
		int amount = inputInt("金額：");

		/*
		 * 要素を登録する
		 */
		books.add(new MoneyBook(date, item, amount));

		/*
		 * 終了処理
		 */
		System.out.println("登録しました。");
	}

	private static void list() {
		if (books.size() == 0) {
			System.out.println("データがありません。");
		}

		for(MoneyBook book : books) {
			System.out.println(book.toString());
		}
	}

	private static String inputString(String prompt) {
		System.out.print(prompt);
		return new Scanner(System.in).next();
	}

	private static int inputInt(String prompt) {
		System.out.print(prompt);
		return new Scanner(System.in).nextInt();
	}

	/**
	 * リスト：booksの、日付と費目が一致する要素の番号を返す。
	 * @param date - 日付
	 * @param item - 費目
	 * @return int - 要素番号 / -1
	 */
	private static int find(String date, String item) {

		// 要素が見つからないことを仮定する
		int index = -1;

		// リスト中のすべての要素をチェックする
		for(int i=0; i<books.size(); i++) {

			// チェック対象の要素を取得
			MoneyBook book = books.get(i);

			// 日付が等しく、費目が等しければ、要素番号を記憶する
			if (book.dateIsEqualTo(date) && book.itemIsEqualTo(item)) {
				index = i;
				break;
			}
		}

		return index;
	}
}