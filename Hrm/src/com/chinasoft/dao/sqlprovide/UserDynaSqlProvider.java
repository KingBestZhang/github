package com.chinasoft.dao.sqlprovide;


import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import com.chinasoft.enity.User;
import com.chinasoft.unity.HrmConstans;

public class UserDynaSqlProvider {
	//分类动态查询
	public String selectWithParam( final Map<String,Object> params)
	{
		String sql =new SQL(){
			{
				SELECT("*");
				FROM(HrmConstans.USERTABLE);
				   if(params.get("user")!=null)
				    	 
				     {
				    	User user=(User) params.get("user"); 
				    	 if(user.getUsername()!=null&&"".equals(user.getUsername()))
				    	 {
				    		 WHERE("username LIKE CONCAT('%',#{user.username},'%') ");
				    		 
				    	 }
				    	 if(user.getStatus()!=null&&"".equals(user.getStatus()))
				    	 {
				    		 WHERE("status LIKE CONCAT('%',#{user.status},'%') ");
				    		 
				    	 }
				     }
				
			}
		}.toString();
		if(params.get("pageModel")!=null)
			{
			sql = " limit  #{pageModel.FirstLimitParam} ,#{pageModel.pageSize} ";
			
			}
		
		return sql;
	}
	//动态查询数据总量
	public String count(final Map<String,Object> params)
	
	{
		
		return new SQL()
				{
			
		        	{
				     SELECT("count(*)")  ;
				     FROM(HrmConstans.USERTABLE);
				     if(params.get("user")!=null)
				    	 
				     {
				    	User user=(User) params.get("user"); 
				    	 if(user.getUsername()!=null&&"".equals(user.getUsername()))
				    	 {
				    		 WHERE("username LIKE CONCAT('%',#{user.username},'%') ");
				    		 
				    	 }
				    	 if(user.getStatus()!=null&&"".equals(user.getStatus()))
				    	 {
				    		 WHERE("status LIKE CONCAT('%',#{user.status},'%') ");
				    		 
				    	 }
				     }
			        }
			
				}.toString();
	}
	//动态插入
	public String inserUser(final User user)
	{
		
		return new SQL(){
			{
			INSERT_INTO(HrmConstans.USERTABLE);
			if(user.getUsername()!=null&&user.getUsername().equals(""))
			{
				
				VALUES("username","#{username}");
			}
			if(user.getStatus()!=null&&user.getStatus().equals(""))
			{
				
				VALUES("status","#{status}");
			}
			if(user.getLoginame()!=null&&user.getLoginame().equals(""))
			{
				
				VALUES("loginname","#{loginname}");
			}	
			if(user.getPassword()!=null&&user.getPassword().equals(""))
			{
				
				VALUES("password","#{password}");
			}
			}
		}.toString();
	}
   //动态更新
	public  String updateUser(final User user)
	{
		return new SQL()
		{
			{
			
			UPDATE(HrmConstans.USERTABLE);
			 if(user.getUsername()!=null)
			 {
				 
				 SET("username = #{username}");
				 
			 }
			 if(user.getLoginame()!=null)
			 {
				 SET("loginname = #{loginname}");
			 }
			 if(user.getPassword()!=null)
			 {
				 SET("password = #{password}");
			 }
			 if(user.getStatus()!=null)
			 {
				 SET("status = #{status}");
			 }
			 if(user.getCreateDate()!=null)
			 {
				 SET("createdate = #{createdate}");
			 }
			 WHERE("ID= #{id}");
		    }
			}.toString();	
	}
}
