package jp.co.internous.quest.model.form;

import java.io.Serializable;

/**
 * 宛先情報フォーム
 * @author tonnsama123
 *
 */
public class DestinationForm implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int userId;
	private String familyName;
	private String firstName;
	private String telNumber;
	private String address;
	
	/**
	 * ユーザーIDを取得する
	 * @return ユーザーID
	 */
	public int getUserId() {
		return userId;
	}
	
	/**
	 * ユーザーIDを設定する
	 * @param userId ユーザーID
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	/**
	 * 宛先姓を取得する
	 * @return 宛先姓
	 */
	public String getFamilyName() {
		return familyName;
	}
	
	/**
	 * 宛先姓を設定する
	 * @param familyName 宛先姓
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	/**
	 * 宛先名を取得する
	 * @return 宛先名
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * 宛先名を設定する
	 * @param firstName 宛先名
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * 取電話番号を取得する
	 * @return 
	 */
	public String getTelNumber() {
		return telNumber;
	}
	
	/**
	 * を取電話番号を設定する
	 * @param telNumber を取電話番号
	 */
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	
	/**
	 * 住所を取得する
	 * @return 住所
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * 住所を設定する
	 * @param address 住所
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
}
