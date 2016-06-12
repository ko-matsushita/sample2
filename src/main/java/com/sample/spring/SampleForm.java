package com.sample.spring;

import java.io.Serializable;

public class SampleForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3889735342630697088L;
	
	private String mName;
	
	public void setName(String nName) {
		mName = nName;
	}
	
	public String getName() {
		return mName;
	}

}
