package Dto;

public class DataTransfer {
	private String Firstname;
	private Long id;
	private String TFirstname;
	private String Lastname;
	private String gender;
	public DataTransfer(String firstname, Long id, String tFirstname, String lastname, String gender, String course,
			int experince) {
		super();
		Firstname = firstname;
		this.id = id;
		TFirstname = tFirstname;
		Lastname = lastname;
		this.gender = gender;
		Course = course;
		this.experince = experince;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTFirstname() {
		return TFirstname;
	}
	public void setTFirstname(String tFirstname) {
		TFirstname = tFirstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public int getExperince() {
		return experince;
	}
	public void setExperince(int experince) {
		this.experince = experince;
	}
	private String Course;
	private int experince;

}
