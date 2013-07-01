package jp.takuya152005.entities.dto;

import java.io.Serializable;
import java.util.Date;

public class IUserBookmark extends IUserBookmarkKey implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column i_user_bookmark_0.call_point
	 * @mbggenerated
	 */
	private Integer callPoint;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column i_user_bookmark_0.last_call_datetime
	 * @mbggenerated
	 */
	private Date lastCallDatetime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column i_user_bookmark_0.delete_flg
	 * @mbggenerated
	 */
	private Byte deleteFlg;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column i_user_bookmark_0.update_datetime
	 * @mbggenerated
	 */
	private Date updateDatetime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column i_user_bookmark_0.insert_datetime
	 * @mbggenerated
	 */
	private Date insertDatetime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table i_user_bookmark_0
	 * @mbggenerated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column i_user_bookmark_0.call_point
	 * @return  the value of i_user_bookmark_0.call_point
	 * @mbggenerated
	 */
	public Integer getCallPoint() {
		return callPoint;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column i_user_bookmark_0.call_point
	 * @param callPoint  the value for i_user_bookmark_0.call_point
	 * @mbggenerated
	 */
	public void setCallPoint(Integer callPoint) {
		this.callPoint = callPoint;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column i_user_bookmark_0.last_call_datetime
	 * @return  the value of i_user_bookmark_0.last_call_datetime
	 * @mbggenerated
	 */
	public Date getLastCallDatetime() {
		return lastCallDatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column i_user_bookmark_0.last_call_datetime
	 * @param lastCallDatetime  the value for i_user_bookmark_0.last_call_datetime
	 * @mbggenerated
	 */
	public void setLastCallDatetime(Date lastCallDatetime) {
		this.lastCallDatetime = lastCallDatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column i_user_bookmark_0.delete_flg
	 * @return  the value of i_user_bookmark_0.delete_flg
	 * @mbggenerated
	 */
	public Byte getDeleteFlg() {
		return deleteFlg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column i_user_bookmark_0.delete_flg
	 * @param deleteFlg  the value for i_user_bookmark_0.delete_flg
	 * @mbggenerated
	 */
	public void setDeleteFlg(Byte deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column i_user_bookmark_0.update_datetime
	 * @return  the value of i_user_bookmark_0.update_datetime
	 * @mbggenerated
	 */
	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column i_user_bookmark_0.update_datetime
	 * @param updateDatetime  the value for i_user_bookmark_0.update_datetime
	 * @mbggenerated
	 */
	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column i_user_bookmark_0.insert_datetime
	 * @return  the value of i_user_bookmark_0.insert_datetime
	 * @mbggenerated
	 */
	public Date getInsertDatetime() {
		return insertDatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column i_user_bookmark_0.insert_datetime
	 * @param insertDatetime  the value for i_user_bookmark_0.insert_datetime
	 * @mbggenerated
	 */
	public void setInsertDatetime(Date insertDatetime) {
		this.insertDatetime = insertDatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table i_user_bookmark_0
	 * @mbggenerated
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", callPoint=").append(callPoint);
		sb.append(", lastCallDatetime=").append(lastCallDatetime);
		sb.append(", deleteFlg=").append(deleteFlg);
		sb.append(", updateDatetime=").append(updateDatetime);
		sb.append(", insertDatetime=").append(insertDatetime);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}