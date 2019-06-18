package com.example.domain;

/**
 * ユーザのドメインクラス
 * 
 * @author knmrmst
 *
 */
public class User {
	/** メールアドレス */
	private String mailAddress;
	/** パスワード */
	private String password;
	/** 名前 */
	private String name;

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
