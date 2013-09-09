package com.wtf.broker.shared;

import java.io.Serializable;

/**
 * @author Efren
 */
public class Response implements Serializable {

   	private static final long serialVersionUID = -5077178206927386485L;
	
	private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
