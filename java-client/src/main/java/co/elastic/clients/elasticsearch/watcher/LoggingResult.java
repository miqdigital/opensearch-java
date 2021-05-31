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

// typedef: watcher._types.LoggingResult
public final class LoggingResult implements ToJsonp {
	private final String loggedText;

	// ---------------------------------------------------------------------------------------------

	protected LoggingResult(Builder builder) {

		this.loggedText = Objects.requireNonNull(builder.loggedText, "logged_text");

	}

	/**
	 * API name: {@code logged_text}
	 */
	public String loggedText() {
		return this.loggedText;
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

		generator.writeKey("logged_text");
		generator.write(this.loggedText);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LoggingResult}.
	 */
	public static class Builder implements ObjectBuilder<LoggingResult> {
		private String loggedText;

		/**
		 * API name: {@code logged_text}
		 */
		public Builder loggedText(String value) {
			this.loggedText = value;
			return this;
		}

		/**
		 * Builds a {@link LoggingResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LoggingResult build() {

			return new LoggingResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for LoggingResult
	 */
	public static final JsonpValueParser<LoggingResult> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, LoggingResult::setupLoggingResultParser);

	protected static void setupLoggingResultParser(DelegatingJsonpValueParser<LoggingResult.Builder> op) {

		op.add(Builder::loggedText, JsonpValueParser.stringParser(), "logged_text");

	}

}
