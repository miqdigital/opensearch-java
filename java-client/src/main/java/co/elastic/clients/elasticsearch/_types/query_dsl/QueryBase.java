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
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.QueryBase
public abstract class QueryBase implements ToJsonp {
	@Nullable
	private final Number boost;

	@Nullable
	private final String _name;

	// ---------------------------------------------------------------------------------------------

	protected QueryBase(AbstractBuilder<?> builder) {

		this.boost = builder.boost;
		this._name = builder._name;

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

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		@Nullable
		private Number boost;

		@Nullable
		private String _name;

		/**
		 * API name: {@code boost}
		 */
		public BuilderT boost(@Nullable Number value) {
			this.boost = value;
			return self();
		}

		/**
		 * API name: {@code _name}
		 */
		public BuilderT _name(@Nullable String value) {
			this._name = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupQueryBaseParser(
			DelegatingJsonpValueParser<BuilderT> op) {

		op.add(AbstractBuilder::boost, JsonpValueParser.numberParser(), "boost");
		op.add(AbstractBuilder::_name, JsonpValueParser.stringParser(), "_name");

	}

}
