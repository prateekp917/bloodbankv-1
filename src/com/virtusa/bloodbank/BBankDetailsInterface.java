package com.virtusa.bloodbank;

import java.util.List;

import com.virtusa.bloodbank.model.BBankDetails;
import com.virtusa.bloodbank.model.DonorDetail;

public interface BBankDetailsInterface {
	public List<BBankDetails> findAllDetails();
	public String findBankname(long donor_id);
}
