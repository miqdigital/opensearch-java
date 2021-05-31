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
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: _global.get.Request
public class GetRequest extends RequestBase {
	private final String id;

	private final String index;

	@Nullable
	private final String type;

	@Nullable
	private final String preference;

	@Nullable
	private final Boolean realtime;

	@Nullable
	private final Boolean refresh;

	@Nullable
	private final JsonValue routing;

	@Nullable
	private final Boolean sourceEnabled;

	@Nullable
	private final List<String> _sourceExcludes;

	@Nullable
	private final List<String> _sourceIncludes;

	@Nullable
	private final List<String> storedFields;

	@Nullable
	private final Number version;

	@Nullable
	private final JsonValue versionType;

	@Nullable
	private final JsonValue _source;

	// ---------------------------------------------------------------------------------------------

	protected GetRequest(AbstractBuilder<?> builder) {

		this.id = Objects.requireNonNull(builder.id, "id");
		this.index = Objects.requireNonNull(builder.index, "index");
		this.type = builder.type;
		this.preference = builder.preference;
		this.realtime = builder.realtime;
		this.refresh = builder.refresh;
		this.routing = builder.routing;
		this.sourceEnabled = builder.sourceEnabled;
		this._sourceExcludes = builder._sourceExcludes;
		this._sourceIncludes = builder._sourceIncludes;
		this.storedFields = builder.storedFields;
		this.version = builder.version;
		this.versionType = builder.versionType;
		this._source = builder._source;

	}

	/**
	 * Unique identifier of the document.
	 *
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * Name of the index that contains the document.
	 *
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code type}
	 */
	@Nullable
	public String type() {
		return this.type;
	}

	/**
	 * Specifies the node or shard the operation should be performed on. Random by
	 * default.
	 *
	 * API name: {@code preference}
	 */
	@Nullable
	public String preference() {
		return this.preference;
	}

	/**
	 * Boolean) If true, the request is real-time as opposed to near-real-time.
	 *
	 * API name: {@code realtime}
	 */
	@Nullable
	public Boolean realtime() {
		return this.realtime;
	}

	/**
	 * If true, Elasticsearch refreshes the affected shards to make this operation
	 * visible to search. If false, do nothing with refreshes.
	 *
	 * API name: {@code refresh}
	 */
	@Nullable
	public Boolean refresh() {
		return this.refresh;
	}

	/**
	 * Target the specified primary shard.
	 *
	 * API name: {@code routing}
	 */
	@Nullable
	public JsonValue routing() {
		return this.routing;
	}

	/**
	 * API name: {@code source_enabled}
	 */
	@Nullable
	public Boolean sourceEnabled() {
		return this.sourceEnabled;
	}

	/**
	 * A comma-separated list of source fields to exclude in the response.
	 *
	 * API name: {@code _source_excludes}
	 */
	@Nullable
	public List<String> _sourceExcludes() {
		return this._sourceExcludes;
	}

	/**
	 * A comma-separated list of source fields to include in the response.
	 *
	 * API name: {@code _source_includes}
	 */
	@Nullable
	public List<String> _sourceIncludes() {
		return this._sourceIncludes;
	}

	/**
	 * API name: {@code stored_fields}
	 */
	@Nullable
	public List<String> storedFields() {
		return this.storedFields;
	}

	/**
	 * Explicit version number for concurrency control. The specified version must
	 * match the current version of the document for the request to succeed.
	 *
	 * API name: {@code version}
	 */
	@Nullable
	public Number version() {
		return this.version;
	}

	/**
	 * Specific version type: internal, external, external_gte.
	 *
	 * API name: {@code version_type}
	 */
	@Nullable
	public JsonValue versionType() {
		return this.versionType;
	}

	/**
	 * True or false to return the _source field or not, or a list of fields to
	 * return.
	 *
	 * API name: {@code _source}
	 */
	@Nullable
	public JsonValue _source() {
		return this._source;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetRequest}.
	 */
	public static class Builder extends GetRequest.AbstractBuilder<Builder> implements ObjectBuilder<GetRequest> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetRequest build() {

			return new GetRequest(this);
		}
	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		private String id;

		private String index;

		@Nullable
		private String type;

		@Nullable
		private String preference;

		@Nullable
		private Boolean realtime;

		@Nullable
		private Boolean refresh;

		@Nullable
		private JsonValue routing;

		@Nullable
		private Boolean sourceEnabled;

		@Nullable
		private List<String> _sourceExcludes;

		@Nullable
		private List<String> _sourceIncludes;

		@Nullable
		private List<String> storedFields;

		@Nullable
		private Number version;

		@Nullable
		private JsonValue versionType;

		@Nullable
		private JsonValue _source;

		/**
		 * Unique identifier of the document.
		 *
		 * API name: {@code id}
		 */
		public BuilderT id(String value) {
			this.id = value;
			return self();
		}

		/**
		 * Name of the index that contains the document.
		 *
		 * API name: {@code index}
		 */
		public BuilderT index(String value) {
			this.index = value;
			return self();
		}

		/**
		 * API name: {@code type}
		 */
		public BuilderT type(@Nullable String value) {
			this.type = value;
			return self();
		}

		/**
		 * Specifies the node or shard the operation should be performed on. Random by
		 * default.
		 *
		 * API name: {@code preference}
		 */
		public BuilderT preference(@Nullable String value) {
			this.preference = value;
			return self();
		}

		/**
		 * Boolean) If true, the request is real-time as opposed to near-real-time.
		 *
		 * API name: {@code realtime}
		 */
		public BuilderT realtime(@Nullable Boolean value) {
			this.realtime = value;
			return self();
		}

		/**
		 * If true, Elasticsearch refreshes the affected shards to make this operation
		 * visible to search. If false, do nothing with refreshes.
		 *
		 * API name: {@code refresh}
		 */
		public BuilderT refresh(@Nullable Boolean value) {
			this.refresh = value;
			return self();
		}

		/**
		 * Target the specified primary shard.
		 *
		 * API name: {@code routing}
		 */
		public BuilderT routing(@Nullable JsonValue value) {
			this.routing = value;
			return self();
		}

		/**
		 * API name: {@code source_enabled}
		 */
		public BuilderT sourceEnabled(@Nullable Boolean value) {
			this.sourceEnabled = value;
			return self();
		}

		/**
		 * A comma-separated list of source fields to exclude in the response.
		 *
		 * API name: {@code _source_excludes}
		 */
		public BuilderT _sourceExcludes(@Nullable List<String> value) {
			this._sourceExcludes = value;
			return self();
		}

		/**
		 * A comma-separated list of source fields to exclude in the response.
		 *
		 * API name: {@code _source_excludes}
		 */
		public BuilderT _sourceExcludes(String... value) {
			this._sourceExcludes = Arrays.asList(value);
			return self();
		}

		/**
		 * Add a value to {@link #_sourceExcludes(List)}, creating the list if needed.
		 */
		public BuilderT add_sourceExcludes(String value) {
			if (this._sourceExcludes == null) {
				this._sourceExcludes = new ArrayList<>();
			}
			this._sourceExcludes.add(value);
			return self();
		}

		/**
		 * A comma-separated list of source fields to include in the response.
		 *
		 * API name: {@code _source_includes}
		 */
		public BuilderT _sourceIncludes(@Nullable List<String> value) {
			this._sourceIncludes = value;
			return self();
		}

		/**
		 * A comma-separated list of source fields to include in the response.
		 *
		 * API name: {@code _source_includes}
		 */
		public BuilderT _sourceIncludes(String... value) {
			this._sourceIncludes = Arrays.asList(value);
			return self();
		}

		/**
		 * Add a value to {@link #_sourceIncludes(List)}, creating the list if needed.
		 */
		public BuilderT add_sourceIncludes(String value) {
			if (this._sourceIncludes == null) {
				this._sourceIncludes = new ArrayList<>();
			}
			this._sourceIncludes.add(value);
			return self();
		}

		/**
		 * API name: {@code stored_fields}
		 */
		public BuilderT storedFields(@Nullable List<String> value) {
			this.storedFields = value;
			return self();
		}

		/**
		 * API name: {@code stored_fields}
		 */
		public BuilderT storedFields(String... value) {
			this.storedFields = Arrays.asList(value);
			return self();
		}

		/**
		 * Add a value to {@link #storedFields(List)}, creating the list if needed.
		 */
		public BuilderT addStoredFields(String value) {
			if (this.storedFields == null) {
				this.storedFields = new ArrayList<>();
			}
			this.storedFields.add(value);
			return self();
		}

		/**
		 * Explicit version number for concurrency control. The specified version must
		 * match the current version of the document for the request to succeed.
		 *
		 * API name: {@code version}
		 */
		public BuilderT version(@Nullable Number value) {
			this.version = value;
			return self();
		}

		/**
		 * Specific version type: internal, external, external_gte.
		 *
		 * API name: {@code version_type}
		 */
		public BuilderT versionType(@Nullable JsonValue value) {
			this.versionType = value;
			return self();
		}

		/**
		 * True or false to return the _source field or not, or a list of fields to
		 * return.
		 *
		 * API name: {@code _source}
		 */
		public BuilderT _source(@Nullable JsonValue value) {
			this._source = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code get}".
	 */
	private static final Endpoint.Simple<GetRequest, Void> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> "GET",

			// Request path
			request -> {
				StringBuilder buf = new StringBuilder();
				buf.append("/");
				buf.append(request.index);
				if (request.type != null) {
					buf.append("/");
					buf.append(request.type);
				}
				buf.append("/");
				buf.append(request.id);
				return buf.toString();

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.preference != null) {
					params.put("preference", request.preference);
				}
				if (request.realtime != null) {
					params.put("realtime", String.valueOf(request.realtime));
				}
				if (request.refresh != null) {
					params.put("refresh", String.valueOf(request.refresh));
				}
				if (request.routing != null) {
					params.put("routing", request.routing.toString());
				}
				if (request.sourceEnabled != null) {
					params.put("source_enabled", String.valueOf(request.sourceEnabled));
				}
				if (request._sourceExcludes != null) {
					params.put("_source_excludes",
							request._sourceExcludes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request._sourceIncludes != null) {
					params.put("_source_includes",
							request._sourceIncludes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.storedFields != null) {
					params.put("stored_fields",
							request.storedFields.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.version != null) {
					params.put("version", request.version.toString());
				}
				if (request.versionType != null) {
					params.put("version_type", request.versionType.toString());
				}
				if (request._source != null) {
					params.put("_source", request._source.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, null);

	/**
	 * Create an "{@code get}" endpoint.
	 */
	public static <TDocument> Endpoint<GetRequest, GetResponse<TDocument>, ElasticsearchError> createGetEndpoint(
			JsonpValueParser<TDocument> tDocumentParser) {
		return ENDPOINT.withResponseParser(GetResponse.createGetResponseParser(tDocumentParser));
	}
}
