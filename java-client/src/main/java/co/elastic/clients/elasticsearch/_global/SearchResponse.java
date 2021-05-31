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
import co.elastic.clients.json.JsonpUtils;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.search.Response
public class SearchResponse<TDocument> implements ToJsonp {
	private final Number took;

	private final Boolean timedOut;

	private final ShardStatistics _shards;

	private final HitsMetadata<TDocument> hits;

	@Nullable
	private final Map<String, JsonValue> aggregations;

	@Nullable
	private final ClusterStatistics _clusters;

	@Nullable
	private final List<TDocument> documents;

	@Nullable
	private final Map<String, JsonValue> fields;

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

	@Nullable
	private final Map<String, List<Suggest<TDocument>>> suggest;

	@Nullable
	private final Boolean terminatedEarly;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	protected SearchResponse(AbstractBuilder<TDocument, ?> builder) {

		this.took = Objects.requireNonNull(builder.took, "took");
		this.timedOut = Objects.requireNonNull(builder.timedOut, "timed_out");
		this._shards = Objects.requireNonNull(builder._shards, "_shards");
		this.hits = Objects.requireNonNull(builder.hits, "hits");
		this.aggregations = builder.aggregations;
		this._clusters = builder._clusters;
		this.documents = builder.documents;
		this.fields = builder.fields;
		this.maxScore = builder.maxScore;
		this.numReducePhases = builder.numReducePhases;
		this.profile = builder.profile;
		this.pitId = builder.pitId;
		this._scrollId = builder._scrollId;
		this.suggest = builder.suggest;
		this.terminatedEarly = builder.terminatedEarly;
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	/**
	 * API name: {@code took}
	 */
	public Number took() {
		return this.took;
	}

	/**
	 * API name: {@code timed_out}
	 */
	public Boolean timedOut() {
		return this.timedOut;
	}

	/**
	 * API name: {@code _shards}
	 */
	public ShardStatistics _shards() {
		return this._shards;
	}

	/**
	 * API name: {@code hits}
	 */
	public HitsMetadata<TDocument> hits() {
		return this.hits;
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
	 * API name: {@code documents}
	 */
	@Nullable
	public List<TDocument> documents() {
		return this.documents;
	}

	/**
	 * API name: {@code fields}
	 */
	@Nullable
	public Map<String, JsonValue> fields() {
		return this.fields;
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
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("took");
		generator.write(this.took.doubleValue());

		generator.writeKey("timed_out");
		generator.write(this.timedOut);

		generator.writeKey("_shards");
		this._shards.toJsonp(generator, mapper);

		generator.writeKey("hits");
		this.hits.toJsonp(generator, mapper);

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
		if (this.documents != null) {

			generator.writeKey("documents");
			generator.writeStartArray();
			for (TDocument item0 : this.documents) {
				JsonpUtils.serialize(item0, generator, tDocumentSerializer, mapper);

			}
			generator.writeEnd();

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

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchResponse}.
	 */
	public static class Builder<TDocument> extends SearchResponse.AbstractBuilder<TDocument, Builder<TDocument>>
			implements
				ObjectBuilder<SearchResponse<TDocument>> {
		@Override
		protected Builder<TDocument> self() {
			return this;
		}

		/**
		 * Builds a {@link SearchResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchResponse<TDocument> build() {

			return new SearchResponse<TDocument>(this);
		}
	}

	protected abstract static class AbstractBuilder<TDocument, BuilderT extends AbstractBuilder<TDocument, BuilderT>> {
		private Number took;

		private Boolean timedOut;

		private ShardStatistics _shards;

		private HitsMetadata<TDocument> hits;

		@Nullable
		private Map<String, JsonValue> aggregations;

		@Nullable
		private ClusterStatistics _clusters;

		@Nullable
		private List<TDocument> documents;

		@Nullable
		private Map<String, JsonValue> fields;

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

		@Nullable
		private Map<String, List<Suggest<TDocument>>> suggest;

		@Nullable
		private Boolean terminatedEarly;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * API name: {@code took}
		 */
		public BuilderT took(Number value) {
			this.took = value;
			return self();
		}

		/**
		 * API name: {@code timed_out}
		 */
		public BuilderT timedOut(Boolean value) {
			this.timedOut = value;
			return self();
		}

		/**
		 * API name: {@code _shards}
		 */
		public BuilderT _shards(ShardStatistics value) {
			this._shards = value;
			return self();
		}

		/**
		 * API name: {@code _shards}
		 */
		public BuilderT _shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this._shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * API name: {@code hits}
		 */
		public BuilderT hits(HitsMetadata<TDocument> value) {
			this.hits = value;
			return self();
		}

		/**
		 * API name: {@code hits}
		 */
		public BuilderT hits(Function<HitsMetadata.Builder<TDocument>, ObjectBuilder<HitsMetadata<TDocument>>> fn) {
			return this.hits(fn.apply(new HitsMetadata.Builder<TDocument>()).build());
		}

		/**
		 * API name: {@code aggregations}
		 */
		public BuilderT aggregations(@Nullable Map<String, JsonValue> value) {
			this.aggregations = value;
			return self();
		}

		/**
		 * Add a key/value to {@link #aggregations(Map)}, creating the map if needed.
		 */
		public BuilderT putAggregations(String key, JsonValue value) {
			if (this.aggregations == null) {
				this.aggregations = new HashMap<>();
			}
			this.aggregations.put(key, value);
			return self();
		}

		/**
		 * API name: {@code _clusters}
		 */
		public BuilderT _clusters(@Nullable ClusterStatistics value) {
			this._clusters = value;
			return self();
		}

		/**
		 * API name: {@code _clusters}
		 */
		public BuilderT _clusters(Function<ClusterStatistics.Builder, ObjectBuilder<ClusterStatistics>> fn) {
			return this._clusters(fn.apply(new ClusterStatistics.Builder()).build());
		}

		/**
		 * API name: {@code documents}
		 */
		public BuilderT documents(@Nullable List<TDocument> value) {
			this.documents = value;
			return self();
		}

		/**
		 * API name: {@code documents}
		 */
		public BuilderT documents(TDocument... value) {
			this.documents = Arrays.asList(value);
			return self();
		}

		/**
		 * Add a value to {@link #documents(List)}, creating the list if needed.
		 */
		public BuilderT addDocuments(TDocument value) {
			if (this.documents == null) {
				this.documents = new ArrayList<>();
			}
			this.documents.add(value);
			return self();
		}

		/**
		 * API name: {@code fields}
		 */
		public BuilderT fields(@Nullable Map<String, JsonValue> value) {
			this.fields = value;
			return self();
		}

		/**
		 * Add a key/value to {@link #fields(Map)}, creating the map if needed.
		 */
		public BuilderT putFields(String key, JsonValue value) {
			if (this.fields == null) {
				this.fields = new HashMap<>();
			}
			this.fields.put(key, value);
			return self();
		}

		/**
		 * API name: {@code max_score}
		 */
		public BuilderT maxScore(@Nullable Number value) {
			this.maxScore = value;
			return self();
		}

		/**
		 * API name: {@code num_reduce_phases}
		 */
		public BuilderT numReducePhases(@Nullable Number value) {
			this.numReducePhases = value;
			return self();
		}

		/**
		 * API name: {@code profile}
		 */
		public BuilderT profile(@Nullable Profile value) {
			this.profile = value;
			return self();
		}

		/**
		 * API name: {@code profile}
		 */
		public BuilderT profile(Function<Profile.Builder, ObjectBuilder<Profile>> fn) {
			return this.profile(fn.apply(new Profile.Builder()).build());
		}

		/**
		 * API name: {@code pit_id}
		 */
		public BuilderT pitId(@Nullable String value) {
			this.pitId = value;
			return self();
		}

		/**
		 * API name: {@code _scroll_id}
		 */
		public BuilderT _scrollId(@Nullable String value) {
			this._scrollId = value;
			return self();
		}

		/**
		 * API name: {@code suggest}
		 */
		public BuilderT suggest(@Nullable Map<String, List<Suggest<TDocument>>> value) {
			this.suggest = value;
			return self();
		}

		/**
		 * Add a key/value to {@link #suggest(Map)}, creating the map if needed.
		 */
		public BuilderT putSuggest(String key, List<Suggest<TDocument>> value) {
			if (this.suggest == null) {
				this.suggest = new HashMap<>();
			}
			this.suggest.put(key, value);
			return self();
		}

		/**
		 * API name: {@code terminated_early}
		 */
		public BuilderT terminatedEarly(@Nullable Boolean value) {
			this.terminatedEarly = value;
			return self();
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 *
		 */
		public BuilderT tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json parser for SearchResponse
	 */
	public static <TDocument> JsonpValueParser<SearchResponse<TDocument>> createSearchResponseParser(
			JsonpValueParser<TDocument> tDocumentParser) {
		return JsonpObjectBuilderParser.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> SearchResponse.setupSearchResponseParser(op, tDocumentParser));
	};

	protected static <TDocument, BuilderT extends AbstractBuilder<TDocument, BuilderT>> void setupSearchResponseParser(
			DelegatingJsonpValueParser<BuilderT> op, JsonpValueParser<TDocument> tDocumentParser) {

		op.add(AbstractBuilder::took, JsonpValueParser.numberParser(), "took");
		op.add(AbstractBuilder::timedOut, JsonpValueParser.booleanParser(), "timed_out");
		op.add(AbstractBuilder::_shards, ShardStatistics.JSONP_PARSER, "_shards");
		op.add(AbstractBuilder::hits, HitsMetadata.createHitsMetadataParser(tDocumentParser), "hits");
		op.add(AbstractBuilder::aggregations, JsonpValueParser.stringMapParser(JsonpValueParser.jsonValueParser()),
				"aggregations");
		op.add(AbstractBuilder::_clusters, ClusterStatistics.JSONP_PARSER, "_clusters");
		op.add(AbstractBuilder::documents, JsonpValueParser.arrayParser(tDocumentParser), "documents");
		op.add(AbstractBuilder::fields, JsonpValueParser.stringMapParser(JsonpValueParser.jsonValueParser()), "fields");
		op.add(AbstractBuilder::maxScore, JsonpValueParser.numberParser(), "max_score");
		op.add(AbstractBuilder::numReducePhases, JsonpValueParser.numberParser(), "num_reduce_phases");
		op.add(AbstractBuilder::profile, Profile.JSONP_PARSER, "profile");
		op.add(AbstractBuilder::pitId, JsonpValueParser.stringParser(), "pit_id");
		op.add(AbstractBuilder::_scrollId, JsonpValueParser.stringParser(), "_scroll_id");
		op.add(AbstractBuilder::suggest, JsonpValueParser.stringMapParser(
				JsonpValueParser.arrayParser(Suggest.createSuggestParser(tDocumentParser))), "suggest");
		op.add(AbstractBuilder::terminatedEarly, JsonpValueParser.booleanParser(), "terminated_early");

	}

}
