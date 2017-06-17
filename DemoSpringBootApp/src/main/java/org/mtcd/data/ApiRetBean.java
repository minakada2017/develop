package org.mtcd.data;

import java.io.Serializable;

public class ApiRetBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private String RetCd;
	private String RetMsg;
	
	/**
	 * @return the retCd
	 */
	public String getRetCd() {
		return RetCd;
	}
	/**
	 * @param retCd the retCd to set
	 */
	public void setRetCd(String retCd) {
		RetCd = retCd;
	}
	/**
	 * @return the retMsg
	 */
	public String getRetMsg() {
		return RetMsg;
	}
	/**
	 * @param retMsg the retMsg to set
	 */
	public void setRetMsg(String retMsg) {
		RetMsg = retMsg;
	}
	
}
