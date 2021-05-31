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

package co.elastic.clients.elasticsearch._global.search;

import co.elastic.clients.elasticsearch._types.ScriptField;
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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.InnerHits
public final class InnerHits implements ToJsonp {
	@Nullable
	private final String name;

	@Nullable
	private final Number size;

	@Nullable
	private final Number from;

	@Nullable
	private final FieldCollapse collapse;

	@Nullable
	private final List<String> docvalueFields;

	@Nullable
	private final Boolean explain;

	@Nullable
	private final Highlight highlight;

	@Nullable
	private final Boolean ignoreUnmapped;

	@Nullable
	private final Map<String, ScriptField> scriptFields;

	@Nullable
	private final Boolean seqNoPrimaryTerm;

	@Nullable
	private final List<String> fields;

	@Nullable
	private final List<JsonValue> sort;

	@Nullable
	private final JsonValue _source;

	@Nullable
	private final Boolean version;

	// ---------------------------------------------------------------------------------------------

	protected InnerHits(Builder builder) {

		this.name = builder.name;
		this.size = builder.size;
		this.from = builder.from;
		this.collapse = builder.collapse;
		this.docvalueFields = builder.docvalueFields;
		this.explain = builder.explain;
		this.highlight = builder.highlight;
		this.ignoreUnmapped = builder.ignoreUnmapped;
		this.scriptFields = builder.scriptFields;
		this.seqNoPrimaryTerm = builder.seqNoPrimaryTerm;
		this.fields = builder.fields;
		this.sort = builder.sort;
		this._source = builder._source;
		this.version = builder.version;

	}

	/**
	 * API name: {@code name}
	 */
	@Nullable
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public Number size() {
		return this.size;
	}

	/**
	 * API name: {@code from}
	 */
	@Nullable
	public Number from() {
		return this.from;
	}

	/**
	 * API name: {@code collapse}
	 */
	@Nullable
	public FieldCollapse collapse() {
		return this.collapse;
	}

	/**
	 * API name: {@code docvalue_fields}
	 */
	@Nullable
	public List<String> docvalueFields() {
		return this.docvalueFields;
	}

	/**
	 * API name: {@code explain}
	 */
	@Nullable
	public Boolean explain() {
		return this.explain;
	}

	/**
	 * API name: {@code highlight}
	 */
	@Nullable
	public Highlight highlight() {
		return this.highlight;
	}

	/**
	 * API name: {@code ignore_unmapped}
	 */
	@Nullable
	public Boolean ignoreUnmapped() {
		return this.ignoreUnmapped;
	}

	/**
	 * API name: {@code script_fields}
	 */
	@Nullable
	public Map<String, ScriptField> scriptFields() {
		return this.scriptFields;
	}

	/**
	 * API name: {@code seq_no_primary_term}
	 */
	@Nullable
	public Boolean seqNoPrimaryTerm() {
		return this.seqNoPrimaryTerm;
	}

	/**
	 * API name: {@code fields}
	 */
	@Nullable
	public List<String> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code sort}
	 */
	@Nullable
	public List<JsonValue> sort() {
		return this.sort;
	}

	/**
	 * API name: {@code _source}
	 */
	@Nullable
	public JsonValue _source() {
		return this._source;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public Boolean version() {
		return this.version;
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

		if (this.name != null) {

			generator.writeKey("name");
			generator.write(this.name);

		}
		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size.doubleValue());

		}
		if (this.from != null) {

			generator.writeKey("from");
			generator.write(this.from.doubleValue());

		}
		if (this.collapse != null) {

			generator.writeKey("collapse");
			this.collapse.toJsonp(generator, mapper);

		}
		if (this.docvalueFields != null) {

			generator.writeKey("docvalue_fields");
			generator.writeStartArray();
			for (String item0 : this.docvalueFields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.explain != null) {

			generator.writeKey("explain");
			generator.write(this.explain);

		}
		if (this.highlight != null) {

			generator.writeKey("highlight");
			this.highlight.toJsonp(generator, mapper);

		}
		if (this.ignoreUnmapped != null) {

			generator.writeKey("ignore_unmapped");
			generator.write(this.ignoreUnmapped);

		}
		if (this.scriptFields != null) {

			generator.writeKey("script_fields");
			generator.writeStartObject();
			for (Map.Entry<String, ScriptField> item0 : this.scriptFields.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.seqNoPrimaryTerm != null) {

			generator.writeKey("seq_no_primary_term");
			generator.write(this.seqNoPrimaryTerm);

		}
		if (this.fields != null) {

			generator.writeKey("fields");
			generator.writeStartArray();
			for (String item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.sort != null) {

			generator.writeKey("sort");
			generator.writeStartArray();
			for (JsonValue item0 : this.sort) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this._source != null) {

			generator.writeKey("_source");
			generator.write(this._source);

		}
		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InnerHits}.
	 */
	public static class Builder implements ObjectBuilder<InnerHits> {
		@Nullable
		private String name;

		@Nullable
		private Number size;

		@Nullable
		private Number from;

		@Nullable
		private FieldCollapse collapse;

		@Nullable
		private List<String> docvalueFields;

		@Nullable
		private Boolean explain;

		@Nullable
		private Highlight highlight;

		@Nullable
		private Boolean ignoreUnmapped;

		@Nullable
		private Map<String, ScriptField> scriptFields;

		@Nullable
		private Boolean seqNoPrimaryTerm;

		@Nullable
		private List<String> fields;

		@Nullable
		private List<JsonValue> sort;

		@Nullable
		private JsonValue _source;

		@Nullable
		private Boolean version;

		/**
		 * API name: {@code name}
		 */
		public Builder name(@Nullable String value) {
			this.name = value;
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
		 * API name: {@code from}
		 */
		public Builder from(@Nullable Number value) {
			this.from = value;
			return this;
		}

		/**
		 * API name: {@code collapse}
		 */
		public Builder collapse(@Nullable FieldCollapse value) {
			this.collapse = value;
			return this;
		}

		/**
		 * API name: {@code collapse}
		 */
		public Builder collapse(Function<FieldCollapse.Builder, ObjectBuilder<FieldCollapse>> fn) {
			return this.collapse(fn.apply(new FieldCollapse.Builder()).build());
		}

		/**
		 * API name: {@code docvalue_fields}
		 */
		public Builder docvalueFields(@Nullable List<String> value) {
			this.docvalueFields = value;
			return this;
		}

		/**
		 * API name: {@code docvalue_fields}
		 */
		public Builder docvalueFields(String... value) {
			this.docvalueFields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #docvalueFields(List)}, creating the list if needed.
		 */
		public Builder addDocvalueFields(String value) {
			if (this.docvalueFields == null) {
				this.docvalueFields = new ArrayList<>();
			}
			this.docvalueFields.add(value);
			return this;
		}

		/**
		 * API name: {@code explain}
		 */
		public Builder explain(@Nullable Boolean value) {
			this.explain = value;
			return this;
		}

		/**
		 * API name: {@code highlight}
		 */
		public Builder highlight(@Nullable Highlight value) {
			this.highlight = value;
			return this;
		}

		/**
		 * API name: {@code highlight}
		 */
		public Builder highlight(Function<Highlight.Builder, ObjectBuilder<Highlight>> fn) {
			return this.highlight(fn.apply(new Highlight.Builder()).build());
		}

		/**
		 * API name: {@code ignore_unmapped}
		 */
		public Builder ignoreUnmapped(@Nullable Boolean value) {
			this.ignoreUnmapped = value;
			return this;
		}

		/**
		 * API name: {@code script_fields}
		 */
		public Builder scriptFields(@Nullable Map<String, ScriptField> value) {
			this.scriptFields = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #scriptFields(Map)}, creating the map if needed.
		 */
		public Builder putScriptFields(String key, ScriptField value) {
			if (this.scriptFields == null) {
				this.scriptFields = new HashMap<>();
			}
			this.scriptFields.put(key, value);
			return this;
		}

		/**
		 * Set {@link #scriptFields(Map)} to a singleton map.
		 */
		public Builder scriptFields(String key, Function<ScriptField.Builder, ObjectBuilder<ScriptField>> fn) {
			return this.scriptFields(Collections.singletonMap(key, fn.apply(new ScriptField.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #scriptFields(Map)}, creating the map if needed.
		 */
		public Builder putScriptFields(String key, Function<ScriptField.Builder, ObjectBuilder<ScriptField>> fn) {
			return this.putScriptFields(key, fn.apply(new ScriptField.Builder()).build());
		}

		/**
		 * API name: {@code seq_no_primary_term}
		 */
		public Builder seqNoPrimaryTerm(@Nullable Boolean value) {
			this.seqNoPrimaryTerm = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder fields(@Nullable List<String> value) {
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
		 * API name: {@code sort}
		 */
		public Builder sort(@Nullable List<JsonValue> value) {
			this.sort = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder sort(JsonValue... value) {
			this.sort = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sort(List)}, creating the list if needed.
		 */
		public Builder addSort(JsonValue value) {
			if (this.sort == null) {
				this.sort = new ArrayList<>();
			}
			this.sort.add(value);
			return this;
		}

		/**
		 * API name: {@code _source}
		 */
		public Builder _source(@Nullable JsonValue value) {
			this._source = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Boolean value) {
			this.version = value;
			return this;
		}

		/**
		 * Builds a {@link InnerHits}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InnerHits build() {

			return new InnerHits(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for InnerHits
	 */
	public static final JsonpValueParser<InnerHits> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, InnerHits::setupInnerHitsParser);

	protected static void setupInnerHitsParser(DelegatingJsonpValueParser<InnerHits.Builder> op) {

		op.add(Builder::name, JsonpValueParser.stringParser(), "name");
		op.add(Builder::size, JsonpValueParser.numberParser(), "size");
		op.add(Builder::from, JsonpValueParser.numberParser(), "from");
		op.add(Builder::collapse, FieldCollapse.JSONP_PARSER, "collapse");
		op.add(Builder::docvalueFields, JsonpValueParser.arrayParser(JsonpValueParser.stringParser()),
				"docvalue_fields");
		op.add(Builder::explain, JsonpValueParser.booleanParser(), "explain");
		op.add(Builder::highlight, Highlight.JSONP_PARSER, "highlight");
		op.add(Builder::ignoreUnmapped, JsonpValueParser.booleanParser(), "ignore_unmapped");
		op.add(Builder::scriptFields, JsonpValueParser.stringMapParser(ScriptField.JSONP_PARSER), "script_fields");
		op.add(Builder::seqNoPrimaryTerm, JsonpValueParser.booleanParser(), "seq_no_primary_term");
		op.add(Builder::fields, JsonpValueParser.arrayParser(JsonpValueParser.stringParser()), "fields");
		op.add(Builder::sort, JsonpValueParser.arrayParser(JsonpValueParser.jsonValueParser()), "sort");
		op.add(Builder::_source, JsonpValueParser.jsonValueParser(), "_source");
		op.add(Builder::version, JsonpValueParser.booleanParser(), "version");

	}

}
