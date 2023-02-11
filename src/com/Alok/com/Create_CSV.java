package com.Alok.com;

import java.io.FileWriter;

public class Create_CSV {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Name").append(",").append("website").append(",").append("Country").append("\n");
	stringBuilder.append("Alok").append(",").append("www.infintesolutions.com").append(",").append("USA").append("\n");
	stringBuilder.append("Ashwani").append(",").append("www.infintesolutions.com").append(",").append("China").append("\n");
	stringBuilder.append("Surya").append(",").append("www.infintesolutions.com").append(",").append("Greece").append("\n");
	stringBuilder.append("Aakash").append(",").append("www.infintesolutions.com").append(",").append("Amerstdam").append("\n");
	stringBuilder.append("Bhanu").append(",").append("www.infintesolutions.com").append(",").append("Italy").append("\n");
	stringBuilder.append("Bhupesh").append(",").append("www.infintesolutions.com").append(",").append("Iraq").append("\n");
	stringBuilder.append("Bharat").append(",").append("www.infintesolutions.com").append(",").append("Duabi").append("\n");
	stringBuilder.append("Bhuvan").append(",").append("www.infintesolutions.com").append(",").append("Australlia").append("\n");
	stringBuilder.append("Carl").append(",").append("www.infintesolutions.com").append(",").append("Colombia").append("\n");
	stringBuilder.append("Smith").append(",").append("www.infintesolutions.com").append(",").append("France").append("\n");
	stringBuilder.append("Bhavya").append(",").append("www.infintesolutions.com").append(",").append("ukraine").append("\n");
	try(FileWriter writer= new FileWriter("C:\\temp\\hello.csv")){
	writer.write(stringBuilder.toString());
	System.out.println("CSV file created....");
	}catch(Exception e) {
	}

	stringBuilder.append("Bhushan").append(",").append("www.infintesolutions.com").append(",").append("Italy").append("\n");
}
}
