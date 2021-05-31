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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.NamedQuery
public final class NamedQuery<TQuery> implements ToJsonp {
	@Nullable
	private final Number boost;

	@Nullable
	private final String _name;

	@Nullable
	private final Boolean ignoreUnmapped;

	@Nullable
	private final JsonpSerializer<TQuery> tQuerySerializer;

	// ---------------------------------------------------------------------------------------------

	protected NamedQuery(Builder<TQuery> builder) {

		this.boost = builder.boost;
		this._name = builder._name;
		this.ignoreUnmapped = builder.ignoreUnmapped;
		this.tQuerySerializer = builder.tQuerySerializer;

	}

	/**
	 * API name: {@code boost}
	 */
	@Nullable
	public Number boost() {
		return this.boost;
	}

	/**
	 * API name: {@code _name}
	 */
	@Nullable
	public String _name() {
		return this._name;
	}

	/**
	 * API name: {@code ignore_unmapped}
	 */
	@Nullable
	public Boolean ignoreUnmapped() {
		return this.ignoreUnmapped;
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

		if (this.boost != null) {

			generator.writeKey("boost");
			generator.write(this.boost.doubleValue());

		}
		if (this._name != null) {

			generator.writeKey("_name");
			generator.write(this._name);

		}
		if (this.ignoreUnmapped != null) {

			generator.writeKey("ignore_unmapped");
			generator.write(this.ignoreUnmapped);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NamedQuery}.
	 */
	public static class Builder<TQuery> implements ObjectBuilder<NamedQuery<TQuery>> {
		@Nullable
		private Number boost;

		@Nullable
		private String _name;

		@Nullable
		private Boolean ignoreUnmapped;

		@Nullable
		private JsonpSerializer<TQuery> tQuerySerializer;

		/**
		 * API name: {@code boost}
		 */
		public Builder<TQuery> boost(@Nullable Number value) {
			this.boost = value;
			return this;
		}

		/**
		 * API name: {@code _name}
		 */
		public Builder<TQuery> _name(@Nullable String value) {
			this._name = value;
			return this;
		}

		/**
		 * API name: {@code ignore_unmapped}
		 */
		public Builder<TQuery> ignoreUnmapped(@Nullable Boolean value) {
			this.ignoreUnmapped = value;
			return this;
		}

		/**
		 * Serializer for TQuery. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 *
		 */
		public Builder<TQuery> tQuerySerializer(@Nullable JsonpSerializer<TQuery> value) {
			this.tQuerySerializer = value;
			return this;
		}

		/**
		 * Builds a {@link NamedQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NamedQuery<TQuery> build() {

			return new NamedQuery<TQuery>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json parser for NamedQuery
	 */
	public static <TQuery> JsonpValueParser<NamedQuery<TQuery>> createNamedQueryParser(
			JsonpValueParser<TQuery> tQueryParser) {
		return JsonpObjectBuilderParser.createForObject((Supplier<Builder<TQuery>>) Builder::new,
				op -> NamedQuery.setupNamedQueryParser(op, tQueryParser));
	};

	protected static <TQuery> void setupNamedQueryParser(DelegatingJsonpValueParser<NamedQuery.Builder<TQuery>> op,
			JsonpValueParser<TQuery> tQueryParser) {

		op.add(Builder::boost, JsonpValueParser.numberParser(), "boost");
		op.add(Builder::_name, JsonpValueParser.stringParser(), "_name");
		op.add(Builder::ignoreUnmapped, JsonpValueParser.booleanParser(), "ignore_unmapped");

	}

}
