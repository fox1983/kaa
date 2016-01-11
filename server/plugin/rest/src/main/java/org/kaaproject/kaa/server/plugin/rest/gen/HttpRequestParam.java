/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.server.plugin.rest.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class HttpRequestParam extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"HttpRequestParam\",\"namespace\":\"org.kaaproject.kaa.server.plugin.rest.gen\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"avroSchemaMapping\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String name;
   private java.lang.String avroSchemaMapping;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public HttpRequestParam() {}

  /**
   * All-args constructor.
   */
  public HttpRequestParam(java.lang.String name, java.lang.String avroSchemaMapping) {
    this.name = name;
    this.avroSchemaMapping = avroSchemaMapping;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return avroSchemaMapping;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.String)value$; break;
    case 1: avroSchemaMapping = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'avroSchemaMapping' field.
   */
  public java.lang.String getAvroSchemaMapping() {
    return avroSchemaMapping;
  }

  /**
   * Sets the value of the 'avroSchemaMapping' field.
   * @param value the value to set.
   */
  public void setAvroSchemaMapping(java.lang.String value) {
    this.avroSchemaMapping = value;
  }

  /** Creates a new HttpRequestParam RecordBuilder */
  public static org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.Builder newBuilder() {
    return new org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.Builder();
  }
  
  /** Creates a new HttpRequestParam RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.Builder newBuilder(org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.Builder other) {
    return new org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.Builder(other);
  }
  
  /** Creates a new HttpRequestParam RecordBuilder by copying an existing HttpRequestParam instance */
  public static org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.Builder newBuilder(org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam other) {
    return new org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.Builder(other);
  }
  
  /**
   * RecordBuilder for HttpRequestParam instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<HttpRequestParam>
    implements org.apache.avro.data.RecordBuilder<HttpRequestParam> {

    private java.lang.String name;
    private java.lang.String avroSchemaMapping;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.avroSchemaMapping)) {
        this.avroSchemaMapping = data().deepCopy(fields()[1].schema(), other.avroSchemaMapping);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing HttpRequestParam instance */
    private Builder(org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam other) {
            super(org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.avroSchemaMapping)) {
        this.avroSchemaMapping = data().deepCopy(fields()[1].schema(), other.avroSchemaMapping);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'name' field */
    public java.lang.String getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.Builder setName(java.lang.String value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'name' field */
    public org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'avroSchemaMapping' field */
    public java.lang.String getAvroSchemaMapping() {
      return avroSchemaMapping;
    }
    
    /** Sets the value of the 'avroSchemaMapping' field */
    public org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.Builder setAvroSchemaMapping(java.lang.String value) {
      validate(fields()[1], value);
      this.avroSchemaMapping = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'avroSchemaMapping' field has been set */
    public boolean hasAvroSchemaMapping() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'avroSchemaMapping' field */
    public org.kaaproject.kaa.server.plugin.rest.gen.HttpRequestParam.Builder clearAvroSchemaMapping() {
      avroSchemaMapping = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public HttpRequestParam build() {
      try {
        HttpRequestParam record = new HttpRequestParam();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.String) defaultValue(fields()[0]);
        record.avroSchemaMapping = fieldSetFlags()[1] ? this.avroSchemaMapping : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
