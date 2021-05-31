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

package co.elastic.clients.elasticsearch.ml;

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
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.Detector
public final class Detector implements ToJsonp {
	@Nullable
	private final String byFieldName;

	@Nullable
	private final List<DetectionRule> customRules;

	@Nullable
	private final String detectorDescription;

	@Nullable
	private final Number detectorIndex;

	@Nullable
	private final JsonValue excludeFrequent;

	@Nullable
	private final String fieldName;

	@Nullable
	private final String function;

	@Nullable
	private final Boolean useNull;

	@Nullable
	private final String overFieldName;

	@Nullable
	private final String partitionFieldName;

	@Nullable
	private final String description;

	// ---------------------------------------------------------------------------------------------

	protected Detector(Builder builder) {

		this.byFieldName = builder.byFieldName;
		this.customRules = builder.customRules;
		this.detectorDescription = builder.detectorDescription;
		this.detectorIndex = builder.detectorIndex;
		this.excludeFrequent = builder.excludeFrequent;
		this.fieldName = builder.fieldName;
		this.function = builder.function;
		this.useNull = builder.useNull;
		this.overFieldName = builder.overFieldName;
		this.partitionFieldName = builder.partitionFieldName;
		this.description = builder.description;

	}

	/**
	 * API name: {@code by_field_name}
	 */
	@Nullable
	public String byFieldName() {
		return this.byFieldName;
	}

	/**
	 * API name: {@code custom_rules}
	 */
	@Nullable
	public List<DetectionRule> customRules() {
		return this.customRules;
	}

	/**
	 * API name: {@code detector_description}
	 */
	@Nullable
	public String detectorDescription() {
		return this.detectorDescription;
	}

	/**
	 * API name: {@code detector_index}
	 */
	@Nullable
	public Number detectorIndex() {
		return this.detectorIndex;
	}

	/**
	 * API name: {@code exclude_frequent}
	 */
	@Nullable
	public JsonValue excludeFrequent() {
		return this.excludeFrequent;
	}

	/**
	 * API name: {@code field_name}
	 */
	@Nullable
	public String fieldName() {
		return this.fieldName;
	}

	/**
	 * API name: {@code function}
	 */
	@Nullable
	public String function() {
		return this.function;
	}

	/**
	 * API name: {@code use_null}
	 */
	@Nullable
	public Boolean useNull() {
		return this.useNull;
	}

	/**
	 * API name: {@code over_field_name}
	 */
	@Nullable
	public String overFieldName() {
		return this.overFieldName;
	}

	/**
	 * API name: {@code partition_field_name}
	 */
	@Nullable
	public String partitionFieldName() {
		return this.partitionFieldName;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
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

		if (this.byFieldName != null) {

			generator.writeKey("by_field_name");
			generator.write(this.byFieldName);

		}
		if (this.customRules != null) {

			generator.writeKey("custom_rules");
			generator.writeStartArray();
			for (DetectionRule item0 : this.customRules) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.detectorDescription != null) {

			generator.writeKey("detector_description");
			generator.write(this.detectorDescription);

		}
		if (this.detectorIndex != null) {

			generator.writeKey("detector_index");
			generator.write(this.detectorIndex.doubleValue());

		}
		if (this.excludeFrequent != null) {

			generator.writeKey("exclude_frequent");
			generator.write(this.excludeFrequent);

		}
		if (this.fieldName != null) {

			generator.writeKey("field_name");
			generator.write(this.fieldName);

		}
		if (this.function != null) {

			generator.writeKey("function");
			generator.write(this.function);

		}
		if (this.useNull != null) {

			generator.writeKey("use_null");
			generator.write(this.useNull);

		}
		if (this.overFieldName != null) {

			generator.writeKey("over_field_name");
			generator.write(this.overFieldName);

		}
		if (this.partitionFieldName != null) {

			generator.writeKey("partition_field_name");
			generator.write(this.partitionFieldName);

		}
		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Detector}.
	 */
	public static class Builder implements ObjectBuilder<Detector> {
		@Nullable
		private String byFieldName;

		@Nullable
		private List<DetectionRule> customRules;

		@Nullable
		private String detectorDescription;

		@Nullable
		private Number detectorIndex;

		@Nullable
		private JsonValue excludeFrequent;

		@Nullable
		private String fieldName;

		@Nullable
		private String function;

		@Nullable
		private Boolean useNull;

		@Nullable
		private String overFieldName;

		@Nullable
		private String partitionFieldName;

		@Nullable
		private String description;

		/**
		 * API name: {@code by_field_name}
		 */
		public Builder byFieldName(@Nullable String value) {
			this.byFieldName = value;
			return this;
		}

		/**
		 * API name: {@code custom_rules}
		 */
		public Builder customRules(@Nullable List<DetectionRule> value) {
			this.customRules = value;
			return this;
		}

		/**
		 * API name: {@code custom_rules}
		 */
		public Builder customRules(DetectionRule... value) {
			this.customRules = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #customRules(List)}, creating the list if needed.
		 */
		public Builder addCustomRules(DetectionRule value) {
			if (this.customRules == null) {
				this.customRules = new ArrayList<>();
			}
			this.customRules.add(value);
			return this;
		}

		/**
		 * Set {@link #customRules(List)} to a singleton list.
		 */
		public Builder customRules(Function<DetectionRule.Builder, ObjectBuilder<DetectionRule>> fn) {
			return this.customRules(fn.apply(new DetectionRule.Builder()).build());
		}

		/**
		 * Add a value to {@link #customRules(List)}, creating the list if needed.
		 */
		public Builder addCustomRules(Function<DetectionRule.Builder, ObjectBuilder<DetectionRule>> fn) {
			return this.addCustomRules(fn.apply(new DetectionRule.Builder()).build());
		}

		/**
		 * API name: {@code detector_description}
		 */
		public Builder detectorDescription(@Nullable String value) {
			this.detectorDescription = value;
			return this;
		}

		/**
		 * API name: {@code detector_index}
		 */
		public Builder detectorIndex(@Nullable Number value) {
			this.detectorIndex = value;
			return this;
		}

		/**
		 * API name: {@code exclude_frequent}
		 */
		public Builder excludeFrequent(@Nullable JsonValue value) {
			this.excludeFrequent = value;
			return this;
		}

		/**
		 * API name: {@code field_name}
		 */
		public Builder fieldName(@Nullable String value) {
			this.fieldName = value;
			return this;
		}

		/**
		 * API name: {@code function}
		 */
		public Builder function(@Nullable String value) {
			this.function = value;
			return this;
		}

		/**
		 * API name: {@code use_null}
		 */
		public Builder useNull(@Nullable Boolean value) {
			this.useNull = value;
			return this;
		}

		/**
		 * API name: {@code over_field_name}
		 */
		public Builder overFieldName(@Nullable String value) {
			this.overFieldName = value;
			return this;
		}

		/**
		 * API name: {@code partition_field_name}
		 */
		public Builder partitionFieldName(@Nullable String value) {
			this.partitionFieldName = value;
			return this;
		}

		/**
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * Builds a {@link Detector}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Detector build() {

			return new Detector(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for Detector
	 */
	public static final JsonpValueParser<Detector> JSONP_PARSER = JsonpObjectBuilderParser.createForObject(Builder::new,
			Detector::setupDetectorParser);

	protected static void setupDetectorParser(DelegatingJsonpValueParser<Detector.Builder> op) {

		op.add(Builder::byFieldName, JsonpValueParser.stringParser(), "by_field_name");
		op.add(Builder::customRules, JsonpValueParser.arrayParser(DetectionRule.JSONP_PARSER), "custom_rules");
		op.add(Builder::detectorDescription, JsonpValueParser.stringParser(), "detector_description");
		op.add(Builder::detectorIndex, JsonpValueParser.numberParser(), "detector_index");
		op.add(Builder::excludeFrequent, JsonpValueParser.jsonValueParser(), "exclude_frequent");
		op.add(Builder::fieldName, JsonpValueParser.stringParser(), "field_name");
		op.add(Builder::function, JsonpValueParser.stringParser(), "function");
		op.add(Builder::useNull, JsonpValueParser.booleanParser(), "use_null");
		op.add(Builder::overFieldName, JsonpValueParser.stringParser(), "over_field_name");
		op.add(Builder::partitionFieldName, JsonpValueParser.stringParser(), "partition_field_name");
		op.add(Builder::description, JsonpValueParser.stringParser(), "description");

	}

}
