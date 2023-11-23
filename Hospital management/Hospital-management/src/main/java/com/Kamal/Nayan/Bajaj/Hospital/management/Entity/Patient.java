package com.Kamal.Nayan.Bajaj.Hospital.management.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "patientInfo")
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class Patient {
	@Id
	private long id;
	private String name;
	private int age;
	private int room;
	private String doctorName;
	private String admitDate;
	private long expenses;
	private String admitStatus;
}
