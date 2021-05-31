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

package co.elastic.clients.elasticsearch.ml.info;

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

// typedef: ml.info.Datafeeds
public final class Datafeeds implements ToJsonp {
	private final Number scrollSize;

	// ---------------------------------------------------------------------------------------------

	protected Datafeeds(Builder builder) {

		this.scrollSize = Objects.requireNonNull(builder.scrollSize, "scroll_size");

	}

	/**
	 * API name: {@code scroll_size}
	 */
	public Number scrollSize() {
		return this.scrollSize;
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

		generator.writeKey("scroll_size");
		generator.write(this.scrollSize.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Datafeeds}.
	 */
	public static class Builder implements ObjectBuilder<Datafeeds> {
		private Number scrollSize;

		/**
		 * API name: {@code scroll_size}
		 */
		public Builder scrollSize(Number value) {
			this.scrollSize = value;
			return this;
		}

		/**
		 * Builds a {@link Datafeeds}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Datafeeds build() {

			return new Datafeeds(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for Datafeeds
	 */
	public static final JsonpValueParser<Datafeeds> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, Datafeeds::setupDatafeedsParser);

	protected static void setupDatafeedsParser(DelegatingJsonpValueParser<Datafeeds.Builder> op) {

		op.add(Builder::scrollSize, JsonpValueParser.numberParser(), "scroll_size");

	}

}
