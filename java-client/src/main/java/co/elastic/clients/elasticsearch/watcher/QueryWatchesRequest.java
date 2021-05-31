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

package co.elastic.clients.elasticsearch.watcher;

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
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: watcher.query_watches.Request
public final class QueryWatchesRequest extends RequestBase implements ToJsonp {
	private final String stubA;

	private final String stubB;

	private final String stubC;

	// ---------------------------------------------------------------------------------------------

	protected QueryWatchesRequest(Builder builder) {

		this.stubA = Objects.requireNonNull(builder.stubA, "stub_a");
		this.stubB = Objects.requireNonNull(builder.stubB, "stub_b");
		this.stubC = Objects.requireNonNull(builder.stubC, "stub_c");

	}

	/**
	 * API name: {@code stub_a}
	 */
	public String stubA() {
		return this.stubA;
	}

	/**
	 * API name: {@code stub_b}
	 */
	public String stubB() {
		return this.stubB;
	}

	/**
	 * API name: {@code stub_c}
	 */
	public String stubC() {
		return this.stubC;
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

		generator.writeKey("stub_c");
		generator.write(this.stubC);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link QueryWatchesRequest}.
	 */
	public static class Builder implements ObjectBuilder<QueryWatchesRequest> {
		private String stubA;

		private String stubB;

		private String stubC;

		/**
		 * API name: {@code stub_a}
		 */
		public Builder stubA(String value) {
			this.stubA = value;
			return this;
		}

		/**
		 * API name: {@code stub_b}
		 */
		public Builder stubB(String value) {
			this.stubB = value;
			return this;
		}

		/**
		 * API name: {@code stub_c}
		 */
		public Builder stubC(String value) {
			this.stubC = value;
			return this;
		}

		/**
		 * Builds a {@link QueryWatchesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryWatchesRequest build() {

			return new QueryWatchesRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for QueryWatchesRequest
	 */
	public static final JsonpValueParser<QueryWatchesRequest> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, QueryWatchesRequest::setupQueryWatchesRequestParser);

	protected static void setupQueryWatchesRequestParser(DelegatingJsonpValueParser<QueryWatchesRequest.Builder> op) {

		op.add(Builder::stubC, JsonpValueParser.stringParser(), "stub_c");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code watcher.query_watches}".
	 */
	public static final Endpoint<QueryWatchesRequest, QueryWatchesResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> "POST",

			// Request path
			request -> {
				StringBuilder buf = new StringBuilder();
				buf.append("/_watcher");
				buf.append("/_query");
				buf.append("/watches");
				return buf.toString();

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("stub_b", request.stubB);
				return params;

			}, Endpoint.Simple.emptyMap(), true, QueryWatchesResponse.JSONP_PARSER);
}
