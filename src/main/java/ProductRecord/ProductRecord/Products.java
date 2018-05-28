package ProductRecord.ProductRecord;

import org.springframework.data.annotation.Id;

public class Products {
	@Id
	String productname;
	String model;
	String description;
	String yearmodel;
	double price;
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getYearmodel() {
		return yearmodel;
	}
	public void setYearmodel(String yearmodel) {
		this.yearmodel = yearmodel;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
