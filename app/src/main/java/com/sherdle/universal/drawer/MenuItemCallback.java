package com.sherdle.universal.drawer;

import android.view.MenuItem;

import java.util.List;

/**
 * This file is part of the Universal template
 * For license information, please check the LICENSE
 * file in the root of this project
 *
 * @author Sherdle
 * Copyright 2016
 */
public interface MenuItemCallback {

    void menuItemClicked(List<NavItem> action, MenuItem item, boolean requiresPurchase);
}
