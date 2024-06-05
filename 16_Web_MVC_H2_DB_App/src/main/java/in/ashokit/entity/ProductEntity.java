package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ProductEntity {
	@Id
	@GeneratedValue
	private Integer pid;
	private String name;
	private Long quantity;
	private Double price;
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public ProductEntity(Integer pid, String name, Long quantity, Double price) {
		super();
		this.pid = pid;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	public ProductEntity(Integer pid, String name, Long quantity) {
		super();
		this.pid = pid;
		this.name = name;
		this.quantity = quantity;
	}
	public ProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ProductEntity [pid=" + pid + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	

}
