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

package co.elastic.clients.elasticsearch.shutdown;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: shutdown.delete_node.Response
public final class DeleteNodeResponse implements ToJsonp {
	private final Boolean stub;

	// ---------------------------------------------------------------------------------------------

	protected DeleteNodeResponse(Builder builder) {

		this.stub = Objects.requireNonNull(builder.stub, "stub");

	}

	/**
	 * API name: {@code stub}
	 */
	public Boolean stub() {
		return this.stub;
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

		generator.writeKey("stub");
		generator.write(this.stub);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteNodeResponse}.
	 */
	public static class Builder implements ObjectBuilder<DeleteNodeResponse> {
		private Boolean stub;

		/**
		 * API name: {@code stub}
		 */
		public Builder stub(Boolean value) {
			this.stub = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteNodeResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteNodeResponse build() {

			return new DeleteNodeResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for DeleteNodeResponse
	 */
	public static final JsonpValueParser<DeleteNodeResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, DeleteNodeResponse::setupDeleteNodeResponseParser);

	protected static void setupDeleteNodeResponseParser(DelegatingJsonpValueParser<DeleteNodeResponse.Builder> op) {

		op.add(Builder::stub, JsonpValueParser.booleanParser(), "stub");

	}

}
