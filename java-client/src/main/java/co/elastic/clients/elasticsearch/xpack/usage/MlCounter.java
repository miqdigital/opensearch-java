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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: xpack.usage.MlCounter
public final class MlCounter implements ToJsonp {
	private final Number count;

	// ---------------------------------------------------------------------------------------------

	protected MlCounter(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");

	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
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

		generator.writeKey("count");
		generator.write(this.count.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlCounter}.
	 */
	public static class Builder implements ObjectBuilder<MlCounter> {
		private Number count;

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * Builds a {@link MlCounter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlCounter build() {

			return new MlCounter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for MlCounter
	 */
	public static final JsonpValueParser<MlCounter> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, MlCounter::setupMlCounterParser);

	protected static void setupMlCounterParser(DelegatingJsonpValueParser<MlCounter.Builder> op) {

		op.add(Builder::count, JsonpValueParser.numberParser(), "count");

	}

}
