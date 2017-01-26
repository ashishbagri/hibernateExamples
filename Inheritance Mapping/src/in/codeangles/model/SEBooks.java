package in.codeangles.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="se")
public class SEBooks extends Books {

	private String specialFeature;

	public String getSpecialFeature() {
		return specialFeature;
	}

	public void setSpecialFeature(String specialFeature) {
		this.specialFeature = specialFeature;
	}
}
