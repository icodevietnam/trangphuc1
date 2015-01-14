package com.icoding.trangphuc.constant;

public enum CategoryStatus {
	ADMIN("Admin"), HOME("Home"), NEWS("News"), PRODUCT("Product"), ALBUM(
			"Album");
	private final String stringValue;

	private CategoryStatus(String value) {
		this.stringValue = value;
	}

	@Override
	public String toString() {
		return stringValue;
	}

	public String getKey() {
		return name();
	}
}
