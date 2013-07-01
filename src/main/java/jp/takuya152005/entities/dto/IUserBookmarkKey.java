package jp.takuya152005.entities.dto;

import java.io.Serializable;

public class IUserBookmarkKey implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column i_user_bookmark_0.user_id
	 * @mbggenerated
	 */
	private Long userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column i_user_bookmark_0.bookmark_user_id
	 * @mbggenerated
	 */
	private Long bookmarkUserId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table i_user_bookmark_0
	 * @mbggenerated
	 */
	private Integer tableNameSuffix;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table i_user_bookmark_0
	 * @mbggenerated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column i_user_bookmark_0.user_id
	 * @return  the value of i_user_bookmark_0.user_id
	 * @mbggenerated
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column i_user_bookmark_0.user_id
	 * @param userId  the value for i_user_bookmark_0.user_id
	 * @mbggenerated
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column i_user_bookmark_0.bookmark_user_id
	 * @return  the value of i_user_bookmark_0.bookmark_user_id
	 * @mbggenerated
	 */
	public Long getBookmarkUserId() {
		return bookmarkUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column i_user_bookmark_0.bookmark_user_id
	 * @param bookmarkUserId  the value for i_user_bookmark_0.bookmark_user_id
	 * @mbggenerated
	 */
	public void setBookmarkUserId(Long bookmarkUserId) {
		this.bookmarkUserId = bookmarkUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table i_user_bookmark_0
	 * @mbggenerated
	 */
	public Integer getTableNameSuffix() {
		return tableNameSuffix;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table i_user_bookmark_0
	 * @mbggenerated
	 */
	public void setTableNameSuffix(Integer tableNameSuffix) {
		this.tableNameSuffix = tableNameSuffix;
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
		sb.append(", userId=").append(userId);
		sb.append(", bookmarkUserId=").append(bookmarkUserId);
		sb.append(", tableNameSuffix=").append(tableNameSuffix);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}