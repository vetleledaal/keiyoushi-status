# Extension Validation Report

- Extension: tachiyomi-en.guya-v1.4.25
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 30
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4637971935551651734
- Source name: Guya
- Source language: en
- Selected manga input: latest offset 0: Renai Daikou (`.../Renai-Daikou`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 6 | Kaguya-sama: Love is War (`.../Kaguya-Wants-To-Be-Confessed-To`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 6 | Renai Daikou (`.../Renai-Daikou`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Renai Daikou (`.../Renai-Daikou`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Renai Daikou (`.../Renai-Daikou`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 2 | 1 - Coward (`.../1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 46 |  |  | <1s |

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
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | PASS | 6 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Renai Daikou, URL=`Renai-Daikou` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 13/13 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 13/13 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://guya.cubari.moe/.../30618.jpg` (image/jpeg, 338086 bytes, 1146x1079) |  |  |  |
| details identity | PASS | Details preserved selected URL `Renai-Daikou` |  |  |  |
| details thumbnail URL | PASS | `https://guya.cubari.moe/.../30618.jpg` |  |  |  |
| details author | PASS | Aka Akasaka |  |  |  |
| details artist | PASS | Nishizawa 5Miri |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Half-Japanese Half-Swedish Mari Maria Winter Nanase has everything in life. She was raised in a well-off family in Scandinavia and America, she is popular among the girls, and she has good looks. However, she is missing one thing: she can't talk to boys!
<br>
<br>After picking up a book on love in the library, she found a suspicious-looking ad on the back. The ad was for Love Agency, a service promising a "pro in love" to handle your love for you. When she scans it, an agent called "Kon-chan" pops out and promises to help her fall in love with her crush. However, her crush, Masaya Seki, isn't so innocent in his ways either and is also using this app to get with her. How with this pair of hopeless lovers turn out? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://guya.cubari.moe/.../01.png <redacted query values: v2>` (image/png, 863351 bytes, 883x918) |  |  |  |
