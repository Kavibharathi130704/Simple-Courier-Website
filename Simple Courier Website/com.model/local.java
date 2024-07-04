package com.model;

public class local {
 String ProductName;
 String FromAddress;
 String ToAddress;
 
 public local(String ProductName, String FromAddress, String ToAddress) {
	 super();
	 this.ProductName=ProductName;
	 this.FromAddress=FromAddress;
	 this.ToAddress=ToAddress;
 }
 public String getProductName() {
	return ProductName;
}

public void setProductName(String productName) {
	ProductName = productName;
}

public String getFromAddress() {
	return FromAddress;
}

public void setFromAddress(String fromAddress) {
	FromAddress = fromAddress;
}

public String getToAddress() {
	return ToAddress;
}

public void setToAddress(String toAddress) {
	ToAddress = toAddress;
}
	
}
