package de.bytefish.fcmjava.client.serializer;

public interface IJsonSerializer {

    <TModel> String serialize(TModel model);

    <TModel> TModel deserialize(String content, Class<TModel> type);

}