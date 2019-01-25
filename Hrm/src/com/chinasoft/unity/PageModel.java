package com.chinasoft.unity;



/** 
 * 
 * @author Administrator
 *分页实体类
 */

public class PageModel {
   public int getRecordCount() {
	   this.recordCount = this.recordCount<=0?0:this.recordCount;
		return recordCount;
	}
	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}
	public int getPageIndex() {
		this.pageSize =this.pageSize<=HrmConstans.PAGE_DEFAULT_SIZE?HrmConstans.PAGE_DEFAULT_SIZE:this.pageSize;
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getPageSize() {
		this.pageIndex=this.pageIndex<=0?1:this.pageIndex;
		//判断当前页面是否超过总页数，如果超过了，默认给最后一页，当做当前页
		this.pageIndex = this.pageIndex>=this.getTotalSize()?this.getTotalSize():this.pageIndex;
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalSize() {
		if(this.getRecordCount()<0)
		{
			
			totalSize = 0;
		}
		else
		{
			
			totalSize =this.getPageIndex()%this.getPageIndex()==0?this.getPageIndex()%this.getPageIndex():this.getPageIndex()%this.getPageIndex()+1;
		}
		return totalSize;
	}
	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}
private int recordCount;//分页的数据总量
   private int pageIndex;  //当前页面
   private  int pageSize=HrmConstans.PAGE_DEFAULT_SIZE;
   private  int totalSize; //总页数
   private  int FirstLimitParam;
public int getFirstLimitParam() {
	 return (this.getPageIndex()-1)*this.getPageSize();
}
public void setFirstLimitParam(int firstLimitParam) {
	FirstLimitParam = firstLimitParam;
}

   
}
