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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: snapshot.status.Request
public final class StatusRequest extends RequestBase {
	@Nullable
	private final String repository;

	@Nullable
	private final List<String> snapshot;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final JsonValue masterTimeout;

	// ---------------------------------------------------------------------------------------------

	protected StatusRequest(Builder builder) {

		this.repository = builder.repository;
		this.snapshot = builder.snapshot;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.masterTimeout = builder.masterTimeout;

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
	public List<String> snapshot() {
		return this.snapshot;
	}

	/**
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public JsonValue masterTimeout() {
		return this.masterTimeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StatusRequest}.
	 */
	public static class Builder implements ObjectBuilder<StatusRequest> {
		@Nullable
		private String repository;

		@Nullable
		private List<String> snapshot;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private JsonValue masterTimeout;

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
		public Builder snapshot(@Nullable List<String> value) {
			this.snapshot = value;
			return this;
		}

		/**
		 * API name: {@code snapshot}
		 */
		public Builder snapshot(String... value) {
			this.snapshot = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #snapshot(List)}, creating the list if needed.
		 */
		public Builder addSnapshot(String value) {
			if (this.snapshot == null) {
				this.snapshot = new ArrayList<>();
			}
			this.snapshot.add(value);
			return this;
		}

		/**
		 * API name: {@code ignore_unavailable}
		 */
		public Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable JsonValue value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Builds a {@link StatusRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StatusRequest build() {

			return new StatusRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code snapshot.status}".
	 */
	public static final Endpoint<StatusRequest, StatusResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> "GET",

			// Request path
			request -> {
				StringBuilder buf = new StringBuilder();
				buf.append("/_snapshot");
				if (request.repository != null) {
					buf.append("/");
					buf.append(request.repository);
				}
				if (request.snapshot != null) {
					buf.append("/");
					buf.append(request.snapshot.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				buf.append("/_status");
				return buf.toString();

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, StatusResponse.JSONP_PARSER);
}
