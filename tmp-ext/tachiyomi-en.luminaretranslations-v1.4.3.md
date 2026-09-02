# Extension Validation Report

- Extension: tachiyomi-en.luminaretranslations-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 11
- Lint: 1
- Warnings: 0
- Skipped: 22
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1698654724978495521
- Source name: Luminare Translations
- Source language: en
- Selected manga input: latest offset 0: A Romantic Comedy Where the Heroine Dies in the End (`.../heroine-ga-saigo-ni-shinu-lovecome`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 11 | A Romantic Comedy Where the Heroine Dies in the End (`.../heroine-ga-saigo-ni-shinu-lovecome`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 11 | A Romantic Comedy Where the Heroine Dies in the End (`.../heroine-ga-saigo-ni-shinu-lovecome`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | A Romantic Comedy Where the Heroine Dies in the End (`.../heroine-ga-saigo-ni-shinu-lovecome`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | error | 0 |  | kotlinx.serialization.json.JsonDecodingException: Unexpected JSON token at offset 0: Expected start of the object '{', but had '<' instead at path: \$<br>JSON input: <br .../%3E<br><b>Fatal error<.../b%3E:  Al..... | 1-10s |
| chapters | `fetchChapterList(manga)` | error | 0 |  | kotlinx.serialization.json.JsonDecodingException: Unexpected JSON token at offset 0: Expected start of the object '{', but had '<' instead at path: \$<br>JSON input: <br .../%3E<br><b>Fatal error<.../b%3E:  Al..... | 1-10s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | ERROR | kotlinx.serialization.json.JsonDecodingException: Unexpected JSON token at offset 0: Expected start of the object '{', but had '<' instead at path: \$<br>JSON input: <br .../%3E<br><b>Fatal error<.../b%3E:  Al..... | REVIEW | INSUFFICIENT_EVIDENCE |  |
| chapters operation | ERROR | kotlinx.serialization.json.JsonDecodingException: Unexpected JSON token at offset 0: Expected start of the object '{', but had '<' instead at path: \$<br>JSON input: <br .../%3E<br><b>Fatal error<.../b%3E:  Al..... | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 11 entries |  |  |  |
| latest listing | PASS | 11 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Romantic Comedy Where the Heroine Dies in the End, URL=`heroine-ga-saigo-ni-shinu-lovecome` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 23/23 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 23/23 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://luminaretranslations.com/.../kkk-1024x538.png` (image/png, 632774 bytes, 1024x538) |  |  |  |
| details identity | SKIP | No details manga URL to compare |  |  |  |
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
| page load | SKIP | No pages to load |  |  |  |
