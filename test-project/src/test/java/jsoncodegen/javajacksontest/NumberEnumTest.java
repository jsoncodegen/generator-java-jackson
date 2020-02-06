package jsoncodegen.javajacksontest;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jsoncodegen.javajacksontest.generated.parent.tests.JsonNumberEnum;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberEnumTest {

	@Test
	public void serializesAndDeserializes() {
		List<JsonNumberEnum> value = Arrays
				.asList(JsonNumberEnum.Name, JsonNumberEnum.NameWithDescription, JsonNumberEnum.NameOfFractionValue);

		ObjectMapper objectMapper = new ObjectMapper();
		String json = null;
		try {
			json = objectMapper.writeValueAsString(value);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

		ObjectMapper objectMapper2 = new ObjectMapper();
		List<JsonNumberEnum> value2 = null;
		try {
			value2 = objectMapper2.readValue(json, new TypeReference<List<JsonNumberEnum>>() {});
		} catch (IOException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		assertEquals(value, value2);
	}
}
