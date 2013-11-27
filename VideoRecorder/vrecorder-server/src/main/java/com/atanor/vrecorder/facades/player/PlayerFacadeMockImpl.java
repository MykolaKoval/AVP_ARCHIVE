package com.atanor.vrecorder.facades.player;

import com.atanor.vrecorder.facades.PlayerFacade;

public class PlayerFacadeMockImpl implements PlayerFacade {

	@Override
	public void startRecording() {
		System.out.println("VLC Player starts recording ..");
	}

	@Override
	public void stopRecording() {
		System.out.println("VLC Player stops recording ..");
	}

	@Override
	public String getSnapshot() {
		System.out.println("VLC Player gets snapshot ..");
		return null;
	}

}
