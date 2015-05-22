package com.insat.auctionsale.common.exception;

import com.insat.auctionsale.common.enumeration.ExceptionCodeEnum;

public class TechnicalException extends AuctionSaleException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8389997954618362206L;

	public TechnicalException(ExceptionCodeEnum exceptionCode, String message) {
		super(exceptionCode, message);
	}

	public TechnicalException(ExceptionCodeEnum exceptionCode, String message,
			Throwable t) {
		super(exceptionCode, message, t);
	}

}
