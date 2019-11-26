package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_PRODUCT_PURCHASE")
public class Product_Purchase_Information {

	@Id
	@GeneratedValue
	@Column(name = "PRODUCT_PURCHASE_ID")
	private int productpid;

	public Product_Information getProductinformation() {
		return productinformation;
	}

	public void setProductinformation(Product_Information productinformation) {
		this.productinformation = productinformation;
	}

	@OneToOne
	@JoinColumn(name = "PRODUCT_ID")
	private Product_Information productinformation;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CARD_NO")
	private Card_Details carddetails;

	public Card_Details getCarddetails() {
		return carddetails;
	}

	public void setCarddetails(Card_Details carddetails) {
		this.carddetails = carddetails;
	}

	public int getProductpid() {
		return productpid;
	}

	public void setProductpid(int productpid) {
		this.productpid = productpid;
	}

	

}
