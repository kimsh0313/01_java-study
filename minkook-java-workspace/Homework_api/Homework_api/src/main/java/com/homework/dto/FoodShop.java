package com.homework.dto;

import com.homework.common.DateCalculator;
import com.homework.common.MathCalculator;
import com.homework.common.StringCalculator;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class FoodShop implements DateCalculator, MathCalculator, StringCalculator { // 식당에 대한 정보를 보관하기 위한 vo 클래스
	
	private int num; // 순번
	private String shopName; // 식당명
	private String address;  // 식당주소
	private String phoneNumber; // 식당전화번호
	private String category; // 식당분류(카테고리)
	private LocalDate registDate; // 식당등록일
	
	public FoodShop() {
		
	}

	public FoodShop(int num, String shopName, String address, String phoneNumber, String category, LocalDate registDate) {
		super();
		this.num = num;
		this.shopName = shopName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.category = category;
		this.registDate = registDate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getRegistDate() {
		return registDate;
	}

	public void setRegistDate(LocalDate registDate) {
		this.registDate = registDate;
	}

	@Override
	public String toString() {
		return "FoodShop [num=" + num + ", shopName=" + shopName + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", category=" + category + ", registDate=" + registDate + "]";
	}

	@Override
	public void printNowDateTime() {

	}

	@Override
	public Calendar makeCalendar(String year, String month, String date) {
		return null;
	}

	@Override
	public void printFormat(Calendar calc) {

	}

	@Override
	public boolean isLeapYear(int year) {
		return false;
	}

	@Override
	public long leapDate(int startYear, int endYear) {
		return 0;
	}

	@Override
	public int sumString(String num1, String num2) {
		return 0;
	}

	@Override
	public int minusString(String num1, String num2) {
		return 0;
	}

	@Override
	public int findCharCount(String str, char ch) {
		return 0;
	}

	@Override
	public int selectTokenCount(String str) {
		return 0;
	}

	@Override
	public String toSpaceUpper(String str) {
		return "";
	}

	@Override
	public FoodShop[] csvFormat() {
		return new FoodShop[0];
	}
}
