package com.tnsif.project;

public class Beneficiary {
	private int beneficiaryId;
    private String name;
    private int customerId;

    public Beneficiary(int beneficiaryId, String name, int customerId) {
        this.beneficiaryId = beneficiaryId;
        this.name = name;
        this.customerId = customerId;

}

	public int getBeneficiaryId() {
		return beneficiaryId;
	}

	public void setBeneficiaryId(int beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	
}
}
	
