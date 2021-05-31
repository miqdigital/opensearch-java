/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.indices.recovery;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

// typedef: indices.recovery.RecoveryOrigin
public final class RecoveryOrigin implements ToJsonp {
	@Nullable
	private final String hostname;

	@Nullable
	private final String host;

	@Nullable
	private final String transportAddress;

	@Nullable
	private final String id;

	@Nullable
	private final String ip;

	@Nullable
	private final String name;

	@Nullable
	private final Boolean bootstrapNewHistoryUuid;

	@Nullable
	private final String repository;

	@Nullable
	private final String snapshot;

	@Nullable
	private final String version;

	@Nullable
	private final String restoreuuid;

	@Nullable
	private final String index;

	// ---------------------------------------------------------------------------------------------

	protected RecoveryOrigin(Builder builder) {

		this.hostname = builder.hostname;
		this.host = builder.host;
		this.transportAddress = builder.transportAddress;
		this.id = builder.id;
		this.ip = builder.ip;
		this.name = builder.name;
		this.bootstrapNewHistoryUuid = builder.bootstrapNewHistoryUuid;
		this.repository = builder.repository;
		this.snapshot = builder.snapshot;
		this.version = builder.version;
		this.restoreuuid = builder.restoreuuid;
		this.index = builder.index;

	}

	/**
	 * API name: {@code hostname}
	 */
	@Nullable
	public String hostname() {
		return this.hostname;
	}

	/**
	 * API name: {@code host}
	 */
	@Nullable
	public String host() {
		return this.host;
	}

	/**
	 * API name: {@code transport_address}
	 */
	@Nullable
	public String transportAddress() {
		return this.transportAddress;
	}

	/**
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code ip}
	 */
	@Nullable
	public String ip() {
		return this.ip;
	}

	/**
	 * API name: {@code name}
	 */
	@Nullable
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code bootstrap_new_history_uuid}
	 */
	@Nullable
	public Boolean bootstrapNewHistoryUuid() {
		return this.bootstrapNewHistoryUuid;
	}

	/**
	 * API name: {@code repository}
	 */
	@Nullable
	public String repository() {
		return this.repository;
	}

	/**
	 * API name: {@code snapshot}
	 */
	@Nullable
	public String snapshot() {
		return this.snapshot;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public String version() {
		return this.version;
	}

	/**
	 * API name: {@code restoreUUID}
	 */
	@Nullable
	public String restoreuuid() {
		return this.restoreuuid;
	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public String index() {
		return this.index;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.hostname != null) {

			generator.writeKey("hostname");
			generator.write(this.hostname);

		}
		if (this.host != null) {

			generator.writeKey("host");
			generator.write(this.host);

		}
		if (this.transportAddress != null) {

			generator.writeKey("transport_address");
			generator.write(this.transportAddress);

		}
		if (this.id != null) {

			generator.writeKey("id");
			generator.write(this.id);

		}
		if (this.ip != null) {

			generator.writeKey("ip");
			generator.write(this.ip);

		}
		if (this.name != null) {

			generator.writeKey("name");
			generator.write(this.name);

		}
		if (this.bootstrapNewHistoryUuid != null) {

			generator.writeKey("bootstrap_new_history_uuid");
			generator.write(this.bootstrapNewHistoryUuid);

		}
		if (this.repository != null) {

			generator.writeKey("repository");
			generator.write(this.repository);

		}
		if (this.snapshot != null) {

			generator.writeKey("snapshot");
			generator.write(this.snapshot);

		}
		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.restoreuuid != null) {

			generator.writeKey("restoreUUID");
			generator.write(this.restoreuuid);

		}
		if (this.index != null) {

			generator.writeKey("index");
			generator.write(this.index);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RecoveryOrigin}.
	 */
	public static class Builder implements ObjectBuilder<RecoveryOrigin> {
		@Nullable
		private String hostname;

		@Nullable
		private String host;

		@Nullable
		private String transportAddress;

		@Nullable
		private String id;

		@Nullable
		private String ip;

		@Nullable
		private String name;

		@Nullable
		private Boolean bootstrapNewHistoryUuid;

		@Nullable
		private String repository;

		@Nullable
		private String snapshot;

		@Nullable
		private String version;

		@Nullable
		private String restoreuuid;

		@Nullable
		private String index;

		/**
		 * API name: {@code hostname}
		 */
		public Builder hostname(@Nullable String value) {
			this.hostname = value;
			return this;
		}

		/**
		 * API name: {@code host}
		 */
		public Builder host(@Nullable String value) {
			this.host = value;
			return this;
		}

		/**
		 * API name: {@code transport_address}
		 */
		public Builder transportAddress(@Nullable String value) {
			this.transportAddress = value;
			return this;
		}

		/**
		 * API name: {@code id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code ip}
		 */
		public Builder ip(@Nullable String value) {
			this.ip = value;
			return this;
		}

		/**
		 * API name: {@code name}
		 */
		public Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code bootstrap_new_history_uuid}
		 */
		public Builder bootstrapNewHistoryUuid(@Nullable Boolean value) {
			this.bootstrapNewHistoryUuid = value;
			return this;
		}

		/**
		 * API name: {@code repository}
		 */
		public Builder repository(@Nullable String value) {
			this.repository = value;
			return this;
		}

		/**
		 * API name: {@code snapshot}
		 */
		public Builder snapshot(@Nullable String value) {
			this.snapshot = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code restoreUUID}
		 */
		public Builder restoreuuid(@Nullable String value) {
			this.restoreuuid = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * Builds a {@link RecoveryOrigin}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RecoveryOrigin build() {

			return new RecoveryOrigin(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for RecoveryOrigin
	 */
	public static final JsonpValueParser<RecoveryOrigin> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, RecoveryOrigin::setupRecoveryOriginParser);

	protected static void setupRecoveryOriginParser(DelegatingJsonpValueParser<RecoveryOrigin.Builder> op) {

		op.add(Builder::hostname, JsonpValueParser.stringParser(), "hostname");
		op.add(Builder::host, JsonpValueParser.stringParser(), "host");
		op.add(Builder::transportAddress, JsonpValueParser.stringParser(), "transport_address");
		op.add(Builder::id, JsonpValueParser.stringParser(), "id");
		op.add(Builder::ip, JsonpValueParser.stringParser(), "ip");
		op.add(Builder::name, JsonpValueParser.stringParser(), "name");
		op.add(Builder::bootstrapNewHistoryUuid, JsonpValueParser.booleanParser(), "bootstrap_new_history_uuid");
		op.add(Builder::repository, JsonpValueParser.stringParser(), "repository");
		op.add(Builder::snapshot, JsonpValueParser.stringParser(), "snapshot");
		op.add(Builder::version, JsonpValueParser.stringParser(), "version");
		op.add(Builder::restoreuuid, JsonpValueParser.stringParser(), "restoreUUID");
		op.add(Builder::index, JsonpValueParser.stringParser(), "index");

	}

}
