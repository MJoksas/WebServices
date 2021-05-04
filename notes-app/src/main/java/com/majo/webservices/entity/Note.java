package com.majo.webservices.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "NOTES")
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public class Note {
	@Id @GeneratedValue @Getter @Setter private Long id;
	@Getter @Setter private String title;
	@Getter @Setter private String description;
	@Getter @Setter private String tag;
	@Getter @Setter private String note;
	
	public Note(String title, String description, String tag, String note) {
		super();
		this.title = title;
		this.description = description;
		this.tag = tag;
		this.note = note;
	}
	
	
}
