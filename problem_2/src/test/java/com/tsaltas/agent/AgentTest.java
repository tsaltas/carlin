package com.tsaltas.agent;

import static io.dropwizard.testing.FixtureHelpers.fixture;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gs.collections.impl.factory.Lists;

import io.dropwizard.jackson.Jackson;

public class AgentTest {
	private static final ObjectMapper MAPPER = Jackson.newObjectMapper();

	private static final Agent sampleAgent = new Agent(
		123,
		"Sample Name",
		true,
		1000,
		Lists.mutable.of(1, 30, 100, 50),
		Lists.mutable.of(
			new Account(1, "Test Account 1"),
			new Account(2, "Test Account 2")
		)
	);

	@Test
	public void serializesToJSON() throws Exception {
		assertThat(MAPPER.writeValueAsString(sampleAgent))
			.isEqualTo(MAPPER.writeValueAsString(
				MAPPER.readValue(fixture("fixtures/sample.json"), Agent.class))
			);
	}

	@Test
	public void deserializesFromJSON() throws Exception {
		assertThat(MAPPER.readValue(fixture("fixtures/sample.json"), Agent.class))
			.isEqualTo(sampleAgent);
	}

	@Test
	public void deserializationIgnoresEcessData() throws Exception {
		assertThat(MAPPER.readValue(fixture("fixtures/sample_excess_data.json"), Agent.class))
			.isEqualTo(sampleAgent);
	}
}
