/**
 * 
 */
package com.students.domain;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @author B.Pirasanth
 *
 */
public class Phone implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Min(100)
	@Max(999)
 	private Integer area;
	
	@Min(100)
	@Max(999)
 	private Integer prefix;
	
	@Min(1000)
	@Max(9999)
 	private Integer number;
	

 


	public Phone(Integer area, Integer prefix, Integer number) {
		super();
		this.area = area;
		this.prefix = prefix;
		this.number = number;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

 	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getPrefix() {
		return prefix;
	}

	public void setPrefix(Integer prefix) {
		this.prefix = prefix;
	}
}
