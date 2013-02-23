package com.minijazz.ui.view;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MainViewTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testRun() {
		MainView mainView = new MainView();
		
		Assert.assertTrue("Expected true", mainView.run());
	}

}
