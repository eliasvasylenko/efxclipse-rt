/*******************************************************************************
 * Copyright (c) 2000, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.snippets;

/*
 * Slider example snippet: print scroll event details
 *
 * For a list of all SWT example snippets see
 * http://www.eclipse.org/swt/snippets/
 */
import org.eclipse.fx.runtime.swtutil.SWTUtil;
import org.eclipse.fx.runtime.swtutil.SWTUtil.BlockCondition;
import org.eclipse.fx.runtime.swtutil.SWTUtil.SWTAppStart;
import org.eclipse.swt.*;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.*;

public class Snippet17 implements SWTAppStart {

	@Override
	public BlockCondition createApp(Display display) {
		Shell shell = new Shell(display);
		Slider slider = new Slider(shell, SWT.HORIZONTAL);
		Rectangle clientArea = shell.getClientArea();
		slider.setBounds(clientArea.x + 10, clientArea.y + 10, 200, 32);
		slider.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				String string = "SWT.NONE";
				switch (event.detail) {
				case SWT.DRAG:
					string = "SWT.DRAG";
					break;
				case SWT.HOME:
					string = "SWT.HOME";
					break;
				case SWT.END:
					string = "SWT.END";
					break;
				case SWT.ARROW_DOWN:
					string = "SWT.ARROW_DOWN";
					break;
				case SWT.ARROW_UP:
					string = "SWT.ARROW_UP";
					break;
				case SWT.PAGE_DOWN:
					string = "SWT.PAGE_DOWN";
					break;
				case SWT.PAGE_UP:
					string = "SWT.PAGE_UP";
					break;
				}
				System.out.println("Scroll detail -> " + string);
			}
		});
		SWTUtil.getInstance().openBlocking(shell);
		return null;
	}
	
	public static void main(String[] args) {
		SWTUtil.getInstance().bootstrap(new Snippet17());
	}
}
