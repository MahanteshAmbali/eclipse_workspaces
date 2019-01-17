package org.hib;

public class Product {
		
		private String productId;
		private String productName;
		private String productModelNo;
		private double productPrice;
		private String productCondition;
		private int productAvailability;
		
		public String getProductId() {
			return productId;
		}
		public void setProductId(String productId) {
			this.productId = productId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public String getProductModelNo() {
			return productModelNo;
		}
		public void setProductModelNo(String productModelNo) {
			this.productModelNo = productModelNo;
		}
		public double getProductPrice() {
			return productPrice;
		}
		public void setProductPrice(double productPrice) {
			this.productPrice = productPrice;
		}
		public String getProductCondition() {
			return productCondition;
		}
		public void setProductCondition(String productCondition) {
			this.productCondition = productCondition;
		}
		public int getProductAvailability() {
			return productAvailability;
		}
		public void setProductAvailability(int productAvailability) {
			this.productAvailability = productAvailability;
		}
		@Override
		public String toString() {
			return "Product [productId=" + productId + ", productName="
					+ productName + ", productModelNo=" + productModelNo
					+ ", productPrice=" + productPrice + ", productCondition="
					+ productCondition + ", productAvailability="
					+ productAvailability + "]";
		}
		
		
}
