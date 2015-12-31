package com.tsaltas.agent;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.concurrent.Immutable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Immutable
@JsonIgnoreProperties(ignoreUnknown = true) // Do not process unknown fields
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	private final long id;
	private final String name;

	@JsonCreator
	public Account(
		@JsonProperty("id") final long id, @JsonProperty("name") final String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public final boolean equals(final Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Account)) {
			return false;
		}
		final Account otherAccount = (Account) other;
		return Objects.equals(this.id, otherAccount.id)
			&& Objects.equals(this.name, otherAccount.name);
	}

	@Override
	public final int hashCode() {
		return Objects.hash(id, name);
	}
}
