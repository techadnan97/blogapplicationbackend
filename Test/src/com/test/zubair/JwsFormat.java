package com.test.zubair;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwsFormat {
	private static final int VAR1 = 'a';
	private static final int VAR2 = 'z';
	private static final int VAR3 = 'A';
	private static final int VAR4 = 'Z';
	private static final int ZERO = '0';
	private static final int NINE = '9';
	private static final byte[] IVECTOR = "1234567890123456".getBytes();

	public static void main(String[] args) throws Exception {

		final String jwsToken = createToken(new HashMap<>(), "adnan");
		System.out.println(jwsToken);
		final String symmetricKeyValue = generateAlphaNumericKey(32);
		final String publicKey = "C:\\Users\\mdadn\\OneDrive\\Desktop\\Test\\api-uat_hdfcbank_com.cer";
		final byte[] symmetricKeyEncryptedValue =encrypt(symmetricKeyValue, publicKey);
		
		System.out.println(symmetricKeyValue);
		byte[] aesEncryptionData = encrypt(jwsToken, symmetricKeyValue.getBytes());
		System.out.println(aesEncryptionData);

		final String requestSignatureEncryptedValue = new String(encode(aesEncryptionData));
		System.out.println("requestSignatureEncryptedValue==>[" + requestSignatureEncryptedValue);
		MultiValueMap<String, String> body = new LinkedMultiValueMap<String, String>();
		body.add("RequestEncryptedValue", requestSignatureEncryptedValue);
		body.add("SymmetricKeyEncryptedValue", Base64.getEncoder().encodeToString(symmetricKeyEncryptedValue));
		body.add("Scope", "NDML");
		body.add("TransactionId", "6789999");
		body.add("OAuthTokenValue", "");
		body.add("Id-token-jwt", "");
		//JSONObject jo = new JSONObject(map);
		RestTemplate restTemplate= new RestTemplate();
		ResponseEntity<String> postForEntity = restTemplate.postForEntity(
			  "https://api-uat.hdfcbank.com/api/v1/dpSec-dematAccOpening", body,
			  String.class);
			 
		System.out.println(postForEntity);
	}

	private static String createToken(Map<String, Object> claims, String subject) throws Exception {
		PrivateKey readPublicKey = readPublicKey("C:\\Users\\mdadn\\OneDrive\\Desktop\\Test\\DAC.p12");
		TngAddress1 tng = new TngAddress1();
		ObjectMapper Obj = new ObjectMapper();
		String writeValueAsString = "{ \"DPSecureGetAccountOpeningRequestDTO\": { \"requestString\": { \"RefNo\": \"123465644\", \"ShortName\": \"namrata\", \"FirstHolderName\": \"Namrata Harishchandra Foferkar\", \"BillingCategory\": 1, \"GroupId\": 1, \"AddressId\": null, \"BranchId\": 1, \"DpmClientId\": null, \"ClientType\": \"01\", \"ClientSubtype\": \"01\", \"ClientCategory\": \"02\", \"ClientOccupation\": \"08\", \"FhFatherName\": null, \"ContactPerson1\": null, \"ContactPerson2\": null, \"BpId\": null, \"AddressPreferenceFlag\": \"Y\", \"ActivationDatetime\": null, \"FhPanNo\": \"NAMPA1234E\", \"NgIndicator\": \"O\", \"NgName\": null, \"DobMinor\": null, \"NgAddressId\": null, \"FreeCredit\": \"Y\", \"BankAddressId\": null, \"SebiRegistrationNo\": null, \"Status\": \"Not Authorized\", \"StatusChangeReason\": null, \"AccountClosureDate\": null, \"CcId\": null, \"Notes\": null, \"ForiegnAddressId\": null, \"BatchNumber\": \"0\", \"LineNo\": null, \"BankAddressId2\": null, \"Discount\": null, \"CreditDays\": null, \"InterestRate\": null, \"Pin\": null, \"PinIntimation\": null, \"WebEnabled\": null, \"Tin\": null, \"SoaEmail\": \"N\", \"SohEmail\": \"N\", \"BillingEmail\": \"N\", \"HoldValue\": null, \"MakerId\": 2, \"MakerDatetime\": \"2023-03-16T10:18:03+05:30\", \"CheckerId\": null, \"CheckerDatetime\": null, \"CancelId\": null, \"CancelDatetime\": null, \"FreezeReason\": null, \"ModeOfOperation\": null, \"FaxIndeminity\": \"N\", \"CustId\": \"543533434\", \"NomineesGuardianAddId\": null, \"BirthDate\": \"1997-04-26T00:00:00+05:30\", \"ClientRejected\": \"N\", \"ClientRejectedDate\": null, \"InwardDate\": \"2023-03-31T13:57:55+05:30\", \"IntRejCode\": null, \"BankingClient\": \"Y\", \"ExtraCloseCharges\": null, \"RefClientId\": null, \"SmsAlert\": null, \"MobileNo\": null, \"ExportClient\": null, \"DocumentRenewDate\": null, \"OutstandingBalance\": null, \"DebitSmsAlert\": null, \"CreditSmsAlert\": null, \"OverdueSmsAlert\": null, \"FailedSmsAlert\": null, \"DematConfSmsAlert\": null, \"DematRejSmsAlert\": null, \"DebitEmailAlert\": null, \"CreditEmailAlert\": null, \"OverdueEmailAlert\": null, \"FailedEmailAlert\": null, \"DematConfEmailAlert\": null, \"DematRejEmailAlert\": null, \"SmsEmail\": null, \"Deposit\": null, \"PoaAddressId\": null, \"PoaName\": null, \"PoaFatherName\": null, \"PoaPan\": null, \"LobCategory\": null, \"RangeWiseDiscount\": null, \"BillWiseDiscount\": null, \"InterestWaiver\": null, \"Income\": 0, \"AdditionalInfo\": null, \"InternetTrading\": \"N\", \"SearchFirstHolderName\": null, \"AmcAfterMonths\": null, \"RewardsSchemeEligible\": \"N\", \"RewardPointsAvailable\": null, \"DefaulterList\": \"N\", \"AccActivateSmsAlert\": null, \"AccFreezeSmsAlert\": null, \"PledgedSmsAlert\": null, \"PledgeInvokeSmsAlert\": null, \"CorpActSmsAlert\": null, \"AccActivateEmailAlert\": null, \"AccFreezeEmailAlert\": null, \"PledgedEmailAlert\": null, \"PledgeInvokeEmailAlert\": null, \"CorpActEmailAlert\": null, \"TransLimit\": null, \"TransLimitPerTarget\": null, \"TransLimitPerSettlement\": null, \"UpdIns\": null, \"NmIndicator\": \"N\", \"NmDob\": null, \"FirstHolderMapin\": null, \"FirstHolderMob\": \"9004623456\", \"FirstHolderSmsFlag\": \"N\", \"FirstHolderPoaFlag\": null, \"RmCode\": null, \"CorpCode\": null, \"Segment\": null, \"Classification\": null, \"SubClassification\": null, \"LeadGenerator\": null, \"LeadConverter\": null, \"SourceCode\": null, \"UinStatusFh\": null, \"UinNoFh\": null, \"UinStatusSh\": null, \"UinNoSh\": null, \"UinStatusTh\": null, \"UinNoTh\": null, \"RmEffectiveDate\": null, \"CorpCodeEffectiveDate\": null, \"SegmentEffectiveDate\": null, \"ClassificationEffectiveDate\": null, \"HomeBranchEffectiveDate\": null, \"ForCorrAddressFlag\": \"Y\", \"FirstHolderEmail\": \"NAM@GMAIL.COM\", \"OptedDponnet\": null, \"ValueLimitPerSettlement\": null, \"LastTranDate\": null, \"WebcisPwd\": null, \"WebcisEnabled\": null, \"CcrRefNo\": null, \"FirstHolderPanFlag\": \"Y\", \"AddChnDate\": null, \"CustomerHash\": null, \"CustodyCode\": null, \"CoreBankType\": null, \"ThumbImpression\": \"N\", \"SameAsLoAddress\": \"Y\", \"ShAddressId\": null, \"ThAddressId\": null, \"SameAsLoAddressNg\": \"N\", \"SignFileSize\": null, \"CarExport\": null, \"FhNomineeName\": null, \"FhNomineeAddressId\": null, \"FhSexCode\": \"F\", \"FhMinor\": null, \"FhGuardRel\": null, \"FhIdentifier\": null, \"FhItCircle\": null, \"ShGuardAddressId\": null, \"ThGuardAddressId\": null, \"FhCombiCover\": null, \"FhCommFlag\": null, \"InternetTradingLinkDt\": null, \"CarBatchNo\": null, \"InfinityLinking\": null, \"DematCancelSmsAlert\": null, \"DebitCancelSmsAlert\": null, \"PledgeClosureSmsAlert\": null, \"PledgeCancelSmsAlert\": null, \"PledgeFailedSmsAlert\": null, \"LastUpdDt\": null, \"SoaCease\": null, \"SoaCeaseDate\": null, \"VisuallyChallenged\": \"N\", \"CommodityAc\": \"N\", \"NomineeSignFileSize\": null, \"InfopoolFlag\": null, \"CustUserId\": null, \"IncomeRange\": \"82\", \"NomineeFlag\": \"Y\", \"PromotionalSmsAlert\": null, \"SdoClientType\": null, \"SdoSegType\": null, \"SdoMemberCode\": null, \"SdoMemberType\": null, \"SdoSnvid\": null, \"SdoSdvid\": null, \"ClientAlertMsg\": null, \"ClientLinkType\": null, \"FirstHolderAuthFlag\": null, \"SecondHolderAuthFlag\": null, \"ThirdHolderAuthFlag\": null, \"TpAddressFlag\": \"N\", \"LastDrtranDate\": null, \"EmailAdressTo\": null, \"EmailAdressCc\": null, \"EmailAdressBcc\": null, \"FhKraFlag\": null, \"FhKraId\": null, \"Bsda\": \"N\", \"RgessFlag\": \"N\", \"FhAadhaar\": null, \"RgessStatus\": null, \"RgessStatusDate\": null, \"RgessReasonCode\": null, \"DisNotRequired\": \"N\", \"SdoExchange\": null, \"SodPledgeeId\": null, \"FhRtaEmailFlag\": \"N\", \"SiPledgeConfirm\": \"N\", \"AltEmailId\": null, \"EstmtFlag\": \"N\", \"FhFamilyEmail\": \"N\", \"FhFamilyMob\": \"N\", \"Saral\": \"N\", \"PositiveConf\": \"N\", \"NoAddressProof\": \"N\", \"DematCreateSmsAlert\": null, \"PledgeCreateSmsAlert\": null, \"PledgeCloseSmsAlert\": null, \"InstClientId\": null, \"FhUcic\": null, \"LeadId\": null, \"PepFlag\": \"N\", \"RiskCategory\": \"0\", \"FhCityOfBirth\": null, \"FhCountryOfBirth\": null, \"FhFatcaFlag\": null, \"CustodialFlag\": \"N\", \"FhAltEmailId\": null, \"SharePerEqFlag\": \"0\", \"NmIndicatorCode\": \"0\", \"SnAddSameAsFnAdd\": \"0\", \"SnAddId\": null, \"TnAddSameAsFnAdd\": \"0\", \"TnAddId\": null, \"TnGuardianAddId\": null, \"AnnualReport\": null, \"RematCreateSmsAlert\": null, \"RematRejectSmsAlert\": null, \"PledgecreateRejectSmsAlert\": null, \"PledgecloseRejectSmsAlert\": null, \"GstNo\": null, \"GstReg\": \"N\", \"SpcExemp\": null, \"RelParty\": \"N\", \"RelPartyCat\": null, \"EmailAlertToRm\": null, \"HufName\": null, \"ShIncomeRange\": null, \"ThIncomeRange\": null, \"Introduser\": null, \"AccountSourced\": null, \"FhCkycNo\": null, \"FhAadhaarRefNo\": null, \"NoOfCoparceners\": null, \"DateOfFormation\": null, \"AncestralFlag\": null, \"GenderOfKarta\": null, \"DobOfKarta\": null, \"PanOfKarta\": null, \"AadhaarOfKarta\": null, \"UpiId\": null, \"FhAadhaarVerifyFlag\": \"N\", \"FhAadharrNonupdReason\": \"\", \"KycUpdateFlag\": null, \"FatcaFlag\": null, \"Umrn\": null, \"NachFrequency\": null, \"NachLimit\": null, \"NachEffFromDate\": null, \"NachEffToDate\": null, \"KraAgency\": null, \"KraRegDate\": null, \"GsecIdtFlag\": \"N\", \"FhVid\": null, \"KartaVid\": null, \"MaritalStatus\": null, \"FormType\": null, \"OldUdnNo\": null, \"TradingAccountNo\": null, \"TradingBranchName\": null, \"MobileRelation\": null, \"EmailRelation\": null, \"OldBranchId\": null, \"tSET_NO_GST\": null, \"Active\": null, \"Freeze\": null, \"InfoComplete\": null, \"Checked\": \"N\", \"Signature\": null, \"EncClientValue\": null, \"AdacCust\": null, \"Sector\": null, \"LinkedEntity\": null, \"MerchantDetails\": null, \"EdisFlag\": null, \"AccountOption\": null, \"FatherSpouseFlag\": null, \"FhPanaadharlinkFlag\": null, \"FhPanaadharlinkEffDate\": null, \"NeoFlag\": null, \"NeoActDate\": null, \"TcsTemplate\": null, \"NetWorth\": null, \"NetWorthDate\": null, \"LeiNo\": null, \"FhIsdCode\": 91, \"W8ben\": null, \"DpmModeOfOpr\": null, \"CommSendTo\": null, \"PmsFlag\": null, \"signature\": \"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\" }, \"address\": { \"Address1\": \"AT POST-CHIRNER\", \"Address2\": null, \"Address3\": null, \"Address4\": \"MUMBAI\", \"City\": null, \"State\": \"27\", \"Zip\": \"410206\", \"Country\": \"India\", \"Phone1\": null, \"Phone2\": null, \"Phone3\": null, \"Telex\": null, \"Fax\": null, \"Email\": \"nam@gmail.com\", \"Website\": null, \"mobileNo\": \"9004623456\", \"gstState\": \"27\" }, \"foreignAddress\": { \"Address1\": \"AT POST-CHIRNER\", \"Address2\": null, \"Address3\": null, \"Address4\": \"MUMBAI\", \"City\": null, \"State\": \"27\", \"Zip\": \"410206\", \"Country\": \"India\", \"Phone1\": null, \"Phone2\": null, \"Phone3\": null, \"Telex\": null, \"Fax\": null, \"Email\": \"nam@gmail.com\", \"Website\": null, \"mobileNo\": null, \"gstState\": \"27\" }, \"secondHolder\": { \"secondHolderName\": null, \"shFatherName\": null, \"shOccupation\": null, \"shPanNo\": null, \"shDob\": null, \"secondHolderEmail\": null, \"shAltEmailId\": null, \"shFamilyEmail\": \"N\", \"shPhoneNo\": null, \"secondHolderMob\": null, \"secondHolderMapin\": null, \"shFamilyMob\": \"N\", \"secondHolderSmsFlag\": \"N\", \"shCustId\": null, \"shBankAccountNo\": null, \"secondHolderPanFlag\": null, \"ShPanaadharlinkFlag\": null, \"ShPanaadharlinkEffDate\": null, \"ShIsdCode\": null, \"shAddress\": { \"Address1\": null, \"Address2\": null, \"Address3\": null, \"Address4\": null, \"City\": null, \"State\": null, \"Zip\": null, \"Country\": null, \"Phone1\": null, \"Phone2\": null, \"Phone3\": null, \"Telex\": null, \"Fax\": null, \"Email\": null, \"Website\": null, \"mobileNo\": null, \"gstState\": null }, \"shGuardName\": null, \"shGuardRel\": null, \"shItCircle\": null, \"shAadhaar\": null, \"shAadharNonupdReason\": \"\", \"shVid\": null, \"shKraFlag\": \"N\", \"shUcic\": null, \"shAadhaarVerifyFlag\": \"N\", \"shRtaEmailFlag\": \"N\", \"shgAddress\": { \"Address1\": null, \"Address2\": null, \"Address3\": null, \"Address4\": null, \"City\": null, \"State\": null, \"Zip\": null, \"Country\": null, \"Phone1\": null, \"Phone2\": null, \"Phone3\": null, \"Telex\": null, \"Fax\": null, \"Email\": null, \"Website\": null, \"mobileNo\": null, \"gstState\": null }, \"shNcFlag\": null }, \"thirdHolder\": { \"thirdHolderName\": null, \"thFatherName\": null, \"thOccupation\": null, \"thDob\": null, \"thPanNo\": null, \"thirdHolderEmail\": null, \"thAltEmailId\": null, \"thFamilyEmail\": \"N\", \"thPhoneNo\": null, \"thirdHolderMob\": null, \"thFamilyMob\": \"N\", \"thirdHolderSmsFlag\": \"N\", \"thirdHolderMapin\": null, \"thCustId\": null, \"thBankAccountNo\": null, \"thirdHolderPanFlag\": null, \"ThPanaadharlinkFlag\": null, \"ThPanaadharlinkEffDate\": null, \"ThIsdCode\": null, \"thAddress\": { \"Address1\": null, \"Address2\": null, \"Address3\": null, \"Address4\": null, \"City\": null, \"State\": null, \"Zip\": null, \"Country\": null, \"Phone1\": null, \"Phone2\": null, \"Phone3\": null, \"Telex\": null, \"Fax\": null, \"Email\": null, \"Website\": null, \"mobileNo\": null, \"gstState\": null }, \"thGuardName\": null, \"thGuardRel\": null, \"thItCircle\": null, \"thKraFlag\": \"N\", \"thUcic\": null, \"thAadhaar\": null, \"thAadharNonupdReason\": \"\", \"thVid\": null, \"thAadhaarVerifyFlag\": \"N\", \"thRtaEmailFlag\": \"N\", \"thgAddress\": { \"Address1\": null, \"Address2\": null, \"Address3\": null, \"Address4\": null, \"City\": null, \"State\": null, \"Zip\": null, \"Country\": null, \"Phone1\": null, \"Phone2\": null, \"Phone3\": null, \"Telex\": null, \"Fax\": null, \"Email\": null, \"Website\": null, \"mobileNo\": null, \"gstState\": null }, \"thNcFlag\": null }, \"finance\": { \"bankingClient\": \"Y\", \"IfscCode\": \"ABHY0065001\", \"BankName\": \"ABHYUDAYACOOPERATIVEBANKLIMITED\", \"MicrCode\": \"400065001\", \"BankAccountNo\": \"3456978066\", \"BankAccountType\": \"10\", \"divBankAddress\": { \"Address1\": \"ABHYUDAYABANKBLDG.\", \"Address2\": \"B.NO.71\", \"Address3\": \"NEHRUNAGAR\", \"Address4\": \"KURLA(E)\", \"City\": null, \"State\": null, \"Zip\": \"400024\", \"Country\": null, \"Phone1\": null, \"Phone2\": null, \"Phone3\": null, \"Telex\": null, \"Fax\": null, \"Email\": null, \"Website\": null, \"mobileNo\": null, \"gstState\": null }, \"IfscCode2\": \"ABHY0065001\", \"BankName2\": \"ABHYUDAYACOOPERATIVEBANKLIMITED\", \"MicrCode2\": \"400065001\", \"BankAccountType2\": \"10\", \"BankAccountNo2\": \"3456978066\", \"chargBankAddress\": { \"Address1\": \"ABHYUDAYABANKBLDG.\", \"Address2\": \"B.NO.71\", \"Address3\": \"NEHRUNAGAR\", \"Address4\": \"KURLA(E)\", \"City\": null, \"State\": null, \"Zip\": \"400024\", \"Country\": null, \"Phone1\": null, \"Phone2\": null, \"Phone3\": null, \"Telex\": null, \"Fax\": null, \"Email\": null, \"Website\": null, \"mobileNo\": null, \"gstState\": null }, \"ChargesBranchId\": null, \"GhUcic\": null, \"RbiReferenceNo\": null, \"RbiApprovalDate\": null, \"TaxDeductionStatus\": null, \"AsfCollected\": \"N\" }, \"firstNominee\": { \"ngName\": null, \"fhNomRel\": null, \"nmDob\": null, \"fnPerOfShare\": null, \"fnPanNo\": null, \"fnAadhaar\": null, \"fnAddress\": { \"Address1\": null, \"Address2\": null, \"Address3\": null, \"Address4\": null, \"City\": null, \"State\": null, \"Zip\": null, \"Country\": null, \"Phone1\": null, \"Phone2\": null, \"Phone3\": null, \"Telex\": null, \"Fax\": null, \"Email\": null, \"Website\": null, \"mobileNo\": null, \"gstState\": null }, \"nomineesGuardianName\": null, \"fhNomGuardRel\": null, \"fnVid\": null, \"fngAddress\": { \"Address1\": null, \"Address2\": null, \"Address3\": null, \"Address4\": null, \"City\": null, \"State\": null, \"Zip\": null, \"Country\": null, \"Phone1\": null, \"Phone2\": null, \"Phone3\": null, \"Telex\": null, \"Fax\": null, \"Email\": null, \"Website\": null, \"mobileNo\": null, \"gstState\": null } }, \"secondNominee\": { \"snName\": null, \"snRelation\": null, \"snDob\": null, \"snPerOfShare\": null, \"snPanNo\": null, \"snAadhaar\": null, \"snVid\": null, \"snAddress\": { \"Address1\": null, \"Address2\": null, \"Address3\": null, \"Address4\": null, \"City\": null, \"State\": null, \"Zip\": null, \"Country\": null, \"Phone1\": null, \"Phone2\": null, \"Phone3\": null, \"Telex\": null, \"Fax\": null, \"Email\": null, \"Website\": null, \"mobileNo\": null, \"gstState\": null }, \"snGuardianName\": null, \"snGuardianRelation\": null, \"snGuardianAddId\": null, \"snAddId\": null, \"sngAddress\": { \"Address1\": null, \"Address2\": null, \"Address3\": null, \"Address4\": null, \"City\": null, \"State\": null, \"Zip\": null, \"Country\": null, \"Phone1\": null, \"Phone2\": null, \"Phone3\": null, \"Telex\": null, \"Fax\": null, \"Email\": null, \"Website\": null, \"mobileNo\": null, \"gstState\": null }, \"sngDetailsSameAsFng\": null }, \"thirdNominee\": { \"tnName\": null, \"tnRelation\": null, \"tnDob\": null, \"tnPerOfShare\": null, \"tnPanNo\": null, \"tnAadhaar\": null, \"tnVid\": null, \"tnAddress\": { \"Address1\": null, \"Address2\": null, \"Address3\": null, \"Address4\": null, \"City\": null, \"State\": null, \"Zip\": null, \"Country\": null, \"Phone1\": null, \"Phone2\": null, \"Phone3\": null, \"Telex\": null, \"Fax\": null, \"Email\": null, \"Website\": null, \"mobileNo\": null, \"gstState\": null }, \"tnGuardianName\": null, \"tnGuardianRelation\": null, \"tnGuardianAddId\": null, \"tnAddId\": null, \"tngAddress\": { \"Address1\": null, \"Address2\": null, \"Address3\": null, \"Address4\": null, \"City\": null, \"State\": null, \"Zip\": null, \"Country\": null, \"Phone1\": null, \"Phone2\": null, \"Phone3\": null, \"Telex\": null, \"Fax\": null, \"Email\": null, \"Website\": null, \"mobileNo\": null, \"gstState\": null }, \"tngDetailsSameAsFng\": null }, \"authSign\": null, \"CURRENT_DP_ID\": null, \"SET_CORRESPONDENCE\": null, \"SET_INST_CLIENT\": null, \"INDOC_NO\": null, \"txnMode\": \"EDIT\", \"fhApplicantDetails\": null, \"shApplicantDetails\": null, \"thApplicantDetails\": null, \"otherDetails\": null, \"apiLog\": null, \"bankIfscCode\": null,\r\n"
				+ "\r\n"
				+ " \"headerParams\": [ { \"key\": \"Abp.Tenantid\", \"value\": \"1\" } ] }, \"sessionContext\": { \"channel\": \"NDML\", \"userId\": \"DevUser01\", \"externalReferenceNo\": \"8529635\", \"bankCode\": \"08\", \"transactionBranch\": \"089999\" } }";
		claims.put("TngAddress", writeValueAsString);
		JwtBuilder builder = Jwts.builder().setClaims(claims).setHeaderParam("typ", "JWT").setSubject(subject)
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
				.signWith(SignatureAlgorithm.valueOf("RS256"), readPublicKey);
		claims.forEach(builder::claim);
		return builder.compact();
	}

	public static PrivateKey readPublicKey(String filename) throws Exception {
		FileInputStream is = new FileInputStream(filename);
		KeyStore keystore = KeyStore.getInstance(KeyStore.getDefaultType());
		keystore.load(is, "ndml".toCharArray());
		String alias = "DAC";
		KeyPair k = null;
		Key key = keystore.getKey(alias, "ndml".toCharArray());
		if (key instanceof PrivateKey) {
			Certificate cert = keystore.getCertificate(alias);
			PublicKey publicKey = cert.getPublicKey();
			k = new KeyPair(publicKey, (PrivateKey) key);
		}
		return k.getPrivate();
	}

	public static String generateAlphaNumericKey(final int keySize) {
		final Random random = new Random();
		final StringBuilder key = new StringBuilder();
		while (key.length() < keySize) {
			final int character = random.nextInt(128);
			// is within range
			if ((character <= VAR2 && character >= VAR1) || (character <= VAR4 && character >= VAR3)
					|| (character <= NINE && character >= ZERO)) {
				key.append((char) character);
			}
		}
		return key.toString();
	}

	public static byte[] encrypt(final String data, final byte[] key) {
		System.out.println("------------------");
		byte[] encryptedValue = null;
		try {
			final SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
			final Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, new IvParameterSpec(IVECTOR));
			final byte[] dataArr = data.getBytes();
			final byte[] ivAndData = new byte[IVECTOR.length + dataArr.length];
			System.arraycopy(IVECTOR, 0, ivAndData, 0, IVECTOR.length);
			System.arraycopy(dataArr, 0, ivAndData, IVECTOR.length, dataArr.length);
			encryptedValue = cipher.doFinal(ivAndData);
			System.out.println("====" + encryptedValue);
		} catch (Exception exp) {
			System.out.println(exp);

		}
		return encryptedValue;

	}
	public static byte[] encrypt(final String data, final String publicKey) throws BadPaddingException,
	IllegalBlockSizeException, InvalidKeyException, NoSuchPaddingException,
	NoSuchAlgorithmException, InvalidKeySpecException, CertificateException, IOException {
	final Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
	cipher.init(Cipher.ENCRYPT_MODE, readPublicKeys(publicKey));
	return cipher.doFinal(data.getBytes());
	}
	
	public static PublicKey readPublicKeys(String filename)
			throws IOException, NoSuchAlgorithmException, InvalidKeySpecException, CertificateException {
		/*
		 * X509EncodedKeySpec publicSpec = new
		 * X509EncodedKeySpec(readFileBytes(filename)); KeyFactory keyFactory =
		 * KeyFactory.getInstance("RSA"); return keyFactory.generatePublic(publicSpec);
		 */

		FileInputStream fin = new FileInputStream(filename);
		CertificateFactory f = CertificateFactory.getInstance("X.509");
		X509Certificate certificate = (X509Certificate) f.generateCertificate(fin);
		PublicKey pk = certificate.getPublicKey();
		return pk;
	}
	public static PublicKey getPublicKey(final String base64PublicKey) {
		PublicKey publicKey = null;
		try {
		final X509EncodedKeySpec keySpec = new X509EncodedKeySpec(
		Base64.getDecoder().decode(base64PublicKey.getBytes()));
		final KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		publicKey = keyFactory.generatePublic(keySpec);
		} catch (NoSuchAlgorithmException e) {
		
		} catch (InvalidKeySpecException e) {
		
		}
		return publicKey;
		}

	public static byte[] encode(final byte[] value) {
		return Base64.getEncoder().encode(value);
	}
}