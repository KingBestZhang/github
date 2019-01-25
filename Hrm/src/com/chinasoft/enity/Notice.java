package com.chinasoft.enity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
/**
 * @Decription
 * @author Administrator ccq.com
 * @version V1.0
 * 网站<a href="http://www.chinasoft.com"></a>
 */
@Data
public class Notice implements Serializable{
       private Integer id;//公告编号
       private String title;//公告标题
       private  String content;//内容
       private  Date createDate;//发布日期
       private  User user;//发布者
       
}
