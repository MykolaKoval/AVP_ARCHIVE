package com.atanor.smanager.domain.converter;

import junit.framework.Assert;

import org.junit.Test;

import com.atanor.smanager.domain.entity.Display;
import com.atanor.smanager.domain.entity.PanelLayout;
import com.atanor.smanager.rpc.dto.DisplayDto;
import com.atanor.smanager.rpc.dto.PanelLayoutDto;

public class DisplayConverterTest extends BaseConverterTest<DisplayConverter> {

	@Test
	public void testToDto() {
		DisplayDto result = converter.toDto(new Display(PanelLayout.ONExTHREE, 1800, 600));

		Assert.assertNotNull(result);
		Assert.assertEquals(PanelLayout.ONExTHREE.getDescription(), result.getLayout().getName());
		Assert.assertEquals(PanelLayout.ONExTHREE.getRowPanelQuantity(), result.getLayout().getRowPanelQuantity());
		Assert.assertEquals(PanelLayout.ONExTHREE.getColumnPanelQuantity(), result.getLayout().getColumnPanelQuantity());
		Assert.assertEquals(Integer.valueOf(1800), result.getWidth());
		Assert.assertEquals(Integer.valueOf(600), result.getHigh());
	}

	@Test
	public void testToEntity() {
		DisplayDto source = new DisplayDto();
		source.setWidth(1800);
		source.setHigh(600);
		
		PanelLayoutDto layout = new PanelLayoutDto();
		layout.setName(PanelLayout.ONExTHREE.getDescription());
		layout.setRowPanelQuantity(PanelLayout.ONExTHREE.getRowPanelQuantity());
		layout.setColumnPanelQuantity(PanelLayout.ONExTHREE.getColumnPanelQuantity());
		
		source.setLayout(layout);
		
		Display result = converter.toEntity(source);

		Assert.assertNotNull(result);
		Assert.assertEquals(PanelLayout.ONExTHREE.getDescription(), result.getLayout().getDescription());
		Assert.assertEquals(PanelLayout.ONExTHREE.getRowPanelQuantity(), result.getLayout().getRowPanelQuantity());
		Assert.assertEquals(PanelLayout.ONExTHREE.getColumnPanelQuantity(), result.getLayout().getColumnPanelQuantity());
		Assert.assertEquals(Integer.valueOf(1800), result.getWidth());
		Assert.assertEquals(Integer.valueOf(600), result.getHigh());
	}
	
	@Test(expected = NullPointerException.class)
	public void testConvertNull() {
		converter.toDto(null);
	}

}
