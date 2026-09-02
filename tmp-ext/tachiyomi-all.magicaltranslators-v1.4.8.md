# Extension Validation Report

- Extension: tachiyomi-all.magicaltranslators-v1.4.8
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 28
- Lint: 4
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 4033172788130537982
- Source name: Magical Translators
- Source language: en
- Selected manga input: popular offset 0: A Boy Who Loves Genderswap Got Genderswapped so He Acts out His Ideal Genderswap Girl (`.../GB-Lover`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 23 | A Boy Who Loves Genderswap Got Genderswapped so He Acts out His Ideal Genderswap Girl (`.../GB-Lover`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 23 | Genderbent Hero and Genderbent Demon Lord (`.../NyoYuNyoMa`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | A Boy Who Loves Genderswap Got Genderswapped so He Acts out His Ideal Genderswap Girl (`.../GB-Lover`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | A Boy Who Loves Genderswap Got Genderswapped so He Acts out His Ideal Genderswap Girl (`.../GB-Lover`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 4 | 7.5 -  (`.../7.5`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 13 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 23 entries |  |  |  |
| latest listing | PASS | 23 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Boy Who Loves Genderswap Got Genderswapped so He Acts out His Ideal Genderswap Girl, URL=`GB-Lover` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 47/47 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 47/47 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mahoushoujobu.com/.../001.png` (image/png, 3274713 bytes, 2508x3541) |  |  |  |
| details identity | PASS | Details preserved selected URL `GB-Lover` |  |  |  |
| details thumbnail URL | PASS | `https://mahoushoujobu.com/.../001.png` |  |  |  |
| details author | PASS | Kiyu Fuyuki |  |  |  |
| details artist | PASS | Kiyu Fuyuki |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 1 name, chapter 2 name, chapter 3 name, chapter 4 name |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://mahoushoujobu.com/.../01.png` (image/png, 453229 bytes, 4299x6071) |  |  |  |
