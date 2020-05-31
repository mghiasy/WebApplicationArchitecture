package WAA.domain;

import java.time.LocalDate;
import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

public class User {
	@Size(min=2,max=30, message="Size of the name must be between 2 and 30")
	private String name;
	
	//use NotBlank or NotEmpty for String
	@NotBlank(message="email must have a value")
	@Email(message = "Email must follow the formatter ***@***")
	private String email;
	

	//Min is used for int and show the min value
	@Min(value = 18, message ="Age must be greater than ot equal to 18")
	@NotNull(message ="Age is a required field")
	//for age which is Int we can use NotNull
	private Integer age;
	
	
	//better to use localDate instead of Date; coz Date is old and is not immutable
	//for change from string to Date time => otherwise will raise error in submit page
	@DateTimeFormat(pattern="mm-DD-yyyy") // Does not work for LocalDate => loCalDate returns just Date not time , DateTimeFormatter returns both
	@NotNull(message ="birthday is a required field")
	//private LocalDate birthday;
	private Date birthday;
	
	@NotBlank(message="role must have a value")
	private String role;
	
	@Valid
	private Address addr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	

}
