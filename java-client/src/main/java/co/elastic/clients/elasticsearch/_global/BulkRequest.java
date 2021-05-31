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

package co.elastic.clients.elasticsearch._global;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: _global.bulk.Request
public final class BulkRequest<TSource> extends RequestBase implements ToJsonp {
	@Nullable
	private final String index;

	@Nullable
	private final String type;

	@Nullable
	private final String pipeline;

	@Nullable
	private final JsonValue refresh;

	@Nullable
	private final JsonValue routing;

	@Nullable
	private final JsonValue _source;

	@Nullable
	private final List<String> _sourceExcludes;

	@Nullable
	private final List<String> _sourceIncludes;

	@Nullable
	private final JsonValue timeout;

	@Nullable
	private final JsonValue waitForActiveShards;

	@Nullable
	private final Boolean requireAlias;

	private final List<JsonValue> value;

	@Nullable
	private final JsonpSerializer<TSource> tSourceSerializer;

	// ---------------------------------------------------------------------------------------------

	protected BulkRequest(Builder<TSource> builder) {

		this.index = builder.index;
		this.type = builder.type;
		this.pipeline = builder.pipeline;
		this.refresh = builder.refresh;
		this.routing = builder.routing;
		this._source = builder._source;
		this._sourceExcludes = builder._sourceExcludes;
		this._sourceIncludes = builder._sourceIncludes;
		this.timeout = builder.timeout;
		this.waitForActiveShards = builder.waitForActiveShards;
		this.requireAlias = builder.requireAlias;
		this.value = Objects.requireNonNull(builder.value, "value");
		this.tSourceSerializer = builder.tSourceSerializer;

	}

	/**
	 * A comma-separated list of index names to search; use `_all` or empty string
	 * to perform the operation on all indices
	 *
	 * API name: {@code index}
	 */
	@Nullable
	public String index() {
		return this.index;
	}

	/**
	 * A comma-separated list of document types to search; leave empty to perform
	 * the operation on all types
	 *
	 * API name: {@code type}
	 */
	@Nullable
	public String type() {
		return this.type;
	}

	/**
	 * API name: {@code pipeline}
	 */
	@Nullable
	public String pipeline() {
		return this.pipeline;
	}

	/**
	 * API name: {@code refresh}
	 */
	@Nullable
	public JsonValue refresh() {
		return this.refresh;
	}

	/**
	 * API name: {@code routing}
	 */
	@Nullable
	public JsonValue routing() {
		return this.routing;
	}

	/**
	 * API name: {@code _source}
	 */
	@Nullable
	public JsonValue _source() {
		return this._source;
	}

	/**
	 * API name: {@code _source_excludes}
	 */
	@Nullable
	public List<String> _sourceExcludes() {
		return this._sourceExcludes;
	}

	/**
	 * API name: {@code _source_includes}
	 */
	@Nullable
	public List<String> _sourceIncludes() {
		return this._sourceIncludes;
	}

	/**
	 * API name: {@code timeout}
	 */
	@Nullable
	public JsonValue timeout() {
		return this.timeout;
	}

	/**
	 * API name: {@code wait_for_active_shards}
	 */
	@Nullable
	public JsonValue waitForActiveShards() {
		return this.waitForActiveShards;
	}

	/**
	 * API name: {@code require_alias}
	 */
	@Nullable
	public Boolean requireAlias() {
		return this.requireAlias;
	}

	/**
	 * Request body.
	 *
	 * API name: {@code value}
	 */
	public List<JsonValue> value() {
		return this.value;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (JsonValue item0 : this.value) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BulkRequest}.
	 */
	public static class Builder<TSource> implements ObjectBuilder<BulkRequest<TSource>> {
		@Nullable
		private String index;

		@Nullable
		private String type;

		@Nullable
		private String pipeline;

		@Nullable
		private JsonValue refresh;

		@Nullable
		private JsonValue routing;

		@Nullable
		private JsonValue _source;

		@Nullable
		private List<String> _sourceExcludes;

		@Nullable
		private List<String> _sourceIncludes;

		@Nullable
		private JsonValue timeout;

		@Nullable
		private JsonValue waitForActiveShards;

		@Nullable
		private Boolean requireAlias;

		private List<JsonValue> value;

		@Nullable
		private JsonpSerializer<TSource> tSourceSerializer;

		/**
		 * A comma-separated list of index names to search; use `_all` or empty string
		 * to perform the operation on all indices
		 *
		 * API name: {@code index}
		 */
		public Builder<TSource> index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * A comma-separated list of document types to search; leave empty to perform
		 * the operation on all types
		 *
		 * API name: {@code type}
		 */
		public Builder<TSource> type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code pipeline}
		 */
		public Builder<TSource> pipeline(@Nullable String value) {
			this.pipeline = value;
			return this;
		}

		/**
		 * API name: {@code refresh}
		 */
		public Builder<TSource> refresh(@Nullable JsonValue value) {
			this.refresh = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public Builder<TSource> routing(@Nullable JsonValue value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code _source}
		 */
		public Builder<TSource> _source(@Nullable JsonValue value) {
			this._source = value;
			return this;
		}

		/**
		 * API name: {@code _source_excludes}
		 */
		public Builder<TSource> _sourceExcludes(@Nullable List<String> value) {
			this._sourceExcludes = value;
			return this;
		}

		/**
		 * API name: {@code _source_excludes}
		 */
		public Builder<TSource> _sourceExcludes(String... value) {
			this._sourceExcludes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #_sourceExcludes(List)}, creating the list if needed.
		 */
		public Builder<TSource> add_sourceExcludes(String value) {
			if (this._sourceExcludes == null) {
				this._sourceExcludes = new ArrayList<>();
			}
			this._sourceExcludes.add(value);
			return this;
		}

		/**
		 * API name: {@code _source_includes}
		 */
		public Builder<TSource> _sourceIncludes(@Nullable List<String> value) {
			this._sourceIncludes = value;
			return this;
		}

		/**
		 * API name: {@code _source_includes}
		 */
		public Builder<TSource> _sourceIncludes(String... value) {
			this._sourceIncludes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #_sourceIncludes(List)}, creating the list if needed.
		 */
		public Builder<TSource> add_sourceIncludes(String value) {
			if (this._sourceIncludes == null) {
				this._sourceIncludes = new ArrayList<>();
			}
			this._sourceIncludes.add(value);
			return this;
		}

		/**
		 * API name: {@code timeout}
		 */
		public Builder<TSource> timeout(@Nullable JsonValue value) {
			this.timeout = value;
			return this;
		}

		/**
		 * API name: {@code wait_for_active_shards}
		 */
		public Builder<TSource> waitForActiveShards(@Nullable JsonValue value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * API name: {@code require_alias}
		 */
		public Builder<TSource> requireAlias(@Nullable Boolean value) {
			this.requireAlias = value;
			return this;
		}

		/**
		 * Request body.
		 *
		 * API name: {@code value}
		 */
		public Builder<TSource> value(List<JsonValue> value) {
			this.value = value;
			return this;
		}

		/**
		 * Request body.
		 *
		 * API name: {@code value}
		 */
		public Builder<TSource> value(JsonValue... value) {
			this.value = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #value(List)}, creating the list if needed.
		 */
		public Builder<TSource> addValue(JsonValue value) {
			if (this.value == null) {
				this.value = new ArrayList<>();
			}
			this.value.add(value);
			return this;
		}

		/**
		 * Serializer for TSource. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 *
		 */
		public Builder<TSource> tSourceSerializer(@Nullable JsonpSerializer<TSource> value) {
			this.tSourceSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link BulkRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BulkRequest<TSource> build() {

			return new BulkRequest<TSource>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json parser for BulkRequest
	 */
	public static <TSource> JsonpValueParser<BulkRequest<TSource>> createBulkRequestParser(
			JsonpValueParser<TSource> tSourceParser) {
		return JsonpObjectBuilderParser.createForValue((Supplier<Builder<TSource>>) Builder::new,
				op -> BulkRequest.setupBulkRequestParser(op, tSourceParser));
	};

	protected static <TSource> void setupBulkRequestParser(DelegatingJsonpValueParser<BulkRequest.Builder<TSource>> op,
			JsonpValueParser<TSource> tSourceParser) {

		op.add(Builder::value, JsonpValueParser.arrayParser(JsonpValueParser.jsonValueParser()), "value");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code bulk}".
	 */
	public static final Endpoint<BulkRequest<?>, BulkResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> "POST",

			// Request path
			request -> {
				StringBuilder buf = new StringBuilder();
				if (request.index != null) {
					buf.append("/");
					buf.append(request.index);
				}
				if (request.type != null) {
					buf.append("/");
					buf.append(request.type);
				}
				buf.append("/_bulk");
				return buf.toString();

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.pipeline != null) {
					params.put("pipeline", request.pipeline);
				}
				if (request.refresh != null) {
					params.put("refresh", request.refresh.toString());
				}
				if (request.routing != null) {
					params.put("routing", request.routing.toString());
				}
				if (request._source != null) {
					params.put("_source", request._source.toString());
				}
				if (request._sourceExcludes != null) {
					params.put("_source_excludes",
							request._sourceExcludes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request._sourceIncludes != null) {
					params.put("_source_includes",
							request._sourceIncludes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout.toString());
				}
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", request.waitForActiveShards.toString());
				}
				if (request.requireAlias != null) {
					params.put("require_alias", String.valueOf(request.requireAlias));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, BulkResponse.JSONP_PARSER);
}
