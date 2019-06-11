package data;

public class MoneyBook {
	public static final String DATE_FORMAT = "yyyy/MM/dd";
	private String date;	// 日付
	private String item;	// 費目
	private int amount;	// 金額

	/**
	 * @param date - 日付
	 * @param item - 費目
	 * @param amount - 金額
	 */
	public MoneyBook(String date, String item, int amount) {
		this.date = date;
		this.item = item;
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String toString() {
		return this.date + "," + this.item + "," + this.amount;
	}

	public boolean dateIsEqualTo(String date) {
		return this.date.equals(date);
	}

	public boolean itemIsEqualTo(String item) {
		return this.item.equals(item);
	}
}
