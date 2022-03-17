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

package co.elastic.clients.elasticsearch.autoscaling;

import co.elastic.clients.elasticsearch.autoscaling.get_autoscaling_capacity.AutoscalingDeciders;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: autoscaling.get_autoscaling_capacity.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#autoscaling.get_autoscaling_capacity.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetAutoscalingCapacityResponse implements JsonpSerializable {
	private final Map<String, AutoscalingDeciders> policies;

	// ---------------------------------------------------------------------------------------------

	private GetAutoscalingCapacityResponse(Builder builder) {

		this.policies = ApiTypeHelper.unmodifiableRequired(builder.policies, this, "policies");

	}

	public static GetAutoscalingCapacityResponse of(
			Function<Builder, ObjectBuilder<GetAutoscalingCapacityResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code policies}
	 */
	public final Map<String, AutoscalingDeciders> policies() {
		return this.policies;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (ApiTypeHelper.isDefined(this.policies)) {
			generator.writeKey("policies");
			generator.writeStartObject();
			for (Map.Entry<String, AutoscalingDeciders> item0 : this.policies.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetAutoscalingCapacityResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetAutoscalingCapacityResponse> {
		private Map<String, AutoscalingDeciders> policies;

		/**
		 * Required - API name: {@code policies}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>policies</code>.
		 */
		public final Builder policies(Map<String, AutoscalingDeciders> map) {
			this.policies = _mapPutAll(this.policies, map);
			return this;
		}

		/**
		 * Required - API name: {@code policies}
		 * <p>
		 * Adds an entry to <code>policies</code>.
		 */
		public final Builder policies(String key, AutoscalingDeciders value) {
			this.policies = _mapPut(this.policies, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code policies}
		 * <p>
		 * Adds an entry to <code>policies</code> using a builder lambda.
		 */
		public final Builder policies(String key,
				Function<AutoscalingDeciders.Builder, ObjectBuilder<AutoscalingDeciders>> fn) {
			return policies(key, fn.apply(new AutoscalingDeciders.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetAutoscalingCapacityResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetAutoscalingCapacityResponse build() {
			_checkSingleUse();

			return new GetAutoscalingCapacityResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetAutoscalingCapacityResponse}
	 */
	public static final JsonpDeserializer<GetAutoscalingCapacityResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetAutoscalingCapacityResponse::setupGetAutoscalingCapacityResponseDeserializer);

	protected static void setupGetAutoscalingCapacityResponseDeserializer(
			ObjectDeserializer<GetAutoscalingCapacityResponse.Builder> op) {

		op.add(Builder::policies, JsonpDeserializer.stringMapDeserializer(AutoscalingDeciders._DESERIALIZER),
				"policies");

	}

}
