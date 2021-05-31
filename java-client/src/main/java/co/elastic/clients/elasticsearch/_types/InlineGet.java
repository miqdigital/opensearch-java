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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _types.InlineGet
public final class InlineGet<TDocument> implements ToJsonp {
	@Nullable
	private final Map<String, JsonValue> fields;

	private final Boolean found;

	private final Number _seqNo;

	private final Number _primaryTerm;

	@Nullable
	private final JsonValue _routing;

	private final TDocument _source;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	protected InlineGet(Builder<TDocument> builder) {

		this.fields = builder.fields;
		this.found = Objects.requireNonNull(builder.found, "found");
		this._seqNo = Objects.requireNonNull(builder._seqNo, "_seq_no");
		this._primaryTerm = Objects.requireNonNull(builder._primaryTerm, "_primary_term");
		this._routing = builder._routing;
		this._source = Objects.requireNonNull(builder._source, "_source");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	/**
	 * API name: {@code fields}
	 */
	@Nullable
	public Map<String, JsonValue> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code found}
	 */
	public Boolean found() {
		return this.found;
	}

	/**
	 * API name: {@code _seq_no}
	 */
	public Number _seqNo() {
		return this._seqNo;
	}

	/**
	 * API name: {@code _primary_term}
	 */
	public Number _primaryTerm() {
		return this._primaryTerm;
	}

	/**
	 * API name: {@code _routing}
	 */
	@Nullable
	public JsonValue _routing() {
		return this._routing;
	}

	/**
	 * API name: {@code _source}
	 */
	public TDocument _source() {
		return this._source;
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

		if (this.fields != null) {

			generator.writeKey("fields");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.fields.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

		generator.writeKey("found");
		generator.write(this.found);

		generator.writeKey("_seq_no");
		generator.write(this._seqNo.doubleValue());

		generator.writeKey("_primary_term");
		generator.write(this._primaryTerm.doubleValue());

		if (this._routing != null) {

			generator.writeKey("_routing");
			generator.write(this._routing);

		}

		generator.writeKey("_source");
		JsonpUtils.serialize(this._source, generator, tDocumentSerializer, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InlineGet}.
	 */
	public static class Builder<TDocument> implements ObjectBuilder<InlineGet<TDocument>> {
		@Nullable
		private Map<String, JsonValue> fields;

		private Boolean found;

		private Number _seqNo;

		private Number _primaryTerm;

		@Nullable
		private JsonValue _routing;

		private TDocument _source;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * API name: {@code fields}
		 */
		public Builder<TDocument> fields(@Nullable Map<String, JsonValue> value) {
			this.fields = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #fields(Map)}, creating the map if needed.
		 */
		public Builder<TDocument> putFields(String key, JsonValue value) {
			if (this.fields == null) {
				this.fields = new HashMap<>();
			}
			this.fields.put(key, value);
			return this;
		}

		/**
		 * API name: {@code found}
		 */
		public Builder<TDocument> found(Boolean value) {
			this.found = value;
			return this;
		}

		/**
		 * API name: {@code _seq_no}
		 */
		public Builder<TDocument> _seqNo(Number value) {
			this._seqNo = value;
			return this;
		}

		/**
		 * API name: {@code _primary_term}
		 */
		public Builder<TDocument> _primaryTerm(Number value) {
			this._primaryTerm = value;
			return this;
		}

		/**
		 * API name: {@code _routing}
		 */
		public Builder<TDocument> _routing(@Nullable JsonValue value) {
			this._routing = value;
			return this;
		}

		/**
		 * API name: {@code _source}
		 */
		public Builder<TDocument> _source(TDocument value) {
			this._source = value;
			return this;
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 *
		 */
		public Builder<TDocument> tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link InlineGet}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InlineGet<TDocument> build() {

			return new InlineGet<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json parser for InlineGet
	 */
	public static <TDocument> JsonpValueParser<InlineGet<TDocument>> createInlineGetParser(
			JsonpValueParser<TDocument> tDocumentParser) {
		return JsonpObjectBuilderParser.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> InlineGet.setupInlineGetParser(op, tDocumentParser));
	};

	protected static <TDocument> void setupInlineGetParser(DelegatingJsonpValueParser<InlineGet.Builder<TDocument>> op,
			JsonpValueParser<TDocument> tDocumentParser) {

		op.add(Builder::fields, JsonpValueParser.stringMapParser(JsonpValueParser.jsonValueParser()), "fields");
		op.add(Builder::found, JsonpValueParser.booleanParser(), "found");
		op.add(Builder::_seqNo, JsonpValueParser.numberParser(), "_seq_no");
		op.add(Builder::_primaryTerm, JsonpValueParser.numberParser(), "_primary_term");
		op.add(Builder::_routing, JsonpValueParser.jsonValueParser(), "_routing");
		op.add(Builder::_source, tDocumentParser, "_source");

	}

}
