package com.atanor.vserver.vsclient.client;


import com.atanor.vserver.vsclient.client.async.AsyncConnector;
import com.atanor.vserver.vsclient.client.events.SnapshotReceivedEvent;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class VsClient implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		RootPanel.get().add(Client.getView());
		Client.bind();
		register();
		
		AsyncConnector.connect();
	}
	
	private static void register() {
		Client.getEventBus().addHandler(SnapshotReceivedEvent.getType(), Client.getPresenter());
	}
}
