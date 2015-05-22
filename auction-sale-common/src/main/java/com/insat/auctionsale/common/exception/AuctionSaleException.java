package com.insat.auctionsale.common.exception;

import com.insat.auctionsale.common.enumeration.ExceptionCodeEnum;

public class AuctionSaleException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2664589834883180393L;

	private ExceptionCodeEnum exceptionCode;
	
	public AuctionSaleException(ExceptionCodeEnum exceptionCode,String message,Throwable t)
	{
		super(message,t);
		this.exceptionCode=exceptionCode;
	}
	
	public AuctionSaleException(ExceptionCodeEnum exceptionCode,String message)
	{
		super(message);
		this.exceptionCode=exceptionCode;
	}

	public ExceptionCodeEnum getExceptionCode() {
		return exceptionCode;
	}
	
}
