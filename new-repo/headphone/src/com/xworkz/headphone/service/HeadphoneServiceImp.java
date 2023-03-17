package com.xworkz.headphone.service;

import java.time.LocalDate;

import com.xworkz.headphone.constants.Brand;
import com.xworkz.headphone.constants.Color;
import com.xworkz.headphone.constants.WeightAndType;
import com.xworkz.headphone.dto.HeadphoneDTO;
import com.xworkz.headphone.util.HeadphoneUtil;

public class HeadphoneServiceImp implements HeadphoneService {

	@Override
	public boolean validateandsave(HeadphoneDTO dto) {
		System.out.println("running validateandsave in HeadphoneServiceImp" + dto);
		if (dto != null) {
			System.out.println("dto is not null");
			Brand brand = dto.getBrand();
			String modelNo = dto.getModelNo();
			double price = dto.getPrice();
			boolean bass = dto.isBass();
			Color color = dto.getColor();
			WeightAndType weightAndType = dto.getWeightAndType();
			String customerName = dto.getCustomerName();
			int invoiceNo = dto.getInvoiceNo();
			LocalDate mfgDate = dto.getMfgDate();
			int warrantyPeriod = dto.getWarrantyPeriod();
			boolean validbrand = false;
			boolean validmodelNo = false;
			boolean validprice = false;
			boolean validbass = false;
			boolean validcolor = false;
			boolean validweightAndType = false;
			boolean validcustomerName = false;
			boolean validinvoiceNo = false;
			boolean validmfgDate = false;
			boolean validwarrantyPeriod = false;
			if (brand != null) {
				System.out.println("brand is valid");
				validbrand = true;
			} else {
				System.err.println("brand is invalid");
			}
			if (HeadphoneUtil.validString(modelNo)) {
				System.out.println("model number is valid");
				validmodelNo = true;
			} else {
				System.err.println("model number is invalid");
			}
			if (HeadphoneUtil.validDouble(price)) {
				System.out.println("price is valid");
				validprice = true;
			} else {
				System.err.println("price is invalid");
			}
			if (bass != true) {
				System.out.println("bass is valid");
				validbass = true;
			} else {
				System.err.println("bass is invalid");
			}
			if (color != null) {
				System.out.println("color is valid");
				validcolor = true;
			} else {
				System.err.println("colr is invalid");
			}
			if (weightAndType != null) {
				System.out.println("weightAndType is valid");
				validweightAndType = true;
			} else {
				System.err.println("weightAndType is invalid");
			}
			if (HeadphoneUtil.validString(customerName)) {
				System.out.println("customerName is valid");
				validcustomerName = true;
			} else {
				System.err.println("customerName is invalid");
			}
			if (HeadphoneUtil.validInt(invoiceNo)) {
				System.out.println("invoice is valid");
				validinvoiceNo = true;
			} else {
				System.err.println("invoice is invalid");
			}
			if (HeadphoneUtil.validDate(mfgDate)) {
				System.out.println("mfg date is valid");
				validmfgDate = true;
			} else {
				System.err.println(" mfg date is invalid");
			}
			if (HeadphoneUtil.validInt(warrantyPeriod)) {
				System.out.println("warrantyPeriod is valid");
				validwarrantyPeriod = true;
			} else {
				System.err.println("warrantyPeriod is invalid");
			}
			if (HeadphoneUtil.valiFlag(validbrand, validmodelNo, validprice, validbass, validcolor, validweightAndType,
					validcustomerName, validinvoiceNo, validmfgDate, validwarrantyPeriod)) {
				System.out.println("data is valid , saved succesfully");
				return true;
			} else {
				System.err.println("data is invalid");
				return false;
			}
		} else {
			System.out.println("dto is null");
		}
		return false;
	}

}
