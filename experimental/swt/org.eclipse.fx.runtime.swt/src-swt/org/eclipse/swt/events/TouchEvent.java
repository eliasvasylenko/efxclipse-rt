package org.eclipse.swt.events;

import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Touch;

public class TouchEvent extends TypedEvent {

	public Touch[] touches;

	public int stateMask;

	public int x;

	public int y;

	static final long serialVersionUID = -8348741538373572182L;

	public TouchEvent(Event e) {
		super(e);
		this.touches = e.touches;
		this.stateMask = e.stateMask;
		this.x = e.x;
		this.y = e.y;
	}

	public String toString() {
		String string = super.toString();
		string = string.substring(0, string.length() - 1); // remove trailing
															// '}'
		string += " stateMask=0x" + Integer.toHexString(stateMask) + " x=" + x + " y=" + y;
		if (touches != null) {
			for (int i = 0; i < touches.length; i++) {
				string += "\n     " + touches[i].toString();
			}
			string += "\n";
		}
		string += "}";
		return string;
	}
}