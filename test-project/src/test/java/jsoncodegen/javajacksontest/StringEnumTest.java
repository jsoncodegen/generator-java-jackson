package jsoncodegen.javajacksontest;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringEnumTest {

	@Test
	public void serializesAndDeserializes() {
		List<JsonStringEnum> value = Arrays
				.asList(JsonStringEnum.Name, JsonStringEnum.NameWithDescription, JsonStringEnum.NameOfEmptyValue);

		ObjectMapper objectMapper = new ObjectMapper();
		String json = null;
		try {
			json = objectMapper.writeValueAsString(value);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

		ObjectMapper objectMapper2 = new ObjectMapper();
		List<JsonStringEnum> value2 = null;
		try {
			value2 = objectMapper2.readValue(json, new TypeReference<List<JsonStringEnum>>() {});
		} catch (IOException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		assertEquals(value, value2);
	}
}
