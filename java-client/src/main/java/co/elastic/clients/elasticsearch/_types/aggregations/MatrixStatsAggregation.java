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

// typedef: _types.aggregations.MatrixStatsAggregation
public final class MatrixStatsAggregation extends MatrixAggregation {
	@Nullable
	private final JsonValue mode;

	// ---------------------------------------------------------------------------------------------

	protected MatrixStatsAggregation(Builder builder) {
		super(builder);
		this.mode = builder.mode;

	}

	/**
	 * API name: {@code mode}
	 */
	@Nullable
	public JsonValue mode() {
		return this.mode;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.mode != null) {

			generator.writeKey("mode");
			generator.write(this.mode);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MatrixStatsAggregation}.
	 */
	public static class Builder extends MatrixAggregation.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MatrixStatsAggregation> {
		@Nullable
		private JsonValue mode;

		/**
		 * API name: {@code mode}
		 */
		public Builder mode(@Nullable JsonValue value) {
			this.mode = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MatrixStatsAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MatrixStatsAggregation build() {

			return new MatrixStatsAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for MatrixStatsAggregation
	 */
	public static final JsonpValueParser<MatrixStatsAggregation> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, MatrixStatsAggregation::setupMatrixStatsAggregationParser);

	protected static void setupMatrixStatsAggregationParser(
			DelegatingJsonpValueParser<MatrixStatsAggregation.Builder> op) {
		MatrixAggregation.setupMatrixAggregationParser(op);
		op.add(Builder::mode, JsonpValueParser.jsonValueParser(), "mode");

	}

}
