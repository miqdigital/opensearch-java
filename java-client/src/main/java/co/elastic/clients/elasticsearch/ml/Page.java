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
import java.lang.Number;
import javax.annotation.Nullable;

// typedef: ml._types.Page
public final class Page implements ToJsonp {
	@Nullable
	private final Number from;

	@Nullable
	private final Number size;

	// ---------------------------------------------------------------------------------------------

	protected Page(Builder builder) {

		this.from = builder.from;
		this.size = builder.size;

	}

	/**
	 * API name: {@code from}
	 */
	@Nullable
	public Number from() {
		return this.from;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public Number size() {
		return this.size;
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

		if (this.from != null) {

			generator.writeKey("from");
			generator.write(this.from.doubleValue());

		}
		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Page}.
	 */
	public static class Builder implements ObjectBuilder<Page> {
		@Nullable
		private Number from;

		@Nullable
		private Number size;

		/**
		 * API name: {@code from}
		 */
		public Builder from(@Nullable Number value) {
			this.from = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Number value) {
			this.size = value;
			return this;
		}

		/**
		 * Builds a {@link Page}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Page build() {

			return new Page(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for Page
	 */
	public static final JsonpValueParser<Page> JSONP_PARSER = JsonpObjectBuilderParser.createForObject(Builder::new,
			Page::setupPageParser);

	protected static void setupPageParser(DelegatingJsonpValueParser<Page.Builder> op) {

		op.add(Builder::from, JsonpValueParser.numberParser(), "from");
		op.add(Builder::size, JsonpValueParser.numberParser(), "size");

	}

}
