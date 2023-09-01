package jp.co.internous.quest.model.domain;

import java.sql.Timestamp;

import jp.co.internous.quest.model.form.DestinationForm;


/**
 * mst_destinationのドメイン
 * @author tonnsama123
 *
 */


public class MstDestination {
	private int id;
	private int userId;
	private String familyName;
	private String firstName;
	private String telNumber;
	private String address;
	private byte status;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	public MstDestination () {}

	/**
	 * コンストラクタ
	 * @param f 宛先情報フォーム
	 */
	public MstDestination(DestinationForm f) {
		userId = f.getUserId();
		familyName = f.getFamilyName();
		firstName = f.getFirstName();
		telNumber = f.getTelNumber();
		address = f.getAddress();
	}
	
	/**
	 * IDを取得する
	 * @return ID
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * IDを設定する
	 * @param id ID
	 */
	public void setId(int id) {
		this.id = id;
	}
	
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
	 * 姓を取得する
	 * @return 姓
	 */
	public String getFamilyName() {
		return familyName;
	}
	
	/**
	 * 姓を設定する
	 * @param familyName 姓
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	/**
	 * 姓を取得する
	 * @return 姓
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * 名を設定する
	 * @param firstName 名
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * 電話番号を取得する
	 * @return 電話番号
	 */
	public String getTelNumber() {
		return telNumber;
	}
	
	/**
	 * 電話番号を設定する
	 * @param telNumber 電話番号
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
	
	/**
	 * ステータスを取得する
	 * @return ステータス
	 */
	public byte getStatus() {
		return status;
	}
	
	/**
	 * ステータスを設定する
	 * @param status ステータス
	 */
	public void setStatus(byte status) {
		this.status = status;
	}
	
	/**
	 * 登録日時を取得する
	 * @return 登録日時
	 */
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	
	/**
	 * 登録日時を設定する
	 * @param createdAt 登録日時
	 */
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	/**
	 * 更新日時を取得する
	 * @return 更新日時
	 */
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	
	/**
	 * 更新日時を設定する
	 * @param updatedAt 更新日時
	 */
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
}
