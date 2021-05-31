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

package co.elastic.clients.elasticsearch.slm;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: slm.put_lifecycle.Request
public final class PutLifecycleRequest extends RequestBase implements ToJsonp {
	private final String policyId;

	@Nullable
	private final Configuration config;

	@Nullable
	private final String name;

	@Nullable
	private final String repository;

	@Nullable
	private final Retention retention;

	@Nullable
	private final JsonValue schedule;

	// ---------------------------------------------------------------------------------------------

	protected PutLifecycleRequest(Builder builder) {

		this.policyId = Objects.requireNonNull(builder.policyId, "policy_id");
		this.config = builder.config;
		this.name = builder.name;
		this.repository = builder.repository;
		this.retention = builder.retention;
		this.schedule = builder.schedule;

	}

	/**
	 * API name: {@code policy_id}
	 */
	public String policyId() {
		return this.policyId;
	}

	/**
	 * API name: {@code config}
	 */
	@Nullable
	public Configuration config() {
		return this.config;
	}

	/**
	 * API name: {@code name}
	 */
	@Nullable
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code repository}
	 */
	@Nullable
	public String repository() {
		return this.repository;
	}

	/**
	 * API name: {@code retention}
	 */
	@Nullable
	public Retention retention() {
		return this.retention;
	}

	/**
	 * API name: {@code schedule}
	 */
	@Nullable
	public JsonValue schedule() {
		return this.schedule;
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

		if (this.config != null) {

			generator.writeKey("config");
			this.config.toJsonp(generator, mapper);

		}
		if (this.name != null) {

			generator.writeKey("name");
			generator.write(this.name);

		}
		if (this.repository != null) {

			generator.writeKey("repository");
			generator.write(this.repository);

		}
		if (this.retention != null) {

			generator.writeKey("retention");
			this.retention.toJsonp(generator, mapper);

		}
		if (this.schedule != null) {

			generator.writeKey("schedule");
			generator.write(this.schedule);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutLifecycleRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutLifecycleRequest> {
		private String policyId;

		@Nullable
		private Configuration config;

		@Nullable
		private String name;

		@Nullable
		private String repository;

		@Nullable
		private Retention retention;

		@Nullable
		private JsonValue schedule;

		/**
		 * API name: {@code policy_id}
		 */
		public Builder policyId(String value) {
			this.policyId = value;
			return this;
		}

		/**
		 * API name: {@code config}
		 */
		public Builder config(@Nullable Configuration value) {
			this.config = value;
			return this;
		}

		/**
		 * API name: {@code config}
		 */
		public Builder config(Function<Configuration.Builder, ObjectBuilder<Configuration>> fn) {
			return this.config(fn.apply(new Configuration.Builder()).build());
		}

		/**
		 * API name: {@code name}
		 */
		public Builder name(@Nullable String value) {
			this.name = value;
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
		 * API name: {@code retention}
		 */
		public Builder retention(@Nullable Retention value) {
			this.retention = value;
			return this;
		}

		/**
		 * API name: {@code retention}
		 */
		public Builder retention(Function<Retention.Builder, ObjectBuilder<Retention>> fn) {
			return this.retention(fn.apply(new Retention.Builder()).build());
		}

		/**
		 * API name: {@code schedule}
		 */
		public Builder schedule(@Nullable JsonValue value) {
			this.schedule = value;
			return this;
		}

		/**
		 * Builds a {@link PutLifecycleRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutLifecycleRequest build() {

			return new PutLifecycleRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for PutLifecycleRequest
	 */
	public static final JsonpValueParser<PutLifecycleRequest> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, PutLifecycleRequest::setupPutLifecycleRequestParser);

	protected static void setupPutLifecycleRequestParser(DelegatingJsonpValueParser<PutLifecycleRequest.Builder> op) {

		op.add(Builder::config, Configuration.JSONP_PARSER, "config");
		op.add(Builder::name, JsonpValueParser.stringParser(), "name");
		op.add(Builder::repository, JsonpValueParser.stringParser(), "repository");
		op.add(Builder::retention, Retention.JSONP_PARSER, "retention");
		op.add(Builder::schedule, JsonpValueParser.jsonValueParser(), "schedule");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code slm.put_lifecycle}".
	 */
	public static final Endpoint<PutLifecycleRequest, PutLifecycleResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> "PUT",

			// Request path
			request -> {
				StringBuilder buf = new StringBuilder();
				buf.append("/_slm");
				buf.append("/policy");
				buf.append("/");
				buf.append(request.policyId);
				return buf.toString();

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, PutLifecycleResponse.JSONP_PARSER);
}
