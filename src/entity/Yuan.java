package entity;

import java.util.Date;
import java.util.List;

public class Yuan {
private int id;
private String yuangongname;
private String word;
private Date entryTime;
private int wage;
private int bonus;
private int bumenTableId;
private List<Bu>list;
public List<Bu> getList() {
	return list;
}
public void setList(List<Bu> list) {
	this.list = list;
}
public Bu getBu() {
	return bu;
}
public void setBu(Bu bu) {
	this.bu = bu;
}
public int getBumenTableId() {
	return bumenTableId;
}
public void setBumenTableId(int bumenTableId) {
	this.bumenTableId = bumenTableId;
}
public int getBonus() {
	return bonus;
}
public void setBonus(int bonus) {
	this.bonus = bonus;
}
private Bu bu;

public Bu getBumentable() {
	return bu;
}
public void setBumentable(Bu bu) {
	this.bu = bu;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getYuangongname() {
	return yuangongname;
}
public void setYuangongname(String yuangongname) {
	this.yuangongname = yuangongname;
}
public String getWord() {
	return word;
}
public void setWord(String word) {
	this.word = word;
}
public Date getEntryTime() {
	return entryTime;
}
public void setEntryTime(Date entryTime) {
	this.entryTime = entryTime;
}
public int getWage() {
	return wage;
}
public void setWage(int wage) {
	this.wage = wage;
} 

}
