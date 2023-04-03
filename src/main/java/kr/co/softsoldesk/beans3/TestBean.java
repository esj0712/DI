package kr.co.softsoldesk.beans3;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TestBean {
	// 중복이 허용되는 list
	private List<String> list1; // 문자열
	private List<Integer> list2; // 정수
	private List<DataBean> list3; // DataBean의 자료
	
	// 중복된 값을 넣지 못하는 set
	private Set<String> Set1; 
	private Set<Integer> Set2; 
	private Set<DataBean> Set3;
	
	// map
	private Map<String, Object> map1;
	// 문자열만 사용 가능
	private Properties prop1;
	
	
	
	//=================================================================
	
	public Map<String, Object> getMap1() {
		return map1;
	}
	public Properties getProp1() {
		return prop1;
	}
	public void setProp1(Properties prop1) {
		this.prop1 = prop1;
	}
	public void setMap1(Map<String, Object> map1) {
		this.map1 = map1;
	}
	public Set<String> getSet1() {
		return Set1;
	}
	public void setSet1(Set<String> set1) {
		Set1 = set1;
	}
	public Set<Integer> getSet2() {
		return Set2;
	}
	public void setSet2(Set<Integer> set2) {
		Set2 = set2;
	}
	public Set<DataBean> getSet3() {
		return Set3;
	}
	public void setSet3(Set<DataBean> set3) {
		Set3 = set3;
	}
	
	public List<String> getList1() {
		return list1;
	}
	public void setList1(List<String> list1) {
		this.list1 = list1;
	}
	public List<Integer> getList2() {
		return list2;
	}
	public void setList2(List<Integer> list2) {
		this.list2 = list2;
	}
	public List<DataBean> getList3() {
		return list3;
	}
	public void setList3(List<DataBean> list3) {
		this.list3 = list3;
	}
	
	
}
