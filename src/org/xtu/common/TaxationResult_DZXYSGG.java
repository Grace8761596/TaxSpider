package org.xtu.common;

import org.json.JSONException;
import org.json.JSONObject;

public class TaxationResult_DZXYSGG {
	public String TYPE = "委托代征协议书公告";
	public String stfnsrmc = ""; // 受托方名称
	public String stfnsrsbh = ""; // 受托方识别号
	public String dhhm = ""; // 联系电话
	public String stfnsrdz = ""; // 地址
	public String zsxmDm = ""; // 税种及附加
	public String sl = ""; // 计税依据及税率
	public String dzfw = ""; // 代征范围
	public String swjg = ""; // 税务机关
	public String yxqq = ""; // 有效期起
	public String yxqz = ""; // 有效期止
	public String province = ""; // 省份
	public JSONObject toJSONObject() {
		JSONObject json = new JSONObject();
		try {
			json.put("TYPE", TYPE);
			json.put("stfnsrmc", stfnsrmc);
			json.put("stfnsrsbh", stfnsrsbh);
			json.put("dhhm", dhhm);
			json.put("stfnsrdz", stfnsrdz);
			json.put("zsxmDm", zsxmDm);
			json.put("sl", sl);
			json.put("dzfw", dzfw);
			json.put("swjg", swjg);
			json.put("yxqq", yxqq);
			json.put("yxqz", yxqz);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return json;
	}

	public String getTYPE() {
		return TYPE;
	}

	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}

	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getStfnsrmc() {
		return stfnsrmc;
	}

	public void setStfnsrmc(String stfnsrmc) {
		this.stfnsrmc = stfnsrmc;
	}

	public String getStfnsrsbh() {
		return stfnsrsbh;
	}

	public void setStfnsrsbh(String stfnsrsbh) {
		this.stfnsrsbh = stfnsrsbh;
	}

	public String getDhhm() {
		return dhhm;
	}

	public void setDhhm(String dhhm) {
		this.dhhm = dhhm;
	}

	public String getStfnsrdz() {
		return stfnsrdz;
	}

	public void setStfnsrdz(String stfnsrdz) {
		this.stfnsrdz = stfnsrdz;
	}

	public String getZsxmDm() {
		return zsxmDm;
	}

	public void setZsxmDm(String zsxmDm) {
		this.zsxmDm = zsxmDm;
	}

	public String getSl() {
		return sl;
	}

	public void setSl(String sl) {
		this.sl = sl;
	}

	public String getDzfw() {
		return dzfw;
	}

	public void setDzfw(String dzfw) {
		this.dzfw = dzfw;
	}

	public String getSwjg() {
		return swjg;
	}

	public void setSwjg(String swjg) {
		this.swjg = swjg;
	}

	public String getYxqq() {
		return yxqq;
	}

	public void setYxqq(String yxqq) {
		this.yxqq = yxqq;
	}

	public String getYxqz() {
		return yxqz;
	}

	public void setYxqz(String yxqz) {
		this.yxqz = yxqz;
	}

	@Override
	public String toString() {
		return "TaxationResult_DZXYSGG [TYPE=" + TYPE + ", stfnsrmc=" + stfnsrmc
				+ ", stfnsrsbh=" + stfnsrsbh + ", dhhm=" + dhhm + ", stfnsrdz="
				+ stfnsrdz + ", zsxmDm=" + zsxmDm + ", sl=" + sl + ", dzfw="
				+ dzfw + ", swjg=" + swjg + ", yxqq=" + yxqq + ", yxqz=" + yxqz
				+ "]";
	}

}