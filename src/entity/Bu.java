package entity;

import java.util.List;

public class Bu {
private int bumenTableid;
private String bumenTablename;
private String bumenTableaddress;
private String bumenTabledirector;
private List<Yuan>list;

public List<Yuan> getList() {
	return list;
}
public void setList(List<Yuan> list) {
	this.list = list;
}
public int getBumenTableid() {
	return bumenTableid;
}
public void setBumenTableid(int bumenTableid) {
	this.bumenTableid = bumenTableid;
}
public String getBumenTablename() {
	return bumenTablename;
}
public void setBumenTablename(String bumenTablename) {
	this.bumenTablename = bumenTablename;
}
public String getBumenTableaddress() {
	return bumenTableaddress;
}
public void setBumenTableaddress(String bumenTableaddress) {
	this.bumenTableaddress = bumenTableaddress;
}
public String getBumenTabledirector() {
	return bumenTabledirector;
}
public void setBumenTabledirector(String bumenTabledirector) {
	this.bumenTabledirector = bumenTabledirector;
}
}
