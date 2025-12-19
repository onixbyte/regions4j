# regions4j

**regions4j** is a lightweight, type-safe Java library providing comprehensive metadata for world
regions based on the ISO 3166-1 standard. It is designed to simplify internationalisation (i18n),
telecommunication routing, and regional data management in Java-based enterprise applications.

## Key Features

- **ISO 3166-1 Compliant**: Full support for Alpha-2 (`abbr`) and Alpha-3 (`code`) formats.
- **Telecommunication Metadata**: Includes international calling codes (E.164 dialling prefixes).
- **Locality Support**: Default locale tags for each region to assist with i18n workflows.
- **High Performance**: Internal caching for $O(1)$ lookups by abbreviation or code.
- **Zero Dependencies**: A pure Java library with no external overhead.

## Installation

Add the following dependency to your `pom.xml`:

```xml

<dependency>
    <groupId>com.onixbyte</groupId>
    <artifactId>regions4j</artifactId>
    <version>2025.12</version>
</dependency>
```

### Versioning Policy

[!IMPORTANT] To ensure synchronisation with the latest international standards (ISO 3166), this
library does not follow Semantic Versioning (SemVer). Instead, it adopts a Calendar Versioning (
CalVer) scheme in the format of YYYY.MM (e.g., 2025.12). This allows users to immediately identify
the freshness of the regional data contained within the library.

## Core Schema

Each region in the library is defined by the following attributes:

| Attribute      | Type   | Description                     | Example                            |
|----------------|--------|---------------------------------|------------------------------------|
| `abbreviation` | String | ISO 3166-1 alpha-2 abbreviation | `HK`, `US`, `GB`, `RU`             |
| `code`         | String | ISO 3166-1 alpha-3 code         | `HKG`, `USA`, `GBR`, `RUS`         |
| `callingCode`  | String | International dialling prefix   | `852`, `1`, `44`, `7`              |
| `locale`       | String | Default language and region tag | `zh_HK`, `en_US`, `en_GB`, `ru_RU` |

## Usage Examples

### 1. Retrieving Regional Metadata

You can access specific regional data directly via the enum constants:

```java
Region uk = Region.UNITED_KINGDOM;

System.out.println("Abbreviation: " + uk.getAbbreviation()); // GB
System.out.println("ISO Code: " + uk.getCode());             // GBR
System.out.println("Dialling Code: " + uk.getDialCode());    // 44
System.out.println("Default Locale: " + uk.getLocale());     // en_GB
```

### 2. Efficient Lookups

The library provides optimised methods for retrieving regions from string inputs, ideal for
processing web requests or database records.

```java
// Lookup by Alpha-2 abbreviation (case-sensitive)
Region regionByAbbreviation = Region.fromAbbreviation("GB");

// Lookup by Alpha-3 code (case-insensitive)
Region regionByCode = Region.fromCode("GBR");
```

### 3. Integration with Java Locale

While `regions4j` provides a default `locale` string, you can easily convert it to a standard
`java.util.Locale` object for further i18n processing:

```java
Region region = Region.CHINA;
Locale javaLocale = Locale.forLanguageTag(region.getLocale().replace("_", "-"));
System.out.println(javaLocale.getDisplayCountry(Locale.UK)); // China
```

## Initialisation and Performance

Upon the first access to the `Region` class, the library performs an internal initialisation that
maps all regions into immutable `HashMap` structures. This ensures that subsequent lookups are
thread-safe and performed with constant time complexity.

## Contributing

If you find a regional update (e.g., a change in a calling code or a new ISO assignment), please
raise an issue or submit a pull request. We aim to keep this library synchronised with the latest
international standards.

## Licence

This project is licensed under the MIT Licence.