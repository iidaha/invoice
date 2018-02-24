package common;

import java.io.IOException;
import java.util.Optional;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConverter {
    private static ObjectMapper mapper = new ObjectMapper();

    private JsonConverter() {
    }

    public static Optional<String> toJson(final Object object) {
        try {
            return Optional.of(mapper.writeValueAsString(object));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public static <T> Optional<T> toObject(final String json, final Class<T> type) {
        try {
            return Optional.of(mapper.readValue(json, type));
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public static <T> Optional<T> toObject(String json, TypeReference<T> type) {
        try {
            return Optional.of(mapper.readValue(json, type));
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

}
