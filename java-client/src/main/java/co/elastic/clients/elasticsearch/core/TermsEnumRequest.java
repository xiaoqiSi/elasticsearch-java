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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.terms_enum.Request
@JsonpDeserializable
public final class TermsEnumRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean caseInsensitive;

	private final String field;

	private final String index;

	@Nullable
	private final Query indexFilter;

	@Nullable
	private final String searchAfter;

	@Nullable
	private final Integer size;

	@Nullable
	private final String string;

	@Nullable
	private final String timeout;

	// ---------------------------------------------------------------------------------------------

	public TermsEnumRequest(Builder builder) {

		this.caseInsensitive = builder.caseInsensitive;
		this.field = Objects.requireNonNull(builder.field, "field");
		this.index = Objects.requireNonNull(builder.index, "index");
		this.indexFilter = builder.indexFilter;
		this.searchAfter = builder.searchAfter;
		this.size = builder.size;
		this.string = builder.string;
		this.timeout = builder.timeout;

	}

	public TermsEnumRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * When true the provided search string is matched against index terms without
	 * case sensitivity.
	 * <p>
	 * API name: {@code case_insensitive}
	 */
	@Nullable
	public Boolean caseInsensitive() {
		return this.caseInsensitive;
	}

	/**
	 * Required - The string to match at the start of indexed terms. If not
	 * provided, all terms in the field are considered.
	 * <p>
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * Required - Comma-separated list of data streams, indices, and index aliases
	 * to search. Wildcard (*) expressions are supported.
	 * <p>
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * Allows to filter an index shard if the provided query rewrites to match_none.
	 * <p>
	 * API name: {@code index_filter}
	 */
	@Nullable
	public Query indexFilter() {
		return this.indexFilter;
	}

	/**
	 * API name: {@code search_after}
	 */
	@Nullable
	public String searchAfter() {
		return this.searchAfter;
	}

	/**
	 * How many matching terms to return.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public Integer size() {
		return this.size;
	}

	/**
	 * The string after which terms in the index should be returned. Allows for a
	 * form of pagination if the last result from one request is passed as the
	 * search_after parameter for a subsequent request.
	 * <p>
	 * API name: {@code string}
	 */
	@Nullable
	public String string() {
		return this.string;
	}

	/**
	 * The maximum length of time to spend collecting results. Defaults to
	 * &quot;1s&quot; (one second). If the timeout is exceeded the complete flag set
	 * to false in the response and the results may be partial or empty.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public String timeout() {
		return this.timeout;
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

		if (this.caseInsensitive != null) {

			generator.writeKey("case_insensitive");
			generator.write(this.caseInsensitive);

		}

		generator.writeKey("field");
		generator.write(this.field);

		if (this.indexFilter != null) {

			generator.writeKey("index_filter");
			this.indexFilter.serialize(generator, mapper);

		}
		if (this.searchAfter != null) {

			generator.writeKey("search_after");
			generator.write(this.searchAfter);

		}
		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.string != null) {

			generator.writeKey("string");
			generator.write(this.string);

		}
		if (this.timeout != null) {

			generator.writeKey("timeout");
			generator.write(this.timeout);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TermsEnumRequest}.
	 */
	public static class Builder implements ObjectBuilder<TermsEnumRequest> {
		@Nullable
		private Boolean caseInsensitive;

		private String field;

		private String index;

		@Nullable
		private Query indexFilter;

		@Nullable
		private String searchAfter;

		@Nullable
		private Integer size;

		@Nullable
		private String string;

		@Nullable
		private String timeout;

		/**
		 * When true the provided search string is matched against index terms without
		 * case sensitivity.
		 * <p>
		 * API name: {@code case_insensitive}
		 */
		public Builder caseInsensitive(@Nullable Boolean value) {
			this.caseInsensitive = value;
			return this;
		}

		/**
		 * Required - The string to match at the start of indexed terms. If not
		 * provided, all terms in the field are considered.
		 * <p>
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - Comma-separated list of data streams, indices, and index aliases
		 * to search. Wildcard (*) expressions are supported.
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Allows to filter an index shard if the provided query rewrites to match_none.
		 * <p>
		 * API name: {@code index_filter}
		 */
		public Builder indexFilter(@Nullable Query value) {
			this.indexFilter = value;
			return this;
		}

		/**
		 * Allows to filter an index shard if the provided query rewrites to match_none.
		 * <p>
		 * API name: {@code index_filter}
		 */
		public Builder indexFilter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.indexFilter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * API name: {@code search_after}
		 */
		public Builder searchAfter(@Nullable String value) {
			this.searchAfter = value;
			return this;
		}

		/**
		 * How many matching terms to return.
		 * <p>
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * The string after which terms in the index should be returned. Allows for a
		 * form of pagination if the last result from one request is passed as the
		 * search_after parameter for a subsequent request.
		 * <p>
		 * API name: {@code string}
		 */
		public Builder string(@Nullable String value) {
			this.string = value;
			return this;
		}

		/**
		 * The maximum length of time to spend collecting results. Defaults to
		 * &quot;1s&quot; (one second). If the timeout is exceeded the complete flag set
		 * to false in the response and the results may be partial or empty.
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Builds a {@link TermsEnumRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TermsEnumRequest build() {

			return new TermsEnumRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TermsEnumRequest}
	 */
	public static final JsonpDeserializer<TermsEnumRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TermsEnumRequest::setupTermsEnumRequestDeserializer, Builder::build);

	protected static void setupTermsEnumRequestDeserializer(DelegatingDeserializer<TermsEnumRequest.Builder> op) {

		op.add(Builder::caseInsensitive, JsonpDeserializer.booleanDeserializer(), "case_insensitive");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::indexFilter, Query._DESERIALIZER, "index_filter");
		op.add(Builder::searchAfter, JsonpDeserializer.stringDeserializer(), "search_after");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::string, JsonpDeserializer.stringDeserializer(), "string");
		op.add(Builder::timeout, JsonpDeserializer.stringDeserializer(), "timeout");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code terms_enum}".
	 */
	public static final Endpoint<TermsEnumRequest, TermsEnumResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_terms_enum");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, TermsEnumResponse._DESERIALIZER);
}