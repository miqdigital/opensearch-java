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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import javax.annotation.Nullable;

// typedef: _types.aggregations.TDigest
public final class TDigest implements ToJsonp {
	@Nullable
	private final Number compression;

	// ---------------------------------------------------------------------------------------------

	protected TDigest(Builder builder) {

		this.compression = builder.compression;

	}

	/**
	 * API name: {@code compression}
	 */
	@Nullable
	public Number compression() {
		return this.compression;
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

		if (this.compression != null) {

			generator.writeKey("compression");
			generator.write(this.compression.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TDigest}.
	 */
	public static class Builder implements ObjectBuilder<TDigest> {
		@Nullable
		private Number compression;

		/**
		 * API name: {@code compression}
		 */
		public Builder compression(@Nullable Number value) {
			this.compression = value;
			return this;
		}

		/**
		 * Builds a {@link TDigest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TDigest build() {

			return new TDigest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for TDigest
	 */
	public static final JsonpValueParser<TDigest> JSONP_PARSER = JsonpObjectBuilderParser.createForObject(Builder::new,
			TDigest::setupTDigestParser);

	protected static void setupTDigestParser(DelegatingJsonpValueParser<TDigest.Builder> op) {

		op.add(Builder::compression, JsonpValueParser.numberParser(), "compression");

	}

}
