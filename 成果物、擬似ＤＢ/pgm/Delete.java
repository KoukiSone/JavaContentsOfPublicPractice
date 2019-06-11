package pgm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import data.MoneyBook;

public class Delete {
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

		delete();

		list();
	}

	private static void delete() {
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
		String date = inputString("日付：");
		String item = inputString("費目：");

		int index = -1;
		for(int i=0; i<books.size(); i++) {
			MoneyBook book = books.get(i);
			if (book.dateIsEqualTo(date) && book.itemIsEqualTo(item)) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			System.out.println("データが見つかりません。");
			return;
		}

		books.remove(index);

		System.out.println("削除しました。");
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
		return new Scanner(System.in).nextLine();
	}
}
