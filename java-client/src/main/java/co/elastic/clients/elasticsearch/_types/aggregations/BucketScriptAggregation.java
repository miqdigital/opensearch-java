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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import javax.annotation.Nullable;

// typedef: _types.aggregations.BucketScriptAggregation
public final class BucketScriptAggregation extends PipelineAggregationBase {
	@Nullable
	private final JsonValue script;

	// ---------------------------------------------------------------------------------------------

	protected BucketScriptAggregation(Builder builder) {
		super(builder);
		this.script = builder.script;

	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public JsonValue script() {
		return this.script;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.script != null) {

			generator.writeKey("script");
			generator.write(this.script);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BucketScriptAggregation}.
	 */
	public static class Builder extends PipelineAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<BucketScriptAggregation> {
		@Nullable
		private JsonValue script;

		/**
		 * API name: {@code script}
		 */
		public Builder script(@Nullable JsonValue value) {
			this.script = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BucketScriptAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BucketScriptAggregation build() {

			return new BucketScriptAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for BucketScriptAggregation
	 */
	public static final JsonpValueParser<BucketScriptAggregation> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, BucketScriptAggregation::setupBucketScriptAggregationParser);

	protected static void setupBucketScriptAggregationParser(
			DelegatingJsonpValueParser<BucketScriptAggregation.Builder> op) {
		PipelineAggregationBase.setupPipelineAggregationBaseParser(op);
		op.add(Builder::script, JsonpValueParser.jsonValueParser(), "script");

	}

}
