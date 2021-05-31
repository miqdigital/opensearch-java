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

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.find_file_structure.Response
public final class FindFileStructureResponse implements ToJsonp {
	private final String stub;

	// ---------------------------------------------------------------------------------------------

	protected FindFileStructureResponse(Builder builder) {

		this.stub = Objects.requireNonNull(builder.stub, "stub");

	}

	/**
	 * API name: {@code stub}
	 */
	public String stub() {
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
	 * Builder for {@link FindFileStructureResponse}.
	 */
	public static class Builder implements ObjectBuilder<FindFileStructureResponse> {
		private String stub;

		/**
		 * API name: {@code stub}
		 */
		public Builder stub(String value) {
			this.stub = value;
			return this;
		}

		/**
		 * Builds a {@link FindFileStructureResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FindFileStructureResponse build() {

			return new FindFileStructureResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for FindFileStructureResponse
	 */
	public static final JsonpValueParser<FindFileStructureResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, FindFileStructureResponse::setupFindFileStructureResponseParser);

	protected static void setupFindFileStructureResponseParser(
			DelegatingJsonpValueParser<FindFileStructureResponse.Builder> op) {

		op.add(Builder::stub, JsonpValueParser.stringParser(), "stub");

	}

}
