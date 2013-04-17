/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ui.keybindings;

import org.eclipse.core.commands.ParameterizedCommand;

public interface Binding {

	int SYSTEM = 0;
	int USER = 1;

	String getSchemeId();

	TriggerSequence getTriggerSequence();

	ParameterizedCommand getParameterizedCommand();

	String getContextId();
}
