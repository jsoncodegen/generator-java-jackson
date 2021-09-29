package jsoncodegen.javajacksontest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jsoncodegen.javajacksontest.generated.parent.tests.JsonBooleanTest;
import org.junit.Test;

import static org.junit.Assert.*;

public class BooleanTest {

	@Test
	public void serailizesAndDeserializes() {
		JsonBooleanTest obj = new JsonBooleanTest(
				JsonBooleanTest.Builder.create()
						.withFlag(true)
						.withFlagWithDescription(true)
						.withArrayOfFlags(new ArrayList<Boolean>())
						.withArrayOfArraysOfFlags(new ArrayList<List<Boolean>>())
						.withArrayOfFlagsAndNulls(new ArrayList<Boolean>())
						.withMapOfFlags(new HashMap<String, Boolean>())
						.withMapOfMapsOfFlags(new HashMap<String, Map<String, Boolean>>())
						.withMapOfNullsAndFlags(new HashMap<String, Boolean>())
						.withArrayOfMapsOfFlags(new ArrayList<Map<String, Boolean>>())
						.withArrayOfNullsAndMapsOfFlags(new ArrayList<Map<String, Boolean>>())
						.withArrayOfMapsOfNullsAndFlags(new ArrayList<Map<String, Boolean>>())
						.withMapOfArraysOfFlags(new HashMap<String, List<Boolean>>())
						.withMapOfNullsAndArraysOfFlags(new HashMap<String, List<Boolean>>())
						.withMapOfArraysOfNullsAndFlags(new HashMap<String, List<Boolean>>())
		);
		ObjectMapper objectMapper = new ObjectMapper();
		String json = null;
		try {
			json = objectMapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

		JsonBooleanTest obj2 = null;
		ObjectMapper objectMapper2 = new ObjectMapper();
		try {
			obj2 = objectMapper2.readValue(json, JsonBooleanTest.class);
		} catch (IOException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		assertEquals(obj, obj2);
	}

	@Test
	public void canBeMutated() {
		JsonBooleanTest obj = new JsonBooleanTest(
				JsonBooleanTest.Builder.create()
						.withFlag(true)
						.withFlagWithDescription(true)
						.withArrayOfFlags(new ArrayList<Boolean>())
						.withArrayOfArraysOfFlags(new ArrayList<List<Boolean>>())
						.withArrayOfFlagsAndNulls(new ArrayList<Boolean>())
						.withMapOfFlags(new HashMap<String, Boolean>())
						.withMapOfMapsOfFlags(new HashMap<String, Map<String, Boolean>>())
						.withMapOfNullsAndFlags(new HashMap<String, Boolean>())
						.withArrayOfMapsOfFlags(new ArrayList<Map<String, Boolean>>())
						.withArrayOfNullsAndMapsOfFlags(new ArrayList<Map<String, Boolean>>())
						.withArrayOfMapsOfNullsAndFlags(new ArrayList<Map<String, Boolean>>())
						.withMapOfArraysOfFlags(new HashMap<String, List<Boolean>>())
						.withMapOfNullsAndArraysOfFlags(new HashMap<String, List<Boolean>>())
						.withMapOfArraysOfNullsAndFlags(new HashMap<String, List<Boolean>>())
		);
		JsonBooleanTest obj2 = obj.clone();
		
		assertNotSame(obj, obj2);
		assertEquals(obj, obj2);
		
		obj2.setFlag(false);
		
		assertNotEquals(obj, obj2);
		assertFalse(obj2.getFlag());
	}

	@Test(expected = IllegalArgumentException.class)
	public void throwsOnBuildWithNull() {
		JsonBooleanTest obj = new JsonBooleanTest(
				JsonBooleanTest.Builder.create()
						.withFlag(null)
						.withFlagWithDescription(true)
						.withArrayOfFlags(new ArrayList<Boolean>())
						.withArrayOfArraysOfFlags(new ArrayList<List<Boolean>>())
						.withArrayOfFlagsAndNulls(new ArrayList<Boolean>())
						.withMapOfFlags(new HashMap<String, Boolean>())
						.withMapOfMapsOfFlags(new HashMap<String, Map<String, Boolean>>())
						.withMapOfNullsAndFlags(new HashMap<String, Boolean>())
						.withArrayOfMapsOfFlags(new ArrayList<Map<String, Boolean>>())
						.withArrayOfNullsAndMapsOfFlags(new ArrayList<Map<String, Boolean>>())
						.withArrayOfMapsOfNullsAndFlags(new ArrayList<Map<String, Boolean>>())
						.withMapOfArraysOfFlags(new HashMap<String, List<Boolean>>())
						.withMapOfNullsAndArraysOfFlags(new HashMap<String, List<Boolean>>())
						.withMapOfArraysOfNullsAndFlags(new HashMap<String, List<Boolean>>())
		);
	}

	@Test(expected = IllegalArgumentException.class)
	public void throwsOnSetToNull() {
		JsonBooleanTest obj = new JsonBooleanTest(
				JsonBooleanTest.Builder.create()
						.withFlag(true)
						.withFlagWithDescription(true)
						.withArrayOfFlags(new ArrayList<Boolean>())
						.withArrayOfArraysOfFlags(new ArrayList<List<Boolean>>())
						.withArrayOfFlagsAndNulls(new ArrayList<Boolean>())
						.withMapOfFlags(new HashMap<String, Boolean>())
						.withMapOfMapsOfFlags(new HashMap<String, Map<String, Boolean>>())
						.withMapOfNullsAndFlags(new HashMap<String, Boolean>())
						.withArrayOfMapsOfFlags(new ArrayList<Map<String, Boolean>>())
						.withArrayOfNullsAndMapsOfFlags(new ArrayList<Map<String, Boolean>>())
						.withArrayOfMapsOfNullsAndFlags(new ArrayList<Map<String, Boolean>>())
						.withMapOfArraysOfFlags(new HashMap<String, List<Boolean>>())
						.withMapOfNullsAndArraysOfFlags(new HashMap<String, List<Boolean>>())
						.withMapOfArraysOfNullsAndFlags(new HashMap<String, List<Boolean>>())
		);
		obj.setFlag(null);
	}
}
