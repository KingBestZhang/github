package com.chinasoft.enity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;
/**
 * @Decription
 * @author Administrator ccq.com
 * @version V1.0
 * 网站<a href="http://www.chinasoft.com"></a>
 */
@Data
public class Document implements Serializable{
        private Integer id;//文档编号
        private String  title;//标题
        private String fileName;//文件名
        private MultipartFile file;//文件
        private String remark;//描述
        private Date createDate;//上传时间
        private User user;//上传者
        
        
}
