package com.insat.auctionsale.common.exception;

import com.insat.auctionsale.common.enumeration.ExceptionCodeEnum;

public class FunctionalException extends AuctionSaleException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 807024297412135718L;

	public FunctionalException(ExceptionCodeEnum exceptionCode, String message) {
		super(exceptionCode, message);
	}
	
	public FunctionalException(ExceptionCodeEnum exceptionCode, String message,
			Throwable t) {
		super(exceptionCode, message, t);
	}

}
