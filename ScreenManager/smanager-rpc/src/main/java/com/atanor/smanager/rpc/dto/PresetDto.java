package com.atanor.smanager.rpc.dto;

import java.util.List;

@SuppressWarnings("serial")
public class PresetDto extends AbstractDto {

	private Long id;
	private String name;
	private List<WindowDto> windows;

	public PresetDto() {
	}

	public PresetDto(final Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<WindowDto> getWindows() {
		return windows;
	}

	public void setWindows(final List<WindowDto> windows) {
		this.windows = windows;
	}

}
