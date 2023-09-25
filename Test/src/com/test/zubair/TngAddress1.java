package com.test.zubair;


public class TngAddress1 {
	General GeneralObject;
	Address AddressObject;
	ForeignAddress ForeignAddressObject;
	SecondHolder SecondHolderObject;
	ThirdHolder ThirdHolderObject;
	Finance FinanceObject;
	FirstNominee FirstNomineeObject;
	SecondNominee SecondNomineeObject;
	ThirdNominee ThirdNomineeObject;
	private String authSign;
	private String CURRENT_DP_ID;
	private String SET_CORRESPONDENCE;
	private String SET_INST_CLIENT;
	private String INDOC_NO;
	private String txnMode;
	private String fhApplicantDetails;
	private String shApplicantDetails;
	private String thApplicantDetails;
	private String otherDetails;
	private String apiLog;
	private String bankIfscCode;

	// Getter Methods

	public General getGeneral() {
		return GeneralObject;
	}

	public Address getAddress() {
		return AddressObject;
	}

	public ForeignAddress getForeignAddress() {
		return ForeignAddressObject;
	}

	public SecondHolder getSecondHolder() {
		return SecondHolderObject;
	}

	public ThirdHolder getThirdHolder() {
		return ThirdHolderObject;
	}

	public Finance getFinance() {
		return FinanceObject;
	}

	public FirstNominee getFirstNominee() {
		return FirstNomineeObject;
	}

	public SecondNominee getSecondNominee() {
		return SecondNomineeObject;
	}

	public ThirdNominee getThirdNominee() {
		return ThirdNomineeObject;
	}

	public String getAuthSign() {
		return authSign;
	}

	public String getCURRENT_DP_ID() {
		return CURRENT_DP_ID;
	}

	public String getSET_CORRESPONDENCE() {
		return SET_CORRESPONDENCE;
	}

	public String getSET_INST_CLIENT() {
		return SET_INST_CLIENT;
	}

	public String getINDOC_NO() {
		return INDOC_NO;
	}

	public String getTxnMode() {
		return txnMode;
	}

	public String getFhApplicantDetails() {
		return fhApplicantDetails;
	}

	public String getShApplicantDetails() {
		return shApplicantDetails;
	}

	public String getThApplicantDetails() {
		return thApplicantDetails;
	}

	public String getOtherDetails() {
		return otherDetails;
	}

	public String getApiLog() {
		return apiLog;
	}

	public String getBankIfscCode() {
		return bankIfscCode;
	}

	// Setter Methods

	public void setGeneral(General generalObject) {
		this.GeneralObject = generalObject;
	}

	public void setAddress(Address addressObject) {
		this.AddressObject = addressObject;
	}

	public void setForeignAddress(ForeignAddress foreignAddressObject) {
		this.ForeignAddressObject = foreignAddressObject;
	}

	public void setSecondHolder(SecondHolder secondHolderObject) {
		this.SecondHolderObject = secondHolderObject;
	}

	public void setThirdHolder(ThirdHolder thirdHolderObject) {
		this.ThirdHolderObject = thirdHolderObject;
	}

	public void setFinance(Finance financeObject) {
		this.FinanceObject = financeObject;
	}

	public void setFirstNominee(FirstNominee firstNomineeObject) {
		this.FirstNomineeObject = firstNomineeObject;
	}

	public void setSecondNominee(SecondNominee secondNomineeObject) {
		this.SecondNomineeObject = secondNomineeObject;
	}

	public void setThirdNominee(ThirdNominee thirdNomineeObject) {
		this.ThirdNomineeObject = thirdNomineeObject;
	}

	public void setAuthSign(String authSign) {
		this.authSign = authSign;
	}

	public void setCURRENT_DP_ID(String CURRENT_DP_ID) {
		this.CURRENT_DP_ID = CURRENT_DP_ID;
	}

	public void setSET_CORRESPONDENCE(String SET_CORRESPONDENCE) {
		this.SET_CORRESPONDENCE = SET_CORRESPONDENCE;
	}

	public void setSET_INST_CLIENT(String SET_INST_CLIENT) {
		this.SET_INST_CLIENT = SET_INST_CLIENT;
	}

	public void setINDOC_NO(String INDOC_NO) {
		this.INDOC_NO = INDOC_NO;
	}

	public void setTxnMode(String txnMode) {
		this.txnMode = txnMode;
	}

	public void setFhApplicantDetails(String fhApplicantDetails) {
		this.fhApplicantDetails = fhApplicantDetails;
	}

	public void setShApplicantDetails(String shApplicantDetails) {
		this.shApplicantDetails = shApplicantDetails;
	}

	public void setThApplicantDetails(String thApplicantDetails) {
		this.thApplicantDetails = thApplicantDetails;
	}

	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}

	public void setApiLog(String apiLog) {
		this.apiLog = apiLog;
	}

	public void setBankIfscCode(String bankIfscCode) {
		this.bankIfscCode = bankIfscCode;
	}
}

class ThirdNominee {
	private String tnName;
	private String tnRelation;
	private String tnDob;
	private String tnPerOfShare;
	private String tnPanNo;
	private String tnAadhaar;
	private String tnVid;
	TnAddress TnAddressObject;
	private String tnGuardianName;
	private String tnGuardianRelation;
	private String tnGuardianAddId;
	private String tnAddId;
	TngAddress1 TngAddressObject;
	private String tngDetailsSameAsFng;

	// Getter Methods

	public String getTnName() {
		return tnName;
	}

	public String getTnRelation() {
		return tnRelation;
	}

	public String getTnDob() {
		return tnDob;
	}

	public String getTnPerOfShare() {
		return tnPerOfShare;
	}

	public String getTnPanNo() {
		return tnPanNo;
	}

	public String getTnAadhaar() {
		return tnAadhaar;
	}

	public String getTnVid() {
		return tnVid;
	}

	public TnAddress getTnAddress() {
		return TnAddressObject;
	}

	public String getTnGuardianName() {
		return tnGuardianName;
	}

	public String getTnGuardianRelation() {
		return tnGuardianRelation;
	}

	public String getTnGuardianAddId() {
		return tnGuardianAddId;
	}

	public String getTnAddId() {
		return tnAddId;
	}

	public TngAddress1 getTngAddress() {
		return TngAddressObject;
	}

	public String getTngDetailsSameAsFng() {
		return tngDetailsSameAsFng;
	}

	// Setter Methods

	public void setTnName(String tnName) {
		this.tnName = tnName;
	}

	public void setTnRelation(String tnRelation) {
		this.tnRelation = tnRelation;
	}

	public void setTnDob(String tnDob) {
		this.tnDob = tnDob;
	}

	public void setTnPerOfShare(String tnPerOfShare) {
		this.tnPerOfShare = tnPerOfShare;
	}

	public void setTnPanNo(String tnPanNo) {
		this.tnPanNo = tnPanNo;
	}

	public void setTnAadhaar(String tnAadhaar) {
		this.tnAadhaar = tnAadhaar;
	}

	public void setTnVid(String tnVid) {
		this.tnVid = tnVid;
	}

	public void setTnAddress(TnAddress tnAddressObject) {
		this.TnAddressObject = tnAddressObject;
	}

	public void setTnGuardianName(String tnGuardianName) {
		this.tnGuardianName = tnGuardianName;
	}

	public void setTnGuardianRelation(String tnGuardianRelation) {
		this.tnGuardianRelation = tnGuardianRelation;
	}

	public void setTnGuardianAddId(String tnGuardianAddId) {
		this.tnGuardianAddId = tnGuardianAddId;
	}

	public void setTnAddId(String tnAddId) {
		this.tnAddId = tnAddId;
	}

	public void setTngAddress(TngAddress1 tngAddressObject) {
		this.TngAddressObject = tngAddressObject;
	}

	public void setTngDetailsSameAsFng(String tngDetailsSameAsFng) {
		this.tngDetailsSameAsFng = tngDetailsSameAsFng;
	}
}

class TngAddress {
	private String Address1;
	private String Address2;
	private String Address3;
	private String Address4;
	private String City;
	private String State;
	private String Zip;
	private String Country;
	private String Phone1;
	private String Phone2;
	private String Phone3;
	private String Telex;
	private String Fax;
	private String Email;
	private String Website;
	private String mobileNo;
	private String gstState;

	// Getter Methods

	public String getAddress1() {
		return Address1;
	}

	public String getAddress2() {
		return Address2;
	}

	public String getAddress3() {
		return Address3;
	}

	public String getAddress4() {
		return Address4;
	}

	public String getCity() {
		return City;
	}

	public String getState() {
		return State;
	}

	public String getZip() {
		return Zip;
	}

	public String getCountry() {
		return Country;
	}

	public String getPhone1() {
		return Phone1;
	}

	public String getPhone2() {
		return Phone2;
	}

	public String getPhone3() {
		return Phone3;
	}

	public String getTelex() {
		return Telex;
	}

	public String getFax() {
		return Fax;
	}

	public String getEmail() {
		return Email;
	}

	public String getWebsite() {
		return Website;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getGstState() {
		return gstState;
	}

	// Setter Methods

	public void setAddress1(String Address1) {
		this.Address1 = Address1;
	}

	public void setAddress2(String Address2) {
		this.Address2 = Address2;
	}

	public void setAddress3(String Address3) {
		this.Address3 = Address3;
	}

	public void setAddress4(String Address4) {
		this.Address4 = Address4;
	}

	public void setCity(String City) {
		this.City = City;
	}

	public void setState(String State) {
		this.State = State;
	}

	public void setZip(String Zip) {
		this.Zip = Zip;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}

	public void setPhone1(String Phone1) {
		this.Phone1 = Phone1;
	}

	public void setPhone2(String Phone2) {
		this.Phone2 = Phone2;
	}

	public void setPhone3(String Phone3) {
		this.Phone3 = Phone3;
	}

	public void setTelex(String Telex) {
		this.Telex = Telex;
	}

	public void setFax(String Fax) {
		this.Fax = Fax;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public void setWebsite(String Website) {
		this.Website = Website;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setGstState(String gstState) {
		this.gstState = gstState;
	}
}

class TnAddress {
	private String Address1;
	private String Address2;
	private String Address3;
	private String Address4;
	private String City;
	private String State;
	private String Zip;
	private String Country;
	private String Phone1;
	private String Phone2;
	private String Phone3;
	private String Telex;
	private String Fax;
	private String Email;
	private String Website;
	private String mobileNo;
	private String gstState;

	// Getter Methods

	public String getAddress1() {
		return Address1;
	}

	public String getAddress2() {
		return Address2;
	}

	public String getAddress3() {
		return Address3;
	}

	public String getAddress4() {
		return Address4;
	}

	public String getCity() {
		return City;
	}

	public String getState() {
		return State;
	}

	public String getZip() {
		return Zip;
	}

	public String getCountry() {
		return Country;
	}

	public String getPhone1() {
		return Phone1;
	}

	public String getPhone2() {
		return Phone2;
	}

	public String getPhone3() {
		return Phone3;
	}

	public String getTelex() {
		return Telex;
	}

	public String getFax() {
		return Fax;
	}

	public String getEmail() {
		return Email;
	}

	public String getWebsite() {
		return Website;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getGstState() {
		return gstState;
	}

	// Setter Methods

	public void setAddress1(String Address1) {
		this.Address1 = Address1;
	}

	public void setAddress2(String Address2) {
		this.Address2 = Address2;
	}

	public void setAddress3(String Address3) {
		this.Address3 = Address3;
	}

	public void setAddress4(String Address4) {
		this.Address4 = Address4;
	}

	public void setCity(String City) {
		this.City = City;
	}

	public void setState(String State) {
		this.State = State;
	}

	public void setZip(String Zip) {
		this.Zip = Zip;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}

	public void setPhone1(String Phone1) {
		this.Phone1 = Phone1;
	}

	public void setPhone2(String Phone2) {
		this.Phone2 = Phone2;
	}

	public void setPhone3(String Phone3) {
		this.Phone3 = Phone3;
	}

	public void setTelex(String Telex) {
		this.Telex = Telex;
	}

	public void setFax(String Fax) {
		this.Fax = Fax;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public void setWebsite(String Website) {
		this.Website = Website;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setGstState(String gstState) {
		this.gstState = gstState;
	}
}

class SecondNominee {
	private String snName;
	private String snRelation;
	private String snDob;
	private String snPerOfShare;
	private String snPanNo;
	private String snAadhaar;
	private String snVid;
	SnAddress SnAddressObject;
	private String snGuardianName;
	private String snGuardianRelation;
	private String snGuardianAddId;
	private String snAddId;
	SngAddress SngAddressObject;
	private String sngDetailsSameAsFng;

	// Getter Methods

	public String getSnName() {
		return snName;
	}

	public String getSnRelation() {
		return snRelation;
	}

	public String getSnDob() {
		return snDob;
	}

	public String getSnPerOfShare() {
		return snPerOfShare;
	}

	public String getSnPanNo() {
		return snPanNo;
	}

	public String getSnAadhaar() {
		return snAadhaar;
	}

	public String getSnVid() {
		return snVid;
	}

	public SnAddress getSnAddress() {
		return SnAddressObject;
	}

	public String getSnGuardianName() {
		return snGuardianName;
	}

	public String getSnGuardianRelation() {
		return snGuardianRelation;
	}

	public String getSnGuardianAddId() {
		return snGuardianAddId;
	}

	public String getSnAddId() {
		return snAddId;
	}

	public SngAddress getSngAddress() {
		return SngAddressObject;
	}

	public String getSngDetailsSameAsFng() {
		return sngDetailsSameAsFng;
	}

	// Setter Methods

	public void setSnName(String snName) {
		this.snName = snName;
	}

	public void setSnRelation(String snRelation) {
		this.snRelation = snRelation;
	}

	public void setSnDob(String snDob) {
		this.snDob = snDob;
	}

	public void setSnPerOfShare(String snPerOfShare) {
		this.snPerOfShare = snPerOfShare;
	}

	public void setSnPanNo(String snPanNo) {
		this.snPanNo = snPanNo;
	}

	public void setSnAadhaar(String snAadhaar) {
		this.snAadhaar = snAadhaar;
	}

	public void setSnVid(String snVid) {
		this.snVid = snVid;
	}

	public void setSnAddress(SnAddress snAddressObject) {
		this.SnAddressObject = snAddressObject;
	}

	public void setSnGuardianName(String snGuardianName) {
		this.snGuardianName = snGuardianName;
	}

	public void setSnGuardianRelation(String snGuardianRelation) {
		this.snGuardianRelation = snGuardianRelation;
	}

	public void setSnGuardianAddId(String snGuardianAddId) {
		this.snGuardianAddId = snGuardianAddId;
	}

	public void setSnAddId(String snAddId) {
		this.snAddId = snAddId;
	}

	public void setSngAddress(SngAddress sngAddressObject) {
		this.SngAddressObject = sngAddressObject;
	}

	public void setSngDetailsSameAsFng(String sngDetailsSameAsFng) {
		this.sngDetailsSameAsFng = sngDetailsSameAsFng;
	}
}

class SngAddress {
	private String Address1;
	private String Address2;
	private String Address3;
	private String Address4;
	private String City;
	private String State;
	private String Zip;
	private String Country;
	private String Phone1;
	private String Phone2;
	private String Phone3;
	private String Telex;
	private String Fax;
	private String Email;
	private String Website;
	private String mobileNo;
	private String gstState;

	// Getter Methods

	public String getAddress1() {
		return Address1;
	}

	public String getAddress2() {
		return Address2;
	}

	public String getAddress3() {
		return Address3;
	}

	public String getAddress4() {
		return Address4;
	}

	public String getCity() {
		return City;
	}

	public String getState() {
		return State;
	}

	public String getZip() {
		return Zip;
	}

	public String getCountry() {
		return Country;
	}

	public String getPhone1() {
		return Phone1;
	}

	public String getPhone2() {
		return Phone2;
	}

	public String getPhone3() {
		return Phone3;
	}

	public String getTelex() {
		return Telex;
	}

	public String getFax() {
		return Fax;
	}

	public String getEmail() {
		return Email;
	}

	public String getWebsite() {
		return Website;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getGstState() {
		return gstState;
	}

	// Setter Methods

	public void setAddress1(String Address1) {
		this.Address1 = Address1;
	}

	public void setAddress2(String Address2) {
		this.Address2 = Address2;
	}

	public void setAddress3(String Address3) {
		this.Address3 = Address3;
	}

	public void setAddress4(String Address4) {
		this.Address4 = Address4;
	}

	public void setCity(String City) {
		this.City = City;
	}

	public void setState(String State) {
		this.State = State;
	}

	public void setZip(String Zip) {
		this.Zip = Zip;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}

	public void setPhone1(String Phone1) {
		this.Phone1 = Phone1;
	}

	public void setPhone2(String Phone2) {
		this.Phone2 = Phone2;
	}

	public void setPhone3(String Phone3) {
		this.Phone3 = Phone3;
	}

	public void setTelex(String Telex) {
		this.Telex = Telex;
	}

	public void setFax(String Fax) {
		this.Fax = Fax;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public void setWebsite(String Website) {
		this.Website = Website;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setGstState(String gstState) {
		this.gstState = gstState;
	}
}

class SnAddress {
	private String Address1;
	private String Address2;
	private String Address3;
	private String Address4;
	private String City;
	private String State;
	private String Zip;
	private String Country;
	private String Phone1;
	private String Phone2;
	private String Phone3;
	private String Telex;
	private String Fax;
	private String Email;
	private String Website;
	private String mobileNo;
	private String gstState;

	// Getter Methods

	public String getAddress1() {
		return Address1;
	}

	public String getAddress2() {
		return Address2;
	}

	public String getAddress3() {
		return Address3;
	}

	public String getAddress4() {
		return Address4;
	}

	public String getCity() {
		return City;
	}

	public String getState() {
		return State;
	}

	public String getZip() {
		return Zip;
	}

	public String getCountry() {
		return Country;
	}

	public String getPhone1() {
		return Phone1;
	}

	public String getPhone2() {
		return Phone2;
	}

	public String getPhone3() {
		return Phone3;
	}

	public String getTelex() {
		return Telex;
	}

	public String getFax() {
		return Fax;
	}

	public String getEmail() {
		return Email;
	}

	public String getWebsite() {
		return Website;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getGstState() {
		return gstState;
	}

	// Setter Methods

	public void setAddress1(String Address1) {
		this.Address1 = Address1;
	}

	public void setAddress2(String Address2) {
		this.Address2 = Address2;
	}

	public void setAddress3(String Address3) {
		this.Address3 = Address3;
	}

	public void setAddress4(String Address4) {
		this.Address4 = Address4;
	}

	public void setCity(String City) {
		this.City = City;
	}

	public void setState(String State) {
		this.State = State;
	}

	public void setZip(String Zip) {
		this.Zip = Zip;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}

	public void setPhone1(String Phone1) {
		this.Phone1 = Phone1;
	}

	public void setPhone2(String Phone2) {
		this.Phone2 = Phone2;
	}

	public void setPhone3(String Phone3) {
		this.Phone3 = Phone3;
	}

	public void setTelex(String Telex) {
		this.Telex = Telex;
	}

	public void setFax(String Fax) {
		this.Fax = Fax;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public void setWebsite(String Website) {
		this.Website = Website;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setGstState(String gstState) {
		this.gstState = gstState;
	}
}

class FirstNominee {
	private String ngName;
	private String fhNomRel;
	private String nmDob;
	private String fnPerOfShare;
	private String fnPanNo;
	private String fnAadhaar;
	FnAddress FnAddressObject;
	private String nomineesGuardianName;
	private String fhNomGuardRel;
	private String fnVid;
	FngAddress FngAddressObject;

	// Getter Methods

	public String getNgName() {
		return ngName;
	}

	public String getFhNomRel() {
		return fhNomRel;
	}

	public String getNmDob() {
		return nmDob;
	}

	public String getFnPerOfShare() {
		return fnPerOfShare;
	}

	public String getFnPanNo() {
		return fnPanNo;
	}

	public String getFnAadhaar() {
		return fnAadhaar;
	}

	public FnAddress getFnAddress() {
		return FnAddressObject;
	}

	public String getNomineesGuardianName() {
		return nomineesGuardianName;
	}

	public String getFhNomGuardRel() {
		return fhNomGuardRel;
	}

	public String getFnVid() {
		return fnVid;
	}

	public FngAddress getFngAddress() {
		return FngAddressObject;
	}

	// Setter Methods

	public void setNgName(String ngName) {
		this.ngName = ngName;
	}

	public void setFhNomRel(String fhNomRel) {
		this.fhNomRel = fhNomRel;
	}

	public void setNmDob(String nmDob) {
		this.nmDob = nmDob;
	}

	public void setFnPerOfShare(String fnPerOfShare) {
		this.fnPerOfShare = fnPerOfShare;
	}

	public void setFnPanNo(String fnPanNo) {
		this.fnPanNo = fnPanNo;
	}

	public void setFnAadhaar(String fnAadhaar) {
		this.fnAadhaar = fnAadhaar;
	}

	public void setFnAddress(FnAddress fnAddressObject) {
		this.FnAddressObject = fnAddressObject;
	}

	public void setNomineesGuardianName(String nomineesGuardianName) {
		this.nomineesGuardianName = nomineesGuardianName;
	}

	public void setFhNomGuardRel(String fhNomGuardRel) {
		this.fhNomGuardRel = fhNomGuardRel;
	}

	public void setFnVid(String fnVid) {
		this.fnVid = fnVid;
	}

	public void setFngAddress(FngAddress fngAddressObject) {
		this.FngAddressObject = fngAddressObject;
	}
}

class FngAddress {
	private String Address1;
	private String Address2;
	private String Address3;
	private String Address4;
	private String City;
	private String State;
	private String Zip;
	private String Country;
	private String Phone1;
	private String Phone2;
	private String Phone3;
	private String Telex;
	private String Fax;
	private String Email;
	private String Website;
	private String mobileNo;
	private String gstState;

	// Getter Methods

	public String getAddress1() {
		return Address1;
	}

	public String getAddress2() {
		return Address2;
	}

	public String getAddress3() {
		return Address3;
	}

	public String getAddress4() {
		return Address4;
	}

	public String getCity() {
		return City;
	}

	public String getState() {
		return State;
	}

	public String getZip() {
		return Zip;
	}

	public String getCountry() {
		return Country;
	}

	public String getPhone1() {
		return Phone1;
	}

	public String getPhone2() {
		return Phone2;
	}

	public String getPhone3() {
		return Phone3;
	}

	public String getTelex() {
		return Telex;
	}

	public String getFax() {
		return Fax;
	}

	public String getEmail() {
		return Email;
	}

	public String getWebsite() {
		return Website;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getGstState() {
		return gstState;
	}

	// Setter Methods

	public void setAddress1(String Address1) {
		this.Address1 = Address1;
	}

	public void setAddress2(String Address2) {
		this.Address2 = Address2;
	}

	public void setAddress3(String Address3) {
		this.Address3 = Address3;
	}

	public void setAddress4(String Address4) {
		this.Address4 = Address4;
	}

	public void setCity(String City) {
		this.City = City;
	}

	public void setState(String State) {
		this.State = State;
	}

	public void setZip(String Zip) {
		this.Zip = Zip;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}

	public void setPhone1(String Phone1) {
		this.Phone1 = Phone1;
	}

	public void setPhone2(String Phone2) {
		this.Phone2 = Phone2;
	}

	public void setPhone3(String Phone3) {
		this.Phone3 = Phone3;
	}

	public void setTelex(String Telex) {
		this.Telex = Telex;
	}

	public void setFax(String Fax) {
		this.Fax = Fax;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public void setWebsite(String Website) {
		this.Website = Website;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setGstState(String gstState) {
		this.gstState = gstState;
	}
}

class FnAddress {
	private String Address1;
	private String Address2;
	private String Address3;
	private String Address4;
	private String City;
	private String State;
	private String Zip;
	private String Country;
	private String Phone1;
	private String Phone2;
	private String Phone3;
	private String Telex;
	private String Fax;
	private String Email;
	private String Website;
	private String mobileNo;
	private String gstState;

	// Getter Methods

	public String getAddress1() {
		return Address1;
	}

	public String getAddress2() {
		return Address2;
	}

	public String getAddress3() {
		return Address3;
	}

	public String getAddress4() {
		return Address4;
	}

	public String getCity() {
		return City;
	}

	public String getState() {
		return State;
	}

	public String getZip() {
		return Zip;
	}

	public String getCountry() {
		return Country;
	}

	public String getPhone1() {
		return Phone1;
	}

	public String getPhone2() {
		return Phone2;
	}

	public String getPhone3() {
		return Phone3;
	}

	public String getTelex() {
		return Telex;
	}

	public String getFax() {
		return Fax;
	}

	public String getEmail() {
		return Email;
	}

	public String getWebsite() {
		return Website;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getGstState() {
		return gstState;
	}

	// Setter Methods

	public void setAddress1(String Address1) {
		this.Address1 = Address1;
	}

	public void setAddress2(String Address2) {
		this.Address2 = Address2;
	}

	public void setAddress3(String Address3) {
		this.Address3 = Address3;
	}

	public void setAddress4(String Address4) {
		this.Address4 = Address4;
	}

	public void setCity(String City) {
		this.City = City;
	}

	public void setState(String State) {
		this.State = State;
	}

	public void setZip(String Zip) {
		this.Zip = Zip;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}

	public void setPhone1(String Phone1) {
		this.Phone1 = Phone1;
	}

	public void setPhone2(String Phone2) {
		this.Phone2 = Phone2;
	}

	public void setPhone3(String Phone3) {
		this.Phone3 = Phone3;
	}

	public void setTelex(String Telex) {
		this.Telex = Telex;
	}

	public void setFax(String Fax) {
		this.Fax = Fax;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public void setWebsite(String Website) {
		this.Website = Website;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setGstState(String gstState) {
		this.gstState = gstState;
	}
}

class Finance {
	private String bankingClient;
	private String IfscCode;
	private String BankName;
	private String MicrCode;
	private String BankAccountNo;
	private String BankAccountType;
	DivBankAddress DivBankAddressObject;
	private String IfscCode2;
	private String BankName2;
	private String MicrCode2;
	private String BankAccountType2;
	private String BankAccountNo2;
	ChargBankAddress ChargBankAddressObject;
	private String ChargesBranchId;
	private String GhUcic;
	private String RbiReferenceNo;
	private String RbiApprovalDate;
	private String TaxDeductionStatus;
	private String AsfCollected;

	// Getter Methods

	public String getBankingClient() {
		return bankingClient;
	}

	public String getIfscCode() {
		return IfscCode;
	}

	public String getBankName() {
		return BankName;
	}

	public String getMicrCode() {
		return MicrCode;
	}

	public String getBankAccountNo() {
		return BankAccountNo;
	}

	public String getBankAccountType() {
		return BankAccountType;
	}

	public DivBankAddress getDivBankAddress() {
		return DivBankAddressObject;
	}

	public String getIfscCode2() {
		return IfscCode2;
	}

	public String getBankName2() {
		return BankName2;
	}

	public String getMicrCode2() {
		return MicrCode2;
	}

	public String getBankAccountType2() {
		return BankAccountType2;
	}

	public String getBankAccountNo2() {
		return BankAccountNo2;
	}

	public ChargBankAddress getChargBankAddress() {
		return ChargBankAddressObject;
	}

	public String getChargesBranchId() {
		return ChargesBranchId;
	}

	public String getGhUcic() {
		return GhUcic;
	}

	public String getRbiReferenceNo() {
		return RbiReferenceNo;
	}

	public String getRbiApprovalDate() {
		return RbiApprovalDate;
	}

	public String getTaxDeductionStatus() {
		return TaxDeductionStatus;
	}

	public String getAsfCollected() {
		return AsfCollected;
	}

	// Setter Methods

	public void setBankingClient(String bankingClient) {
		this.bankingClient = bankingClient;
	}

	public void setIfscCode(String IfscCode) {
		this.IfscCode = IfscCode;
	}

	public void setBankName(String BankName) {
		this.BankName = BankName;
	}

	public void setMicrCode(String MicrCode) {
		this.MicrCode = MicrCode;
	}

	public void setBankAccountNo(String BankAccountNo) {
		this.BankAccountNo = BankAccountNo;
	}

	public void setBankAccountType(String BankAccountType) {
		this.BankAccountType = BankAccountType;
	}

	public void setDivBankAddress(DivBankAddress divBankAddressObject) {
		this.DivBankAddressObject = divBankAddressObject;
	}

	public void setIfscCode2(String IfscCode2) {
		this.IfscCode2 = IfscCode2;
	}

	public void setBankName2(String BankName2) {
		this.BankName2 = BankName2;
	}

	public void setMicrCode2(String MicrCode2) {
		this.MicrCode2 = MicrCode2;
	}

	public void setBankAccountType2(String BankAccountType2) {
		this.BankAccountType2 = BankAccountType2;
	}

	public void setBankAccountNo2(String BankAccountNo2) {
		this.BankAccountNo2 = BankAccountNo2;
	}

	public void setChargBankAddress(ChargBankAddress chargBankAddressObject) {
		this.ChargBankAddressObject = chargBankAddressObject;
	}

	public void setChargesBranchId(String ChargesBranchId) {
		this.ChargesBranchId = ChargesBranchId;
	}

	public void setGhUcic(String GhUcic) {
		this.GhUcic = GhUcic;
	}

	public void setRbiReferenceNo(String RbiReferenceNo) {
		this.RbiReferenceNo = RbiReferenceNo;
	}

	public void setRbiApprovalDate(String RbiApprovalDate) {
		this.RbiApprovalDate = RbiApprovalDate;
	}

	public void setTaxDeductionStatus(String TaxDeductionStatus) {
		this.TaxDeductionStatus = TaxDeductionStatus;
	}

	public void setAsfCollected(String AsfCollected) {
		this.AsfCollected = AsfCollected;
	}
}

class ChargBankAddress {
	private String Address1;
	private String Address2;
	private String Address3;
	private String Address4;
	private String City;
	private String State;
	private String Zip;
	private String Country;
	private String Phone1;
	private String Phone2;
	private String Phone3;
	private String Telex;
	private String Fax;
	private String Email;
	private String Website;
	private String mobileNo;
	private String gstState;

	// Getter Methods

	public String getAddress1() {
		return Address1;
	}

	public String getAddress2() {
		return Address2;
	}

	public String getAddress3() {
		return Address3;
	}

	public String getAddress4() {
		return Address4;
	}

	public String getCity() {
		return City;
	}

	public String getState() {
		return State;
	}

	public String getZip() {
		return Zip;
	}

	public String getCountry() {
		return Country;
	}

	public String getPhone1() {
		return Phone1;
	}

	public String getPhone2() {
		return Phone2;
	}

	public String getPhone3() {
		return Phone3;
	}

	public String getTelex() {
		return Telex;
	}

	public String getFax() {
		return Fax;
	}

	public String getEmail() {
		return Email;
	}

	public String getWebsite() {
		return Website;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getGstState() {
		return gstState;
	}

	// Setter Methods

	public void setAddress1(String Address1) {
		this.Address1 = Address1;
	}

	public void setAddress2(String Address2) {
		this.Address2 = Address2;
	}

	public void setAddress3(String Address3) {
		this.Address3 = Address3;
	}

	public void setAddress4(String Address4) {
		this.Address4 = Address4;
	}

	public void setCity(String City) {
		this.City = City;
	}

	public void setState(String State) {
		this.State = State;
	}

	public void setZip(String Zip) {
		this.Zip = Zip;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}

	public void setPhone1(String Phone1) {
		this.Phone1 = Phone1;
	}

	public void setPhone2(String Phone2) {
		this.Phone2 = Phone2;
	}

	public void setPhone3(String Phone3) {
		this.Phone3 = Phone3;
	}

	public void setTelex(String Telex) {
		this.Telex = Telex;
	}

	public void setFax(String Fax) {
		this.Fax = Fax;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public void setWebsite(String Website) {
		this.Website = Website;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setGstState(String gstState) {
		this.gstState = gstState;
	}
}

class DivBankAddress {
	private String Address1;
	private String Address2;
	private String Address3;
	private String Address4;
	private String City;
	private String State;
	private String Zip;
	private String Country;
	private String Phone1;
	private String Phone2;
	private String Phone3;
	private String Telex;
	private String Fax;
	private String Email;
	private String Website;
	private String mobileNo;
	private String gstState;

	// Getter Methods

	public String getAddress1() {
		return Address1;
	}

	public String getAddress2() {
		return Address2;
	}

	public String getAddress3() {
		return Address3;
	}

	public String getAddress4() {
		return Address4;
	}

	public String getCity() {
		return City;
	}

	public String getState() {
		return State;
	}

	public String getZip() {
		return Zip;
	}

	public String getCountry() {
		return Country;
	}

	public String getPhone1() {
		return Phone1;
	}

	public String getPhone2() {
		return Phone2;
	}

	public String getPhone3() {
		return Phone3;
	}

	public String getTelex() {
		return Telex;
	}

	public String getFax() {
		return Fax;
	}

	public String getEmail() {
		return Email;
	}

	public String getWebsite() {
		return Website;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getGstState() {
		return gstState;
	}

	// Setter Methods

	public void setAddress1(String Address1) {
		this.Address1 = Address1;
	}

	public void setAddress2(String Address2) {
		this.Address2 = Address2;
	}

	public void setAddress3(String Address3) {
		this.Address3 = Address3;
	}

	public void setAddress4(String Address4) {
		this.Address4 = Address4;
	}

	public void setCity(String City) {
		this.City = City;
	}

	public void setState(String State) {
		this.State = State;
	}

	public void setZip(String Zip) {
		this.Zip = Zip;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}

	public void setPhone1(String Phone1) {
		this.Phone1 = Phone1;
	}

	public void setPhone2(String Phone2) {
		this.Phone2 = Phone2;
	}

	public void setPhone3(String Phone3) {
		this.Phone3 = Phone3;
	}

	public void setTelex(String Telex) {
		this.Telex = Telex;
	}

	public void setFax(String Fax) {
		this.Fax = Fax;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public void setWebsite(String Website) {
		this.Website = Website;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setGstState(String gstState) {
		this.gstState = gstState;
	}
}

class ThirdHolder {
	private String thirdHolderName;
	private String thFatherName;
	private String thOccupation;
	private String thDob;
	private String thPanNo;
	private String thirdHolderEmail;
	private String thAltEmailId;
	private String thFamilyEmail;
	private String thPhoneNo;
	private String thirdHolderMob;
	private String thFamilyMob;
	private String thirdHolderSmsFlag;
	private String thirdHolderMapin;
	private String thCustId;
	private String thBankAccountNo;
	private String thirdHolderPanFlag;
	private String ThPanaadharlinkFlag;
	private String ThPanaadharlinkEffDate;
	private String ThIsdCode;
	ThAddress ThAddressObject;
	private String thGuardName;
	private String thGuardRel;
	private String thItCircle;
	private String thKraFlag;
	private String thUcic;
	private String thAadhaar;
	private String thAadharNonupdReason;
	private String thVid;
	private String thAadhaarVerifyFlag;
	private String thRtaEmailFlag;
	ThgAddress ThgAddressObject;
	private String thNcFlag;

	// Getter Methods

	public String getThirdHolderName() {
		return thirdHolderName;
	}

	public String getThFatherName() {
		return thFatherName;
	}

	public String getThOccupation() {
		return thOccupation;
	}

	public String getThDob() {
		return thDob;
	}

	public String getThPanNo() {
		return thPanNo;
	}

	public String getThirdHolderEmail() {
		return thirdHolderEmail;
	}

	public String getThAltEmailId() {
		return thAltEmailId;
	}

	public String getThFamilyEmail() {
		return thFamilyEmail;
	}

	public String getThPhoneNo() {
		return thPhoneNo;
	}

	public String getThirdHolderMob() {
		return thirdHolderMob;
	}

	public String getThFamilyMob() {
		return thFamilyMob;
	}

	public String getThirdHolderSmsFlag() {
		return thirdHolderSmsFlag;
	}

	public String getThirdHolderMapin() {
		return thirdHolderMapin;
	}

	public String getThCustId() {
		return thCustId;
	}

	public String getThBankAccountNo() {
		return thBankAccountNo;
	}

	public String getThirdHolderPanFlag() {
		return thirdHolderPanFlag;
	}

	public String getThPanaadharlinkFlag() {
		return ThPanaadharlinkFlag;
	}

	public String getThPanaadharlinkEffDate() {
		return ThPanaadharlinkEffDate;
	}

	public String getThIsdCode() {
		return ThIsdCode;
	}

	public ThAddress getThAddress() {
		return ThAddressObject;
	}

	public String getThGuardName() {
		return thGuardName;
	}

	public String getThGuardRel() {
		return thGuardRel;
	}

	public String getThItCircle() {
		return thItCircle;
	}

	public String getThKraFlag() {
		return thKraFlag;
	}

	public String getThUcic() {
		return thUcic;
	}

	public String getThAadhaar() {
		return thAadhaar;
	}

	public String getThAadharNonupdReason() {
		return thAadharNonupdReason;
	}

	public String getThVid() {
		return thVid;
	}

	public String getThAadhaarVerifyFlag() {
		return thAadhaarVerifyFlag;
	}

	public String getThRtaEmailFlag() {
		return thRtaEmailFlag;
	}

	public ThgAddress getThgAddress() {
		return ThgAddressObject;
	}

	public String getThNcFlag() {
		return thNcFlag;
	}

	// Setter Methods

	public void setThirdHolderName(String thirdHolderName) {
		this.thirdHolderName = thirdHolderName;
	}

	public void setThFatherName(String thFatherName) {
		this.thFatherName = thFatherName;
	}

	public void setThOccupation(String thOccupation) {
		this.thOccupation = thOccupation;
	}

	public void setThDob(String thDob) {
		this.thDob = thDob;
	}

	public void setThPanNo(String thPanNo) {
		this.thPanNo = thPanNo;
	}

	public void setThirdHolderEmail(String thirdHolderEmail) {
		this.thirdHolderEmail = thirdHolderEmail;
	}

	public void setThAltEmailId(String thAltEmailId) {
		this.thAltEmailId = thAltEmailId;
	}

	public void setThFamilyEmail(String thFamilyEmail) {
		this.thFamilyEmail = thFamilyEmail;
	}

	public void setThPhoneNo(String thPhoneNo) {
		this.thPhoneNo = thPhoneNo;
	}

	public void setThirdHolderMob(String thirdHolderMob) {
		this.thirdHolderMob = thirdHolderMob;
	}

	public void setThFamilyMob(String thFamilyMob) {
		this.thFamilyMob = thFamilyMob;
	}

	public void setThirdHolderSmsFlag(String thirdHolderSmsFlag) {
		this.thirdHolderSmsFlag = thirdHolderSmsFlag;
	}

	public void setThirdHolderMapin(String thirdHolderMapin) {
		this.thirdHolderMapin = thirdHolderMapin;
	}

	public void setThCustId(String thCustId) {
		this.thCustId = thCustId;
	}

	public void setThBankAccountNo(String thBankAccountNo) {
		this.thBankAccountNo = thBankAccountNo;
	}

	public void setThirdHolderPanFlag(String thirdHolderPanFlag) {
		this.thirdHolderPanFlag = thirdHolderPanFlag;
	}

	public void setThPanaadharlinkFlag(String ThPanaadharlinkFlag) {
		this.ThPanaadharlinkFlag = ThPanaadharlinkFlag;
	}

	public void setThPanaadharlinkEffDate(String ThPanaadharlinkEffDate) {
		this.ThPanaadharlinkEffDate = ThPanaadharlinkEffDate;
	}

	public void setThIsdCode(String ThIsdCode) {
		this.ThIsdCode = ThIsdCode;
	}

	public void setThAddress(ThAddress thAddressObject) {
		this.ThAddressObject = thAddressObject;
	}

	public void setThGuardName(String thGuardName) {
		this.thGuardName = thGuardName;
	}

	public void setThGuardRel(String thGuardRel) {
		this.thGuardRel = thGuardRel;
	}

	public void setThItCircle(String thItCircle) {
		this.thItCircle = thItCircle;
	}

	public void setThKraFlag(String thKraFlag) {
		this.thKraFlag = thKraFlag;
	}

	public void setThUcic(String thUcic) {
		this.thUcic = thUcic;
	}

	public void setThAadhaar(String thAadhaar) {
		this.thAadhaar = thAadhaar;
	}

	public void setThAadharNonupdReason(String thAadharNonupdReason) {
		this.thAadharNonupdReason = thAadharNonupdReason;
	}

	public void setThVid(String thVid) {
		this.thVid = thVid;
	}

	public void setThAadhaarVerifyFlag(String thAadhaarVerifyFlag) {
		this.thAadhaarVerifyFlag = thAadhaarVerifyFlag;
	}

	public void setThRtaEmailFlag(String thRtaEmailFlag) {
		this.thRtaEmailFlag = thRtaEmailFlag;
	}

	public void setThgAddress(ThgAddress thgAddressObject) {
		this.ThgAddressObject = thgAddressObject;
	}

	public void setThNcFlag(String thNcFlag) {
		this.thNcFlag = thNcFlag;
	}
}

class ThgAddress {
	private String Address1;
	private String Address2;
	private String Address3;
	private String Address4;
	private String City;
	private String State;
	private String Zip;
	private String Country;
	private String Phone1;
	private String Phone2;
	private String Phone3;
	private String Telex;
	private String Fax;
	private String Email;
	private String Website;
	private String mobileNo;
	private String gstState;

	// Getter Methods

	public String getAddress1() {
		return Address1;
	}

	public String getAddress2() {
		return Address2;
	}

	public String getAddress3() {
		return Address3;
	}

	public String getAddress4() {
		return Address4;
	}

	public String getCity() {
		return City;
	}

	public String getState() {
		return State;
	}

	public String getZip() {
		return Zip;
	}

	public String getCountry() {
		return Country;
	}

	public String getPhone1() {
		return Phone1;
	}

	public String getPhone2() {
		return Phone2;
	}

	public String getPhone3() {
		return Phone3;
	}

	public String getTelex() {
		return Telex;
	}

	public String getFax() {
		return Fax;
	}

	public String getEmail() {
		return Email;
	}

	public String getWebsite() {
		return Website;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getGstState() {
		return gstState;
	}

	// Setter Methods

	public void setAddress1(String Address1) {
		this.Address1 = Address1;
	}

	public void setAddress2(String Address2) {
		this.Address2 = Address2;
	}

	public void setAddress3(String Address3) {
		this.Address3 = Address3;
	}

	public void setAddress4(String Address4) {
		this.Address4 = Address4;
	}

	public void setCity(String City) {
		this.City = City;
	}

	public void setState(String State) {
		this.State = State;
	}

	public void setZip(String Zip) {
		this.Zip = Zip;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}

	public void setPhone1(String Phone1) {
		this.Phone1 = Phone1;
	}

	public void setPhone2(String Phone2) {
		this.Phone2 = Phone2;
	}

	public void setPhone3(String Phone3) {
		this.Phone3 = Phone3;
	}

	public void setTelex(String Telex) {
		this.Telex = Telex;
	}

	public void setFax(String Fax) {
		this.Fax = Fax;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public void setWebsite(String Website) {
		this.Website = Website;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setGstState(String gstState) {
		this.gstState = gstState;
	}
}

class ThAddress {
	private String Address1;
	private String Address2;
	private String Address3;
	private String Address4;
	private String City;
	private String State;
	private String Zip;
	private String Country;
	private String Phone1;
	private String Phone2;
	private String Phone3;
	private String Telex;
	private String Fax;
	private String Email;
	private String Website;
	private String mobileNo;
	private String gstState;

	// Getter Methods

	public String getAddress1() {
		return Address1;
	}

	public String getAddress2() {
		return Address2;
	}

	public String getAddress3() {
		return Address3;
	}

	public String getAddress4() {
		return Address4;
	}

	public String getCity() {
		return City;
	}

	public String getState() {
		return State;
	}

	public String getZip() {
		return Zip;
	}

	public String getCountry() {
		return Country;
	}

	public String getPhone1() {
		return Phone1;
	}

	public String getPhone2() {
		return Phone2;
	}

	public String getPhone3() {
		return Phone3;
	}

	public String getTelex() {
		return Telex;
	}

	public String getFax() {
		return Fax;
	}

	public String getEmail() {
		return Email;
	}

	public String getWebsite() {
		return Website;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getGstState() {
		return gstState;
	}

	// Setter Methods

	public void setAddress1(String Address1) {
		this.Address1 = Address1;
	}

	public void setAddress2(String Address2) {
		this.Address2 = Address2;
	}

	public void setAddress3(String Address3) {
		this.Address3 = Address3;
	}

	public void setAddress4(String Address4) {
		this.Address4 = Address4;
	}

	public void setCity(String City) {
		this.City = City;
	}

	public void setState(String State) {
		this.State = State;
	}

	public void setZip(String Zip) {
		this.Zip = Zip;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}

	public void setPhone1(String Phone1) {
		this.Phone1 = Phone1;
	}

	public void setPhone2(String Phone2) {
		this.Phone2 = Phone2;
	}

	public void setPhone3(String Phone3) {
		this.Phone3 = Phone3;
	}

	public void setTelex(String Telex) {
		this.Telex = Telex;
	}

	public void setFax(String Fax) {
		this.Fax = Fax;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public void setWebsite(String Website) {
		this.Website = Website;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setGstState(String gstState) {
		this.gstState = gstState;
	}
}

class SecondHolder {
	private String secondHolderName;
	private String shFatherName;
	private String shOccupation;
	private String shPanNo;
	private String shDob;
	private String secondHolderEmail;
	private String shAltEmailId;
	private String shFamilyEmail;
	private String shPhoneNo;
	private String secondHolderMob;
	private String secondHolderMapin;
	private String shFamilyMob;
	private String secondHolderSmsFlag;
	private String shCustId;
	private String shBankAccountNo;
	private String secondHolderPanFlag;
	private String ShPanaadharlinkFlag;
	private String ShPanaadharlinkEffDate;
	private String ShIsdCode;
	ShAddress ShAddressObject;
	private String shGuardName;
	private String shGuardRel;
	private String shItCircle;
	private String shAadhaar;
	private String shAadharNonupdReason;
	private String shVid;
	private String shKraFlag;
	private String shUcic;
	private String shAadhaarVerifyFlag;
	private String shRtaEmailFlag;
	ShgAddress ShgAddressObject;
	private String shNcFlag;

	// Getter Methods

	public String getSecondHolderName() {
		return secondHolderName;
	}

	public String getShFatherName() {
		return shFatherName;
	}

	public String getShOccupation() {
		return shOccupation;
	}

	public String getShPanNo() {
		return shPanNo;
	}

	public String getShDob() {
		return shDob;
	}

	public String getSecondHolderEmail() {
		return secondHolderEmail;
	}

	public String getShAltEmailId() {
		return shAltEmailId;
	}

	public String getShFamilyEmail() {
		return shFamilyEmail;
	}

	public String getShPhoneNo() {
		return shPhoneNo;
	}

	public String getSecondHolderMob() {
		return secondHolderMob;
	}

	public String getSecondHolderMapin() {
		return secondHolderMapin;
	}

	public String getShFamilyMob() {
		return shFamilyMob;
	}

	public String getSecondHolderSmsFlag() {
		return secondHolderSmsFlag;
	}

	public String getShCustId() {
		return shCustId;
	}

	public String getShBankAccountNo() {
		return shBankAccountNo;
	}

	public String getSecondHolderPanFlag() {
		return secondHolderPanFlag;
	}

	public String getShPanaadharlinkFlag() {
		return ShPanaadharlinkFlag;
	}

	public String getShPanaadharlinkEffDate() {
		return ShPanaadharlinkEffDate;
	}

	public String getShIsdCode() {
		return ShIsdCode;
	}

	public ShAddress getShAddress() {
		return ShAddressObject;
	}

	public String getShGuardName() {
		return shGuardName;
	}

	public String getShGuardRel() {
		return shGuardRel;
	}

	public String getShItCircle() {
		return shItCircle;
	}

	public String getShAadhaar() {
		return shAadhaar;
	}

	public String getShAadharNonupdReason() {
		return shAadharNonupdReason;
	}

	public String getShVid() {
		return shVid;
	}

	public String getShKraFlag() {
		return shKraFlag;
	}

	public String getShUcic() {
		return shUcic;
	}

	public String getShAadhaarVerifyFlag() {
		return shAadhaarVerifyFlag;
	}

	public String getShRtaEmailFlag() {
		return shRtaEmailFlag;
	}

	public ShgAddress getShgAddress() {
		return ShgAddressObject;
	}

	public String getShNcFlag() {
		return shNcFlag;
	}

	// Setter Methods

	public void setSecondHolderName(String secondHolderName) {
		this.secondHolderName = secondHolderName;
	}

	public void setShFatherName(String shFatherName) {
		this.shFatherName = shFatherName;
	}

	public void setShOccupation(String shOccupation) {
		this.shOccupation = shOccupation;
	}

	public void setShPanNo(String shPanNo) {
		this.shPanNo = shPanNo;
	}

	public void setShDob(String shDob) {
		this.shDob = shDob;
	}

	public void setSecondHolderEmail(String secondHolderEmail) {
		this.secondHolderEmail = secondHolderEmail;
	}

	public void setShAltEmailId(String shAltEmailId) {
		this.shAltEmailId = shAltEmailId;
	}

	public void setShFamilyEmail(String shFamilyEmail) {
		this.shFamilyEmail = shFamilyEmail;
	}

	public void setShPhoneNo(String shPhoneNo) {
		this.shPhoneNo = shPhoneNo;
	}

	public void setSecondHolderMob(String secondHolderMob) {
		this.secondHolderMob = secondHolderMob;
	}

	public void setSecondHolderMapin(String secondHolderMapin) {
		this.secondHolderMapin = secondHolderMapin;
	}

	public void setShFamilyMob(String shFamilyMob) {
		this.shFamilyMob = shFamilyMob;
	}

	public void setSecondHolderSmsFlag(String secondHolderSmsFlag) {
		this.secondHolderSmsFlag = secondHolderSmsFlag;
	}

	public void setShCustId(String shCustId) {
		this.shCustId = shCustId;
	}

	public void setShBankAccountNo(String shBankAccountNo) {
		this.shBankAccountNo = shBankAccountNo;
	}

	public void setSecondHolderPanFlag(String secondHolderPanFlag) {
		this.secondHolderPanFlag = secondHolderPanFlag;
	}

	public void setShPanaadharlinkFlag(String ShPanaadharlinkFlag) {
		this.ShPanaadharlinkFlag = ShPanaadharlinkFlag;
	}

	public void setShPanaadharlinkEffDate(String ShPanaadharlinkEffDate) {
		this.ShPanaadharlinkEffDate = ShPanaadharlinkEffDate;
	}

	public void setShIsdCode(String ShIsdCode) {
		this.ShIsdCode = ShIsdCode;
	}

	public void setShAddress(ShAddress shAddressObject) {
		this.ShAddressObject = shAddressObject;
	}

	public void setShGuardName(String shGuardName) {
		this.shGuardName = shGuardName;
	}

	public void setShGuardRel(String shGuardRel) {
		this.shGuardRel = shGuardRel;
	}

	public void setShItCircle(String shItCircle) {
		this.shItCircle = shItCircle;
	}

	public void setShAadhaar(String shAadhaar) {
		this.shAadhaar = shAadhaar;
	}

	public void setShAadharNonupdReason(String shAadharNonupdReason) {
		this.shAadharNonupdReason = shAadharNonupdReason;
	}

	public void setShVid(String shVid) {
		this.shVid = shVid;
	}

	public void setShKraFlag(String shKraFlag) {
		this.shKraFlag = shKraFlag;
	}

	public void setShUcic(String shUcic) {
		this.shUcic = shUcic;
	}

	public void setShAadhaarVerifyFlag(String shAadhaarVerifyFlag) {
		this.shAadhaarVerifyFlag = shAadhaarVerifyFlag;
	}

	public void setShRtaEmailFlag(String shRtaEmailFlag) {
		this.shRtaEmailFlag = shRtaEmailFlag;
	}

	public void setShgAddress(ShgAddress shgAddressObject) {
		this.ShgAddressObject = shgAddressObject;
	}

	public void setShNcFlag(String shNcFlag) {
		this.shNcFlag = shNcFlag;
	}
}

class ShgAddress {
	private String Address1;
	private String Address2;
	private String Address3;
	private String Address4;
	private String City;
	private String State;
	private String Zip;
	private String Country;
	private String Phone1;
	private String Phone2;
	private String Phone3;
	private String Telex;
	private String Fax;
	private String Email;
	private String Website;
	private String mobileNo;
	private String gstState;

	// Getter Methods

	public String getAddress1() {
		return Address1;
	}

	public String getAddress2() {
		return Address2;
	}

	public String getAddress3() {
		return Address3;
	}

	public String getAddress4() {
		return Address4;
	}

	public String getCity() {
		return City;
	}

	public String getState() {
		return State;
	}

	public String getZip() {
		return Zip;
	}

	public String getCountry() {
		return Country;
	}

	public String getPhone1() {
		return Phone1;
	}

	public String getPhone2() {
		return Phone2;
	}

	public String getPhone3() {
		return Phone3;
	}

	public String getTelex() {
		return Telex;
	}

	public String getFax() {
		return Fax;
	}

	public String getEmail() {
		return Email;
	}

	public String getWebsite() {
		return Website;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getGstState() {
		return gstState;
	}

	// Setter Methods

	public void setAddress1(String Address1) {
		this.Address1 = Address1;
	}

	public void setAddress2(String Address2) {
		this.Address2 = Address2;
	}

	public void setAddress3(String Address3) {
		this.Address3 = Address3;
	}

	public void setAddress4(String Address4) {
		this.Address4 = Address4;
	}

	public void setCity(String City) {
		this.City = City;
	}

	public void setState(String State) {
		this.State = State;
	}

	public void setZip(String Zip) {
		this.Zip = Zip;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}

	public void setPhone1(String Phone1) {
		this.Phone1 = Phone1;
	}

	public void setPhone2(String Phone2) {
		this.Phone2 = Phone2;
	}

	public void setPhone3(String Phone3) {
		this.Phone3 = Phone3;
	}

	public void setTelex(String Telex) {
		this.Telex = Telex;
	}

	public void setFax(String Fax) {
		this.Fax = Fax;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public void setWebsite(String Website) {
		this.Website = Website;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setGstState(String gstState) {
		this.gstState = gstState;
	}
}

class ShAddress {
	private String Address1;
	private String Address2;
	private String Address3;
	private String Address4;
	private String City;
	private String State;
	private String Zip;
	private String Country;
	private String Phone1;
	private String Phone2;
	private String Phone3;
	private String Telex;
	private String Fax;
	private String Email;
	private String Website;
	private String mobileNo;
	private String gstState;

	// Getter Methods

	public String getAddress1() {
		return Address1;
	}

	public String getAddress2() {
		return Address2;
	}

	public String getAddress3() {
		return Address3;
	}

	public String getAddress4() {
		return Address4;
	}

	public String getCity() {
		return City;
	}

	public String getState() {
		return State;
	}

	public String getZip() {
		return Zip;
	}

	public String getCountry() {
		return Country;
	}

	public String getPhone1() {
		return Phone1;
	}

	public String getPhone2() {
		return Phone2;
	}

	public String getPhone3() {
		return Phone3;
	}

	public String getTelex() {
		return Telex;
	}

	public String getFax() {
		return Fax;
	}

	public String getEmail() {
		return Email;
	}

	public String getWebsite() {
		return Website;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getGstState() {
		return gstState;
	}

	// Setter Methods

	public void setAddress1(String Address1) {
		this.Address1 = Address1;
	}

	public void setAddress2(String Address2) {
		this.Address2 = Address2;
	}

	public void setAddress3(String Address3) {
		this.Address3 = Address3;
	}

	public void setAddress4(String Address4) {
		this.Address4 = Address4;
	}

	public void setCity(String City) {
		this.City = City;
	}

	public void setState(String State) {
		this.State = State;
	}

	public void setZip(String Zip) {
		this.Zip = Zip;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}

	public void setPhone1(String Phone1) {
		this.Phone1 = Phone1;
	}

	public void setPhone2(String Phone2) {
		this.Phone2 = Phone2;
	}

	public void setPhone3(String Phone3) {
		this.Phone3 = Phone3;
	}

	public void setTelex(String Telex) {
		this.Telex = Telex;
	}

	public void setFax(String Fax) {
		this.Fax = Fax;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public void setWebsite(String Website) {
		this.Website = Website;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setGstState(String gstState) {
		this.gstState = gstState;
	}
}

class ForeignAddress {
	private String Address1;
	private String Address2;
	private String Address3;
	private String Address4;
	private String City;
	private String State;
	private String Zip;
	private String Country;
	private String Phone1;
	private String Phone2;
	private String Phone3;
	private String Telex;
	private String Fax;
	private String Email;
	private String Website;
	private String mobileNo;
	private String gstState;

	// Getter Methods

	public String getAddress1() {
		return Address1;
	}

	public String getAddress2() {
		return Address2;
	}

	public String getAddress3() {
		return Address3;
	}

	public String getAddress4() {
		return Address4;
	}

	public String getCity() {
		return City;
	}

	public String getState() {
		return State;
	}

	public String getZip() {
		return Zip;
	}

	public String getCountry() {
		return Country;
	}

	public String getPhone1() {
		return Phone1;
	}

	public String getPhone2() {
		return Phone2;
	}

	public String getPhone3() {
		return Phone3;
	}

	public String getTelex() {
		return Telex;
	}

	public String getFax() {
		return Fax;
	}

	public String getEmail() {
		return Email;
	}

	public String getWebsite() {
		return Website;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getGstState() {
		return gstState;
	}

	// Setter Methods

	public void setAddress1(String Address1) {
		this.Address1 = Address1;
	}

	public void setAddress2(String Address2) {
		this.Address2 = Address2;
	}

	public void setAddress3(String Address3) {
		this.Address3 = Address3;
	}

	public void setAddress4(String Address4) {
		this.Address4 = Address4;
	}

	public void setCity(String City) {
		this.City = City;
	}

	public void setState(String State) {
		this.State = State;
	}

	public void setZip(String Zip) {
		this.Zip = Zip;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}

	public void setPhone1(String Phone1) {
		this.Phone1 = Phone1;
	}

	public void setPhone2(String Phone2) {
		this.Phone2 = Phone2;
	}

	public void setPhone3(String Phone3) {
		this.Phone3 = Phone3;
	}

	public void setTelex(String Telex) {
		this.Telex = Telex;
	}

	public void setFax(String Fax) {
		this.Fax = Fax;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public void setWebsite(String Website) {
		this.Website = Website;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setGstState(String gstState) {
		this.gstState = gstState;
	}
}

class Address {
	private String Address1;
	private String Address2;
	private String Address3;
	private String Address4;
	private String City;
	private String State;
	private String Zip;
	private String Country;
	private String Phone1;
	private String Phone2;
	private String Phone3;
	private String Telex;
	private String Fax;
	private String Email;
	private String Website;
	private String mobileNo;
	private String gstState;

	// Getter Methods

	public String getAddress1() {
		return Address1;
	}

	public String getAddress2() {
		return Address2;
	}

	public String getAddress3() {
		return Address3;
	}

	public String getAddress4() {
		return Address4;
	}

	public String getCity() {
		return City;
	}

	public String getState() {
		return State;
	}

	public String getZip() {
		return Zip;
	}

	public String getCountry() {
		return Country;
	}

	public String getPhone1() {
		return Phone1;
	}

	public String getPhone2() {
		return Phone2;
	}

	public String getPhone3() {
		return Phone3;
	}

	public String getTelex() {
		return Telex;
	}

	public String getFax() {
		return Fax;
	}

	public String getEmail() {
		return Email;
	}

	public String getWebsite() {
		return Website;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getGstState() {
		return gstState;
	}

	// Setter Methods

	public void setAddress1(String Address1) {
		this.Address1 = Address1;
	}

	public void setAddress2(String Address2) {
		this.Address2 = Address2;
	}

	public void setAddress3(String Address3) {
		this.Address3 = Address3;
	}

	public void setAddress4(String Address4) {
		this.Address4 = Address4;
	}

	public void setCity(String City) {
		this.City = City;
	}

	public void setState(String State) {
		this.State = State;
	}

	public void setZip(String Zip) {
		this.Zip = Zip;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}

	public void setPhone1(String Phone1) {
		this.Phone1 = Phone1;
	}

	public void setPhone2(String Phone2) {
		this.Phone2 = Phone2;
	}

	public void setPhone3(String Phone3) {
		this.Phone3 = Phone3;
	}

	public void setTelex(String Telex) {
		this.Telex = Telex;
	}

	public void setFax(String Fax) {
		this.Fax = Fax;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public void setWebsite(String Website) {
		this.Website = Website;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setGstState(String gstState) {
		this.gstState = gstState;
	}
}

class General {
	private String RefNo;
	private String ShortName;
	private String FirstHolderName;
	private float BillingCategory;
	private float GroupId;
	private String AddressId;
	private float BranchId;
	private String DpmClientId;
	private String ClientType;
	private String ClientSubtype;
	private String ClientCategory;
	private String ClientOccupation;
	private String FhFatherName;
	private String ContactPerson1;
	private String ContactPerson2;
	private String BpId;
	private String AddressPreferenceFlag;
	private String ActivationDatetime;
	private String FhPanNo;
	private String NgIndicator;
	private String NgName;
	private String DobMinor;
	private String NgAddressId;
	private String FreeCredit;
	private String BankAddressId;
	private String SebiRegistrationNo;
	private String Status;
	private String StatusChangeReason;
	private String AccountClosureDate;
	private String CcId;
	private String Notes;
	private String ForiegnAddressId;
	private String BatchNumber;
	private String LineNo;
	private String BankAddressId2;
	private String Discount;
	private String CreditDays;
	private String InterestRate;
	private String Pin;
	private String PinIntimation;
	private String WebEnabled;
	private String Tin;
	private String SoaEmail;
	private String SohEmail;
	private String BillingEmail;
	private String HoldValue;
	private float MakerId;
	private String MakerDatetime;
	private String CheckerId;
	private String CheckerDatetime;
	private String CancelId;
	private String CancelDatetime;
	private String FreezeReason;
	private String ModeOfOperation;
	private String FaxIndeminity;
	private String CustId;
	private String NomineesGuardianAddId;
	private String BirthDate;
	private String ClientRejected;
	private String ClientRejectedDate;
	private String InwardDate;
	private String IntRejCode;
	private String BankingClient;
	private String ExtraCloseCharges;
	private String RefClientId;
	private String SmsAlert;
	private String MobileNo;
	private String ExportClient;
	private String DocumentRenewDate;
	private String OutstandingBalance;
	private String DebitSmsAlert;
	private String CreditSmsAlert;
	private String OverdueSmsAlert;
	private String FailedSmsAlert;
	private String DematConfSmsAlert;
	private String DematRejSmsAlert;
	private String DebitEmailAlert;
	private String CreditEmailAlert;
	private String OverdueEmailAlert;
	private String FailedEmailAlert;
	private String DematConfEmailAlert;
	private String DematRejEmailAlert;
	private String SmsEmail;
	private String Deposit;
	private String PoaAddressId;
	private String PoaName;
	private String PoaFatherName;
	private String PoaPan;
	private String LobCategory;
	private String RangeWiseDiscount;
	private String BillWiseDiscount;
	private String InterestWaiver;
	private float Income;
	private String AdditionalInfo;
	private String InternetTrading;
	private String SearchFirstHolderName;
	private String AmcAfterMonths;
	private String RewardsSchemeEligible;
	private String RewardPointsAvailable;
	private String DefaulterList;
	private String AccActivateSmsAlert;
	private String AccFreezeSmsAlert;
	private String PledgedSmsAlert;
	private String PledgeInvokeSmsAlert;
	private String CorpActSmsAlert;
	private String AccActivateEmailAlert;
	private String AccFreezeEmailAlert;
	private String PledgedEmailAlert;
	private String PledgeInvokeEmailAlert;
	private String CorpActEmailAlert;
	private String TransLimit;
	private String TransLimitPerTarget;
	private String TransLimitPerSettlement;
	private String UpdIns;
	private String NmIndicator;
	private String NmDob;
	private String FirstHolderMapin;
	private String FirstHolderMob;
	private String FirstHolderSmsFlag;
	private String FirstHolderPoaFlag;
	private String RmCode;
	private String CorpCode;
	private String Segment;
	private String Classification;
	private String SubClassification;
	private String LeadGenerator;
	private String LeadConverter;
	private String SourceCode;
	private String UinStatusFh;
	private String UinNoFh;
	private String UinStatusSh;
	private String UinNoSh;
	private String UinStatusTh;
	private String UinNoTh;
	private String RmEffectiveDate;
	private String CorpCodeEffectiveDate;
	private String SegmentEffectiveDate;
	private String ClassificationEffectiveDate;
	private String HomeBranchEffectiveDate;
	private String ForCorrAddressFlag;
	private String FirstHolderEmail;
	private String OptedDponnet;
	private String ValueLimitPerSettlement;
	private String LastTranDate;
	private String WebcisPwd;
	private String WebcisEnabled;
	private String CcrRefNo;
	private String FirstHolderPanFlag;
	private String AddChnDate;
	private String CustomerHash;
	private String CustodyCode;
	private String CoreBankType;
	private String ThumbImpression;
	private String SameAsLoAddress;
	private String ShAddressId;
	private String ThAddressId;
	private String SameAsLoAddressNg;
	private String SignFileSize;
	private String CarExport;
	private String FhNomineeName;
	private String FhNomineeAddressId;
	private String FhSexCode;
	private String FhMinor;
	private String FhGuardRel;
	private String FhIdentifier;
	private String FhItCircle;
	private String ShGuardAddressId;
	private String ThGuardAddressId;
	private String FhCombiCover;
	private String FhCommFlag;
	private String InternetTradingLinkDt;
	private String CarBatchNo;
	private String InfinityLinking;
	private String DematCancelSmsAlert;
	private String DebitCancelSmsAlert;
	private String PledgeClosureSmsAlert;
	private String PledgeCancelSmsAlert;
	private String PledgeFailedSmsAlert;
	private String LastUpdDt;
	private String SoaCease;
	private String SoaCeaseDate;
	private String VisuallyChallenged;
	private String CommodityAc;
	private String NomineeSignFileSize;
	private String InfopoolFlag;
	private String CustUserId;
	private String IncomeRange;
	private String NomineeFlag;
	private String PromotionalSmsAlert;
	private String SdoClientType;
	private String SdoSegType;
	private String SdoMemberCode;
	private String SdoMemberType;
	private String SdoSnvid;
	private String SdoSdvid;
	private String ClientAlertMsg;
	private String ClientLinkType;
	private String FirstHolderAuthFlag;
	private String SecondHolderAuthFlag;
	private String ThirdHolderAuthFlag;
	private String TpAddressFlag;
	private String LastDrtranDate;
	private String EmailAdressTo;
	private String EmailAdressCc;
	private String EmailAdressBcc;
	private String FhKraFlag;
	private String FhKraId;
	private String Bsda;
	private String RgessFlag;
	private String FhAadhaar;
	private String RgessStatus;
	private String RgessStatusDate;
	private String RgessReasonCode;
	private String DisNotRequired;
	private String SdoExchange;
	private String SodPledgeeId;
	private String FhRtaEmailFlag;
	private String SiPledgeConfirm;
	private String AltEmailId;
	private String EstmtFlag;
	private String FhFamilyEmail;
	private String FhFamilyMob;
	private String Saral;
	private String PositiveConf;
	private String NoAddressProof;
	private String DematCreateSmsAlert;
	private String PledgeCreateSmsAlert;
	private String PledgeCloseSmsAlert;
	private String InstClientId;
	private String FhUcic;
	private String LeadId;
	private String PepFlag;
	private String RiskCategory;
	private String FhCityOfBirth;
	private String FhCountryOfBirth;
	private String FhFatcaFlag;
	private String CustodialFlag;
	private String FhAltEmailId;
	private String SharePerEqFlag;
	private String NmIndicatorCode;
	private String SnAddSameAsFnAdd;
	private String SnAddId;
	private String TnAddSameAsFnAdd;
	private String TnAddId;
	private String TnGuardianAddId;
	private String AnnualReport;
	private String RematCreateSmsAlert;
	private String RematRejectSmsAlert;
	private String PledgecreateRejectSmsAlert;
	private String PledgecloseRejectSmsAlert;
	private String GstNo;
	private String GstReg;
	private String SpcExemp;
	private String RelParty;
	private String RelPartyCat;
	private String EmailAlertToRm;
	private String HufName;
	private String ShIncomeRange;
	private String ThIncomeRange;
	private String Introduser;
	private String AccountSourced;
	private String FhCkycNo;
	private String FhAadhaarRefNo;
	private String NoOfCoparceners;
	private String DateOfFormation;
	private String AncestralFlag;
	private String GenderOfKarta;
	private String DobOfKarta;
	private String PanOfKarta;
	private String AadhaarOfKarta;
	private String UpiId;
	private String FhAadhaarVerifyFlag;
	private String FhAadharrNonupdReason;
	private String KycUpdateFlag;
	private String FatcaFlag;
	private String Umrn;
	private String NachFrequency;
	private String NachLimit;
	private String NachEffFromDate;
	private String NachEffToDate;
	private String KraAgency;
	private String KraRegDate;
	private String GsecIdtFlag;
	private String FhVid;
	private String KartaVid;
	private String MaritalStatus;
	private String FormType;
	private String OldUdnNo;
	private String TradingAccountNo;
	private String TradingBranchName;
	private String MobileRelation;
	private String EmailRelation;
	private String OldBranchId;
	private String tSET_NO_GST;
	private String Active;
	private String Freeze;
	private String InfoComplete;
	private String Checked;
	private String Signature;
	private String EncClientValue;
	private String AdacCust;
	private String Sector;
	private String LinkedEntity;
	private String MerchantDetails;
	private String EdisFlag;
	private String AccountOption;
	private String FatherSpouseFlag;
	private String FhPanaadharlinkFlag;
	private String FhPanaadharlinkEffDate;
	private String NeoFlag;
	private String NeoActDate;
	private String TcsTemplate;
	private String NetWorth;
	private String NetWorthDate;
	private String LeiNo;
	private float FhIsdCode;
	private String W8ben;
	private String DpmModeOfOpr;
	private String CommSendTo;
	private String PmsFlag;
	private String signature;

	// Getter Methods

	public String getRefNo() {
		return RefNo;
	}

	public String getShortName() {
		return ShortName;
	}

	public String getFirstHolderName() {
		return FirstHolderName;
	}

	public float getBillingCategory() {
		return BillingCategory;
	}

	public float getGroupId() {
		return GroupId;
	}

	public String getAddressId() {
		return AddressId;
	}

	public float getBranchId() {
		return BranchId;
	}

	public String getDpmClientId() {
		return DpmClientId;
	}

	public String getClientType() {
		return ClientType;
	}

	public String getClientSubtype() {
		return ClientSubtype;
	}

	public String getClientCategory() {
		return ClientCategory;
	}

	public String getClientOccupation() {
		return ClientOccupation;
	}

	public String getFhFatherName() {
		return FhFatherName;
	}

	public String getContactPerson1() {
		return ContactPerson1;
	}

	public String getContactPerson2() {
		return ContactPerson2;
	}

	public String getBpId() {
		return BpId;
	}

	public String getAddressPreferenceFlag() {
		return AddressPreferenceFlag;
	}

	public String getActivationDatetime() {
		return ActivationDatetime;
	}

	public String getFhPanNo() {
		return FhPanNo;
	}

	public String getNgIndicator() {
		return NgIndicator;
	}

	public String getNgName() {
		return NgName;
	}

	public String getDobMinor() {
		return DobMinor;
	}

	public String getNgAddressId() {
		return NgAddressId;
	}

	public String getFreeCredit() {
		return FreeCredit;
	}

	public String getBankAddressId() {
		return BankAddressId;
	}

	public String getSebiRegistrationNo() {
		return SebiRegistrationNo;
	}

	public String getStatus() {
		return Status;
	}

	public String getStatusChangeReason() {
		return StatusChangeReason;
	}

	public String getAccountClosureDate() {
		return AccountClosureDate;
	}

	public String getCcId() {
		return CcId;
	}

	public String getNotes() {
		return Notes;
	}

	public String getForiegnAddressId() {
		return ForiegnAddressId;
	}

	public String getBatchNumber() {
		return BatchNumber;
	}

	public String getLineNo() {
		return LineNo;
	}

	public String getBankAddressId2() {
		return BankAddressId2;
	}

	public String getDiscount() {
		return Discount;
	}

	public String getCreditDays() {
		return CreditDays;
	}

	public String getInterestRate() {
		return InterestRate;
	}

	public String getPin() {
		return Pin;
	}

	public String getPinIntimation() {
		return PinIntimation;
	}

	public String getWebEnabled() {
		return WebEnabled;
	}

	public String getTin() {
		return Tin;
	}

	public String getSoaEmail() {
		return SoaEmail;
	}

	public String getSohEmail() {
		return SohEmail;
	}

	public String getBillingEmail() {
		return BillingEmail;
	}

	public String getHoldValue() {
		return HoldValue;
	}

	public float getMakerId() {
		return MakerId;
	}

	public String getMakerDatetime() {
		return MakerDatetime;
	}

	public String getCheckerId() {
		return CheckerId;
	}

	public String getCheckerDatetime() {
		return CheckerDatetime;
	}

	public String getCancelId() {
		return CancelId;
	}

	public String getCancelDatetime() {
		return CancelDatetime;
	}

	public String getFreezeReason() {
		return FreezeReason;
	}

	public String getModeOfOperation() {
		return ModeOfOperation;
	}

	public String getFaxIndeminity() {
		return FaxIndeminity;
	}

	public String getCustId() {
		return CustId;
	}

	public String getNomineesGuardianAddId() {
		return NomineesGuardianAddId;
	}

	public String getBirthDate() {
		return BirthDate;
	}

	public String getClientRejected() {
		return ClientRejected;
	}

	public String getClientRejectedDate() {
		return ClientRejectedDate;
	}

	public String getInwardDate() {
		return InwardDate;
	}

	public String getIntRejCode() {
		return IntRejCode;
	}

	public String getBankingClient() {
		return BankingClient;
	}

	public String getExtraCloseCharges() {
		return ExtraCloseCharges;
	}

	public String getRefClientId() {
		return RefClientId;
	}

	public String getSmsAlert() {
		return SmsAlert;
	}

	public String getMobileNo() {
		return MobileNo;
	}

	public String getExportClient() {
		return ExportClient;
	}

	public String getDocumentRenewDate() {
		return DocumentRenewDate;
	}

	public String getOutstandingBalance() {
		return OutstandingBalance;
	}

	public String getDebitSmsAlert() {
		return DebitSmsAlert;
	}

	public String getCreditSmsAlert() {
		return CreditSmsAlert;
	}

	public String getOverdueSmsAlert() {
		return OverdueSmsAlert;
	}

	public String getFailedSmsAlert() {
		return FailedSmsAlert;
	}

	public String getDematConfSmsAlert() {
		return DematConfSmsAlert;
	}

	public String getDematRejSmsAlert() {
		return DematRejSmsAlert;
	}

	public String getDebitEmailAlert() {
		return DebitEmailAlert;
	}

	public String getCreditEmailAlert() {
		return CreditEmailAlert;
	}

	public String getOverdueEmailAlert() {
		return OverdueEmailAlert;
	}

	public String getFailedEmailAlert() {
		return FailedEmailAlert;
	}

	public String getDematConfEmailAlert() {
		return DematConfEmailAlert;
	}

	public String getDematRejEmailAlert() {
		return DematRejEmailAlert;
	}

	public String getSmsEmail() {
		return SmsEmail;
	}

	public String getDeposit() {
		return Deposit;
	}

	public String getPoaAddressId() {
		return PoaAddressId;
	}

	public String getPoaName() {
		return PoaName;
	}

	public String getPoaFatherName() {
		return PoaFatherName;
	}

	public String getPoaPan() {
		return PoaPan;
	}

	public String getLobCategory() {
		return LobCategory;
	}

	public String getRangeWiseDiscount() {
		return RangeWiseDiscount;
	}

	public String getBillWiseDiscount() {
		return BillWiseDiscount;
	}

	public String getInterestWaiver() {
		return InterestWaiver;
	}

	public float getIncome() {
		return Income;
	}

	public String getAdditionalInfo() {
		return AdditionalInfo;
	}

	public String getInternetTrading() {
		return InternetTrading;
	}

	public String getSearchFirstHolderName() {
		return SearchFirstHolderName;
	}

	public String getAmcAfterMonths() {
		return AmcAfterMonths;
	}

	public String getRewardsSchemeEligible() {
		return RewardsSchemeEligible;
	}

	public String getRewardPointsAvailable() {
		return RewardPointsAvailable;
	}

	public String getDefaulterList() {
		return DefaulterList;
	}

	public String getAccActivateSmsAlert() {
		return AccActivateSmsAlert;
	}

	public String getAccFreezeSmsAlert() {
		return AccFreezeSmsAlert;
	}

	public String getPledgedSmsAlert() {
		return PledgedSmsAlert;
	}

	public String getPledgeInvokeSmsAlert() {
		return PledgeInvokeSmsAlert;
	}

	public String getCorpActSmsAlert() {
		return CorpActSmsAlert;
	}

	public String getAccActivateEmailAlert() {
		return AccActivateEmailAlert;
	}

	public String getAccFreezeEmailAlert() {
		return AccFreezeEmailAlert;
	}

	public String getPledgedEmailAlert() {
		return PledgedEmailAlert;
	}

	public String getPledgeInvokeEmailAlert() {
		return PledgeInvokeEmailAlert;
	}

	public String getCorpActEmailAlert() {
		return CorpActEmailAlert;
	}

	public String getTransLimit() {
		return TransLimit;
	}

	public String getTransLimitPerTarget() {
		return TransLimitPerTarget;
	}

	public String getTransLimitPerSettlement() {
		return TransLimitPerSettlement;
	}

	public String getUpdIns() {
		return UpdIns;
	}

	public String getNmIndicator() {
		return NmIndicator;
	}

	public String getNmDob() {
		return NmDob;
	}

	public String getFirstHolderMapin() {
		return FirstHolderMapin;
	}

	public String getFirstHolderMob() {
		return FirstHolderMob;
	}

	public String getFirstHolderSmsFlag() {
		return FirstHolderSmsFlag;
	}

	public String getFirstHolderPoaFlag() {
		return FirstHolderPoaFlag;
	}

	public String getRmCode() {
		return RmCode;
	}

	public String getCorpCode() {
		return CorpCode;
	}

	public String getSegment() {
		return Segment;
	}

	public String getClassification() {
		return Classification;
	}

	public String getSubClassification() {
		return SubClassification;
	}

	public String getLeadGenerator() {
		return LeadGenerator;
	}

	public String getLeadConverter() {
		return LeadConverter;
	}

	public String getSourceCode() {
		return SourceCode;
	}

	public String getUinStatusFh() {
		return UinStatusFh;
	}

	public String getUinNoFh() {
		return UinNoFh;
	}

	public String getUinStatusSh() {
		return UinStatusSh;
	}

	public String getUinNoSh() {
		return UinNoSh;
	}

	public String getUinStatusTh() {
		return UinStatusTh;
	}

	public String getUinNoTh() {
		return UinNoTh;
	}

	public String getRmEffectiveDate() {
		return RmEffectiveDate;
	}

	public String getCorpCodeEffectiveDate() {
		return CorpCodeEffectiveDate;
	}

	public String getSegmentEffectiveDate() {
		return SegmentEffectiveDate;
	}

	public String getClassificationEffectiveDate() {
		return ClassificationEffectiveDate;
	}

	public String getHomeBranchEffectiveDate() {
		return HomeBranchEffectiveDate;
	}

	public String getForCorrAddressFlag() {
		return ForCorrAddressFlag;
	}

	public String getFirstHolderEmail() {
		return FirstHolderEmail;
	}

	public String getOptedDponnet() {
		return OptedDponnet;
	}

	public String getValueLimitPerSettlement() {
		return ValueLimitPerSettlement;
	}

	public String getLastTranDate() {
		return LastTranDate;
	}

	public String getWebcisPwd() {
		return WebcisPwd;
	}

	public String getWebcisEnabled() {
		return WebcisEnabled;
	}

	public String getCcrRefNo() {
		return CcrRefNo;
	}

	public String getFirstHolderPanFlag() {
		return FirstHolderPanFlag;
	}

	public String getAddChnDate() {
		return AddChnDate;
	}

	public String getCustomerHash() {
		return CustomerHash;
	}

	public String getCustodyCode() {
		return CustodyCode;
	}

	public String getCoreBankType() {
		return CoreBankType;
	}

	public String getThumbImpression() {
		return ThumbImpression;
	}

	public String getSameAsLoAddress() {
		return SameAsLoAddress;
	}

	public String getShAddressId() {
		return ShAddressId;
	}

	public String getThAddressId() {
		return ThAddressId;
	}

	public String getSameAsLoAddressNg() {
		return SameAsLoAddressNg;
	}

	public String getSignFileSize() {
		return SignFileSize;
	}

	public String getCarExport() {
		return CarExport;
	}

	public String getFhNomineeName() {
		return FhNomineeName;
	}

	public String getFhNomineeAddressId() {
		return FhNomineeAddressId;
	}

	public String getFhSexCode() {
		return FhSexCode;
	}

	public String getFhMinor() {
		return FhMinor;
	}

	public String getFhGuardRel() {
		return FhGuardRel;
	}

	public String getFhIdentifier() {
		return FhIdentifier;
	}

	public String getFhItCircle() {
		return FhItCircle;
	}

	public String getShGuardAddressId() {
		return ShGuardAddressId;
	}

	public String getThGuardAddressId() {
		return ThGuardAddressId;
	}

	public String getFhCombiCover() {
		return FhCombiCover;
	}

	public String getFhCommFlag() {
		return FhCommFlag;
	}

	public String getInternetTradingLinkDt() {
		return InternetTradingLinkDt;
	}

	public String getCarBatchNo() {
		return CarBatchNo;
	}

	public String getInfinityLinking() {
		return InfinityLinking;
	}

	public String getDematCancelSmsAlert() {
		return DematCancelSmsAlert;
	}

	public String getDebitCancelSmsAlert() {
		return DebitCancelSmsAlert;
	}

	public String getPledgeClosureSmsAlert() {
		return PledgeClosureSmsAlert;
	}

	public String getPledgeCancelSmsAlert() {
		return PledgeCancelSmsAlert;
	}

	public String getPledgeFailedSmsAlert() {
		return PledgeFailedSmsAlert;
	}

	public String getLastUpdDt() {
		return LastUpdDt;
	}

	public String getSoaCease() {
		return SoaCease;
	}

	public String getSoaCeaseDate() {
		return SoaCeaseDate;
	}

	public String getVisuallyChallenged() {
		return VisuallyChallenged;
	}

	public String getCommodityAc() {
		return CommodityAc;
	}

	public String getNomineeSignFileSize() {
		return NomineeSignFileSize;
	}

	public String getInfopoolFlag() {
		return InfopoolFlag;
	}

	public String getCustUserId() {
		return CustUserId;
	}

	public String getIncomeRange() {
		return IncomeRange;
	}

	public String getNomineeFlag() {
		return NomineeFlag;
	}

	public String getPromotionalSmsAlert() {
		return PromotionalSmsAlert;
	}

	public String getSdoClientType() {
		return SdoClientType;
	}

	public String getSdoSegType() {
		return SdoSegType;
	}

	public String getSdoMemberCode() {
		return SdoMemberCode;
	}

	public String getSdoMemberType() {
		return SdoMemberType;
	}

	public String getSdoSnvid() {
		return SdoSnvid;
	}

	public String getSdoSdvid() {
		return SdoSdvid;
	}

	public String getClientAlertMsg() {
		return ClientAlertMsg;
	}

	public String getClientLinkType() {
		return ClientLinkType;
	}

	public String getFirstHolderAuthFlag() {
		return FirstHolderAuthFlag;
	}

	public String getSecondHolderAuthFlag() {
		return SecondHolderAuthFlag;
	}

	public String getThirdHolderAuthFlag() {
		return ThirdHolderAuthFlag;
	}

	public String getTpAddressFlag() {
		return TpAddressFlag;
	}

	public String getLastDrtranDate() {
		return LastDrtranDate;
	}

	public String getEmailAdressTo() {
		return EmailAdressTo;
	}

	public String getEmailAdressCc() {
		return EmailAdressCc;
	}

	public String getEmailAdressBcc() {
		return EmailAdressBcc;
	}

	public String getFhKraFlag() {
		return FhKraFlag;
	}

	public String getFhKraId() {
		return FhKraId;
	}

	public String getBsda() {
		return Bsda;
	}

	public String getRgessFlag() {
		return RgessFlag;
	}

	public String getFhAadhaar() {
		return FhAadhaar;
	}

	public String getRgessStatus() {
		return RgessStatus;
	}

	public String getRgessStatusDate() {
		return RgessStatusDate;
	}

	public String getRgessReasonCode() {
		return RgessReasonCode;
	}

	public String getDisNotRequired() {
		return DisNotRequired;
	}

	public String getSdoExchange() {
		return SdoExchange;
	}

	public String getSodPledgeeId() {
		return SodPledgeeId;
	}

	public String getFhRtaEmailFlag() {
		return FhRtaEmailFlag;
	}

	public String getSiPledgeConfirm() {
		return SiPledgeConfirm;
	}

	public String getAltEmailId() {
		return AltEmailId;
	}

	public String getEstmtFlag() {
		return EstmtFlag;
	}

	public String getFhFamilyEmail() {
		return FhFamilyEmail;
	}

	public String getFhFamilyMob() {
		return FhFamilyMob;
	}

	public String getSaral() {
		return Saral;
	}

	public String getPositiveConf() {
		return PositiveConf;
	}

	public String getNoAddressProof() {
		return NoAddressProof;
	}

	public String getDematCreateSmsAlert() {
		return DematCreateSmsAlert;
	}

	public String getPledgeCreateSmsAlert() {
		return PledgeCreateSmsAlert;
	}

	public String getPledgeCloseSmsAlert() {
		return PledgeCloseSmsAlert;
	}

	public String getInstClientId() {
		return InstClientId;
	}

	public String getFhUcic() {
		return FhUcic;
	}

	public String getLeadId() {
		return LeadId;
	}

	public String getPepFlag() {
		return PepFlag;
	}

	public String getRiskCategory() {
		return RiskCategory;
	}

	public String getFhCityOfBirth() {
		return FhCityOfBirth;
	}

	public String getFhCountryOfBirth() {
		return FhCountryOfBirth;
	}

	public String getFhFatcaFlag() {
		return FhFatcaFlag;
	}

	public String getCustodialFlag() {
		return CustodialFlag;
	}

	public String getFhAltEmailId() {
		return FhAltEmailId;
	}

	public String getSharePerEqFlag() {
		return SharePerEqFlag;
	}

	public String getNmIndicatorCode() {
		return NmIndicatorCode;
	}

	public String getSnAddSameAsFnAdd() {
		return SnAddSameAsFnAdd;
	}

	public String getSnAddId() {
		return SnAddId;
	}

	public String getTnAddSameAsFnAdd() {
		return TnAddSameAsFnAdd;
	}

	public String getTnAddId() {
		return TnAddId;
	}

	public String getTnGuardianAddId() {
		return TnGuardianAddId;
	}

	public String getAnnualReport() {
		return AnnualReport;
	}

	public String getRematCreateSmsAlert() {
		return RematCreateSmsAlert;
	}

	public String getRematRejectSmsAlert() {
		return RematRejectSmsAlert;
	}

	public String getPledgecreateRejectSmsAlert() {
		return PledgecreateRejectSmsAlert;
	}

	public String getPledgecloseRejectSmsAlert() {
		return PledgecloseRejectSmsAlert;
	}

	public String getGstNo() {
		return GstNo;
	}

	public String getGstReg() {
		return GstReg;
	}

	public String getSpcExemp() {
		return SpcExemp;
	}

	public String getRelParty() {
		return RelParty;
	}

	public String getRelPartyCat() {
		return RelPartyCat;
	}

	public String getEmailAlertToRm() {
		return EmailAlertToRm;
	}

	public String getHufName() {
		return HufName;
	}

	public String getShIncomeRange() {
		return ShIncomeRange;
	}

	public String getThIncomeRange() {
		return ThIncomeRange;
	}

	public String getIntroduser() {
		return Introduser;
	}

	public String getAccountSourced() {
		return AccountSourced;
	}

	public String getFhCkycNo() {
		return FhCkycNo;
	}

	public String getFhAadhaarRefNo() {
		return FhAadhaarRefNo;
	}

	public String getNoOfCoparceners() {
		return NoOfCoparceners;
	}

	public String getDateOfFormation() {
		return DateOfFormation;
	}

	public String getAncestralFlag() {
		return AncestralFlag;
	}

	public String getGenderOfKarta() {
		return GenderOfKarta;
	}

	public String getDobOfKarta() {
		return DobOfKarta;
	}

	public String getPanOfKarta() {
		return PanOfKarta;
	}

	public String getAadhaarOfKarta() {
		return AadhaarOfKarta;
	}

	public String getUpiId() {
		return UpiId;
	}

	public String getFhAadhaarVerifyFlag() {
		return FhAadhaarVerifyFlag;
	}

	public String getFhAadharrNonupdReason() {
		return FhAadharrNonupdReason;
	}

	public String getKycUpdateFlag() {
		return KycUpdateFlag;
	}

	public String getFatcaFlag() {
		return FatcaFlag;
	}

	public String getUmrn() {
		return Umrn;
	}

	public String getNachFrequency() {
		return NachFrequency;
	}

	public String getNachLimit() {
		return NachLimit;
	}

	public String getNachEffFromDate() {
		return NachEffFromDate;
	}

	public String getNachEffToDate() {
		return NachEffToDate;
	}

	public String getKraAgency() {
		return KraAgency;
	}

	public String getKraRegDate() {
		return KraRegDate;
	}

	public String getGsecIdtFlag() {
		return GsecIdtFlag;
	}

	public String getFhVid() {
		return FhVid;
	}

	public String getKartaVid() {
		return KartaVid;
	}

	public String getMaritalStatus() {
		return MaritalStatus;
	}

	public String getFormType() {
		return FormType;
	}

	public String getOldUdnNo() {
		return OldUdnNo;
	}

	public String getTradingAccountNo() {
		return TradingAccountNo;
	}

	public String getTradingBranchName() {
		return TradingBranchName;
	}

	public String getMobileRelation() {
		return MobileRelation;
	}

	public String getEmailRelation() {
		return EmailRelation;
	}

	public String getOldBranchId() {
		return OldBranchId;
	}

	public String getTSET_NO_GST() {
		return tSET_NO_GST;
	}

	public String getActive() {
		return Active;
	}

	public String getFreeze() {
		return Freeze;
	}

	public String getInfoComplete() {
		return InfoComplete;
	}

	public String getChecked() {
		return Checked;
	}

	public String gettSET_NO_GST() {
		return tSET_NO_GST;
	}

	public void settSET_NO_GST(String tSET_NO_GST) {
		this.tSET_NO_GST = tSET_NO_GST;
	}

	public String getEncClientValue() {
		return EncClientValue;
	}

	public String getAdacCust() {
		return AdacCust;
	}

	public String getSector() {
		return Sector;
	}

	public String getLinkedEntity() {
		return LinkedEntity;
	}

	public String getMerchantDetails() {
		return MerchantDetails;
	}

	public String getEdisFlag() {
		return EdisFlag;
	}

	public String getAccountOption() {
		return AccountOption;
	}

	public String getFatherSpouseFlag() {
		return FatherSpouseFlag;
	}

	public String getFhPanaadharlinkFlag() {
		return FhPanaadharlinkFlag;
	}

	public String getFhPanaadharlinkEffDate() {
		return FhPanaadharlinkEffDate;
	}

	public String getNeoFlag() {
		return NeoFlag;
	}

	public String getNeoActDate() {
		return NeoActDate;
	}

	public String getTcsTemplate() {
		return TcsTemplate;
	}

	public String getNetWorth() {
		return NetWorth;
	}

	public String getNetWorthDate() {
		return NetWorthDate;
	}

	public String getLeiNo() {
		return LeiNo;
	}

	public float getFhIsdCode() {
		return FhIsdCode;
	}

	public String getW8ben() {
		return W8ben;
	}

	public String getDpmModeOfOpr() {
		return DpmModeOfOpr;
	}

	public String getCommSendTo() {
		return CommSendTo;
	}

	public String getPmsFlag() {
		return PmsFlag;
	}

	public String getSignature() {
		return signature;
	}

	// Setter Methods

	public void setRefNo(String RefNo) {
		this.RefNo = RefNo;
	}

	public void setShortName(String ShortName) {
		this.ShortName = ShortName;
	}

	public void setFirstHolderName(String FirstHolderName) {
		this.FirstHolderName = FirstHolderName;
	}

	public void setBillingCategory(float BillingCategory) {
		this.BillingCategory = BillingCategory;
	}

	public void setGroupId(float GroupId) {
		this.GroupId = GroupId;
	}

	public void setAddressId(String AddressId) {
		this.AddressId = AddressId;
	}

	public void setBranchId(float BranchId) {
		this.BranchId = BranchId;
	}

	public void setDpmClientId(String DpmClientId) {
		this.DpmClientId = DpmClientId;
	}

	public void setClientType(String ClientType) {
		this.ClientType = ClientType;
	}

	public void setClientSubtype(String ClientSubtype) {
		this.ClientSubtype = ClientSubtype;
	}

	public void setClientCategory(String ClientCategory) {
		this.ClientCategory = ClientCategory;
	}

	public void setClientOccupation(String ClientOccupation) {
		this.ClientOccupation = ClientOccupation;
	}

	public void setFhFatherName(String FhFatherName) {
		this.FhFatherName = FhFatherName;
	}

	public void setContactPerson1(String ContactPerson1) {
		this.ContactPerson1 = ContactPerson1;
	}

	public void setContactPerson2(String ContactPerson2) {
		this.ContactPerson2 = ContactPerson2;
	}

	public void setBpId(String BpId) {
		this.BpId = BpId;
	}

	public void setAddressPreferenceFlag(String AddressPreferenceFlag) {
		this.AddressPreferenceFlag = AddressPreferenceFlag;
	}

	public void setActivationDatetime(String ActivationDatetime) {
		this.ActivationDatetime = ActivationDatetime;
	}

	public void setFhPanNo(String FhPanNo) {
		this.FhPanNo = FhPanNo;
	}

	public void setNgIndicator(String NgIndicator) {
		this.NgIndicator = NgIndicator;
	}

	public void setNgName(String NgName) {
		this.NgName = NgName;
	}

	public void setDobMinor(String DobMinor) {
		this.DobMinor = DobMinor;
	}

	public void setNgAddressId(String NgAddressId) {
		this.NgAddressId = NgAddressId;
	}

	public void setFreeCredit(String FreeCredit) {
		this.FreeCredit = FreeCredit;
	}

	public void setBankAddressId(String BankAddressId) {
		this.BankAddressId = BankAddressId;
	}

	public void setSebiRegistrationNo(String SebiRegistrationNo) {
		this.SebiRegistrationNo = SebiRegistrationNo;
	}

	public void setStatus(String Status) {
		this.Status = Status;
	}

	public void setStatusChangeReason(String StatusChangeReason) {
		this.StatusChangeReason = StatusChangeReason;
	}

	public void setAccountClosureDate(String AccountClosureDate) {
		this.AccountClosureDate = AccountClosureDate;
	}

	public void setCcId(String CcId) {
		this.CcId = CcId;
	}

	public void setNotes(String Notes) {
		this.Notes = Notes;
	}

	public void setForiegnAddressId(String ForiegnAddressId) {
		this.ForiegnAddressId = ForiegnAddressId;
	}

	public void setBatchNumber(String BatchNumber) {
		this.BatchNumber = BatchNumber;
	}

	public void setLineNo(String LineNo) {
		this.LineNo = LineNo;
	}

	public void setBankAddressId2(String BankAddressId2) {
		this.BankAddressId2 = BankAddressId2;
	}

	public void setDiscount(String Discount) {
		this.Discount = Discount;
	}

	public void setCreditDays(String CreditDays) {
		this.CreditDays = CreditDays;
	}

	public void setInterestRate(String InterestRate) {
		this.InterestRate = InterestRate;
	}

	public void setPin(String Pin) {
		this.Pin = Pin;
	}

	public void setPinIntimation(String PinIntimation) {
		this.PinIntimation = PinIntimation;
	}

	public void setWebEnabled(String WebEnabled) {
		this.WebEnabled = WebEnabled;
	}

	public void setTin(String Tin) {
		this.Tin = Tin;
	}

	public void setSoaEmail(String SoaEmail) {
		this.SoaEmail = SoaEmail;
	}

	public void setSohEmail(String SohEmail) {
		this.SohEmail = SohEmail;
	}

	public void setBillingEmail(String BillingEmail) {
		this.BillingEmail = BillingEmail;
	}

	public void setHoldValue(String HoldValue) {
		this.HoldValue = HoldValue;
	}

	public void setMakerId(float MakerId) {
		this.MakerId = MakerId;
	}

	public void setMakerDatetime(String MakerDatetime) {
		this.MakerDatetime = MakerDatetime;
	}

	public void setCheckerId(String CheckerId) {
		this.CheckerId = CheckerId;
	}

	public void setCheckerDatetime(String CheckerDatetime) {
		this.CheckerDatetime = CheckerDatetime;
	}

	public void setCancelId(String CancelId) {
		this.CancelId = CancelId;
	}

	public void setCancelDatetime(String CancelDatetime) {
		this.CancelDatetime = CancelDatetime;
	}

	public void setFreezeReason(String FreezeReason) {
		this.FreezeReason = FreezeReason;
	}

	public void setModeOfOperation(String ModeOfOperation) {
		this.ModeOfOperation = ModeOfOperation;
	}

	public void setFaxIndeminity(String FaxIndeminity) {
		this.FaxIndeminity = FaxIndeminity;
	}

	public void setCustId(String CustId) {
		this.CustId = CustId;
	}

	public void setNomineesGuardianAddId(String NomineesGuardianAddId) {
		this.NomineesGuardianAddId = NomineesGuardianAddId;
	}

	public void setBirthDate(String BirthDate) {
		this.BirthDate = BirthDate;
	}

	public void setClientRejected(String ClientRejected) {
		this.ClientRejected = ClientRejected;
	}

	public void setClientRejectedDate(String ClientRejectedDate) {
		this.ClientRejectedDate = ClientRejectedDate;
	}

	public void setInwardDate(String InwardDate) {
		this.InwardDate = InwardDate;
	}

	public void setIntRejCode(String IntRejCode) {
		this.IntRejCode = IntRejCode;
	}

	public void setBankingClient(String BankingClient) {
		this.BankingClient = BankingClient;
	}

	public void setExtraCloseCharges(String ExtraCloseCharges) {
		this.ExtraCloseCharges = ExtraCloseCharges;
	}

	public void setRefClientId(String RefClientId) {
		this.RefClientId = RefClientId;
	}

	public void setSmsAlert(String SmsAlert) {
		this.SmsAlert = SmsAlert;
	}

	public void setMobileNo(String MobileNo) {
		this.MobileNo = MobileNo;
	}

	public void setExportClient(String ExportClient) {
		this.ExportClient = ExportClient;
	}

	public void setDocumentRenewDate(String DocumentRenewDate) {
		this.DocumentRenewDate = DocumentRenewDate;
	}

	public void setOutstandingBalance(String OutstandingBalance) {
		this.OutstandingBalance = OutstandingBalance;
	}

	public void setDebitSmsAlert(String DebitSmsAlert) {
		this.DebitSmsAlert = DebitSmsAlert;
	}

	public void setCreditSmsAlert(String CreditSmsAlert) {
		this.CreditSmsAlert = CreditSmsAlert;
	}

	public void setOverdueSmsAlert(String OverdueSmsAlert) {
		this.OverdueSmsAlert = OverdueSmsAlert;
	}

	public void setFailedSmsAlert(String FailedSmsAlert) {
		this.FailedSmsAlert = FailedSmsAlert;
	}

	public void setDematConfSmsAlert(String DematConfSmsAlert) {
		this.DematConfSmsAlert = DematConfSmsAlert;
	}

	public void setDematRejSmsAlert(String DematRejSmsAlert) {
		this.DematRejSmsAlert = DematRejSmsAlert;
	}

	public void setDebitEmailAlert(String DebitEmailAlert) {
		this.DebitEmailAlert = DebitEmailAlert;
	}

	public void setCreditEmailAlert(String CreditEmailAlert) {
		this.CreditEmailAlert = CreditEmailAlert;
	}

	public void setOverdueEmailAlert(String OverdueEmailAlert) {
		this.OverdueEmailAlert = OverdueEmailAlert;
	}

	public void setFailedEmailAlert(String FailedEmailAlert) {
		this.FailedEmailAlert = FailedEmailAlert;
	}

	public void setDematConfEmailAlert(String DematConfEmailAlert) {
		this.DematConfEmailAlert = DematConfEmailAlert;
	}

	public void setDematRejEmailAlert(String DematRejEmailAlert) {
		this.DematRejEmailAlert = DematRejEmailAlert;
	}

	public void setSmsEmail(String SmsEmail) {
		this.SmsEmail = SmsEmail;
	}

	public void setDeposit(String Deposit) {
		this.Deposit = Deposit;
	}

	public void setPoaAddressId(String PoaAddressId) {
		this.PoaAddressId = PoaAddressId;
	}

	public void setPoaName(String PoaName) {
		this.PoaName = PoaName;
	}

	public void setPoaFatherName(String PoaFatherName) {
		this.PoaFatherName = PoaFatherName;
	}

	public void setPoaPan(String PoaPan) {
		this.PoaPan = PoaPan;
	}

	public void setLobCategory(String LobCategory) {
		this.LobCategory = LobCategory;
	}

	public void setRangeWiseDiscount(String RangeWiseDiscount) {
		this.RangeWiseDiscount = RangeWiseDiscount;
	}

	public void setBillWiseDiscount(String BillWiseDiscount) {
		this.BillWiseDiscount = BillWiseDiscount;
	}

	public void setInterestWaiver(String InterestWaiver) {
		this.InterestWaiver = InterestWaiver;
	}

	public void setIncome(float Income) {
		this.Income = Income;
	}

	public void setAdditionalInfo(String AdditionalInfo) {
		this.AdditionalInfo = AdditionalInfo;
	}

	public void setInternetTrading(String InternetTrading) {
		this.InternetTrading = InternetTrading;
	}

	public void setSearchFirstHolderName(String SearchFirstHolderName) {
		this.SearchFirstHolderName = SearchFirstHolderName;
	}

	public void setAmcAfterMonths(String AmcAfterMonths) {
		this.AmcAfterMonths = AmcAfterMonths;
	}

	public void setRewardsSchemeEligible(String RewardsSchemeEligible) {
		this.RewardsSchemeEligible = RewardsSchemeEligible;
	}

	public void setRewardPointsAvailable(String RewardPointsAvailable) {
		this.RewardPointsAvailable = RewardPointsAvailable;
	}

	public void setDefaulterList(String DefaulterList) {
		this.DefaulterList = DefaulterList;
	}

	public void setAccActivateSmsAlert(String AccActivateSmsAlert) {
		this.AccActivateSmsAlert = AccActivateSmsAlert;
	}

	public void setAccFreezeSmsAlert(String AccFreezeSmsAlert) {
		this.AccFreezeSmsAlert = AccFreezeSmsAlert;
	}

	public void setPledgedSmsAlert(String PledgedSmsAlert) {
		this.PledgedSmsAlert = PledgedSmsAlert;
	}

	public void setPledgeInvokeSmsAlert(String PledgeInvokeSmsAlert) {
		this.PledgeInvokeSmsAlert = PledgeInvokeSmsAlert;
	}

	public void setCorpActSmsAlert(String CorpActSmsAlert) {
		this.CorpActSmsAlert = CorpActSmsAlert;
	}

	public void setAccActivateEmailAlert(String AccActivateEmailAlert) {
		this.AccActivateEmailAlert = AccActivateEmailAlert;
	}

	public void setAccFreezeEmailAlert(String AccFreezeEmailAlert) {
		this.AccFreezeEmailAlert = AccFreezeEmailAlert;
	}

	public void setPledgedEmailAlert(String PledgedEmailAlert) {
		this.PledgedEmailAlert = PledgedEmailAlert;
	}

	public void setPledgeInvokeEmailAlert(String PledgeInvokeEmailAlert) {
		this.PledgeInvokeEmailAlert = PledgeInvokeEmailAlert;
	}

	public void setCorpActEmailAlert(String CorpActEmailAlert) {
		this.CorpActEmailAlert = CorpActEmailAlert;
	}

	public void setTransLimit(String TransLimit) {
		this.TransLimit = TransLimit;
	}

	public void setTransLimitPerTarget(String TransLimitPerTarget) {
		this.TransLimitPerTarget = TransLimitPerTarget;
	}

	public void setTransLimitPerSettlement(String TransLimitPerSettlement) {
		this.TransLimitPerSettlement = TransLimitPerSettlement;
	}

	public void setUpdIns(String UpdIns) {
		this.UpdIns = UpdIns;
	}

	public void setNmIndicator(String NmIndicator) {
		this.NmIndicator = NmIndicator;
	}

	public void setNmDob(String NmDob) {
		this.NmDob = NmDob;
	}

	public void setFirstHolderMapin(String FirstHolderMapin) {
		this.FirstHolderMapin = FirstHolderMapin;
	}

	public void setFirstHolderMob(String FirstHolderMob) {
		this.FirstHolderMob = FirstHolderMob;
	}

	public void setFirstHolderSmsFlag(String FirstHolderSmsFlag) {
		this.FirstHolderSmsFlag = FirstHolderSmsFlag;
	}

	public void setFirstHolderPoaFlag(String FirstHolderPoaFlag) {
		this.FirstHolderPoaFlag = FirstHolderPoaFlag;
	}

	public void setRmCode(String RmCode) {
		this.RmCode = RmCode;
	}

	public void setCorpCode(String CorpCode) {
		this.CorpCode = CorpCode;
	}

	public void setSegment(String Segment) {
		this.Segment = Segment;
	}

	public void setClassification(String Classification) {
		this.Classification = Classification;
	}

	public void setSubClassification(String SubClassification) {
		this.SubClassification = SubClassification;
	}

	public void setLeadGenerator(String LeadGenerator) {
		this.LeadGenerator = LeadGenerator;
	}

	public void setLeadConverter(String LeadConverter) {
		this.LeadConverter = LeadConverter;
	}

	public void setSourceCode(String SourceCode) {
		this.SourceCode = SourceCode;
	}

	public void setUinStatusFh(String UinStatusFh) {
		this.UinStatusFh = UinStatusFh;
	}

	public void setUinNoFh(String UinNoFh) {
		this.UinNoFh = UinNoFh;
	}

	public void setUinStatusSh(String UinStatusSh) {
		this.UinStatusSh = UinStatusSh;
	}

	public void setUinNoSh(String UinNoSh) {
		this.UinNoSh = UinNoSh;
	}

	public void setUinStatusTh(String UinStatusTh) {
		this.UinStatusTh = UinStatusTh;
	}

	public void setUinNoTh(String UinNoTh) {
		this.UinNoTh = UinNoTh;
	}

	public void setRmEffectiveDate(String RmEffectiveDate) {
		this.RmEffectiveDate = RmEffectiveDate;
	}

	public void setCorpCodeEffectiveDate(String CorpCodeEffectiveDate) {
		this.CorpCodeEffectiveDate = CorpCodeEffectiveDate;
	}

	public void setSegmentEffectiveDate(String SegmentEffectiveDate) {
		this.SegmentEffectiveDate = SegmentEffectiveDate;
	}

	public void setClassificationEffectiveDate(String ClassificationEffectiveDate) {
		this.ClassificationEffectiveDate = ClassificationEffectiveDate;
	}

	public void setHomeBranchEffectiveDate(String HomeBranchEffectiveDate) {
		this.HomeBranchEffectiveDate = HomeBranchEffectiveDate;
	}

	public void setForCorrAddressFlag(String ForCorrAddressFlag) {
		this.ForCorrAddressFlag = ForCorrAddressFlag;
	}

	public void setFirstHolderEmail(String FirstHolderEmail) {
		this.FirstHolderEmail = FirstHolderEmail;
	}

	public void setOptedDponnet(String OptedDponnet) {
		this.OptedDponnet = OptedDponnet;
	}

	public void setValueLimitPerSettlement(String ValueLimitPerSettlement) {
		this.ValueLimitPerSettlement = ValueLimitPerSettlement;
	}

	public void setLastTranDate(String LastTranDate) {
		this.LastTranDate = LastTranDate;
	}

	public void setWebcisPwd(String WebcisPwd) {
		this.WebcisPwd = WebcisPwd;
	}

	public void setWebcisEnabled(String WebcisEnabled) {
		this.WebcisEnabled = WebcisEnabled;
	}

	public void setCcrRefNo(String CcrRefNo) {
		this.CcrRefNo = CcrRefNo;
	}

	public void setFirstHolderPanFlag(String FirstHolderPanFlag) {
		this.FirstHolderPanFlag = FirstHolderPanFlag;
	}

	public void setAddChnDate(String AddChnDate) {
		this.AddChnDate = AddChnDate;
	}

	public void setCustomerHash(String CustomerHash) {
		this.CustomerHash = CustomerHash;
	}

	public void setCustodyCode(String CustodyCode) {
		this.CustodyCode = CustodyCode;
	}

	public void setCoreBankType(String CoreBankType) {
		this.CoreBankType = CoreBankType;
	}

	public void setThumbImpression(String ThumbImpression) {
		this.ThumbImpression = ThumbImpression;
	}

	public void setSameAsLoAddress(String SameAsLoAddress) {
		this.SameAsLoAddress = SameAsLoAddress;
	}

	public void setShAddressId(String ShAddressId) {
		this.ShAddressId = ShAddressId;
	}

	public void setThAddressId(String ThAddressId) {
		this.ThAddressId = ThAddressId;
	}

	public void setSameAsLoAddressNg(String SameAsLoAddressNg) {
		this.SameAsLoAddressNg = SameAsLoAddressNg;
	}

	public void setSignFileSize(String SignFileSize) {
		this.SignFileSize = SignFileSize;
	}

	public void setCarExport(String CarExport) {
		this.CarExport = CarExport;
	}

	public void setFhNomineeName(String FhNomineeName) {
		this.FhNomineeName = FhNomineeName;
	}

	public void setFhNomineeAddressId(String FhNomineeAddressId) {
		this.FhNomineeAddressId = FhNomineeAddressId;
	}

	public void setFhSexCode(String FhSexCode) {
		this.FhSexCode = FhSexCode;
	}

	public void setFhMinor(String FhMinor) {
		this.FhMinor = FhMinor;
	}

	public void setFhGuardRel(String FhGuardRel) {
		this.FhGuardRel = FhGuardRel;
	}

	public void setFhIdentifier(String FhIdentifier) {
		this.FhIdentifier = FhIdentifier;
	}

	public void setFhItCircle(String FhItCircle) {
		this.FhItCircle = FhItCircle;
	}

	public void setShGuardAddressId(String ShGuardAddressId) {
		this.ShGuardAddressId = ShGuardAddressId;
	}

	public void setThGuardAddressId(String ThGuardAddressId) {
		this.ThGuardAddressId = ThGuardAddressId;
	}

	public void setFhCombiCover(String FhCombiCover) {
		this.FhCombiCover = FhCombiCover;
	}

	public void setFhCommFlag(String FhCommFlag) {
		this.FhCommFlag = FhCommFlag;
	}

	public void setInternetTradingLinkDt(String InternetTradingLinkDt) {
		this.InternetTradingLinkDt = InternetTradingLinkDt;
	}

	public void setCarBatchNo(String CarBatchNo) {
		this.CarBatchNo = CarBatchNo;
	}

	public void setInfinityLinking(String InfinityLinking) {
		this.InfinityLinking = InfinityLinking;
	}

	public void setDematCancelSmsAlert(String DematCancelSmsAlert) {
		this.DematCancelSmsAlert = DematCancelSmsAlert;
	}

	public void setDebitCancelSmsAlert(String DebitCancelSmsAlert) {
		this.DebitCancelSmsAlert = DebitCancelSmsAlert;
	}

	public void setPledgeClosureSmsAlert(String PledgeClosureSmsAlert) {
		this.PledgeClosureSmsAlert = PledgeClosureSmsAlert;
	}

	public void setPledgeCancelSmsAlert(String PledgeCancelSmsAlert) {
		this.PledgeCancelSmsAlert = PledgeCancelSmsAlert;
	}

	public void setPledgeFailedSmsAlert(String PledgeFailedSmsAlert) {
		this.PledgeFailedSmsAlert = PledgeFailedSmsAlert;
	}

	public void setLastUpdDt(String LastUpdDt) {
		this.LastUpdDt = LastUpdDt;
	}

	public void setSoaCease(String SoaCease) {
		this.SoaCease = SoaCease;
	}

	public void setSoaCeaseDate(String SoaCeaseDate) {
		this.SoaCeaseDate = SoaCeaseDate;
	}

	public void setVisuallyChallenged(String VisuallyChallenged) {
		this.VisuallyChallenged = VisuallyChallenged;
	}

	public void setCommodityAc(String CommodityAc) {
		this.CommodityAc = CommodityAc;
	}

	public void setNomineeSignFileSize(String NomineeSignFileSize) {
		this.NomineeSignFileSize = NomineeSignFileSize;
	}

	public void setInfopoolFlag(String InfopoolFlag) {
		this.InfopoolFlag = InfopoolFlag;
	}

	public void setCustUserId(String CustUserId) {
		this.CustUserId = CustUserId;
	}

	public void setIncomeRange(String IncomeRange) {
		this.IncomeRange = IncomeRange;
	}

	public void setNomineeFlag(String NomineeFlag) {
		this.NomineeFlag = NomineeFlag;
	}

	public void setPromotionalSmsAlert(String PromotionalSmsAlert) {
		this.PromotionalSmsAlert = PromotionalSmsAlert;
	}

	public void setSdoClientType(String SdoClientType) {
		this.SdoClientType = SdoClientType;
	}

	public void setSdoSegType(String SdoSegType) {
		this.SdoSegType = SdoSegType;
	}

	public void setSdoMemberCode(String SdoMemberCode) {
		this.SdoMemberCode = SdoMemberCode;
	}

	public void setSdoMemberType(String SdoMemberType) {
		this.SdoMemberType = SdoMemberType;
	}

	public void setSdoSnvid(String SdoSnvid) {
		this.SdoSnvid = SdoSnvid;
	}

	public void setSdoSdvid(String SdoSdvid) {
		this.SdoSdvid = SdoSdvid;
	}

	public void setClientAlertMsg(String ClientAlertMsg) {
		this.ClientAlertMsg = ClientAlertMsg;
	}

	public void setClientLinkType(String ClientLinkType) {
		this.ClientLinkType = ClientLinkType;
	}

	public void setFirstHolderAuthFlag(String FirstHolderAuthFlag) {
		this.FirstHolderAuthFlag = FirstHolderAuthFlag;
	}

	public void setSecondHolderAuthFlag(String SecondHolderAuthFlag) {
		this.SecondHolderAuthFlag = SecondHolderAuthFlag;
	}

	public void setThirdHolderAuthFlag(String ThirdHolderAuthFlag) {
		this.ThirdHolderAuthFlag = ThirdHolderAuthFlag;
	}

	public void setTpAddressFlag(String TpAddressFlag) {
		this.TpAddressFlag = TpAddressFlag;
	}

	public void setLastDrtranDate(String LastDrtranDate) {
		this.LastDrtranDate = LastDrtranDate;
	}

	public void setEmailAdressTo(String EmailAdressTo) {
		this.EmailAdressTo = EmailAdressTo;
	}

	public void setEmailAdressCc(String EmailAdressCc) {
		this.EmailAdressCc = EmailAdressCc;
	}

	public void setEmailAdressBcc(String EmailAdressBcc) {
		this.EmailAdressBcc = EmailAdressBcc;
	}

	public void setFhKraFlag(String FhKraFlag) {
		this.FhKraFlag = FhKraFlag;
	}

	public void setFhKraId(String FhKraId) {
		this.FhKraId = FhKraId;
	}

	public void setBsda(String Bsda) {
		this.Bsda = Bsda;
	}

	public void setRgessFlag(String RgessFlag) {
		this.RgessFlag = RgessFlag;
	}

	public void setFhAadhaar(String FhAadhaar) {
		this.FhAadhaar = FhAadhaar;
	}

	public void setRgessStatus(String RgessStatus) {
		this.RgessStatus = RgessStatus;
	}

	public void setRgessStatusDate(String RgessStatusDate) {
		this.RgessStatusDate = RgessStatusDate;
	}

	public void setRgessReasonCode(String RgessReasonCode) {
		this.RgessReasonCode = RgessReasonCode;
	}

	public void setDisNotRequired(String DisNotRequired) {
		this.DisNotRequired = DisNotRequired;
	}

	public void setSdoExchange(String SdoExchange) {
		this.SdoExchange = SdoExchange;
	}

	public void setSodPledgeeId(String SodPledgeeId) {
		this.SodPledgeeId = SodPledgeeId;
	}

	public void setFhRtaEmailFlag(String FhRtaEmailFlag) {
		this.FhRtaEmailFlag = FhRtaEmailFlag;
	}

	public void setSiPledgeConfirm(String SiPledgeConfirm) {
		this.SiPledgeConfirm = SiPledgeConfirm;
	}

	public void setAltEmailId(String AltEmailId) {
		this.AltEmailId = AltEmailId;
	}

	public void setEstmtFlag(String EstmtFlag) {
		this.EstmtFlag = EstmtFlag;
	}

	public void setFhFamilyEmail(String FhFamilyEmail) {
		this.FhFamilyEmail = FhFamilyEmail;
	}

	public void setFhFamilyMob(String FhFamilyMob) {
		this.FhFamilyMob = FhFamilyMob;
	}

	public void setSaral(String Saral) {
		this.Saral = Saral;
	}

	public void setPositiveConf(String PositiveConf) {
		this.PositiveConf = PositiveConf;
	}

	public void setNoAddressProof(String NoAddressProof) {
		this.NoAddressProof = NoAddressProof;
	}

	public void setDematCreateSmsAlert(String DematCreateSmsAlert) {
		this.DematCreateSmsAlert = DematCreateSmsAlert;
	}

	public void setPledgeCreateSmsAlert(String PledgeCreateSmsAlert) {
		this.PledgeCreateSmsAlert = PledgeCreateSmsAlert;
	}

	public void setPledgeCloseSmsAlert(String PledgeCloseSmsAlert) {
		this.PledgeCloseSmsAlert = PledgeCloseSmsAlert;
	}

	public void setInstClientId(String InstClientId) {
		this.InstClientId = InstClientId;
	}

	public void setFhUcic(String FhUcic) {
		this.FhUcic = FhUcic;
	}

	public void setLeadId(String LeadId) {
		this.LeadId = LeadId;
	}

	public void setPepFlag(String PepFlag) {
		this.PepFlag = PepFlag;
	}

	public void setRiskCategory(String RiskCategory) {
		this.RiskCategory = RiskCategory;
	}

	public void setFhCityOfBirth(String FhCityOfBirth) {
		this.FhCityOfBirth = FhCityOfBirth;
	}

	public void setFhCountryOfBirth(String FhCountryOfBirth) {
		this.FhCountryOfBirth = FhCountryOfBirth;
	}

	public void setFhFatcaFlag(String FhFatcaFlag) {
		this.FhFatcaFlag = FhFatcaFlag;
	}

	public void setCustodialFlag(String CustodialFlag) {
		this.CustodialFlag = CustodialFlag;
	}

	public void setFhAltEmailId(String FhAltEmailId) {
		this.FhAltEmailId = FhAltEmailId;
	}

	public void setSharePerEqFlag(String SharePerEqFlag) {
		this.SharePerEqFlag = SharePerEqFlag;
	}

	public void setNmIndicatorCode(String NmIndicatorCode) {
		this.NmIndicatorCode = NmIndicatorCode;
	}

	public void setSnAddSameAsFnAdd(String SnAddSameAsFnAdd) {
		this.SnAddSameAsFnAdd = SnAddSameAsFnAdd;
	}

	public void setSnAddId(String SnAddId) {
		this.SnAddId = SnAddId;
	}

	public void setTnAddSameAsFnAdd(String TnAddSameAsFnAdd) {
		this.TnAddSameAsFnAdd = TnAddSameAsFnAdd;
	}

	public void setTnAddId(String TnAddId) {
		this.TnAddId = TnAddId;
	}

	public void setTnGuardianAddId(String TnGuardianAddId) {
		this.TnGuardianAddId = TnGuardianAddId;
	}

	public void setAnnualReport(String AnnualReport) {
		this.AnnualReport = AnnualReport;
	}

	public void setRematCreateSmsAlert(String RematCreateSmsAlert) {
		this.RematCreateSmsAlert = RematCreateSmsAlert;
	}

	public void setRematRejectSmsAlert(String RematRejectSmsAlert) {
		this.RematRejectSmsAlert = RematRejectSmsAlert;
	}

	public void setPledgecreateRejectSmsAlert(String PledgecreateRejectSmsAlert) {
		this.PledgecreateRejectSmsAlert = PledgecreateRejectSmsAlert;
	}

	public void setPledgecloseRejectSmsAlert(String PledgecloseRejectSmsAlert) {
		this.PledgecloseRejectSmsAlert = PledgecloseRejectSmsAlert;
	}

	public void setGstNo(String GstNo) {
		this.GstNo = GstNo;
	}

	public void setGstReg(String GstReg) {
		this.GstReg = GstReg;
	}

	public void setSpcExemp(String SpcExemp) {
		this.SpcExemp = SpcExemp;
	}

	public void setRelParty(String RelParty) {
		this.RelParty = RelParty;
	}

	public void setRelPartyCat(String RelPartyCat) {
		this.RelPartyCat = RelPartyCat;
	}

	public void setEmailAlertToRm(String EmailAlertToRm) {
		this.EmailAlertToRm = EmailAlertToRm;
	}

	public void setHufName(String HufName) {
		this.HufName = HufName;
	}

	public void setShIncomeRange(String ShIncomeRange) {
		this.ShIncomeRange = ShIncomeRange;
	}

	public void setThIncomeRange(String ThIncomeRange) {
		this.ThIncomeRange = ThIncomeRange;
	}

	public void setIntroduser(String Introduser) {
		this.Introduser = Introduser;
	}

	public void setAccountSourced(String AccountSourced) {
		this.AccountSourced = AccountSourced;
	}

	public void setFhCkycNo(String FhCkycNo) {
		this.FhCkycNo = FhCkycNo;
	}

	public void setFhAadhaarRefNo(String FhAadhaarRefNo) {
		this.FhAadhaarRefNo = FhAadhaarRefNo;
	}

	public void setNoOfCoparceners(String NoOfCoparceners) {
		this.NoOfCoparceners = NoOfCoparceners;
	}

	public void setDateOfFormation(String DateOfFormation) {
		this.DateOfFormation = DateOfFormation;
	}

	public void setAncestralFlag(String AncestralFlag) {
		this.AncestralFlag = AncestralFlag;
	}

	public void setGenderOfKarta(String GenderOfKarta) {
		this.GenderOfKarta = GenderOfKarta;
	}

	public void setDobOfKarta(String DobOfKarta) {
		this.DobOfKarta = DobOfKarta;
	}

	public void setPanOfKarta(String PanOfKarta) {
		this.PanOfKarta = PanOfKarta;
	}

	public void setAadhaarOfKarta(String AadhaarOfKarta) {
		this.AadhaarOfKarta = AadhaarOfKarta;
	}

	public void setUpiId(String UpiId) {
		this.UpiId = UpiId;
	}

	public void setFhAadhaarVerifyFlag(String FhAadhaarVerifyFlag) {
		this.FhAadhaarVerifyFlag = FhAadhaarVerifyFlag;
	}

	public void setFhAadharrNonupdReason(String FhAadharrNonupdReason) {
		this.FhAadharrNonupdReason = FhAadharrNonupdReason;
	}

	public void setKycUpdateFlag(String KycUpdateFlag) {
		this.KycUpdateFlag = KycUpdateFlag;
	}

	public void setFatcaFlag(String FatcaFlag) {
		this.FatcaFlag = FatcaFlag;
	}

	public void setUmrn(String Umrn) {
		this.Umrn = Umrn;
	}

	public void setNachFrequency(String NachFrequency) {
		this.NachFrequency = NachFrequency;
	}

	public void setNachLimit(String NachLimit) {
		this.NachLimit = NachLimit;
	}

	public void setNachEffFromDate(String NachEffFromDate) {
		this.NachEffFromDate = NachEffFromDate;
	}

	public void setNachEffToDate(String NachEffToDate) {
		this.NachEffToDate = NachEffToDate;
	}

	public void setKraAgency(String KraAgency) {
		this.KraAgency = KraAgency;
	}

	public void setKraRegDate(String KraRegDate) {
		this.KraRegDate = KraRegDate;
	}

	public void setGsecIdtFlag(String GsecIdtFlag) {
		this.GsecIdtFlag = GsecIdtFlag;
	}

	public void setFhVid(String FhVid) {
		this.FhVid = FhVid;
	}

	public void setKartaVid(String KartaVid) {
		this.KartaVid = KartaVid;
	}

	public void setMaritalStatus(String MaritalStatus) {
		this.MaritalStatus = MaritalStatus;
	}

	public void setFormType(String FormType) {
		this.FormType = FormType;
	}

	public void setOldUdnNo(String OldUdnNo) {
		this.OldUdnNo = OldUdnNo;
	}

	public void setTradingAccountNo(String TradingAccountNo) {
		this.TradingAccountNo = TradingAccountNo;
	}

	public void setTradingBranchName(String TradingBranchName) {
		this.TradingBranchName = TradingBranchName;
	}

	public void setMobileRelation(String MobileRelation) {
		this.MobileRelation = MobileRelation;
	}

	public void setEmailRelation(String EmailRelation) {
		this.EmailRelation = EmailRelation;
	}

	public void setOldBranchId(String OldBranchId) {
		this.OldBranchId = OldBranchId;
	}

	public void setTSET_NO_GST(String tSET_NO_GST) {
		this.tSET_NO_GST = tSET_NO_GST;
	}

	public void setActive(String Active) {
		this.Active = Active;
	}

	public void setFreeze(String Freeze) {
		this.Freeze = Freeze;
	}

	public void setInfoComplete(String InfoComplete) {
		this.InfoComplete = InfoComplete;
	}

	public void setChecked(String Checked) {
		this.Checked = Checked;
	}

	public void setEncClientValue(String EncClientValue) {
		this.EncClientValue = EncClientValue;
	}

	public void setAdacCust(String AdacCust) {
		this.AdacCust = AdacCust;
	}

	public void setSector(String Sector) {
		this.Sector = Sector;
	}

	public void setLinkedEntity(String LinkedEntity) {
		this.LinkedEntity = LinkedEntity;
	}

	public void setMerchantDetails(String MerchantDetails) {
		this.MerchantDetails = MerchantDetails;
	}

	public void setEdisFlag(String EdisFlag) {
		this.EdisFlag = EdisFlag;
	}

	public void setAccountOption(String AccountOption) {
		this.AccountOption = AccountOption;
	}

	public void setFatherSpouseFlag(String FatherSpouseFlag) {
		this.FatherSpouseFlag = FatherSpouseFlag;
	}

	public void setFhPanaadharlinkFlag(String FhPanaadharlinkFlag) {
		this.FhPanaadharlinkFlag = FhPanaadharlinkFlag;
	}

	public void setFhPanaadharlinkEffDate(String FhPanaadharlinkEffDate) {
		this.FhPanaadharlinkEffDate = FhPanaadharlinkEffDate;
	}

	public void setNeoFlag(String NeoFlag) {
		this.NeoFlag = NeoFlag;
	}

	public void setNeoActDate(String NeoActDate) {
		this.NeoActDate = NeoActDate;
	}

	public void setTcsTemplate(String TcsTemplate) {
		this.TcsTemplate = TcsTemplate;
	}

	public void setNetWorth(String NetWorth) {
		this.NetWorth = NetWorth;
	}

	public void setNetWorthDate(String NetWorthDate) {
		this.NetWorthDate = NetWorthDate;
	}

	public void setLeiNo(String LeiNo) {
		this.LeiNo = LeiNo;
	}

	public void setFhIsdCode(float FhIsdCode) {
		this.FhIsdCode = FhIsdCode;
	}

	public void setW8ben(String W8ben) {
		this.W8ben = W8ben;
	}

	public void setDpmModeOfOpr(String DpmModeOfOpr) {
		this.DpmModeOfOpr = DpmModeOfOpr;
	}

	public void setCommSendTo(String CommSendTo) {
		this.CommSendTo = CommSendTo;
	}

	public void setPmsFlag(String PmsFlag) {
		this.PmsFlag = PmsFlag;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}
}
