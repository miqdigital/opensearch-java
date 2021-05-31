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

package co.elastic.clients.elasticsearch.sql;

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
import java.util.Collections;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: sql.clear_cursor.Request
public final class ClearCursorRequest extends RequestBase implements ToJsonp {
	private final String cursor;

	// ---------------------------------------------------------------------------------------------

	protected ClearCursorRequest(Builder builder) {

		this.cursor = Objects.requireNonNull(builder.cursor, "cursor");

	}

	/**
	 * API name: {@code cursor}
	 */
	public String cursor() {
		return this.cursor;
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

		generator.writeKey("cursor");
		generator.write(this.cursor);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClearCursorRequest}.
	 */
	public static class Builder implements ObjectBuilder<ClearCursorRequest> {
		private String cursor;

		/**
		 * API name: {@code cursor}
		 */
		public Builder cursor(String value) {
			this.cursor = value;
			return this;
		}

		/**
		 * Builds a {@link ClearCursorRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClearCursorRequest build() {

			return new ClearCursorRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for ClearCursorRequest
	 */
	public static final JsonpValueParser<ClearCursorRequest> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, ClearCursorRequest::setupClearCursorRequestParser);

	protected static void setupClearCursorRequestParser(DelegatingJsonpValueParser<ClearCursorRequest.Builder> op) {

		op.add(Builder::cursor, JsonpValueParser.stringParser(), "cursor");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code sql.clear_cursor}".
	 */
	public static final Endpoint<ClearCursorRequest, ClearCursorResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> "POST",

			// Request path
			request -> {
				StringBuilder buf = new StringBuilder();
				buf.append("/_sql");
				buf.append("/close");
				return buf.toString();

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, ClearCursorResponse.JSONP_PARSER);
}
