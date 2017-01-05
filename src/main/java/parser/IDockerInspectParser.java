package parser;

import java.util.List;

import dto.DockerInspectDTO;

public interface IDockerInspectParser {
	
	public List<DockerInspectDTO> parse(String filename);
}
