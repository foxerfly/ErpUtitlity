package com.edwin.modle;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the COPTO database table.
 * 
 */
@Embeddable
public class CoptoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="TO001")
	private String to001;

	@Column(name="TO002")
	private String to002;

	@Column(name="TO003")
	private String to003;

	public CoptoPK() {
	}
	public String getTo001() {
		return this.to001;
	}
	public void setTo001(String to001) {
		this.to001 = to001;
	}
	public String getTo002() {
		return this.to002;
	}
	public void setTo002(String to002) {
		this.to002 = to002;
	}
	public String getTo003() {
		return this.to003;
	}
	public void setTo003(String to003) {
		this.to003 = to003;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CoptoPK)) {
			return false;
		}
		CoptoPK castOther = (CoptoPK)other;
		return 
			this.to001.equals(castOther.to001)
			&& this.to002.equals(castOther.to002)
			&& this.to003.equals(castOther.to003);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.to001.hashCode();
		hash = hash * prime + this.to002.hashCode();
		hash = hash * prime + this.to003.hashCode();
		
		return hash;
	}
}