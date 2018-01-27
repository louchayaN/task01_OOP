package com.corporation.task01.dao.impl;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ApplianceResourceReader implements Closeable {

	private static String resourceName;
	private static final BufferedReader reader;

	static {
		ResourceNameReader resourceNameReader = ResourceNameReader.getInstance();
		try {
			resourceName = resourceNameReader.getResourceName();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		InputStream stream = ApplianceResourceReader.class.getClassLoader().getResourceAsStream(resourceName);
		reader = new BufferedReader(new InputStreamReader(stream));
	}

	public String readLine() throws IOException {
		return reader.readLine();
	}

	@Override
	public void close() {
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
