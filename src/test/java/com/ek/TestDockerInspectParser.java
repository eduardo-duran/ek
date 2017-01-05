package com.ek;

import java.util.List;

import org.junit.Test;

import dto.DockerInspectDTO;
import junit.framework.Assert;
import parser.DockerInspectParserImpl;
import parser.IDockerInspectParser;

public class TestDockerInspectParser {

	@Test
	public void Test_DTO_is_not_null(){
		IDockerInspectParser parser = new DockerInspectParserImpl();
		List<DockerInspectDTO> dtos = parser.parse("data.json");
		
		Assert.assertNotNull(dtos);
	}
}
