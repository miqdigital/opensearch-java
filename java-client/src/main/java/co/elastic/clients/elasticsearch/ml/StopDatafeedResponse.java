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
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.stop_datafeed.Response
public final class StopDatafeedResponse implements ToJsonp {
	private final Boolean stopped;

	// ---------------------------------------------------------------------------------------------

	protected StopDatafeedResponse(Builder builder) {

		this.stopped = Objects.requireNonNull(builder.stopped, "stopped");

	}

	/**
	 * API name: {@code stopped}
	 */
	public Boolean stopped() {
		return this.stopped;
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

		generator.writeKey("stopped");
		generator.write(this.stopped);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StopDatafeedResponse}.
	 */
	public static class Builder implements ObjectBuilder<StopDatafeedResponse> {
		private Boolean stopped;

		/**
		 * API name: {@code stopped}
		 */
		public Builder stopped(Boolean value) {
			this.stopped = value;
			return this;
		}

		/**
		 * Builds a {@link StopDatafeedResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StopDatafeedResponse build() {

			return new StopDatafeedResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for StopDatafeedResponse
	 */
	public static final JsonpValueParser<StopDatafeedResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, StopDatafeedResponse::setupStopDatafeedResponseParser);

	protected static void setupStopDatafeedResponseParser(DelegatingJsonpValueParser<StopDatafeedResponse.Builder> op) {

		op.add(Builder::stopped, JsonpValueParser.booleanParser(), "stopped");

	}

}
