package com.chinasoft.util;

/**
 * 
 * @author Administrator
 * @version V1.0
 * ��ҳʵ����
 */
public class PageModel {

	private int recordCount;   //��ҳ��������
	private int pageIndex;     //��ǰҳ��
	private int pageSize = HrmConstants.PAGE_DEFAULT_SIZE= 4;  //ÿҳ�ֶ���������
	private int totalSize;    //��ҳ��
	
	
	public int getRecordCount() {
		this.recordCount = this.recordCount <=0?0:this.recordCount;
		return recordCount ;
	}
	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}
	public int getPageIndex() {
		this.pageIndex = this.pageIndex <= 0?1:this.pageIndex;
		//�жϵ�ǰҳ���Ƿ񳬹���ҳ������������ˣ�Ĭ�ϸ����һҳ����Ϊ��ǰҳ
		this.pageIndex = this.pageIndex>=this.getTotalSize()?this.getTotalSize():this.pageIndex;
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getPageSize() {
		this.pageSize = this.pageSize<=HrmConstants.PAGE_DEFAULT_SIZE?HrmConstants.PAGE_DEFAULT_SIZE:this.pageSize;
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalSize() {
		if(this.getRecordCount() <0)
		{
			totalSize = 0;
		}
		else
		{
			totalSize =this.getRecordCount()%this.getPageSize()==0?this.getRecordCount()/this.getPageSize():
				this.getRecordCount()/this.getPageSize()+1;
		}
			
		return totalSize;
	}
	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}
	
	public int getFirstLimitParam()
	{
		return (this.getPageIndex()-1)*this.getPageSize();
	}
}
