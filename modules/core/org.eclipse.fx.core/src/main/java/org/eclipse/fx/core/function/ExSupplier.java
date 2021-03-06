/*******************************************************************************
 * Copyright (c) 2015 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.core.function;

/**
 * Operation to retrieve a value
 *
 * @param <V>
 *            the value
 * @since 1.2
 */
@FunctionalInterface
public interface ExSupplier<V> {
	/**
	 * Called to request the value
	 *
	 * @return the value
	 * @throws Throwable
	 *             exception if something wrong
	 */
	public V wrappedGet() throws Throwable;
}
