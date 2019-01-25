package com.chinasoft.dao.sqlprovider;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import com.chinasoft.entity.User;
import com.chinasoft.util.HrmConstants;

/**
 * @Decription:
 * @author Administrator  22215@qq.com
 * @version V1.0
 * 网站 <a href="http://www.chinasofti.com">chinasoft</a>
 */
public class UserDynaSqlProvider {

	//分页动态查询
	
	public String selectWithParam(final Map<String,Object> params )
	{
		String sql= new SQL(){
			{
				SELECT("*");
				FROM(HrmConstants.USERTABLE);
				if(params.get("user") != null)
				{
					User user =(User) params.get("user");
					if(user.getUsername() != null && !user.getUsername().equals(""))
					{
						WHERE(" username LIKE CONCAT ('%',#{user.username},'%') ");
					}
					if(user.getStatus() != null && !user.getStatus().equals(""))
					{
						WHERE(" status LIKE CONCAT ('%',#{user.status},'%') ");
					}
				}
			}
		}.toString();
		  if(params.get("pageModel") != null)  
		  {
			  sql += "  limit  #{pageModel.firstLimitParam} , #{pageModel.pageSize} ";
		  }
		return sql;
	}
	
	
	//动态查询数据总量
	public String count(final Map<String,Object> params)
	{
		return new SQL(){
			{
				SELECT("count(*)");
				FROM(HrmConstants.USERTABLE);
				if(params.get("user") != null)
				{
					User user =(User) params.get("user");
					if(user.getUsername() != null && !user.getUsername().equals(""))
					{
						WHERE(" username LIKE CONCAT ('%',#{user.username},'%') ");
					}
					if(user.getStatus() != null && !user.getStatus().equals(""))
					{
						WHERE(" status LIKE CONCAT ('%',#{user.status},'%') ");
					}
				}
			}
		}.toString();
	}
	
	//动态插入
	public String insertUser(final User user)
	{
		return new SQL(){
			{
				INSERT_INTO(HrmConstants.USERTABLE);
				if(user.getUsername() !=null && !user.getUsername().equals(""))
				{
					VALUES("username","#{username}");
				}
				if(user.getStatus() !=null && !user.getStatus().equals(""))
				{
					VALUES("status","#{status}");
				}
				if(user.getLoginname() !=null && !user.getLoginname().equals(""))
				{
					VALUES("loginname","#{loginname}");
				}
				if(user.getPassword() !=null && !user.getPassword().equals(""))
				{
					VALUES("password","#{password}");
				}
			}
		}.toString();
	}
	
	
	//动态更新
	public String updateUser(final User user)
	{
		 return new SQL(){
			 { 
				 UPDATE(HrmConstants.USERTABLE);
				  if(user.getUsername()!= null)
				  {
					  SET(" username = #{username} ");
				  }
				  if(user.getLoginname() != null)
				  {
					  SET(" loginname = #{loginname} ");
				  }
				  if(user.getPassword() != null)
				  {
					  SET(" password = #{password} ");
				  }
				  if(user.getStatus() != null)
				  {
					  SET(" status = #{status} ");
				  }
				  
				  if(user.getCreateDate() != null)
				  {
					  SET(" createdate = #{createdate} ");
				  }
				  WHERE(" id = #{id}");
			 }
		 }.toString();
	}
}
