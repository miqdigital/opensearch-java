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

package co.elastic.clients.elasticsearch.ml.evaluate_data_frame;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.evaluate_data_frame.DataframeEvaluationValue
public class DataframeEvaluationValue implements ToJsonp {
	private final Number value;

	// ---------------------------------------------------------------------------------------------

	protected DataframeEvaluationValue(AbstractBuilder<?> builder) {

		this.value = Objects.requireNonNull(builder.value, "value");

	}

	/**
	 * API name: {@code value}
	 */
	public Number value() {
		return this.value;
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

		generator.writeKey("value");
		generator.write(this.value.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeEvaluationValue}.
	 */
	public static class Builder extends DataframeEvaluationValue.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DataframeEvaluationValue> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframeEvaluationValue}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeEvaluationValue build() {

			return new DataframeEvaluationValue(this);
		}
	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		private Number value;

		/**
		 * API name: {@code value}
		 */
		public BuilderT value(Number value) {
			this.value = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for DataframeEvaluationValue
	 */
	public static final JsonpValueParser<DataframeEvaluationValue> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, DataframeEvaluationValue::setupDataframeEvaluationValueParser);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupDataframeEvaluationValueParser(
			DelegatingJsonpValueParser<BuilderT> op) {

		op.add(AbstractBuilder::value, JsonpValueParser.numberParser(), "value");

	}

}
