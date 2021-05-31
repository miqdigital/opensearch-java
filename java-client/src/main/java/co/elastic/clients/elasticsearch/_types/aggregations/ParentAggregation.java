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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import javax.annotation.Nullable;

// typedef: _types.aggregations.ParentAggregation
public final class ParentAggregation extends BucketAggregationBase {
	@Nullable
	private final String type;

	// ---------------------------------------------------------------------------------------------

	protected ParentAggregation(Builder builder) {
		super(builder);
		this.type = builder.type;

	}

	/**
	 * API name: {@code type}
	 */
	@Nullable
	public String type() {
		return this.type;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.type != null) {

			generator.writeKey("type");
			generator.write(this.type);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ParentAggregation}.
	 */
	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ParentAggregation> {
		@Nullable
		private String type;

		/**
		 * API name: {@code type}
		 */
		public Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ParentAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ParentAggregation build() {

			return new ParentAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for ParentAggregation
	 */
	public static final JsonpValueParser<ParentAggregation> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, ParentAggregation::setupParentAggregationParser);

	protected static void setupParentAggregationParser(DelegatingJsonpValueParser<ParentAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseParser(op);
		op.add(Builder::type, JsonpValueParser.stringParser(), "type");

	}

}
