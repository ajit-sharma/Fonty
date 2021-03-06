package com.marcinorlowski.fonty.demo;

/*
 ******************************************************************************
 *
 * Copyright 2013-2017 Marcin Orłowski
 *
 * Licensed under the Apache License 2.0
 *
 ******************************************************************************
 *
 * @author Marcin Orlowski <mail@MarcinOrlowski.com>
 *
 ******************************************************************************
 */

import com.marcinorlowski.fonty.Fonty;

public class Application extends android.app.Application {

	@Override
	public void onCreate() {
		super.onCreate();

		Fonty.init(this)
			 .regularTypeface("Exo-Regular.ttf")
			 .boldTypeface("Capture_it.ttf");
	}

}
