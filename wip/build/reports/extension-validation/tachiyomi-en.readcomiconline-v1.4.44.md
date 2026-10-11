# Extension Validation Report

- Extension: tachiyomi-en.readcomiconline-v1.4.44
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 1
- Lint: 0
- Warnings: 0
- Skipped: 34
- Failed: 2
- Retry disposition: RETRY_WHEN
- Retry condition: TLS_HANDSHAKE_SUCCEEDS: readcomiconline.li

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8061953015808280611
- Source name: ReadComicOnline
- Source language: en

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | error | 0 |  | javax.net.ssl.SSLPeerUnverifiedException: Hostname readcomiconline.li not verified:<br>    certificate: sha256/lOLuq1g2wh6ncqAOibfdqkMgP1geY5riajNT3At9fEg=<br>    DN: CN=dns.google<br>    subjectAltNames: \[8.8.8.8, 8.8.4.4, 8.8.8.53, 2001:4860:4860:0:0:0:0:8888, 2001:4860:4860:0:0:0:0:8844, 2001:4860:4860:0:0:0:0:6464, 2001:4860:4860:0:0:0:0:64, dns.google, dns.google.com, *.dns.google.com, 8888.google, dns64.dns.google\] | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | error | 0 |  | javax.net.ssl.SSLPeerUnverifiedException: Hostname readcomiconline.li not verified:<br>    certificate: sha256/lOLuq1g2wh6ncqAOibfdqkMgP1geY5riajNT3At9fEg=<br>    DN: CN=dns.google<br>    subjectAltNames: \[8.8.8.8, 8.8.4.4, 8.8.8.53, 2001:4860:4860:0:0:0:0:8888, 2001:4860:4860:0:0:0:0:8844, 2001:4860:4860:0:0:0:0:6464, 2001:4860:4860:0:0:0:0:64, dns.google, dns.google.com, *.dns.google.com, 8888.google, dns64.dns.google\] | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | skipped | 0 |  |  | <1s |
| details | `fetchMangaDetails(manga)` | skipped | 0 |  |  | <1s |
| chapters | `fetchChapterList(manga)` | skipped | 0 |  |  | <1s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | ERROR | javax.net.ssl.SSLPeerUnverifiedException: Hostname readcomiconline.li not verified:<br>    certificate: sha256/lOLuq1g2wh6ncqAOibfdqkMgP1geY5riajNT3At9fEg=<br>    DN: CN=dns.google<br>    subjectAltNames: \[8.8.8.8, 8.8.4.4, 8.8.8.53, 2001:4860:4860:0:0:0:0:8888, 2001:4860:4860:0:0:0:0:8844, 2001:4860:4860:0:0:0:0:6464, 2001:4860:4860:0:0:0:0:64, dns.google, dns.google.com, *.dns.google.com, 8888.google, dns64.dns.google\] | RETRY_WHEN | TLS_FAILURE | TLS_HANDSHAKE_SUCCEEDS: readcomiconline.li |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | ERROR | javax.net.ssl.SSLPeerUnverifiedException: Hostname readcomiconline.li not verified:<br>    certificate: sha256/lOLuq1g2wh6ncqAOibfdqkMgP1geY5riajNT3At9fEg=<br>    DN: CN=dns.google<br>    subjectAltNames: \[8.8.8.8, 8.8.4.4, 8.8.8.53, 2001:4860:4860:0:0:0:0:8888, 2001:4860:4860:0:0:0:0:8844, 2001:4860:4860:0:0:0:0:6464, 2001:4860:4860:0:0:0:0:64, dns.google, dns.google.com, *.dns.google.com, 8888.google, dns64.dns.google\] | RETRY_WHEN | TLS_FAILURE | TLS_HANDSHAKE_SUCCEEDS: readcomiconline.li |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | SKIP | No manga was returned by popular or latest |  |  |  |
| details operation | SKIP | No manga was returned by popular or latest |  |  |  |
| chapters operation | SKIP | No manga was returned by popular or latest |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | SKIP | Hostname readcomiconline.li not verified:<br>    certificate: sha256/lOLuq1g2wh6ncqAOibfdqkMgP1geY5riajNT3At9fEg=<br>    DN: CN=dns.google<br>    subjectAltNames: \[8.8.8.8, 8.8.4.4, 8.8.8.53, 2001:4860:4860:0:0:0:0:8888, 2001:4860:4860:0:0:0:0:8844, 2001:4860:4860:0:0:0:0:6464, 2001:4860:4860:0:0:0:0:64, dns.google, dns.google.com, *.dns.google.com, 8888.google, dns64.dns.google\] |  |  |  |
| latest listing | SKIP | Hostname readcomiconline.li not verified:<br>    certificate: sha256/lOLuq1g2wh6ncqAOibfdqkMgP1geY5riajNT3At9fEg=<br>    DN: CN=dns.google<br>    subjectAltNames: \[8.8.8.8, 8.8.4.4, 8.8.8.53, 2001:4860:4860:0:0:0:0:8888, 2001:4860:4860:0:0:0:0:8844, 2001:4860:4860:0:0:0:0:6464, 2001:4860:4860:0:0:0:0:64, dns.google, dns.google.com, *.dns.google.com, 8888.google, dns64.dns.google\] |  |  |  |
| search listing | SKIP | No manga was returned by popular or latest |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | Hostname readcomiconline.li not verified:<br>    certificate: sha256/lOLuq1g2wh6ncqAOibfdqkMgP1geY5riajNT3At9fEg=<br>    DN: CN=dns.google<br>    subjectAltNames: \[8.8.8.8, 8.8.4.4, 8.8.8.53, 2001:4860:4860:0:0:0:0:8888, 2001:4860:4860:0:0:0:0:8844, 2001:4860:4860:0:0:0:0:6464, 2001:4860:4860:0:0:0:0:64, dns.google, dns.google.com, *.dns.google.com, 8888.google, dns64.dns.google\] |  |  |  |
| latest pagination | SKIP | Hostname readcomiconline.li not verified:<br>    certificate: sha256/lOLuq1g2wh6ncqAOibfdqkMgP1geY5riajNT3At9fEg=<br>    DN: CN=dns.google<br>    subjectAltNames: \[8.8.8.8, 8.8.4.4, 8.8.8.53, 2001:4860:4860:0:0:0:0:8888, 2001:4860:4860:0:0:0:0:8844, 2001:4860:4860:0:0:0:0:6464, 2001:4860:4860:0:0:0:0:64, dns.google, dns.google.com, *.dns.google.com, 8888.google, dns64.dns.google\] |  |  |  |
| listing duplicates | SKIP | Fewer than 2 manga to check |  |  |  |
| manga title and URL | SKIP | No manga to check |  |  |  |
| thumbnail URLs | SKIP | No manga to check |  |  |  |
| duplicate thumbnail URLs | SKIP | No manga to check |  |  |  |
| thumbnail | SKIP | No manga to check |  |  |  |
| details identity | SKIP | No selected manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | SKIP | No details metadata to check |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
