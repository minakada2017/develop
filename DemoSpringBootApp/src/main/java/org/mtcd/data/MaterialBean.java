package org.mtcd.data;

import java.io.Serializable;
import java.util.Date;

public class MaterialBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private String mt_id;            // マテリアルID
	private String mt_kind1;         // テリアル種別１
	private String mt_kind2;         // マテリアル種別２
	private String mt_onr_id;        // マテリアルオーナーID
	private String mt_nm;            // マテリアル名
	private String tag_a;            // 追加タグA
	private String tag_b;            // 追加タグB
	private String default_locale;   // 標準ロケールID
	private String ex_cnt;           // 排他制御カウンタ
	private String ins_acc;          // 登録アカウント
	private String ins_date;         // 登録日時
	private String upd_acc;          // 更新アカウント
	private String upd_date;         // 更新日時
	private String del_flg;          // 削除フラグ
	/**
	 * @return the mt_id
	 */
	public String getMt_id() {
		return mt_id;
	}
	/**
	 * @param mt_id the mt_id to set
	 */
	public void setMt_id(String mt_id) {
		this.mt_id = mt_id;
	}
	/**
	 * @return the mt_kind1
	 */
	public String getMt_kind1() {
		return mt_kind1;
	}
	/**
	 * @param mt_kind1 the mt_kind1 to set
	 */
	public void setMt_kind1(String mt_kind1) {
		this.mt_kind1 = mt_kind1;
	}
	/**
	 * @return the mt_kind2
	 */
	public String getMt_kind2() {
		return mt_kind2;
	}
	/**
	 * @param mt_kind2 the mt_kind2 to set
	 */
	public void setMt_kind2(String mt_kind2) {
		this.mt_kind2 = mt_kind2;
	}
	/**
	 * @return the mt_onr_id
	 */
	public String getMt_onr_id() {
		return mt_onr_id;
	}
	/**
	 * @param mt_onr_id the mt_onr_id to set
	 */
	public void setMt_onr_id(String mt_onr_id) {
		this.mt_onr_id = mt_onr_id;
	}
	/**
	 * @return the mt_nm
	 */
	public String getMt_nm() {
		return mt_nm;
	}
	/**
	 * @param mt_nm the mt_nm to set
	 */
	public void setMt_nm(String mt_nm) {
		this.mt_nm = mt_nm;
	}
	/**
	 * @return the tag_a
	 */
	public String getTag_a() {
		return tag_a;
	}
	/**
	 * @param tag_a the tag_a to set
	 */
	public void setTag_a(String tag_a) {
		this.tag_a = tag_a;
	}
	/**
	 * @return the tag_b
	 */
	public String getTag_b() {
		return tag_b;
	}
	/**
	 * @param tag_b the tag_b to set
	 */
	public void setTag_b(String tag_b) {
		this.tag_b = tag_b;
	}
	/**
	 * @return the default_locale
	 */
	public String getDefault_locale() {
		return default_locale;
	}
	/**
	 * @param default_locale the default_locale to set
	 */
	public void setDefault_locale(String default_locale) {
		this.default_locale = default_locale;
	}
	/**
	 * @return the ex_cnt
	 */
	public String getEx_cnt() {
		return ex_cnt;
	}
	/**
	 * @param ex_cnt the ex_cnt to set
	 */
	public void setEx_cnt(String ex_cnt) {
		this.ex_cnt = ex_cnt;
	}
	/**
	 * @return the ins_acc
	 */
	public String getIns_acc() {
		return ins_acc;
	}
	/**
	 * @param ins_acc the ins_acc to set
	 */
	public void setIns_acc(String ins_acc) {
		this.ins_acc = ins_acc;
	}
	/**
	 * @return the ins_date
	 */
	public String getIns_date() {
		return ins_date;
	}
	/**
	 * @param ins_date the ins_date to set
	 */
	public void setIns_date(String ins_date) {
		this.ins_date = ins_date;
	}
	/**
	 * @return the upd_acc
	 */
	public String getUpd_acc() {
		return upd_acc;
	}
	/**
	 * @param upd_acc the upd_acc to set
	 */
	public void setUpd_acc(String upd_acc) {
		this.upd_acc = upd_acc;
	}
	/**
	 * @return the upd_date
	 */
	public String getUpd_date() {
		return upd_date;
	}
	/**
	 * @param upd_date the upd_date to set
	 */
	public void setUpd_date(String upd_date) {
		this.upd_date = upd_date;
	}
	/**
	 * @return the del_flg
	 */
	public String getDel_flg() {
		return del_flg;
	}
	/**
	 * @param del_flg the del_flg to set
	 */
	public void setDel_flg(String del_flg) {
		this.del_flg = del_flg;
	}

}
