package com.hualala.bean;import lombok.Data;@Datapublic class User {		private Long userID;//	private String userName;//用户名	private String password;//密码	private Integer sex;//1-男 2-女	private String realName;//真实姓名	private String phone;//电话	private Integer roleType;//1-普通用户 2-临时科长 3-科长 4-管理员	private Long departmentID;//科室ID	private String departmentName;//科室名称	private String userIDs;	private String searchKey;	private Integer pageNum;	private Integer pageSize;	private Integer filterRole;//过滤角色类型}