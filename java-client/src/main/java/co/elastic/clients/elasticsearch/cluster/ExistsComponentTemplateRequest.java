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

package co.elastic.clients.elasticsearch.cluster;

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

// typedef: cluster.exists_component_template.Request
public final class ExistsComponentTemplateRequest extends RequestBase implements ToJsonp {
	private final String stubA;

	@Nullable
	private final String name;

	private final String stubB;

	private final String stubC;

	// ---------------------------------------------------------------------------------------------

	protected ExistsComponentTemplateRequest(Builder builder) {

		this.stubA = Objects.requireNonNull(builder.stubA, "stub_a");
		this.name = builder.name;
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
	 * Auto generated - missing in the input spec
	 *
	 * API name: {@code name}
	 */
	@Nullable
	public String name() {
		return this.name;
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
	 * Builder for {@link ExistsComponentTemplateRequest}.
	 */
	public static class Builder implements ObjectBuilder<ExistsComponentTemplateRequest> {
		private String stubA;

		@Nullable
		private String name;

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
		 * Auto generated - missing in the input spec
		 *
		 * API name: {@code name}
		 */
		public Builder name(@Nullable String value) {
			this.name = value;
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
		 * Builds a {@link ExistsComponentTemplateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExistsComponentTemplateRequest build() {

			return new ExistsComponentTemplateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for ExistsComponentTemplateRequest
	 */
	public static final JsonpValueParser<ExistsComponentTemplateRequest> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, ExistsComponentTemplateRequest::setupExistsComponentTemplateRequestParser);

	protected static void setupExistsComponentTemplateRequestParser(
			DelegatingJsonpValueParser<ExistsComponentTemplateRequest.Builder> op) {

		op.add(Builder::stubC, JsonpValueParser.stringParser(), "stub_c");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cluster.exists_component_template}".
	 */
	public static final Endpoint<ExistsComponentTemplateRequest, ExistsComponentTemplateResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> "HEAD",

			// Request path
			request -> {
				StringBuilder buf = new StringBuilder();
				buf.append("/_component_template");
				if (request.name != null) {
					buf.append("/");
					buf.append(request.name);
				}
				return buf.toString();

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("stub_b", request.stubB);
				return params;

			}, Endpoint.Simple.emptyMap(), true, ExistsComponentTemplateResponse.JSONP_PARSER);
}
