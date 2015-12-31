package com.tsaltas.agent;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.annotation.concurrent.Immutable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gs.collections.api.list.ImmutableList;
import com.gs.collections.impl.factory.Lists;

@Immutable
@JsonIgnoreProperties(ignoreUnknown = true) // Do not process unknown fields
public class Agent implements Serializable {
	private static final long serialVersionUID = 1L;

	private final long id;
	private final String name;
	private final boolean active;
	private final long count;
	private final ImmutableList<Integer> addressIds;
	private final ImmutableList<Account> accounts;

	@JsonCreator
	public Agent(
		@JsonProperty("id") final long id,
		@JsonProperty("name") final String name,
		@JsonProperty("active") final boolean active,
		@JsonProperty("count") final long count,
		@JsonProperty("address_ids") final List<Integer> addressIds,
		@JsonProperty("accounts") final List<Account> accounts
	) {
		this.id = id;
		this.name = name;
		this.active = active;
		this.count = count;
		this.addressIds = Lists.immutable.ofAll(addressIds);
		this.accounts = Lists.immutable.ofAll(accounts);
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public boolean isActive() {
		return active;
	}

	public long getCount() {
		return count;
	}

	@JsonProperty("address_ids") // Make JSON field name match sample format
	public ImmutableList<Integer> getAddressIds() {
		return addressIds;
	}

	public ImmutableList<Account> getAccounts() {
		return accounts;
	}

	@Override
	public final boolean equals(final Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Agent)) {
			return false;
		}
		final Agent otherAgent = (Agent) other;
		return Objects.equals(this.id, otherAgent.id)
			&& Objects.equals(this.name, otherAgent.name)
			&& Objects.equals(this.active, otherAgent.active)
			&& Objects.equals(this.count, otherAgent.count)
			&& Objects.equals(this.addressIds, otherAgent.addressIds)
			&& Objects.equals(this.accounts, otherAgent.accounts);
	}

	@Override
	public final int hashCode() {
		return Objects.hash(id, name, active, count, addressIds, accounts);
	}
}
