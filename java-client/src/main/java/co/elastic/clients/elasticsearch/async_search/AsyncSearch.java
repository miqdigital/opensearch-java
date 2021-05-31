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

package co.elastic.clients.elasticsearch.async_search;

import co.elastic.clients.elasticsearch._global.search.HitsMetadata;
import co.elastic.clients.elasticsearch._global.search.Profile;
import co.elastic.clients.elasticsearch._global.search.Suggest;
import co.elastic.clients.elasticsearch._types.ClusterStatistics;
import co.elastic.clients.elasticsearch._types.ShardStatistics;
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
import java.lang.Number;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: async_search._types.AsyncSearch
public final class AsyncSearch<TDocument> implements ToJsonp {
	@Nullable
	private final Map<String, JsonValue> aggregations;

	@Nullable
	private final ClusterStatistics _clusters;

	@Nullable
	private final Map<String, JsonValue> fields;

	private final HitsMetadata<TDocument> hits;

	@Nullable
	private final Number maxScore;

	@Nullable
	private final Number numReducePhases;

	@Nullable
	private final Profile profile;

	@Nullable
	private final String pitId;

	@Nullable
	private final String _scrollId;

	private final ShardStatistics _shards;

	@Nullable
	private final Map<String, List<Suggest<TDocument>>> suggest;

	@Nullable
	private final Boolean terminatedEarly;

	private final Boolean timedOut;

	private final Number took;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	protected AsyncSearch(Builder<TDocument> builder) {

		this.aggregations = builder.aggregations;
		this._clusters = builder._clusters;
		this.fields = builder.fields;
		this.hits = Objects.requireNonNull(builder.hits, "hits");
		this.maxScore = builder.maxScore;
		this.numReducePhases = builder.numReducePhases;
		this.profile = builder.profile;
		this.pitId = builder.pitId;
		this._scrollId = builder._scrollId;
		this._shards = Objects.requireNonNull(builder._shards, "_shards");
		this.suggest = builder.suggest;
		this.terminatedEarly = builder.terminatedEarly;
		this.timedOut = Objects.requireNonNull(builder.timedOut, "timed_out");
		this.took = Objects.requireNonNull(builder.took, "took");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	/**
	 * API name: {@code aggregations}
	 */
	@Nullable
	public Map<String, JsonValue> aggregations() {
		return this.aggregations;
	}

	/**
	 * API name: {@code _clusters}
	 */
	@Nullable
	public ClusterStatistics _clusters() {
		return this._clusters;
	}

	/**
	 * API name: {@code fields}
	 */
	@Nullable
	public Map<String, JsonValue> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code hits}
	 */
	public HitsMetadata<TDocument> hits() {
		return this.hits;
	}

	/**
	 * API name: {@code max_score}
	 */
	@Nullable
	public Number maxScore() {
		return this.maxScore;
	}

	/**
	 * API name: {@code num_reduce_phases}
	 */
	@Nullable
	public Number numReducePhases() {
		return this.numReducePhases;
	}

	/**
	 * API name: {@code profile}
	 */
	@Nullable
	public Profile profile() {
		return this.profile;
	}

	/**
	 * API name: {@code pit_id}
	 */
	@Nullable
	public String pitId() {
		return this.pitId;
	}

	/**
	 * API name: {@code _scroll_id}
	 */
	@Nullable
	public String _scrollId() {
		return this._scrollId;
	}

	/**
	 * API name: {@code _shards}
	 */
	public ShardStatistics _shards() {
		return this._shards;
	}

	/**
	 * API name: {@code suggest}
	 */
	@Nullable
	public Map<String, List<Suggest<TDocument>>> suggest() {
		return this.suggest;
	}

	/**
	 * API name: {@code terminated_early}
	 */
	@Nullable
	public Boolean terminatedEarly() {
		return this.terminatedEarly;
	}

	/**
	 * API name: {@code timed_out}
	 */
	public Boolean timedOut() {
		return this.timedOut;
	}

	/**
	 * API name: {@code took}
	 */
	public Number took() {
		return this.took;
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

		if (this.aggregations != null) {

			generator.writeKey("aggregations");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.aggregations.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this._clusters != null) {

			generator.writeKey("_clusters");
			this._clusters.toJsonp(generator, mapper);

		}
		if (this.fields != null) {

			generator.writeKey("fields");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.fields.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

		generator.writeKey("hits");
		this.hits.toJsonp(generator, mapper);

		if (this.maxScore != null) {

			generator.writeKey("max_score");
			generator.write(this.maxScore.doubleValue());

		}
		if (this.numReducePhases != null) {

			generator.writeKey("num_reduce_phases");
			generator.write(this.numReducePhases.doubleValue());

		}
		if (this.profile != null) {

			generator.writeKey("profile");
			this.profile.toJsonp(generator, mapper);

		}
		if (this.pitId != null) {

			generator.writeKey("pit_id");
			generator.write(this.pitId);

		}
		if (this._scrollId != null) {

			generator.writeKey("_scroll_id");
			generator.write(this._scrollId);

		}

		generator.writeKey("_shards");
		this._shards.toJsonp(generator, mapper);

		if (this.suggest != null) {

			generator.writeKey("suggest");
			generator.writeStartObject();
			for (Map.Entry<String, List<Suggest<TDocument>>> item0 : this.suggest.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				for (Suggest<TDocument> item1 : item0.getValue()) {
					item1.toJsonp(generator, mapper);

				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this.terminatedEarly != null) {

			generator.writeKey("terminated_early");
			generator.write(this.terminatedEarly);

		}

		generator.writeKey("timed_out");
		generator.write(this.timedOut);

		generator.writeKey("took");
		generator.write(this.took.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AsyncSearch}.
	 */
	public static class Builder<TDocument> implements ObjectBuilder<AsyncSearch<TDocument>> {
		@Nullable
		private Map<String, JsonValue> aggregations;

		@Nullable
		private ClusterStatistics _clusters;

		@Nullable
		private Map<String, JsonValue> fields;

		private HitsMetadata<TDocument> hits;

		@Nullable
		private Number maxScore;

		@Nullable
		private Number numReducePhases;

		@Nullable
		private Profile profile;

		@Nullable
		private String pitId;

		@Nullable
		private String _scrollId;

		private ShardStatistics _shards;

		@Nullable
		private Map<String, List<Suggest<TDocument>>> suggest;

		@Nullable
		private Boolean terminatedEarly;

		private Boolean timedOut;

		private Number took;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * API name: {@code aggregations}
		 */
		public Builder<TDocument> aggregations(@Nullable Map<String, JsonValue> value) {
			this.aggregations = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aggregations(Map)}, creating the map if needed.
		 */
		public Builder<TDocument> putAggregations(String key, JsonValue value) {
			if (this.aggregations == null) {
				this.aggregations = new HashMap<>();
			}
			this.aggregations.put(key, value);
			return this;
		}

		/**
		 * API name: {@code _clusters}
		 */
		public Builder<TDocument> _clusters(@Nullable ClusterStatistics value) {
			this._clusters = value;
			return this;
		}

		/**
		 * API name: {@code _clusters}
		 */
		public Builder<TDocument> _clusters(Function<ClusterStatistics.Builder, ObjectBuilder<ClusterStatistics>> fn) {
			return this._clusters(fn.apply(new ClusterStatistics.Builder()).build());
		}

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
		 * API name: {@code hits}
		 */
		public Builder<TDocument> hits(HitsMetadata<TDocument> value) {
			this.hits = value;
			return this;
		}

		/**
		 * API name: {@code hits}
		 */
		public Builder<TDocument> hits(
				Function<HitsMetadata.Builder<TDocument>, ObjectBuilder<HitsMetadata<TDocument>>> fn) {
			return this.hits(fn.apply(new HitsMetadata.Builder<TDocument>()).build());
		}

		/**
		 * API name: {@code max_score}
		 */
		public Builder<TDocument> maxScore(@Nullable Number value) {
			this.maxScore = value;
			return this;
		}

		/**
		 * API name: {@code num_reduce_phases}
		 */
		public Builder<TDocument> numReducePhases(@Nullable Number value) {
			this.numReducePhases = value;
			return this;
		}

		/**
		 * API name: {@code profile}
		 */
		public Builder<TDocument> profile(@Nullable Profile value) {
			this.profile = value;
			return this;
		}

		/**
		 * API name: {@code profile}
		 */
		public Builder<TDocument> profile(Function<Profile.Builder, ObjectBuilder<Profile>> fn) {
			return this.profile(fn.apply(new Profile.Builder()).build());
		}

		/**
		 * API name: {@code pit_id}
		 */
		public Builder<TDocument> pitId(@Nullable String value) {
			this.pitId = value;
			return this;
		}

		/**
		 * API name: {@code _scroll_id}
		 */
		public Builder<TDocument> _scrollId(@Nullable String value) {
			this._scrollId = value;
			return this;
		}

		/**
		 * API name: {@code _shards}
		 */
		public Builder<TDocument> _shards(ShardStatistics value) {
			this._shards = value;
			return this;
		}

		/**
		 * API name: {@code _shards}
		 */
		public Builder<TDocument> _shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this._shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * API name: {@code suggest}
		 */
		public Builder<TDocument> suggest(@Nullable Map<String, List<Suggest<TDocument>>> value) {
			this.suggest = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #suggest(Map)}, creating the map if needed.
		 */
		public Builder<TDocument> putSuggest(String key, List<Suggest<TDocument>> value) {
			if (this.suggest == null) {
				this.suggest = new HashMap<>();
			}
			this.suggest.put(key, value);
			return this;
		}

		/**
		 * API name: {@code terminated_early}
		 */
		public Builder<TDocument> terminatedEarly(@Nullable Boolean value) {
			this.terminatedEarly = value;
			return this;
		}

		/**
		 * API name: {@code timed_out}
		 */
		public Builder<TDocument> timedOut(Boolean value) {
			this.timedOut = value;
			return this;
		}

		/**
		 * API name: {@code took}
		 */
		public Builder<TDocument> took(Number value) {
			this.took = value;
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
		 * Builds a {@link AsyncSearch}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AsyncSearch<TDocument> build() {

			return new AsyncSearch<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json parser for AsyncSearch
	 */
	public static <TDocument> JsonpValueParser<AsyncSearch<TDocument>> createAsyncSearchParser(
			JsonpValueParser<TDocument> tDocumentParser) {
		return JsonpObjectBuilderParser.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> AsyncSearch.setupAsyncSearchParser(op, tDocumentParser));
	};

	protected static <TDocument> void setupAsyncSearchParser(
			DelegatingJsonpValueParser<AsyncSearch.Builder<TDocument>> op,
			JsonpValueParser<TDocument> tDocumentParser) {

		op.add(Builder::aggregations, JsonpValueParser.stringMapParser(JsonpValueParser.jsonValueParser()),
				"aggregations");
		op.add(Builder::_clusters, ClusterStatistics.JSONP_PARSER, "_clusters");
		op.add(Builder::fields, JsonpValueParser.stringMapParser(JsonpValueParser.jsonValueParser()), "fields");
		op.add(Builder::hits, HitsMetadata.createHitsMetadataParser(tDocumentParser), "hits");
		op.add(Builder::maxScore, JsonpValueParser.numberParser(), "max_score");
		op.add(Builder::numReducePhases, JsonpValueParser.numberParser(), "num_reduce_phases");
		op.add(Builder::profile, Profile.JSONP_PARSER, "profile");
		op.add(Builder::pitId, JsonpValueParser.stringParser(), "pit_id");
		op.add(Builder::_scrollId, JsonpValueParser.stringParser(), "_scroll_id");
		op.add(Builder::_shards, ShardStatistics.JSONP_PARSER, "_shards");
		op.add(Builder::suggest, JsonpValueParser.stringMapParser(
				JsonpValueParser.arrayParser(Suggest.createSuggestParser(tDocumentParser))), "suggest");
		op.add(Builder::terminatedEarly, JsonpValueParser.booleanParser(), "terminated_early");
		op.add(Builder::timedOut, JsonpValueParser.booleanParser(), "timed_out");
		op.add(Builder::took, JsonpValueParser.numberParser(), "took");

	}

}
