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

package co.elastic.clients.elasticsearch.ml;

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

// typedef: ml.put_trained_model.Request
public final class PutTrainedModelRequest extends RequestBase implements ToJsonp {
	private final String stub;

	@Nullable
	private final String modelId;

	// ---------------------------------------------------------------------------------------------

	protected PutTrainedModelRequest(Builder builder) {

		this.stub = Objects.requireNonNull(builder.stub, "stub");
		this.modelId = builder.modelId;

	}

	/**
	 * API name: {@code stub}
	 */
	public String stub() {
		return this.stub;
	}

	/**
	 * Auto generated - missing in the input spec
	 *
	 * API name: {@code model_id}
	 */
	@Nullable
	public String modelId() {
		return this.modelId;
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

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutTrainedModelRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutTrainedModelRequest> {
		private String stub;

		@Nullable
		private String modelId;

		/**
		 * API name: {@code stub}
		 */
		public Builder stub(String value) {
			this.stub = value;
			return this;
		}

		/**
		 * Auto generated - missing in the input spec
		 *
		 * API name: {@code model_id}
		 */
		public Builder modelId(@Nullable String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * Builds a {@link PutTrainedModelRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutTrainedModelRequest build() {

			return new PutTrainedModelRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for PutTrainedModelRequest
	 */
	public static final JsonpValueParser<PutTrainedModelRequest> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, PutTrainedModelRequest::setupPutTrainedModelRequestParser);

	protected static void setupPutTrainedModelRequestParser(
			DelegatingJsonpValueParser<PutTrainedModelRequest.Builder> op) {

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.put_trained_model}".
	 */
	public static final Endpoint<PutTrainedModelRequest, PutTrainedModelResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> "PUT",

			// Request path
			request -> {
				StringBuilder buf = new StringBuilder();
				buf.append("/_ml");
				buf.append("/trained_models");
				if (request.modelId != null) {
					buf.append("/");
					buf.append(request.modelId);
				}
				return buf.toString();

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				return params;

			}, Endpoint.Simple.emptyMap(), true, PutTrainedModelResponse.JSONP_PARSER);
}
