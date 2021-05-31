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

package co.elastic.clients.elasticsearch._global.mtermvectors;

import co.elastic.clients.elasticsearch._global.termvectors.Filter;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.mtermvectors.Operation
public final class Operation implements ToJsonp {
	private final JsonValue doc;

	private final List<String> fields;

	private final Boolean fieldStatistics;

	private final Filter filter;

	private final String _id;

	private final String _index;

	private final Boolean offsets;

	private final Boolean payloads;

	private final Boolean positions;

	private final JsonValue routing;

	private final Boolean termStatistics;

	private final Number version;

	private final JsonValue versionType;

	// ---------------------------------------------------------------------------------------------

	protected Operation(Builder builder) {

		this.doc = Objects.requireNonNull(builder.doc, "doc");
		this.fields = Objects.requireNonNull(builder.fields, "fields");
		this.fieldStatistics = Objects.requireNonNull(builder.fieldStatistics, "field_statistics");
		this.filter = Objects.requireNonNull(builder.filter, "filter");
		this._id = Objects.requireNonNull(builder._id, "_id");
		this._index = Objects.requireNonNull(builder._index, "_index");
		this.offsets = Objects.requireNonNull(builder.offsets, "offsets");
		this.payloads = Objects.requireNonNull(builder.payloads, "payloads");
		this.positions = Objects.requireNonNull(builder.positions, "positions");
		this.routing = Objects.requireNonNull(builder.routing, "routing");
		this.termStatistics = Objects.requireNonNull(builder.termStatistics, "term_statistics");
		this.version = Objects.requireNonNull(builder.version, "version");
		this.versionType = Objects.requireNonNull(builder.versionType, "version_type");

	}

	/**
	 * API name: {@code doc}
	 */
	public JsonValue doc() {
		return this.doc;
	}

	/**
	 * API name: {@code fields}
	 */
	public List<String> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code field_statistics}
	 */
	public Boolean fieldStatistics() {
		return this.fieldStatistics;
	}

	/**
	 * API name: {@code filter}
	 */
	public Filter filter() {
		return this.filter;
	}

	/**
	 * API name: {@code _id}
	 */
	public String _id() {
		return this._id;
	}

	/**
	 * API name: {@code _index}
	 */
	public String _index() {
		return this._index;
	}

	/**
	 * API name: {@code offsets}
	 */
	public Boolean offsets() {
		return this.offsets;
	}

	/**
	 * API name: {@code payloads}
	 */
	public Boolean payloads() {
		return this.payloads;
	}

	/**
	 * API name: {@code positions}
	 */
	public Boolean positions() {
		return this.positions;
	}

	/**
	 * API name: {@code routing}
	 */
	public JsonValue routing() {
		return this.routing;
	}

	/**
	 * API name: {@code term_statistics}
	 */
	public Boolean termStatistics() {
		return this.termStatistics;
	}

	/**
	 * API name: {@code version}
	 */
	public Number version() {
		return this.version;
	}

	/**
	 * API name: {@code version_type}
	 */
	public JsonValue versionType() {
		return this.versionType;
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

		generator.writeKey("doc");
		generator.write(this.doc);

		generator.writeKey("fields");
		generator.writeStartArray();
		for (String item0 : this.fields) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("field_statistics");
		generator.write(this.fieldStatistics);

		generator.writeKey("filter");
		this.filter.toJsonp(generator, mapper);

		generator.writeKey("_id");
		generator.write(this._id);

		generator.writeKey("_index");
		generator.write(this._index);

		generator.writeKey("offsets");
		generator.write(this.offsets);

		generator.writeKey("payloads");
		generator.write(this.payloads);

		generator.writeKey("positions");
		generator.write(this.positions);

		generator.writeKey("routing");
		generator.write(this.routing);

		generator.writeKey("term_statistics");
		generator.write(this.termStatistics);

		generator.writeKey("version");
		generator.write(this.version.doubleValue());

		generator.writeKey("version_type");
		generator.write(this.versionType);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Operation}.
	 */
	public static class Builder implements ObjectBuilder<Operation> {
		private JsonValue doc;

		private List<String> fields;

		private Boolean fieldStatistics;

		private Filter filter;

		private String _id;

		private String _index;

		private Boolean offsets;

		private Boolean payloads;

		private Boolean positions;

		private JsonValue routing;

		private Boolean termStatistics;

		private Number version;

		private JsonValue versionType;

		/**
		 * API name: {@code doc}
		 */
		public Builder doc(JsonValue value) {
			this.doc = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder fields(List<String> value) {
			this.fields = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder fields(String... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #fields(List)}, creating the list if needed.
		 */
		public Builder addFields(String value) {
			if (this.fields == null) {
				this.fields = new ArrayList<>();
			}
			this.fields.add(value);
			return this;
		}

		/**
		 * API name: {@code field_statistics}
		 */
		public Builder fieldStatistics(Boolean value) {
			this.fieldStatistics = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(Filter value) {
			this.filter = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(Function<Filter.Builder, ObjectBuilder<Filter>> fn) {
			return this.filter(fn.apply(new Filter.Builder()).build());
		}

		/**
		 * API name: {@code _id}
		 */
		public Builder _id(String value) {
			this._id = value;
			return this;
		}

		/**
		 * API name: {@code _index}
		 */
		public Builder _index(String value) {
			this._index = value;
			return this;
		}

		/**
		 * API name: {@code offsets}
		 */
		public Builder offsets(Boolean value) {
			this.offsets = value;
			return this;
		}

		/**
		 * API name: {@code payloads}
		 */
		public Builder payloads(Boolean value) {
			this.payloads = value;
			return this;
		}

		/**
		 * API name: {@code positions}
		 */
		public Builder positions(Boolean value) {
			this.positions = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public Builder routing(JsonValue value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code term_statistics}
		 */
		public Builder termStatistics(Boolean value) {
			this.termStatistics = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(Number value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code version_type}
		 */
		public Builder versionType(JsonValue value) {
			this.versionType = value;
			return this;
		}

		/**
		 * Builds a {@link Operation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Operation build() {

			return new Operation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for Operation
	 */
	public static final JsonpValueParser<Operation> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, Operation::setupOperationParser);

	protected static void setupOperationParser(DelegatingJsonpValueParser<Operation.Builder> op) {

		op.add(Builder::doc, JsonpValueParser.jsonValueParser(), "doc");
		op.add(Builder::fields, JsonpValueParser.arrayParser(JsonpValueParser.stringParser()), "fields");
		op.add(Builder::fieldStatistics, JsonpValueParser.booleanParser(), "field_statistics");
		op.add(Builder::filter, Filter.JSONP_PARSER, "filter");
		op.add(Builder::_id, JsonpValueParser.stringParser(), "_id");
		op.add(Builder::_index, JsonpValueParser.stringParser(), "_index");
		op.add(Builder::offsets, JsonpValueParser.booleanParser(), "offsets");
		op.add(Builder::payloads, JsonpValueParser.booleanParser(), "payloads");
		op.add(Builder::positions, JsonpValueParser.booleanParser(), "positions");
		op.add(Builder::routing, JsonpValueParser.jsonValueParser(), "routing");
		op.add(Builder::termStatistics, JsonpValueParser.booleanParser(), "term_statistics");
		op.add(Builder::version, JsonpValueParser.numberParser(), "version");
		op.add(Builder::versionType, JsonpValueParser.jsonValueParser(), "version_type");

	}

}
