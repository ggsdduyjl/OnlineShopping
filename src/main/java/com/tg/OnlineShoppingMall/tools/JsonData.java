package com.tg.OnlineShoppingMall.tools;


/**
 * 前后端交互的数据格式
 * @author follow_tg
 *
 */
public class JsonData {
	private String status;
	private String msg;
	private String callback;
	Object data;
	
	public JsonData (String status,String msg,Object data,String callback) {
		this.status=status;
		this.msg=msg;
		this.data=data;
		this.callback=callback;
	}
	
	public JsonData(Object data) {
		this.data=data;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return this.callback+
				"({'status':'"+ this.status
				+"','msg':'" +this.msg
				+"','data':'"+this.data
				+"'})";
	}
}