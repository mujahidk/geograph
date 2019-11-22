package com.mujahidk.geograph.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Country {

	@Id
	private String id;

	private String name;
	private String code;

}
