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

package co.elastic.clients.elasticsearch._types.mapping;

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
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.TypeMapping
public final class TypeMapping implements ToJsonp {
	@Nullable
	private final AllField allField;

	@Nullable
	private final Boolean dateDetection;

	@Nullable
	private final JsonValue dynamic;

	@Nullable
	private final List<String> dynamicDateFormats;

	@Nullable
	private final List<Map<String, DynamicTemplate>> dynamicTemplates;

	@Nullable
	private final FieldNamesField _fieldNames;

	@Nullable
	private final IndexField indexField;

	@Nullable
	private final Map<String, JsonValue> _meta;

	@Nullable
	private final Boolean numericDetection;

	@Nullable
	private final Map<String, JsonValue> properties;

	@Nullable
	private final RoutingField _routing;

	@Nullable
	private final SizeField _size;

	@Nullable
	private final SourceField _source;

	@Nullable
	private final Map<String, RuntimeField> runtime;

	// ---------------------------------------------------------------------------------------------

	protected TypeMapping(Builder builder) {

		this.allField = builder.allField;
		this.dateDetection = builder.dateDetection;
		this.dynamic = builder.dynamic;
		this.dynamicDateFormats = builder.dynamicDateFormats;
		this.dynamicTemplates = builder.dynamicTemplates;
		this._fieldNames = builder._fieldNames;
		this.indexField = builder.indexField;
		this._meta = builder._meta;
		this.numericDetection = builder.numericDetection;
		this.properties = builder.properties;
		this._routing = builder._routing;
		this._size = builder._size;
		this._source = builder._source;
		this.runtime = builder.runtime;

	}

	/**
	 * API name: {@code all_field}
	 */
	@Nullable
	public AllField allField() {
		return this.allField;
	}

	/**
	 * API name: {@code date_detection}
	 */
	@Nullable
	public Boolean dateDetection() {
		return this.dateDetection;
	}

	/**
	 * API name: {@code dynamic}
	 */
	@Nullable
	public JsonValue dynamic() {
		return this.dynamic;
	}

	/**
	 * API name: {@code dynamic_date_formats}
	 */
	@Nullable
	public List<String> dynamicDateFormats() {
		return this.dynamicDateFormats;
	}

	/**
	 * API name: {@code dynamic_templates}
	 */
	@Nullable
	public List<Map<String, DynamicTemplate>> dynamicTemplates() {
		return this.dynamicTemplates;
	}

	/**
	 * API name: {@code _field_names}
	 */
	@Nullable
	public FieldNamesField _fieldNames() {
		return this._fieldNames;
	}

	/**
	 * API name: {@code index_field}
	 */
	@Nullable
	public IndexField indexField() {
		return this.indexField;
	}

	/**
	 * API name: {@code _meta}
	 */
	@Nullable
	public Map<String, JsonValue> _meta() {
		return this._meta;
	}

	/**
	 * API name: {@code numeric_detection}
	 */
	@Nullable
	public Boolean numericDetection() {
		return this.numericDetection;
	}

	/**
	 * API name: {@code properties}
	 */
	@Nullable
	public Map<String, JsonValue> properties() {
		return this.properties;
	}

	/**
	 * API name: {@code _routing}
	 */
	@Nullable
	public RoutingField _routing() {
		return this._routing;
	}

	/**
	 * API name: {@code _size}
	 */
	@Nullable
	public SizeField _size() {
		return this._size;
	}

	/**
	 * API name: {@code _source}
	 */
	@Nullable
	public SourceField _source() {
		return this._source;
	}

	/**
	 * API name: {@code runtime}
	 */
	@Nullable
	public Map<String, RuntimeField> runtime() {
		return this.runtime;
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

		if (this.allField != null) {

			generator.writeKey("all_field");
			this.allField.toJsonp(generator, mapper);

		}
		if (this.dateDetection != null) {

			generator.writeKey("date_detection");
			generator.write(this.dateDetection);

		}
		if (this.dynamic != null) {

			generator.writeKey("dynamic");
			generator.write(this.dynamic);

		}
		if (this.dynamicDateFormats != null) {

			generator.writeKey("dynamic_date_formats");
			generator.writeStartArray();
			for (String item0 : this.dynamicDateFormats) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.dynamicTemplates != null) {

			generator.writeKey("dynamic_templates");
			generator.writeStartArray();
			for (Map<String, DynamicTemplate> item0 : this.dynamicTemplates) {
				generator.writeStartObject();
				for (Map.Entry<String, DynamicTemplate> item1 : item0.entrySet()) {
					generator.writeKey(item1.getKey());
					item1.getValue().toJsonp(generator, mapper);

				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this._fieldNames != null) {

			generator.writeKey("_field_names");
			this._fieldNames.toJsonp(generator, mapper);

		}
		if (this.indexField != null) {

			generator.writeKey("index_field");
			this.indexField.toJsonp(generator, mapper);

		}
		if (this._meta != null) {

			generator.writeKey("_meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this._meta.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.numericDetection != null) {

			generator.writeKey("numeric_detection");
			generator.write(this.numericDetection);

		}
		if (this.properties != null) {

			generator.writeKey("properties");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.properties.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this._routing != null) {

			generator.writeKey("_routing");
			this._routing.toJsonp(generator, mapper);

		}
		if (this._size != null) {

			generator.writeKey("_size");
			this._size.toJsonp(generator, mapper);

		}
		if (this._source != null) {

			generator.writeKey("_source");
			this._source.toJsonp(generator, mapper);

		}
		if (this.runtime != null) {

			generator.writeKey("runtime");
			generator.writeStartObject();
			for (Map.Entry<String, RuntimeField> item0 : this.runtime.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TypeMapping}.
	 */
	public static class Builder implements ObjectBuilder<TypeMapping> {
		@Nullable
		private AllField allField;

		@Nullable
		private Boolean dateDetection;

		@Nullable
		private JsonValue dynamic;

		@Nullable
		private List<String> dynamicDateFormats;

		@Nullable
		private List<Map<String, DynamicTemplate>> dynamicTemplates;

		@Nullable
		private FieldNamesField _fieldNames;

		@Nullable
		private IndexField indexField;

		@Nullable
		private Map<String, JsonValue> _meta;

		@Nullable
		private Boolean numericDetection;

		@Nullable
		private Map<String, JsonValue> properties;

		@Nullable
		private RoutingField _routing;

		@Nullable
		private SizeField _size;

		@Nullable
		private SourceField _source;

		@Nullable
		private Map<String, RuntimeField> runtime;

		/**
		 * API name: {@code all_field}
		 */
		public Builder allField(@Nullable AllField value) {
			this.allField = value;
			return this;
		}

		/**
		 * API name: {@code all_field}
		 */
		public Builder allField(Function<AllField.Builder, ObjectBuilder<AllField>> fn) {
			return this.allField(fn.apply(new AllField.Builder()).build());
		}

		/**
		 * API name: {@code date_detection}
		 */
		public Builder dateDetection(@Nullable Boolean value) {
			this.dateDetection = value;
			return this;
		}

		/**
		 * API name: {@code dynamic}
		 */
		public Builder dynamic(@Nullable JsonValue value) {
			this.dynamic = value;
			return this;
		}

		/**
		 * API name: {@code dynamic_date_formats}
		 */
		public Builder dynamicDateFormats(@Nullable List<String> value) {
			this.dynamicDateFormats = value;
			return this;
		}

		/**
		 * API name: {@code dynamic_date_formats}
		 */
		public Builder dynamicDateFormats(String... value) {
			this.dynamicDateFormats = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #dynamicDateFormats(List)}, creating the list if
		 * needed.
		 */
		public Builder addDynamicDateFormats(String value) {
			if (this.dynamicDateFormats == null) {
				this.dynamicDateFormats = new ArrayList<>();
			}
			this.dynamicDateFormats.add(value);
			return this;
		}

		/**
		 * API name: {@code dynamic_templates}
		 */
		public Builder dynamicTemplates(@Nullable List<Map<String, DynamicTemplate>> value) {
			this.dynamicTemplates = value;
			return this;
		}

		/**
		 * API name: {@code dynamic_templates}
		 */
		public Builder dynamicTemplates(Map<String, DynamicTemplate>... value) {
			this.dynamicTemplates = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #dynamicTemplates(List)}, creating the list if needed.
		 */
		public Builder addDynamicTemplates(Map<String, DynamicTemplate> value) {
			if (this.dynamicTemplates == null) {
				this.dynamicTemplates = new ArrayList<>();
			}
			this.dynamicTemplates.add(value);
			return this;
		}

		/**
		 * API name: {@code _field_names}
		 */
		public Builder _fieldNames(@Nullable FieldNamesField value) {
			this._fieldNames = value;
			return this;
		}

		/**
		 * API name: {@code _field_names}
		 */
		public Builder _fieldNames(Function<FieldNamesField.Builder, ObjectBuilder<FieldNamesField>> fn) {
			return this._fieldNames(fn.apply(new FieldNamesField.Builder()).build());
		}

		/**
		 * API name: {@code index_field}
		 */
		public Builder indexField(@Nullable IndexField value) {
			this.indexField = value;
			return this;
		}

		/**
		 * API name: {@code index_field}
		 */
		public Builder indexField(Function<IndexField.Builder, ObjectBuilder<IndexField>> fn) {
			return this.indexField(fn.apply(new IndexField.Builder()).build());
		}

		/**
		 * API name: {@code _meta}
		 */
		public Builder _meta(@Nullable Map<String, JsonValue> value) {
			this._meta = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #_meta(Map)}, creating the map if needed.
		 */
		public Builder put_meta(String key, JsonValue value) {
			if (this._meta == null) {
				this._meta = new HashMap<>();
			}
			this._meta.put(key, value);
			return this;
		}

		/**
		 * API name: {@code numeric_detection}
		 */
		public Builder numericDetection(@Nullable Boolean value) {
			this.numericDetection = value;
			return this;
		}

		/**
		 * API name: {@code properties}
		 */
		public Builder properties(@Nullable Map<String, JsonValue> value) {
			this.properties = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #properties(Map)}, creating the map if needed.
		 */
		public Builder putProperties(String key, JsonValue value) {
			if (this.properties == null) {
				this.properties = new HashMap<>();
			}
			this.properties.put(key, value);
			return this;
		}

		/**
		 * API name: {@code _routing}
		 */
		public Builder _routing(@Nullable RoutingField value) {
			this._routing = value;
			return this;
		}

		/**
		 * API name: {@code _routing}
		 */
		public Builder _routing(Function<RoutingField.Builder, ObjectBuilder<RoutingField>> fn) {
			return this._routing(fn.apply(new RoutingField.Builder()).build());
		}

		/**
		 * API name: {@code _size}
		 */
		public Builder _size(@Nullable SizeField value) {
			this._size = value;
			return this;
		}

		/**
		 * API name: {@code _size}
		 */
		public Builder _size(Function<SizeField.Builder, ObjectBuilder<SizeField>> fn) {
			return this._size(fn.apply(new SizeField.Builder()).build());
		}

		/**
		 * API name: {@code _source}
		 */
		public Builder _source(@Nullable SourceField value) {
			this._source = value;
			return this;
		}

		/**
		 * API name: {@code _source}
		 */
		public Builder _source(Function<SourceField.Builder, ObjectBuilder<SourceField>> fn) {
			return this._source(fn.apply(new SourceField.Builder()).build());
		}

		/**
		 * API name: {@code runtime}
		 */
		public Builder runtime(@Nullable Map<String, RuntimeField> value) {
			this.runtime = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #runtime(Map)}, creating the map if needed.
		 */
		public Builder putRuntime(String key, RuntimeField value) {
			if (this.runtime == null) {
				this.runtime = new HashMap<>();
			}
			this.runtime.put(key, value);
			return this;
		}

		/**
		 * Set {@link #runtime(Map)} to a singleton map.
		 */
		public Builder runtime(String key, Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return this.runtime(Collections.singletonMap(key, fn.apply(new RuntimeField.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #runtime(Map)}, creating the map if needed.
		 */
		public Builder putRuntime(String key, Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return this.putRuntime(key, fn.apply(new RuntimeField.Builder()).build());
		}

		/**
		 * Builds a {@link TypeMapping}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TypeMapping build() {

			return new TypeMapping(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for TypeMapping
	 */
	public static final JsonpValueParser<TypeMapping> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, TypeMapping::setupTypeMappingParser);

	protected static void setupTypeMappingParser(DelegatingJsonpValueParser<TypeMapping.Builder> op) {

		op.add(Builder::allField, AllField.JSONP_PARSER, "all_field");
		op.add(Builder::dateDetection, JsonpValueParser.booleanParser(), "date_detection");
		op.add(Builder::dynamic, JsonpValueParser.jsonValueParser(), "dynamic");
		op.add(Builder::dynamicDateFormats, JsonpValueParser.arrayParser(JsonpValueParser.stringParser()),
				"dynamic_date_formats");
		op.add(Builder::dynamicTemplates,
				JsonpValueParser.arrayParser(JsonpValueParser.stringMapParser(DynamicTemplate.JSONP_PARSER)),
				"dynamic_templates");
		op.add(Builder::_fieldNames, FieldNamesField.JSONP_PARSER, "_field_names");
		op.add(Builder::indexField, IndexField.JSONP_PARSER, "index_field");
		op.add(Builder::_meta, JsonpValueParser.stringMapParser(JsonpValueParser.jsonValueParser()), "_meta");
		op.add(Builder::numericDetection, JsonpValueParser.booleanParser(), "numeric_detection");
		op.add(Builder::properties, JsonpValueParser.stringMapParser(JsonpValueParser.jsonValueParser()), "properties");
		op.add(Builder::_routing, RoutingField.JSONP_PARSER, "_routing");
		op.add(Builder::_size, SizeField.JSONP_PARSER, "_size");
		op.add(Builder::_source, SourceField.JSONP_PARSER, "_source");
		op.add(Builder::runtime, JsonpValueParser.stringMapParser(RuntimeField.JSONP_PARSER), "runtime");

	}

}
