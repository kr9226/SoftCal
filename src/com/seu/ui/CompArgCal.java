package com.seu.ui;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;

public class CompArgCal extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public CompArgCal(Composite parent, int style) {
		super(parent, style);
		
		Button btnSelPrj = new Button(this, SWT.TOGGLE);
		btnSelPrj.setLocation(0, 0);
		btnSelPrj.setSize(80, 27);
		btnSelPrj.setText("选择项目目录");
		btnSelPrj.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		
		Button btnDelPrj = new Button(this, SWT.TOGGLE);
		btnDelPrj.setLocation(97, 0);
		btnDelPrj.setSize(80, 27);
		btnDelPrj.setText("项目删除");
		btnDelPrj.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
