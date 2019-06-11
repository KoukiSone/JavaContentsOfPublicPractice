package pgm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import data.MoneyBook;

public class Update {
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

		update();

		list();
	}

	private static void update() {
		/*
		 * リストに要素がなかったら中止
		 */
		if(books.size() == 0) {
			System.out.println("データがありません。");
			return;
		}

		/*
		 * 日付と費目を入力
		 */
		// キーボードから入力
		String targetDate = inputString("日付：");
		String targetItem = inputString("費目：");

		// 日付と費目が一致する要素を見つける
		int index = find(targetDate, targetItem);

		// 要素が見つからなければ表示を中止
		if (index == -1) {
			System.out.println("データが見つかりません。");
			return;
		}

		/*
		 * 変更後のデータを入力
		 */
		// キーボードから入力
		String newDate = inputString("日付：");
		String newItem = inputString("費目：");

		// 重複をチェックする。
		MoneyBook oldValue = books.get(index);

		if (!oldValue.dateIsEqualTo(newDate) || !oldValue.itemIsEqualTo(newItem)) {
			if (find(newDate, newItem) != -1) {
				System.out.println("すでに登録されています。");
				return;
			}
		}

		// 金額を入力する
		int newAmount = inputInt("金額；");

		/*
		 * 更新する
		 */
		books.set(index, new MoneyBook(newDate, newItem, newAmount));

		System.out.println("更新しました。");
	}

	private static int find(String date, String item) {
		int index = -1;
		for(int i=0; i<books.size(); i++) {
			MoneyBook book = books.get(i);
			if (book.dateIsEqualTo(date) && book.itemIsEqualTo(item)) {
				index = i;
				break;
			}
		}

		return index;
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
}
