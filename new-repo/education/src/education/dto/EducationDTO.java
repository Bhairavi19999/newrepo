package education.dto;

import java.io.Serializable;

public class EducationDTO implements Serializable {
	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "EducationDTO [studentname=" + studentname + ", id=" + id + ", stream=" + stream + ", fee=" + fee + "]";
	}

	private String studentname;
	private int id;
	private String stream;
	private double fee;

	public EducationDTO(String studentname, int id, String stream, double fee) {
		this.studentname = studentname;
		this.id = id;
		this.stream = stream;
		this.fee = fee;
	}

}
